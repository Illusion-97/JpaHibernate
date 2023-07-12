package fr.dawan.jpahibernate.entities.heritage.SingleTable.repositories;

import fr.dawan.jpahibernate.entities.heritage.SingleTable.ST_BarB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ST_BarB_Repository extends JpaRepository<ST_BarB, Long> {
}
