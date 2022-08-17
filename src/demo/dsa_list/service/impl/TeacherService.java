package demo.dsa_list.service.impl;

import demo.dsa_list.model.Teacher;
import demo.dsa_list.service.ITeacherService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService  implements ITeacherService {
    private Scanner scanner = new Scanner(System.in);
    private static List<Teacher> teacherList = new ArrayList<>();

    static {
        teacherList.add(new Teacher(1, "QuangNN", "3030", "Nam", "Intructor"));
        teacherList.add(new Teacher(2, "HaiTT", "2313", "Nam", "Tutor"));
    }

    @Override
    public void addNewTeacher() {
        teacherList.add(getInforTeacher());
        System.out.println("Thêm giáo viên thành công!");
    }

    @Override
    public void displayAllTeacher() {
        for (Teacher teacher : teacherList
        ) {
            System.out.println(teacher.toString());
        }
    }

    @Override
    public void removeTeacher() {
        Teacher teacher = findTeacherById("xóa");
        if (teacher == null) {
            System.out.println("ID này không tồn tại trong danh sách.");
            return;
        }
        System.out.println("Bạn có chắc chắn muốn xóa giáo viên này không?");
        System.out.println(teacher.toString());
        System.out.println("1- Có ----------------- 2- Không");
        int choose = Integer.parseInt(scanner.nextLine());
        if (choose == 1) {
            teacherList.remove(teacher);
            System.out.println("Xóa giáo viên thành công");
        } else {
            System.out.println("Xóa giáo viên không thành công");
        }
    }

    @Override
    public void editTeacher() {
        Teacher teacher = findTeacherById("chỉnh sửa");
        int choose;
        do {
            System.out.println("---------------------------------------------");
            System.out.println("Giáo viên cần chỉnh sửa:");
            System.out.println(teacher.toString());
            System.out.println("Bạn muốn chỉnh sửa nội dung nào?");
            System.out.println("1. ID");
            System.out.println("2. Tên học sinh");
            System.out.println("3. Ngày sinh");
            System.out.println("4. Giới tính");
            System.out.println("5. Chuyên môn");
            System.out.println("6. Thoát");
            System.out.println("Chọn nội dung cần chỉnh sửa: 1 -> 6");
            choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    teacher.setId(Integer.parseInt(getEditInfor("ID")));
                    break;
                case 2:
                    teacher.setName(getEditInfor("tên"));
                    break;
                case 3:
                    teacher.setDateOfBirth(getEditInfor("ngày sinh"));
                    break;
                case 4:
                    teacher.setGender(getEditInfor("giới tính"));
                    break;
                case 5:
                    teacher.setSpeciality(getEditInfor("chuyên môn"));
                    break;
                case 6:
                    return;
            }
            System.out.println("Chỉnh sửa thành công!");
            System.out.println("Bạn có muốn tiếp tục chỉnh sửa?");
            System.out.println("1- Có ------------- 2- Hoàn tất");
            choose = Integer.parseInt(scanner.nextLine());
            if (choose != 1) {
                return;
            }
        } while (true);
    }

    public Teacher getInforTeacher() {
        System.out.println("Vui lòng nhập thông tin c ho giáo viên: ");
        System.out.println("Id= ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Tên = ");
        String name = scanner.nextLine();
        System.out.print("Ngày sinh = ");
        String dateOfBirth = scanner.nextLine();
        System.out.print("Giới tính = ");
        String gender = scanner.nextLine();
        System.out.print("Chuyên môn = ");
        String speciality = scanner.nextLine();
        return new Teacher(id, name, dateOfBirth, gender, speciality);
    }

    public String getEditInfor(String editContent) {
        System.out.print("Vui lòng nhập "+ editContent+ " mới: ");
        return scanner.nextLine();
    }

    public Teacher findTeacherById(String taskName) {
        System.out.print("Mời bạn nhập ID của giáo viên cần " + taskName);
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).getId() == id) {
                return teacherList.get(i);
            }
        }
        return null;
    }
}
