package fr.dawan.jpahibernate.entities.heritage.TablePerClass.controllers;

import fr.dawan.jpahibernate.entities.basic.generic.GenericController;
import fr.dawan.jpahibernate.entities.heritage.TablePerClass.TPC_Foo;
import fr.dawan.jpahibernate.entities.heritage.TablePerClass.repositories.TPC_FooRepository;
import fr.dawan.jpahibernate.entities.heritage.TablePerClass.services.TPC_FooService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/TPC_Foo")
public class TPC_FooController extends GenericController<TPC_Foo, Long, TPC_FooRepository, TPC_FooService> {
    public TPC_FooController(TPC_FooService service) {
        super(service);
    }
}
