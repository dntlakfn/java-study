package oop_study;

public class Circle {
    int radius;

    void set(int radius) {
        this.radius = radius;
    }

    double getArea() {
        return 3.14 * radius * radius;
    }

    public Circle() {
    }

    public Circle(int r) {
        radius = r;
    }
}