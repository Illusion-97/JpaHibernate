package fr.dawan.jpahibernate.entities.heritage.SingleTable.controllers;

import fr.dawan.jpahibernate.entities.basic.generic.GenericController;
import fr.dawan.jpahibernate.entities.heritage.SingleTable.ST_BarA;
import fr.dawan.jpahibernate.entities.heritage.SingleTable.repositories.ST_BarA_Repository;
import fr.dawan.jpahibernate.entities.heritage.SingleTable.services.ST_BarAService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/ST_BarA")
public class ST_BarAController extends GenericController<ST_BarA, Long, ST_BarA_Repository, ST_BarAService> {
    public ST_BarAController(ST_BarAService service) {
        super(service);
    }
}
