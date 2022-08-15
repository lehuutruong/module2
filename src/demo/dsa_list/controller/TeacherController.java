package demo.dsa_list.controller;

import demo.dsa_list.service.ITeacherService;
import demo.dsa_list.service.impl.TeacherService;

import java.util.Scanner;

public class TeacherController {
    public static Scanner scanner = new Scanner(System.in);
    public static ITeacherService iTeacherService = new TeacherService();

    public static void teacherManage() {
        while (true) {
            System.out.println("---------------------------------");
            System.out.println("Chào mừng bạn đến với CodeGym - Teacher:");
            System.out.println("1. Hiển thị danh sách giáo viên");
            System.out.println("2. Thêm mới giáo viên");
            System.out.println("3. Cập nhật thông tin giáo viên");
            System.out.println("4. Xóa giáo viên");
            System.out.println("5. Trở lại CodeGym menu");
            System.out.println("6. Thoát");
            System.out.print("Mời bạn nhập chức năng 1->6: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    iTeacherService.displayAllTeacher();
                    break;
                case 2:
                    iTeacherService.addNewTeacher();
                    break;
                case 3:
                    iTeacherService.editTeacher();
                    break;
                case 4:
                    iTeacherService.removeTeacher();
                    break;
                case 5:
                    return;
                case 6:
                    CodeGymController.continueRunning = false;
                    return;
                default:
                    System.out.println("Lựa chọn bạn nhập không đúng!");
            }
        }
    }
}
