package fr.dawan.jpahibernate.entities.lifecycle;

import fr.dawan.jpahibernate.entities.basic.generic.GenericService;
import org.springframework.stereotype.Service;

@Service
public class AliveService extends GenericService<Alive,Long,AliveRepository> {
    protected AliveService(AliveRepository repository) {
        super(repository);
    }
}
