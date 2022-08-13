package ss10_dsa_list_menu.student.view;

import ss10_dsa_list_menu.student.controller.MainController;
import ss10_dsa_list_menu.student.controller.StudentController;
import ss10_dsa_list_menu.student.controller.TeacherController;

public class MainView {
    public static void main(String[] args) {
        MainController mainController=new MainController();
        mainController.menuManagementTotal();
    }
}
