package ss5_access_modifier.exercise.class_write_java;

public class MainController {
    public static void main(String[] args) {
        ClassWriteJava student1 = new ClassWriteJava();
        student1.setName("Truong");
        student1.setClasses("C0622G1");
        ClassWriteJava student2 = new ClassWriteJava();
        student2.setName("Hai");
        student2.setClasses("C0622G1");
        ClassWriteJava studentDefault = new ClassWriteJava();
        System.out.println("Student 1: " + student1.getName() + ", " + student1.getClasses());
        System.out.println("Student 2: " + student2.getName() + ", " + student2.getClasses());
        System.out.println("Student Default: " + studentDefault.getName() + ", " + studentDefault.getClasses());

    }
}


