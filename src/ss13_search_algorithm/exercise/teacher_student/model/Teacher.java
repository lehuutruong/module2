package ss13_search_algorithm.exercise.teacher_student.model;

import java.util.Comparator;

public class Teacher  extends Person {
    private String speciality;
    public Teacher(){

    }

    public Teacher(String speciality) {
        this.speciality = speciality;
    }

    public Teacher(String id, String name, String gender, String dateOfBirth, String speciality) {
        super(id, name, gender, dateOfBirth);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Teacher{" +super.toString()+
                "speciality='" + speciality + '\'' +
                '}';
    }

}
