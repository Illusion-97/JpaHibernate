package fr.dawan.jpahibernate.entities.heritage.TablePerClass.repositories;

import fr.dawan.jpahibernate.entities.heritage.TablePerClass.TPC_BarA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TPC_BarA_Repository extends JpaRepository<TPC_BarA, Long> {
}
