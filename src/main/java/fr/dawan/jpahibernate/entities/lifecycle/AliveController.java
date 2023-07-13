package fr.dawan.jpahibernate.entities.lifecycle;

import fr.dawan.jpahibernate.entities.basic.generic.GenericController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/alive")
public class AliveController extends GenericController<Alive,Long,AliveRepository,AliveService> {
    public AliveController(AliveService service) {
        super(service);
    }
}
