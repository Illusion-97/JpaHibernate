package fr.dawan.jpahibernate.entities.heritage.TablePerClass.repositories;

import fr.dawan.jpahibernate.entities.heritage.TablePerClass.TPC_Foo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TPC_FooRepository extends JpaRepository<TPC_Foo, Long> {
}
