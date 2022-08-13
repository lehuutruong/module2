package ss10_dsa_list_menu.student.controller;

import ss10_dsa_list_menu.student.service.IStudentService;
import ss10_dsa_list_menu.student.service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    private static Scanner scanner=new Scanner(System.in);
    private IStudentService studentService=new StudentService();
    public  void menuManagement(){
        while(true){
            System.out.println("---------------------------------------------");
            System.out.println("Chào mừng bạn đến với c06");
            System.out.println("1. Hiển thị danh sách học viên");
            System.out.println("2. Thêm mới học sinh");
            System.out.println("3. Cập nhật thông tin học sinh");
            System.out.println("4. Xóa học sinh");
            System.out.println("5. Exit");
            System.out.println("Mời bạn nhập chức năng 1-5");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    studentService.displayAllStudent();
                    break;
                case 2:
                    studentService.addStudent();
                    break;
                case 4:
                    studentService.removeStudent();
                case 5:
                    return;
                default:
                    System.out.println("lựa chọn bạn nhập không đúng");
            }
        }
    }

}
