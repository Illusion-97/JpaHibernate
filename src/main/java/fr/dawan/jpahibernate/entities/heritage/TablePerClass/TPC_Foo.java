package fr.dawan.jpahibernate.entities.heritage.TablePerClass;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class TPC_Foo {
    @Id
    // Il n'est pas possible avec une stratégie d'héritage TablePerClass d'utiliser GenerationType.IDENTITY
    // L'auto-increment étant propre à chaque table, il y aurait un décalage
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name = "TPC_Foo";

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
