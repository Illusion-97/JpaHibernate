package fr.dawan.jpahibernate.entities.heritage.SingleTable.repositories;

import fr.dawan.jpahibernate.entities.heritage.SingleTable.ST_BarA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ST_BarA_Repository extends JpaRepository<ST_BarA, Long> {
}
