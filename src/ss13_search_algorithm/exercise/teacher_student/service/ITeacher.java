package ss13_search_algorithm.exercise.teacher_student.service;

import java.io.IOException;

public interface ITeacher {
    void addTeacher() throws IOException;
    void displayTeacher() throws IOException;
    void editTeacher();
    void deleteTeacher();
    void searchTeach();
     void sortIdTeach();
     void sortNameTeach();
}
