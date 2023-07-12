package fr.dawan.jpahibernate.entities.heritage.SingleTable.services;

import fr.dawan.jpahibernate.entities.basic.generic.GenericService;
import fr.dawan.jpahibernate.entities.heritage.SingleTable.ST_Foo;
import fr.dawan.jpahibernate.entities.heritage.SingleTable.repositories.ST_FooRepository;
import org.springframework.stereotype.Service;

@Service
public class ST_FooService extends GenericService<ST_Foo, Long, ST_FooRepository> {
    protected ST_FooService(ST_FooRepository repository) {
        super(repository);
    }
}
