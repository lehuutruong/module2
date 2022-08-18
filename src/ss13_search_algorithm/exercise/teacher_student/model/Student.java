package ss13_search_algorithm.exercise.teacher_student.model;

import java.util.concurrent.ConcurrentMap;

public class Student  extends Person {
    private double score;
    private String nameClass;
    public Student(){

    }

    public Student(double score, String nameClass) {
        this.score = score;
        this.nameClass = nameClass;
    }

    public Student(String id, String name, String gender, String dateOfBirth, double score, String nameClass) {
        super(id, name, gender, dateOfBirth);
        this.score = score;
        this.nameClass = nameClass;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    @Override
    public String toString() {
        return "Student{" +super.toString()+
                "score=" + score +
                ", nameClass='" + nameClass + '\'' +
                '}';
    }

}
