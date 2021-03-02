package com.hc.first.utils;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void draw() {
        try {
            if(width < 0 || length < 0) {
                String msg = "ERROR: The length or width of the rectangle cannot be 0.";
                throw new ShapeParameterException(msg);
            }
            System.out.println("Draw a rectangle | S = "
                    + length * width);
        } catch (ShapeParameterException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void erase() {
        System.out.println("Erased a rectangle ...");
    }
}
