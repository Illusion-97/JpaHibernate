package fr.dawan.jpahibernate.entities.heritage.Joining.services;

import fr.dawan.jpahibernate.entities.basic.generic.GenericService;
import fr.dawan.jpahibernate.entities.heritage.Joining.J_BarA;
import fr.dawan.jpahibernate.entities.heritage.Joining.repositories.J_BarA_Repository;
import org.springframework.stereotype.Service;

@Service
public class J_BarAService extends GenericService<J_BarA, Long, J_BarA_Repository> {
    protected J_BarAService(J_BarA_Repository repository) {
        super(repository);
    }
}
