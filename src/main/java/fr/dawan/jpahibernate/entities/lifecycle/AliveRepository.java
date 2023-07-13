package fr.dawan.jpahibernate.entities.lifecycle;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AliveRepository extends JpaRepository<Alive,Long> {
}
