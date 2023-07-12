package fr.dawan.jpahibernate.entities.heritage.Joining.controllers;

import fr.dawan.jpahibernate.entities.basic.generic.GenericController;
import fr.dawan.jpahibernate.entities.heritage.Joining.J_BarB;
import fr.dawan.jpahibernate.entities.heritage.Joining.repositories.J_BarB_Repository;
import fr.dawan.jpahibernate.entities.heritage.Joining.services.J_BarBService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/J_BarB")
public class J_BarBController extends GenericController<J_BarB, Long, J_BarB_Repository, J_BarBService> {
    public J_BarBController(J_BarBService service) {
        super(service);
    }
}
