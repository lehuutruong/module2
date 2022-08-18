package demo.dsa_list.controller;
import demo.dsa_list.service.IStudentService;
import demo.dsa_list.service.impl.StudentService;

import java.util.Scanner;
public class StudentController {
    private Scanner scanner = new Scanner(System.in);
    private IStudentService studentService = new StudentService();
    private static int choice;
    public void studentManage() {
        while (true) {
            System.out.println("---------------------------------------------");
            System.out.println("Chào mừng bạn đến với CodeGym - Student");
            System.out.println("1. Hiển thị danh sách học viên");
            System.out.println("2. Thêm mới học sinh");
            System.out.println("3. Cập nhật thông tin học sinh");
            System.out.println("4. Xóa học sinh");
            System.out.println("5. Trở lại menu chính");
            System.out.println("6. Thoát");
            System.out.print("Mời bạn nhập chức năng 1->6: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    studentService.displayAllStudent();
                    break;
                case 2:
                    studentService.addStudent();
                    break;
                case 3:
                    studentService.editStudent();
                    break;
                case 4:
                    studentService.removeStudent();
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

