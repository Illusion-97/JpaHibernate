package fr.dawan.jpahibernate.dao.hql;

import fr.dawan.jpahibernate.dao.Animal;
import jakarta.persistence.*;
import jakarta.transaction.Transaction;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
@Transactional
public class AnimalHQLRepository {

    @PersistenceContext // Permet d'utiliser le Manager de connexion géré automatiquement par Spring
    private EntityManager em; // EntityManager représente la connexion à la BDD

    // Pour la gestion des transactions, il n'est pas possible d'utiliser l'EntityManager géré par Spring
    // On passera donc par la fabrique pour obtenir un manager propre à la classe ou à la requête
    private final EntityManagerFactory emf;

    public AnimalHQLRepository(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public List<?> all() { // En tant que type "?" signifie "je ne sais pas encore quel type ce sera
        Query nativeQuery = em.createNativeQuery("SELECT * FROM Animal");
        // requêtes équivalentes
        Query hqlquery = em.createQuery("FROM Animal");
        // Les requêtes écrites sous le standard HQL permettent une syntaxe proche de la structure des classes JAVA
        // Ce qui laisse votre ORM convertir la requête en SQL natif, en utilisant les règles définies sur @Entity

        Query namedQuery = em.createNamedQuery("Animal.findAll");

        //return nativeQuery.getResultList();
        return hqlquery.getResultList();
    }

    public Animal byId(long id) {
        TypedQuery<Animal> typedQuery = em.createQuery("FROM Animal a WHERE a.id = ?", Animal.class);
        // L'index des paramètres d'une requête commence à 1
        typedQuery.setParameter(1,id); // Ceci s'occupe de prévenir l'injection SQL
        return typedQuery.getSingleResult(); // Lance une exception si plus d'une ligne correspondent à la condition
    }

    public List<Animal> byBirthday(LocalDate date) {
        TypedQuery<Animal> typedQuery = em.createQuery("FROM Animal a WHERE a.birthday = ?", Animal.class);
        // L'index des paramètres d'une requête commence à 1
        typedQuery.setParameter(1,date); // Ceci s'occupe de prévenir l'injection SQL
        return typedQuery.getResultList(); // Lance une exception si plus d'une ligne correspondent à la condition

    }

    public List<Animal> searchByName(String name) {
        //name = "%" + name + "%";
        TypedQuery<Animal> typedQuery = em.createQuery("FROM Animal a WHERE a.name LIKE %:nameParameter%", Animal.class);
        // L'index des paramètres d'une requête commence à 1
        // typedQuery.setParameter(1, "%" + name + "%");
        typedQuery.setParameter("nameParameter",name); // Ceci s'occupe de prévenir l'injection SQL
        return typedQuery.getResultList(); // Lance une exception si plus d'une ligne correspondent à la condition

    }


    public List<Animal> searchByNameAndBirthday(String name, LocalDate date) {
        /*TypedQuery<Animal> typedQuery = em.createQuery("FROM Animal a WHERE a.name LIKE %:nameParameter% AND a.birthday = ?", Animal.class);
        typedQuery.setParameter("nameParameter",name);
        typedQuery.setParameter(2,date);
        return typedQuery.getResultList(); */

        return em.createQuery("FROM Animal a WHERE a.name LIKE %:nameParameter% AND a.birthday = ?", Animal.class)
                .setParameter("nameParameter",name)
                .setParameter(2,date)
                .getResultList();

    }

    //@Transactional
    public int updateNamesToUpperCase() {
        /*EntityManager entityManager = emf.createEntityManager();
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        try {
            // executeUpdate retourne le nombre de lignes affectées par la requête.
            int update = em.createQuery("UPDATE Animal SET name = upper(name)").executeUpdate();
            tx.commit(); // Valide les changements si tout s'est bien déroulé
            return update;
        } catch (Exception e) {
            tx.rollback();
            return 0;
        } finally {
            entityManager.close();
        }*/
        return em.createQuery("UPDATE Animal SET name = upper(name)").executeUpdate();
    }

    public List<Animal> findByChildName(String name) {
        /*em.createNativeQuery("""
SELECT parent.*
FROM Animal parent
JOIN Animal_Children children ON parent.id = children.animal_id
JOIN Animal child ON children.children_id = child.id
WHERE child.name LIKE %?%
""");*/
        return em.createQuery("FROM Animal parent JOIN parent.children child WHERE child.name LIKE %?%", Animal.class)
                .setParameter(1, name)
                .getResultList();
    }
}
