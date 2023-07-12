package fr.dawan.jpahibernate.entities.heritage.SingleTable.services;

import fr.dawan.jpahibernate.entities.basic.generic.GenericService;
import fr.dawan.jpahibernate.entities.heritage.SingleTable.ST_BarA;
import fr.dawan.jpahibernate.entities.heritage.SingleTable.repositories.ST_BarA_Repository;
import org.springframework.stereotype.Service;

@Service
public class ST_BarAService extends GenericService<ST_BarA, Long, ST_BarA_Repository> {
    protected ST_BarAService(ST_BarA_Repository repository) {
        super(repository);
    }
}
