package ss13_search_algorithm.exercise.teacher_student.service;

import java.io.IOException;

public interface IStudent{
    void addStudent() throws IOException;
    void displayStudent() throws IOException;
    void deleteStudent();
    void editStudent();
    void searchStudent();
    void sortIdStudent();
    void sortNameStudent();
}
