package fr.dawan.jpahibernate.entities.heritage.Joining.repositories;

import fr.dawan.jpahibernate.entities.heritage.Joining.J_Foo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface J_FooRepository extends JpaRepository<J_Foo, Long> {
}
