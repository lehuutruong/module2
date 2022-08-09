package ss7_abstract_class_and_interface.exercise.interface_resizeable.main;

import ss7_abstract_class_and_interface.exercise.interface_resizeable.model.Circle;
import ss7_abstract_class_and_interface.exercise.interface_resizeable.model.Rectangle;
import ss7_abstract_class_and_interface.exercise.interface_resizeable.model.Shape;

public class MainController {
    public static void main(String[] args) {
        Shape [] shapes=new Shape[2];
        shapes[0]=new Circle(5);
        shapes[1]=new Rectangle(3,3);
        for(Shape shape :shapes){
            shape.resize(Math.floor((Math.random()*100)));
                  }
        for (Shape shape:shapes
             ) {
            System.out.println(shape);

        }
    }
}
