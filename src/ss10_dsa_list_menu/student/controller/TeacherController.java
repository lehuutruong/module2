package ss10_dsa_list_menu.student.controller;

import ss10_dsa_list_menu.student.service.IStudentService;
import ss10_dsa_list_menu.student.service.ITeacherService;
import ss10_dsa_list_menu.student.service.impl.StudentService;
import ss10_dsa_list_menu.student.service.impl.TeacherService;

import java.util.Scanner;

public class TeacherController {
    private static Scanner scanner = new Scanner(System.in);
    private ITeacherService teacherService = new TeacherService();

    public  void menuManagementTeacher() {
        while (true) {
            System.out.println("---------------------------------------------");
            System.out.println("Chào mừng bạn đến với c06");
            System.out.println("1. Hiển thị danh sách giáo viên");
            System.out.println("2. Thêm mới giáo viên");
            System.out.println("3. Cập nhật thông tin giáo viên");
            System.out.println("4. Xóa giáo viên");
            System.out.println("5. Exit");
            System.out.println("Mời bạn nhập chức năng 1-5");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    teacherService.displayTeacher();
                    break;
                case 2:
                    teacherService.addTeacher();
                    break;
                case 4:
                    teacherService.removeTeacher();
                case 5:
                    return;
                default:
                    System.out.println("lựa chọn bạn nhập không đúng");
            }
        }
    }
}
