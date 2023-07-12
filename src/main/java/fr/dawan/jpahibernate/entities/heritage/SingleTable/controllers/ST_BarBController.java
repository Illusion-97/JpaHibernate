package fr.dawan.jpahibernate.entities.heritage.SingleTable.controllers;

import fr.dawan.jpahibernate.entities.basic.generic.GenericController;
import fr.dawan.jpahibernate.entities.heritage.SingleTable.ST_BarB;
import fr.dawan.jpahibernate.entities.heritage.SingleTable.repositories.ST_BarB_Repository;
import fr.dawan.jpahibernate.entities.heritage.SingleTable.services.ST_BarBService;

public class ST_BarBController extends GenericController<ST_BarB, Long, ST_BarB_Repository, ST_BarBService> {
    public ST_BarBController(ST_BarBService service) {
        super(service);
    }
}
