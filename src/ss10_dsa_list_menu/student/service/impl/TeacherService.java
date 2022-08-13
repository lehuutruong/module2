package ss10_dsa_list_menu.student.service.impl;

import ss10_dsa_list_menu.student.model.Teacher;
import ss10_dsa_list_menu.student.service.ITeacherService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Teacher> teachers = new ArrayList<>();

    @Override
    public void addTeacher() {
        Teacher teacher = this.infoTeacher();
        teachers.add(teacher);
        System.out.println("Thêm giáo viên thành công");
    }

    @Override
    public void displayTeacher() {
        for (Teacher teacher : teachers
        ) {
            System.out.println(teacher);

        }
    }

    @Override
    public void removeTeacher() {
        Teacher teacher = this.findTeacher();
        if (teacher == null) {
            System.out.println("Không tìm thấy đối tượng cần xóa");
        } else {
            System.out.println("Bạn có chắc muốn xóa đối tượng có id là " + teacher.getId() + " không?");
            System.out.println("1. Có");
            System.out.println("2. Không");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                teachers.remove(teacher);
                System.out.println("Xóa thành công!");
            }
        }
    }

    public Teacher findTeacher() {
        System.out.println("mời bạn nhập vào id cần xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).getId() == id) {
                return teachers.get(i);
            }
        }
        return null;
    }

    public Teacher infoTeacher() {
        System.out.print("Mời bạn nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Mời bạn nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Mời bạn nhập ngày sinh: ");
        String dateOfBirth = scanner.nextLine();
        System.out.println("mời bạn nhập vào giới tính");
        String gener = scanner.nextLine();
        System.out.print("Mời bạn nhập vào chuyên môn: ");
        String position = scanner.nextLine();
        Teacher teacher = new Teacher(id, name, dateOfBirth, gener, position);
        return teacher;
    }
}

