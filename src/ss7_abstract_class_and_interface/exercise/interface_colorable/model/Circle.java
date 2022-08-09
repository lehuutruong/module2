package ss7_abstract_class_and_interface.exercise.interface_colorable.model;
public class Circle extends Shape {
    private double radius = 1.0;

    public Circle(int i) {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + " ,Area="
                +String.format("%.2f",getArea());

    }
 }
