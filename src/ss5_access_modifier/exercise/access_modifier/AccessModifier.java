package ss5_access_modifier.exercise.access_modifier;

import static java.lang.Math.PI;

public class AccessModifier {
    private double radius = 1.0d;
    private String color = "red";
    private double area;

    public void AccessModifier() {

    }

    public void AccessModifier(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public double getArea() {
        return Math.pow(radius, 2) * PI;
    }

}
