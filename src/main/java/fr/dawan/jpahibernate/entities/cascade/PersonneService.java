package fr.dawan.jpahibernate.entities.cascade;

import fr.dawan.jpahibernate.entities.basic.generic.GenericService;
import org.springframework.stereotype.Service;

@Service
public class PersonneService extends GenericService<Personne,Long, PersonneRepository> {
    protected PersonneService(PersonneRepository repository) {
        super(repository);
    }
}
