/*
* code repository: https://github.com/jaywhen/JavaCourse
* author: jaywhen --- 2018051604079
* */
package com.hc.first;

import com.hc.first.utils.Circle;
import com.hc.first.utils.Rectangle;
import com.hc.first.utils.Shape;
import com.hc.first.utils.Triangle;

public class Main {
    public static void main(String[] args) {
        // error handle test
        Shape circle = new Circle(-2);
        circle.draw();
        circle.erase();

        // will be fine
        Shape circleBeta = new Circle(3);
        circleBeta.draw();
        circleBeta.erase();

        // error handle test
        Shape triangleBeta = new Triangle(-3, 4);
        triangleBeta.draw();
        triangleBeta.erase();

        // will be fine
        Shape triangle = new Triangle(3, 4);
        triangle.draw();
        triangle.erase();

        // error handle test
        Shape rectangleBeta = new Rectangle(-4, 5);
        rectangleBeta.draw();
        rectangleBeta.erase();

        // fine
        Shape rectangle = new Rectangle(4, 5);
        rectangle.draw();
        rectangle.erase();
    }
}
