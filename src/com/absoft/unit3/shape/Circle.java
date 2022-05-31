package com.absoft.unit3.shape;

public class Circle implements Shape{

    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSqare() {
        return radius * radius * Math.PI;
    }
}
