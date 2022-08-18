package ss13_search_algorithm.exercise.teacher_student.controller;
import ss13_search_algorithm.exercise.teacher_student.service.ITeacher;
import ss13_search_algorithm.exercise.teacher_student.service.impl.TeacherService;

import java.util.Scanner;

public class TeacherController {
    public static Scanner scanner = new Scanner(System.in);
    public static ITeacher iTeacherService =  new TeacherService();
    public static void teacherManage() {
        while (true) {
            System.out.println("---------------------------------");
            System.out.println("Chào mừng bạn đến với CodeGym - Teacher:");
            System.out.println("1. Hiển thị danh sách giáo viên");
            System.out.println("2. Thêm mới giáo viên");
            System.out.println("3. Cập nhật thông tin giáo viên");
            System.out.println("4. Xóa giáo viên");
            System.out.println("5. Tìm kiếm giáo viên ");
            System.out.println("6. Săp xếp giáo viên ");
            System.out.println("7. Trở lại menu chính ");
            System.out.println("8. Thoát");
            System.out.print("Mời bạn nhập chức năng 1->7: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    iTeacherService.displayTeacher();
                    break;
                case 2:
                    iTeacherService.addTeacher();
                    break;
                case 3:
                    iTeacherService.editTeacher();
                    break;
                case 4:
                    iTeacherService.deleteTeacher();
                    break;
                case 5:
                    iTeacherService.searchTeach();
                    break;
                case 6:
                    iTeacherService.sortNameTeach();
                    break;
                case 7:
                    return;
                case 8:
                    MainController.continueRunning = false;
                    return;
                default:
                    System.out.println("Lựa chọn bạn nhập không đúng!");
            }
        }
    }
}
