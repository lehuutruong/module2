package ss4_class_object.exercise.quadratic_equation;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value a");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter value b");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter value c");
        double c = Double.parseDouble(scanner.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() < 0) {
            System.out.println("Phương trình vô nghiệm");
        }
        if (quadraticEquation.getDiscriminant() >= 0) {
            System.out.println("Nghiệm đầu tiên của hệ phương trình là: " + quadraticEquation.getRoot1());
            System.out.println("Nghiệm đầu tiên của hệ phương trình là: " + quadraticEquation.getRoot2());
        }
    }
}
