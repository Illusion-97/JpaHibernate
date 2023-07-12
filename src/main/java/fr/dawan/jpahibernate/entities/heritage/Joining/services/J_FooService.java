package fr.dawan.jpahibernate.entities.heritage.Joining.services;

import fr.dawan.jpahibernate.entities.basic.generic.GenericService;
import fr.dawan.jpahibernate.entities.heritage.Joining.J_Foo;
import fr.dawan.jpahibernate.entities.heritage.Joining.repositories.J_FooRepository;
import org.springframework.stereotype.Service;

@Service
public class J_FooService extends GenericService<J_Foo, Long, J_FooRepository> {
    protected J_FooService(J_FooRepository repository) {
        super(repository);
    }
}
