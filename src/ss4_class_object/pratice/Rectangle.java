package ss4_class_object.pratice;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter");
        double height = Double.parseDouble(scanner.nextLine());
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your Rectangle\n" + rectangle.display());
        System.out.println("your getPrimeter " + rectangle.getPrimeter());
        System.out.println("your getArea " + rectangle.getArea());
    }

    double width, height;

    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPrimeter() {
        return (this.height + this.height) * 2;
    }

    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}

