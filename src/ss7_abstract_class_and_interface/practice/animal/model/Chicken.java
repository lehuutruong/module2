package ss7_abstract_class_and_interface.practice.animal.model;

import ss7_abstract_class_and_interface.practice.animal.model.Animal;
import ss7_abstract_class_and_interface.practice.animal.model.Edible;

public class Chicken extends Animal implements Edible {

    @Override
    public String makeSound() {
        return "gâu gâu gâu";
    }

    @Override
    public String howToEat() {
        return "đừng ăn tôi";
    }
}
