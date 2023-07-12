package fr.dawan.jpahibernate.entities.heritage.TablePerClass.services;

import fr.dawan.jpahibernate.entities.basic.generic.GenericService;
import fr.dawan.jpahibernate.entities.heritage.TablePerClass.TPC_BarB;
import fr.dawan.jpahibernate.entities.heritage.TablePerClass.repositories.TPC_BarB_Repository;
import org.springframework.stereotype.Service;

@Service
public class TPC_BarBService extends GenericService<TPC_BarB, Long, TPC_BarB_Repository> {
    protected TPC_BarBService(TPC_BarB_Repository repository) {
        super(repository);
    }
}
