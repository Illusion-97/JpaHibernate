package fr.dawan.jpahibernate.entities.heritage.SingleTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("BarB") // Personnalise la valeur à insérer dans le discriminateur
public class ST_BarB extends ST_Foo {
    // hérite de l'id de ST_Foo
    private boolean aBooleanB = false;

    public boolean isaBooleanB() {
        return aBooleanB;
    }

    public void setaBooleanB(boolean aBooleanB) {
        this.aBooleanB = aBooleanB;
    }
}
