package mpaletti.exercises.oop.basic;

import java.awt.*;
public class Circle {
    Point center;
    int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getPerimeter(){
        return 2*radius*Math.PI;
    }

    public double getArea(){
        return Math.pow(radius,2)*Math.PI;
    }

    public boolean contains(Point point){
        double dist=Math.hypot(point.x - center.x, point.y - center.y);
        return !(dist >= radius);
    }

    public void translate(int dx,int dy){
        this.center.x=dx;
        this.center.y=dy;
    }
    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
