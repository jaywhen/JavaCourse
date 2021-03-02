package com.hc.first.utils;

import static java.lang.Math.PI;

public class Circle extends Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public void draw() {
        try {
            if(r < 0) {
                String msg = "ERROR: The radius of the circle cannot be less than 0.";
                throw new ShapeParameterException(msg);
            }
            System.out.println("Draw a circle | S = "
                    + PI * r );
        } catch (ShapeParameterException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void erase() {
        System.out.println("Erased a circle ...");
    }
}
