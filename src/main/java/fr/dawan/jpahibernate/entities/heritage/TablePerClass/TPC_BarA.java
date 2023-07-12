package fr.dawan.jpahibernate.entities.heritage.TablePerClass;

import jakarta.persistence.Entity;

@Entity
public class TPC_BarA extends TPC_Foo {
    private String valA = "TPC_Aar_A";

    public String getValA() {
        return valA;
    }

    public void setValA(String valA) {
        this.valA = valA;
    }
}
