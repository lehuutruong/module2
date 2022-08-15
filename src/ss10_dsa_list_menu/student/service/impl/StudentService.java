package ss10_dsa_list_menu.student.service.impl;

import ss10_dsa_list_menu.student.model.Student;
import ss10_dsa_list_menu.student.service.IStudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Student> students = new ArrayList<>();
    @Override
    public void addStudent() {
        Student student = this.infoStudent();
        students.add(student);
        System.out.println("Thêm học sinh thành công");
    }

    @Override
    public void displayAllStudent() {
        for (Student student : students
        ) {
            System.out.println(student);

        }
    }
    @Override
    public void editStudent() {
        Student student = this.findStudent();
        int choose;
        do {
            System.out.println("---------------------------------------------");
            System.out.println("Sinh viên cần chỉnh sửa:");
            System.out.println(student.toString());
            System.out.println("Bạn muốn chỉnh sửa nội dung nào?");
            System.out.println("1. ID");
            System.out.println("2. Tên học sinh");
            System.out.println("3. Ngày sinh");
            System.out.println("4. Giới tính");
            System.out.println("5. Điểm số");
            System.out.println("6. Tên lớp");
            System.out.println("7. Thoát");
            System.out.println("Chọn nội dung cần chỉnh sửa: 1 -> 7");
            choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    student.setId(Integer.parseInt(getEditInfor("ID")));
                    break;
                case 2:
                    student.setName(getEditInfor("tên"));
                    break;
                case 3:
                    student.setDateOfBirth(getEditInfor("ngày sinh"));
                    break;
                case 4:
                    student.setGender(getEditInfor("giới tính"));
                    break;
                case 5:
                    student.setScore(Integer.parseInt(getEditInfor("điểm")));
                    break;
                case 6:
                    student.setClassName(getEditInfor("tên lớp"));
                    break;
                case 7:
                    return;
            }
            System.out.println("Chỉnh sửa thành công!");
            System.out.println("Bạn có muốn tiếp tục chỉnh sửa?");
            System.out.println("1- Có ------------- 2- Hoàn tất");
            choose = Integer.parseInt(scanner.nextLine());
            if(choose != 1) {return;}
        } while (true);
    }

    @Override
    public void removeStudent() {
        Student student = this.findStudent();
        if(student == null) {
            System.out.println("Không tìm thấy đối tượng cần xóa");
        } else {
            System.out.println("Bạn có chắc muốn xóa đối tượng có id là "+student.getId()+" không?");
            System.out.println("1. Có");
            System.out.println("2. Không");
            int choice = Integer.parseInt(scanner.nextLine());
            if(choice == 1) {
                students.remove(student);
                System.out.println("Xóa thành công!");
            }
        }
    }
    public String getEditInfor(String editContent){
        System.out.print("Vui lòng nhập "+ editContent+ " mới: ");
        return scanner.nextLine();
    }
    public Student findStudent(){
        System.out.println("mời bạn nhập vào id cần xóa: ");
        int id=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <students.size() ; i++) {
            if(students.get(i).getId()==id){
                return students.get(i);
            }
        }
        return null;
    }
    public Student infoStudent() {
        System.out.print("Mời bạn nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Mời bạn nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Mời bạn nhập ngày sinh: ");
        String dateOfBirth = scanner.nextLine();
        System.out.println("mời bạn nhập vào giới tính");
        String gener=scanner.nextLine();
        System.out.print("Mời bạn nhập điểm: ");
        double point = Double.parseDouble(scanner.nextLine());
        System.out.print("Mời bạn nhập tên lớp: ");
        String nameClass = scanner.nextLine();
        Student student = new Student(id, name, dateOfBirth, gener, point, nameClass) {
            @Override
            public void setGender(String giới_tính) {

            }

            @Override
            public void setScore(int điểm) {

            }

            @Override
            public void setClassName(String tên_lớp) {

            }
        };
        return student;
    }
}
