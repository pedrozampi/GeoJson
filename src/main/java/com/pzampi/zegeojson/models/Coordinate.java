package com.pzampi.zegeojson.models;

import java.io.Serializable;

public class Coordinate implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private Double pointX,pointY;

    public Coordinate(Double pointX, Double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public Double getPointX() {
        return pointX;
    }

    public void setPointX(Double pointX) {
        this.pointX = pointX;
    }

    public Double getPointY() {
        return pointY;
    }

    public void setPointY(Double pointY) {
        this.pointY = pointY;
    }

    
}
