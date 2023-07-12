package fr.dawan.jpahibernate.entities.heritage.SingleTable.repositories;

import fr.dawan.jpahibernate.entities.heritage.SingleTable.ST_Foo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ST_FooRepository extends JpaRepository<ST_Foo, Long> {
}
