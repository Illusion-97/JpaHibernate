package fr.dawan.jpahibernate.entities.heritage.Joining;

import jakarta.persistence.Entity;

@Entity
public class J_BarA extends J_Foo {
    private String valA = "J_Aar_A";

    public String getValA() {
        return valA;
    }

    public void setValA(String valA) {
        this.valA = valA;
    }
}
