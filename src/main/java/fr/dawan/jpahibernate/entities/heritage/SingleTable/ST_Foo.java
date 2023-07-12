package fr.dawan.jpahibernate.entities.heritage.SingleTable;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // @Inheritance indique à l'ORM la façon de mapper la relation d'héritage des classes enfant
// Puisque les champs non utiles à l'objet créé sont set à null en BDD, il n'est pas possible pour les classes enfant d'utiliser "@Column(nullable : false)"
@DiscriminatorColumn(name = "discriminator") // permet de personnaliser la colonne dtype
@DiscriminatorValue("Foo") // Personnalise la valeur à insérer dans le discriminateur
public class ST_Foo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name = "ST_Foo";

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
