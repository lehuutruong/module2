package ss10_dsa_list_menu.student.controller;

import ss10_dsa_list_menu.student.model.Student;
import ss10_dsa_list_menu.student.service.impl.StudentService;

import java.util.Scanner;

public  class MainController {
Scanner scanner=new Scanner(System.in);
private  StudentController studentController=new StudentController();
public static boolean cotinueRunning;
public   void menuManagementTotal(){
    cotinueRunning=true;
    while (cotinueRunning){
//        System.out.println(-----------------------------------------'');
        System.out.println("chào mừng bạn đến với tui: ");
        System.out.println("1. Hệ thống học sinh");
        System.out.println("2. Hệ thống giáo viên");
        System.out.println("3. Exit");
        System.out.println("Mời bạn nhập chức năng 1-3");
        int choice=Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
//                StudentController.menuManagement();
                break;
            case 2:
//                TeacherController.menuManagementTeacher();
            case 3:
                return;
            default:
                System.out.println("lựa chọn bạn nhập không đúng");
        }
    }
}
}
