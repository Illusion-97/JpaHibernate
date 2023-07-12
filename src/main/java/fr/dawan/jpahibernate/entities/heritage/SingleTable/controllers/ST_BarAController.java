package fr.dawan.jpahibernate.entities.heritage.SingleTable.controllers;

import fr.dawan.jpahibernate.entities.basic.generic.GenericController;
import fr.dawan.jpahibernate.entities.heritage.SingleTable.ST_BarA;
import fr.dawan.jpahibernate.entities.heritage.SingleTable.repositories.ST_BarA_Repository;
import fr.dawan.jpahibernate.entities.heritage.SingleTable.services.ST_BarAService;

public class ST_BarAController extends GenericController<ST_BarA, Long, ST_BarA_Repository, ST_BarAService> {
    public ST_BarAController(ST_BarAService service) {
        super(service);
    }
}
