package ss13_search_algorithm.exercise.teacher_student.service.impl;
import ss13_search_algorithm.exercise.teacher_student.model.Teacher;
import ss13_search_algorithm.exercise.teacher_student.service.ITeacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacher {
    public Scanner scanner=new Scanner(System.in);
    private  static List<Teacher> teacherList=new ArrayList<>();
      @Override
    public  void deleteTeacher() {
     Teacher teacher=findTeacher("Xóa");
        if(teacher==null){
            System.out.println("Id này trong danh sách không tồn tại");
            return;
        }
          System.out.println("Bạn có chắn chắn muốn xóa giáo viên không ");
          System.out.println("1.Có");
          System.out.println("2.Không");
          int choice=Integer.parseInt(scanner.nextLine());
          if(choice==1){
              teacherList.remove(teacher);
              System.out.println("Xóa giáo viên thành công ");
          }
          else {
              System.out.println("Xóa giáo viên không thành không");
          }

    }

    @Override
    public void searchTeach() {

    }

    @Override
    public void addTeacher() {
        teacherList.add(this.inforTeacher());
        System.out.println("Đã thêm thành công giáo viên");
    }

    @Override
    public void displayTeacher() {
        for (Teacher item:teacherList
        ) {
            System.out.println(item.toString());
        }
    }

    @Override
    public void editTeacher() {
     Teacher teacher=findTeacher("chỉnh sửa");
        int choose;
        do {
            System.out.println("--------------------");
            System.out.println("Giáo viên cần chỉnh sửa");
            System.out.println(teacher.toString());
            System.out.println("Bạn muốn chỉnh sửa nội dung nào?");
            System.out.println("1. ID");
            System.out.println("2. Tên Giáo viên");
            System.out.println("3. Ngày sinh");
            System.out.println("4. Giới tính");
            System.out.println("5. Chuyên môn");
            System.out.println("6. Thoát");
            System.out.println("Chọn nội dung cần chỉnh sửa: 1 -> 6");
            choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    teacher.setId(Integer.parseInt(editInfoTeacher("ID")));
                    break;
                case 2:
                    teacher.setName(editInfoTeacher("tên"));
                    break;
                case 3:
                    teacher.setDateOfBirth(editInfoTeacher("ngày sinh"));
                    break;
                case 4:
                    teacher.setGender(editInfoTeacher("giới tính"));
                    break;
                case 5:
                    teacher.setSpeciality(editInfoTeacher("chuyên môn"));
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
    public Teacher inforTeacher(){
        System.out.println("Mời bạn nhập vào thông tin giáo viên:");
        System.out.println("Nhập vào id=");
        int id=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào tên giáo viên");
        String name=scanner.nextLine();
        System.out.println("Nhập vào ngày sinh của giáo viên:");
        String dateOfBirth=scanner.nextLine();
        System.out.println("Nhập vào giới tính giáo viên:");
        String gender=scanner.nextLine();
        System.out.println("Nhập vào chuyên môn của giáo viên");
        String speciality=scanner.nextLine();
       return new Teacher(id,name,dateOfBirth,gender,speciality);
    }
    public Teacher findTeacher(String taskName){
        System.out.println("Mời bạn nhập vào id cần tìm:"+taskName);
        int id=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <teacherList.size() ; i++) {
            if(teacherList.get(i).getId()==id){
                return teacherList.get(i);
            }
        }
        return null;
    }
    public String editInfoTeacher(String editContent){
        System.out.println("Mời bạn nhập "+editContent+"mới:");
        return scanner.nextLine();
    }
}
