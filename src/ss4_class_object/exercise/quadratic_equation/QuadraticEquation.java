package ss4_class_object.exercise.quadratic_equation;

import java.util.Scanner;

public class QuadraticEquation {


   private double a;
   private double b;
   private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        double delta = (this.b * this.b - 4 * this.a * this.c);
        return delta;
    }

    public double getRoot1() {
        double value1 = ((-this.b + Math.pow(this.b * this.b - 4 * this.a * this.c, 0.5)) / (2 * this.a));
        return value1;
    }

    public double getRoot2() {
        double value2 = ((-this.b - Math.pow(this.b * this.b - 4 * this.a * this.c, 0.5)) / (2 * this.a));
        return value2;
    }
}
