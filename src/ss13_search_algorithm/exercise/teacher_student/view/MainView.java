package ss13_search_algorithm.exercise.teacher_student.view;

import ss13_search_algorithm.exercise.teacher_student.controller.MainController;

import java.io.IOException;

public class MainView {
    public static void main(String[] args)  {
        MainController mainController=new MainController();
        try {
            mainController.menuManagement();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
