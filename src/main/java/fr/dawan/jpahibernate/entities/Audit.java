package fr.dawan.jpahibernate.entities;

import fr.dawan.jpahibernate.entities.lifecycle.Alive;
import fr.dawan.jpahibernate.entities.lifecycle.AliveRepository;
import org.springframework.stereotype.Component;

@Component
public class Audit {

    private static AliveRepository repository;

    public Audit(AliveRepository repository) {
        this.repository = repository;
    }

    public static void saveHistory(Alive object) {
        System.out.println("\u001B[36mAudit.saveHistory\u001B[0m");
        System.out.println("object = \u001B[31m" + object + "\u001B[0m");
        if(repository != null) {
            repository.save(object);
        }
    }
}
