package fr.dawan.jpahibernate.entities.heritage.TablePerClass.controllers;

import fr.dawan.jpahibernate.entities.basic.generic.GenericController;
import fr.dawan.jpahibernate.entities.heritage.TablePerClass.TPC_BarB;
import fr.dawan.jpahibernate.entities.heritage.TablePerClass.repositories.TPC_BarB_Repository;
import fr.dawan.jpahibernate.entities.heritage.TablePerClass.services.TPC_BarBService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/TPC_BarB")
public class TPC_BarBController extends GenericController<TPC_BarB, Long, TPC_BarB_Repository, TPC_BarBService> {
    public TPC_BarBController(TPC_BarBService service) {
        super(service);
    }
}
