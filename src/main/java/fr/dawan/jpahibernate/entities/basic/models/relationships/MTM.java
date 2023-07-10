package fr.dawan.jpahibernate.entities.basic.models.relationships;

import jakarta.persistence.*;

@Entity
public class MTM {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(columnDefinition = "VARCHAR(50)")
    private String UUID;

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }
}
