package fr.dawan.jpahibernate.dao.jpa;

import fr.dawan.jpahibernate.dao.Animal;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface AnimalRepository extends JpaRepository<Animal,Long> {
    List<Animal> findByNameContaining(String name);

    @Query("""
FROM Animal a
WHERE a.birthday = :date
""")// Il est possible d'écrire soi-même ses requêtes grâce à @Query
    List<Animal> findAllBirthday(LocalDate date); // Ou respecter un formalisme de nommage pour qu'elle soit déduite du nom

    List<Animal> findByChildren_Id(Long id);
    List<Animal> findByChildren_NameContaining(String name);

    @Query("""
FROM Animal a 
WHERE (:name IS NULL OR a.name LIKE %:name%) 
AND (:date IS NULL OR a.birthday = :date)
""")
    Page<Animal> search(String name, LocalDate date, Pageable pageable);
}
