package ss10_dsa_list_menu.student.model;

public abstract class Student extends Person {
    private double point;
    private String nameClass;
    public Student(){

    }

    public Student(double point) {
        this.point = point;
    }

    public Student(double point, String nameClass) {
        this.point = point;
        this.nameClass = nameClass;
    }

    public Student(int id, String name, String dateOfBirth,String gener, double point, String nameClass) {
        super(id, name, dateOfBirth,gener);
        this.point = point;
        this.nameClass = nameClass;
    }

    @Override
    public String toString() {
        return "Student{" +super.toString()+
                "point=" + point +
                ", nameClass='" + nameClass + '\'' +
                '}';
    }
}
