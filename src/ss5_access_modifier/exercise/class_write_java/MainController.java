package ss5_access_modifier.exercise.class_write_java;

public class MainController {
    public static void main(String[] args) {
        ClassWriteJava studentOne = new ClassWriteJava();
        studentOne.setName("Truong");
        ClassWriteJava studentTwo = new ClassWriteJava();
        studentTwo.setName("Hai");
        ClassWriteJava studentDefault = new ClassWriteJava();
        System.out.println("Student 1: " + studentOne.getName() + ", " + ClassWriteJava.classes);
        System.out.println("Student 2: " + studentTwo.getName() + ", " + ClassWriteJava.classes);
        System.out.println("Student Default: " + studentDefault.getName() + ", " + studentDefault.getClasses());

    }
}


