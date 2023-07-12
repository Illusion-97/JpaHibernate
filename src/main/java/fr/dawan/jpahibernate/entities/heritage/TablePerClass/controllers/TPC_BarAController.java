package fr.dawan.jpahibernate.entities.heritage.TablePerClass.controllers;

import fr.dawan.jpahibernate.entities.basic.generic.GenericController;
import fr.dawan.jpahibernate.entities.heritage.TablePerClass.TPC_BarA;
import fr.dawan.jpahibernate.entities.heritage.TablePerClass.repositories.TPC_BarA_Repository;
import fr.dawan.jpahibernate.entities.heritage.TablePerClass.services.TPC_BarAService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/TPC_BarA")
public class TPC_BarAController extends GenericController<TPC_BarA, Long, TPC_BarA_Repository, TPC_BarAService> {
    public TPC_BarAController(TPC_BarAService service) {
        super(service);
    }
}
