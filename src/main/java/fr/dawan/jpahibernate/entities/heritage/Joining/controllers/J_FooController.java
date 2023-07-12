package fr.dawan.jpahibernate.entities.heritage.Joining.controllers;

import fr.dawan.jpahibernate.entities.basic.generic.GenericController;
import fr.dawan.jpahibernate.entities.heritage.Joining.J_Foo;
import fr.dawan.jpahibernate.entities.heritage.Joining.repositories.J_FooRepository;
import fr.dawan.jpahibernate.entities.heritage.Joining.services.J_FooService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/J_Foo")
public class J_FooController extends GenericController<J_Foo, Long, J_FooRepository, J_FooService> {
    public J_FooController(J_FooService service) {
        super(service);
    }
}
