package fr.dawan.jpahibernate.dao.jpa;

import fr.dawan.jpahibernate.dao.Animal;
import fr.dawan.jpahibernate.entities.basic.generic.GenericService;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class AnimalService extends GenericService<Animal,Long,AnimalRepository> {
    protected AnimalService(AnimalRepository repository) {
        super(repository);
    }

    public List<Animal> searchByName(String name){
        return repository.findByNameContaining(name);
    }

    public List<Animal> searchByChildName(String name) {
        return repository.findByChildren_NameContaining(name);
    }

    public Page<Animal> search(Animal model, int page, int max) {
        return repository.search(model.getName(), model.getBirthday(), PageRequest.of(page,max));
    }
}
