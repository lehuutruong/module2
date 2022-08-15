package demo.dsa_list.model;

public class Student extends Person {
    private double score;
    private  String className;

    public Student() {
    }

    public Student(double score, String className) {
        this.score = score;
        this.className = className;
    }

    public Student(int id, String name, double score, String className) {
        super(id, name);
        this.score = score;
        this.className = className;
    }

    public Student(int id, String name, String dateOfBirth, String gener, double score, String className) {
        super(id, name, dateOfBirth, gener);
        this.score = score;
        this.className = className;
    }

    public Student(int id, String name, double score) {
        super(id, name);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString()+
                "score=" + score +
                ", className='" + className + '\'' +
                '}';
    }

}
