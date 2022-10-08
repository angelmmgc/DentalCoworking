package com.example.DentalCoworking.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "gabinetes")
public class Cabinete implements Serializable {

    /**
     * atributo id autogenerado
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cabinet type")
    private String cabinetType;
    @Column(nullable = false,name = "condition")
    private boolean condition;

    //constructores


    public Cabinete() {
    }

    public Cabinete(Long id, String cabinetType, boolean condition) {
        this.id = id;
        this.cabinetType = cabinetType;
        this.condition = condition;
    }

    //asociaciones

    //getter y setter


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCabinetType() {
        return cabinetType;
    }

    public void setCabinetType(String cabinetType) {
        this.cabinetType = cabinetType;
    }

    public boolean isCondition() {
        return condition;
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }

    //toString

    @Override
    public String toString() {
        return "Gabinete{" +
                "id=" + id +
                ", cabinetType='" + cabinetType + '\'' +
                ", condition=" + condition +
                '}';
    }
}
