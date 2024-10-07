package com.pzampi.zegeojson.models;

import java.io.Serializable;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class GeoLocation implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private Set<Coordinate> coordinates;

    private Partner partner;

    public GeoLocation() {
    }

    public GeoLocation(Long id, String type, Set<Coordinate> coordinates, Partner partner) {
        this.id = id;
        this.type = type;
        this.coordinates = coordinates;
        this.partner = partner;
    }
    @JsonIgnore
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Set<Coordinate> getCoordinates() {
        return coordinates;
    }

    public Partner getPartner() {
        return partner;
    }


    
}
