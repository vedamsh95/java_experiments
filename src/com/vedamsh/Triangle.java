package com.vedamsh;

public class Triangle extends Dimensions {

    double area;
    double a, b, c;

    double getA() {
        return a;
    }

    void setA(double a) {
        this.a = a;
    }

    double getB() {
        return b;

    }

    void setB(double b) {
        this.b = b;
    }

    double getC() {
        return c;
    }

    void setC(double c) {
        this.c = c;
    }


    double area() {
        area = getWidth() * getHeight() / 2;
        System.out.println("The area of the triangle is " + area);
        return area;
    }

    void perimeter() {
        double perimeter = a + b + c;
        System.out.println("The perimeter of the triagle is " + perimeter);
    }

    void type() {

        if (a == b && b == c) {
            System.out.println("It is a Equilateral triangle.");
        } else if ((a == b && b != c) || ((a == c) && a != b) || ((b == c) && b != c)) {
            System.out.println("It is a isosceles Triangle. ");
        } else if (a != b && b != c && a != c) {
            System.out.println("It is a scalene triangle.");
        }

    }

}
