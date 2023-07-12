package fr.dawan.jpahibernate.entities.heritage.SingleTable.services;

import fr.dawan.jpahibernate.entities.basic.generic.GenericService;
import fr.dawan.jpahibernate.entities.heritage.SingleTable.ST_BarB;
import fr.dawan.jpahibernate.entities.heritage.SingleTable.repositories.ST_BarB_Repository;
import org.springframework.stereotype.Service;

@Service
public class ST_BarBService extends GenericService<ST_BarB, Long, ST_BarB_Repository> {
    protected ST_BarBService(ST_BarB_Repository repository) {
        super(repository);
    }
}
