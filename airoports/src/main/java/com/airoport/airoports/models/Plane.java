package com.airoport.airoports.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Plane {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "id")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "number_of_seats")
    private Integer numberOfSeats;

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(Integer numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Basic
    @Column(name = "load_capacity")
    private Integer loadCapacity;

    public Integer getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(Integer loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Basic
    @Column(name = "engine_capacity")
    private Integer engineCapacity;

    public Integer getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(Integer engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plane plane = (Plane) o;
        return Objects.equals(id, plane.id) && Objects.equals(numberOfSeats, plane.numberOfSeats) && Objects.equals(loadCapacity, plane.loadCapacity) && Objects.equals(engineCapacity, plane.engineCapacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numberOfSeats, loadCapacity, engineCapacity);
    }
}
