package ss13_search_algorithm.exercise.teacher_student.controller;

import ss13_search_algorithm.exercise.teacher_student.service.IStudent;
import ss13_search_algorithm.exercise.teacher_student.service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    private Scanner scanner = new Scanner(System.in);
    private IStudent studentService = (IStudent) new StudentService();
    private static int choice;
    public void studentManage() {
        while (true) {
            System.out.println("---------------------------------------------");
            System.out.println("Chào mừng bạn đến với CodeGym - Student");
            System.out.println("1. Hiển thị danh sách học viên");
            System.out.println("2. Thêm mới học sinh");
            System.out.println("3. Cập nhật thông tin học sinh");
            System.out.println("4. Xóa học sinh");
            System.out.println("5. Tìm kiếm sinh viên");
            System.out.println("6. Trở lại menu chính");
            System.out.println("7. Thoát");
            System.out.print("Mời bạn nhập chức năng 1->7: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    studentService.displayStudent();
                    break;
                case 2:
                    studentService.addStudent();
                    break;
                case 3:
                    studentService.editStudent();
                    break;
                case 4:
                    studentService.deleteStudent();
                    break;
                case 5:
                    studentService.searchStudent();
                    break;
                case 6:
                    return;
                case 7:
                    MainController.continueRunning = false;
                    return;
                default:
                    System.out.println("Lựa chọn bạn nhập không đúng!");
            }
        }
    }
}
