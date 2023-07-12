package fr.dawan.jpahibernate.entities.heritage.TablePerClass.services;

import fr.dawan.jpahibernate.entities.basic.generic.GenericService;
import fr.dawan.jpahibernate.entities.heritage.TablePerClass.TPC_Foo;
import fr.dawan.jpahibernate.entities.heritage.TablePerClass.repositories.TPC_FooRepository;
import org.springframework.stereotype.Service;

@Service
public class TPC_FooService extends GenericService<TPC_Foo, Long, TPC_FooRepository> {
    protected TPC_FooService(TPC_FooRepository repository) {
        super(repository);
    }
}
