package ss5_access_modifier.exercise.class_write_java;

public class ClassWriteJava {
    private String name = "Nam";
    static String classes = "C0622G1";

    public ClassWriteJava() {

    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void setClasses(String classes) {
        ClassWriteJava.classes = classes;
    }
}
