package com.airoport.airoports.models;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
@jakarta.persistence.Table(name = "flight_plane", schema = "airoports", catalog = "")
public class FlightPlane {
    @Basic
    @Id
    @jakarta.persistence.Column(name = "flight_id")
    private Integer flightId;

    public Integer getFlightId() {
        return flightId;
    }

    public void setFlightId(Integer flightId) {
        this.flightId = flightId;
    }

    @Basic
    @jakarta.persistence.Column(name = "plane_id")
    private Integer planeId;

    public Integer getPlaneId() {
        return planeId;
    }

    public void setPlaneId(Integer planeId) {
        this.planeId = planeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightPlane that = (FlightPlane) o;
        return Objects.equals(flightId, that.flightId) && Objects.equals(planeId, that.planeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightId, planeId);
    }
}
