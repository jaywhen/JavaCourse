package com.hc.first.utils;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        try{
            if(base < 0 || height < 0) {
                String msg = "ERROR: The base or height of the triangle cannot be 0.";
                throw new ShapeParameterException(msg);
            }
            System.out.println("Draw a triangle | S = "
                    + (base * height) / 2 );
        } catch (ShapeParameterException e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void erase() {
        System.out.println("Erased a triangle ...");
    }
}
