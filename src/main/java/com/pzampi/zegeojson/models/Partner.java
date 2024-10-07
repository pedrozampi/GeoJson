package com.pzampi.zegeojson.models;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_parter")
public class Partner implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String ownerName;
    private String document;


    private GeoLocation coverageArea;

    private GeoLocation address;

    public Partner() {
    }

    public Partner(Integer id, String ownerName, String document, GeoLocation coverageArea, GeoLocation address) {
        this.id = id;
        this.ownerName = ownerName;
        this.document = document;
        this.coverageArea = coverageArea;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public GeoLocation getCoverageArea() {
        return coverageArea;
    }

    public void setCoverageArea(GeoLocation coverageArea) {
        this.coverageArea = coverageArea;
    }

    public GeoLocation getAddress() {
        return address;
    }

    public void setAddress(GeoLocation address) {
        this.address = address;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Partner other = (Partner) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    
}
