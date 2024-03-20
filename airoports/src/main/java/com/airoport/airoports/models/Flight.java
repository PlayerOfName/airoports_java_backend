package com.airoport.airoports.models;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Flight {
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
    @Column(name = "board")
    private Integer board;

    public Integer getBoard() {
        return board;
    }

    public void setBoard(Integer board) {
        this.board = board;
    }

    @Basic
    @Column(name = "departure_date")
    private Timestamp departureDate;

    public Timestamp getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Timestamp departureDate) {
        this.departureDate = departureDate;
    }

    @Basic
    @Column(name = "arrival_date")
    private Timestamp arrivalDate;

    public Timestamp getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Timestamp arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    @Basic
    @Column(name = "destination")
    private String destination;

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Basic
    @Column(name = "plane_id")
    private Integer planeId;

    public Integer getPlaneId() {
        return planeId;
    }

    public void setPlaneId(Integer planeId) {
        this.planeId = planeId;
    }

    @Basic
    @Column(name = "airport_id")
    private Integer airportId;

    public Integer getAirportId() {
        return airportId;
    }

    public void setAirportId(Integer airportId) {
        this.airportId = airportId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(id, flight.id) && Objects.equals(board, flight.board) && Objects.equals(departureDate, flight.departureDate) && Objects.equals(arrivalDate, flight.arrivalDate) && Objects.equals(destination, flight.destination) && Objects.equals(planeId, flight.planeId) && Objects.equals(airportId, flight.airportId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, board, departureDate, arrivalDate, destination, planeId, airportId);
    }
}
