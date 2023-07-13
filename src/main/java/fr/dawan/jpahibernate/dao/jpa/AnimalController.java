package fr.dawan.jpahibernate.dao.jpa;

import fr.dawan.jpahibernate.dao.Animal;
import fr.dawan.jpahibernate.entities.basic.generic.GenericController;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/animal")
public class AnimalController extends GenericController<Animal,Long,AnimalRepository,AnimalService> {
    public AnimalController(AnimalService service) {
        super(service);
    }

    @GetMapping("searchByName/{name}")
    public List<Animal> searchByName(@PathVariable String name){
        return service.searchByName(name);
    }
    @GetMapping("searchByChildName/{name}")
    public List<Animal> searchByChildName(@PathVariable String name){
        return service.searchByChildName(name);
    }

    @PostMapping("search/{page}/{max}")
    public Page<Animal> search(@RequestBody Animal model, @PathVariable int page, @PathVariable int max) {
        return service.search(model,page,max);
    }
}
