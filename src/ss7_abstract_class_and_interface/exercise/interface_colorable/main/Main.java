package ss7_abstract_class_and_interface.exercise.interface_colorable.main;

import ss7_abstract_class_and_interface.exercise.interface_colorable.model.Circle;
import ss7_abstract_class_and_interface.exercise.interface_colorable.model.Rectangle;
import ss7_abstract_class_and_interface.exercise.interface_colorable.model.Shape;
import ss7_abstract_class_and_interface.exercise.interface_colorable.model.Square;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(4);
        shapes[1] = new Square(3);
        shapes[2] = new Rectangle(3, 7);
        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof Square) {
                ((Square) shape).howToColor();
            }

        }
    }
}
