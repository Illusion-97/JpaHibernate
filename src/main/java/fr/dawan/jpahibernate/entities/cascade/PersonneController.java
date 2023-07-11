package fr.dawan.jpahibernate.entities.cascade;

import fr.dawan.jpahibernate.entities.basic.generic.GenericController;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonneController extends GenericController<Personne,Long,PersonneRepository,PersonneService> {
    public PersonneController(PersonneService service) {
        super(service);
    }
}
