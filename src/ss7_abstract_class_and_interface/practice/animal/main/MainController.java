package ss7_abstract_class_and_interface.practice.animal.main;

import ss7_abstract_class_and_interface.practice.animal.model.Animal;
import ss7_abstract_class_and_interface.practice.animal.model.Chicken;
import ss7_abstract_class_and_interface.practice.animal.model.Edible;
import ss7_abstract_class_and_interface.practice.animal.model.Tiger;

public class MainController {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
    }
}
