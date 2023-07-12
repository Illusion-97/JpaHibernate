package fr.dawan.jpahibernate.entities.heritage.Joining.services;

import fr.dawan.jpahibernate.entities.basic.generic.GenericService;
import fr.dawan.jpahibernate.entities.heritage.Joining.J_BarB;
import fr.dawan.jpahibernate.entities.heritage.Joining.repositories.J_BarB_Repository;
import org.springframework.stereotype.Service;

@Service
public class J_BarBService extends GenericService<J_BarB, Long, J_BarB_Repository> {
    protected J_BarBService(J_BarB_Repository repository) {
        super(repository);
    }
}
