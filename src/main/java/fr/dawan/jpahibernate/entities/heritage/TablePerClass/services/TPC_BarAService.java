package fr.dawan.jpahibernate.entities.heritage.TablePerClass.services;

import fr.dawan.jpahibernate.entities.basic.generic.GenericService;
import fr.dawan.jpahibernate.entities.heritage.TablePerClass.TPC_BarA;
import fr.dawan.jpahibernate.entities.heritage.TablePerClass.repositories.TPC_BarA_Repository;
import org.springframework.stereotype.Service;

@Service
public class TPC_BarAService extends GenericService<TPC_BarA, Long, TPC_BarA_Repository> {
    protected TPC_BarAService(TPC_BarA_Repository repository) {
        super(repository);
    }
}
