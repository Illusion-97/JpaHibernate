package fr.dawan.jpahibernate.entities.heritage.Joining.controllers;

import fr.dawan.jpahibernate.entities.basic.generic.GenericController;
import fr.dawan.jpahibernate.entities.heritage.Joining.J_BarA;
import fr.dawan.jpahibernate.entities.heritage.Joining.repositories.J_BarA_Repository;
import fr.dawan.jpahibernate.entities.heritage.Joining.services.J_BarAService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/J_BarA")
public class J_BarAController extends GenericController<J_BarA, Long, J_BarA_Repository, J_BarAService> {
    public J_BarAController(J_BarAService service) {
        super(service);
    }
}
