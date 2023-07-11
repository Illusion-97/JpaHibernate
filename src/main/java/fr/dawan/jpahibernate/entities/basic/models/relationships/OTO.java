package fr.dawan.jpahibernate.entities.basic.models.relationships;

import jakarta.persistence.*;

@Entity
public class OTO {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(columnDefinition = "VARCHAR(50)")
    private String id;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
