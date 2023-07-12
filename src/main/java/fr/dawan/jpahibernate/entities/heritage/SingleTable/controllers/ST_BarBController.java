package fr.dawan.jpahibernate.entities.heritage.SingleTable.controllers;

import fr.dawan.jpahibernate.entities.basic.generic.GenericController;
import fr.dawan.jpahibernate.entities.heritage.SingleTable.ST_BarB;
import fr.dawan.jpahibernate.entities.heritage.SingleTable.repositories.ST_BarB_Repository;
import fr.dawan.jpahibernate.entities.heritage.SingleTable.services.ST_BarBService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/ST_BarB")
public class ST_BarBController extends GenericController<ST_BarB, Long, ST_BarB_Repository, ST_BarBService> {
    public ST_BarBController(ST_BarBService service) {
        super(service);
    }
}
