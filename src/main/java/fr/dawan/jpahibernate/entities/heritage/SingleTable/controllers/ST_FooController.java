package fr.dawan.jpahibernate.entities.heritage.SingleTable.controllers;

import fr.dawan.jpahibernate.entities.basic.generic.GenericController;
import fr.dawan.jpahibernate.entities.heritage.SingleTable.ST_Foo;
import fr.dawan.jpahibernate.entities.heritage.SingleTable.repositories.ST_FooRepository;
import fr.dawan.jpahibernate.entities.heritage.SingleTable.services.ST_FooService;

public class ST_FooController extends GenericController<ST_Foo, Long, ST_FooRepository, ST_FooService> {
    public ST_FooController(ST_FooService service) {
        super(service);
    }
}
