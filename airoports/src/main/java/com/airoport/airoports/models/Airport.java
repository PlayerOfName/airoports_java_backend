package com.airoport.airoports.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Airport {
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
    @Column(name = "name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "country_id")
    private Integer countryId;

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    @Basic
    @Column(name = "runway_id")
    private Integer runwayId;

    public Integer getRunwayId() {
        return runwayId;
    }

    public void setRunwayId(Integer runwayId) {
        this.runwayId = runwayId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return Objects.equals(id, airport.id) && Objects.equals(name, airport.name) && Objects.equals(countryId, airport.countryId) && Objects.equals(runwayId, airport.runwayId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, countryId, runwayId);
    }
}
