package ss13_search_algorithm.exercise.teacher_student.service.impl;
import ss13_search_algorithm.exercise.teacher_student.model.Student;
import ss13_search_algorithm.exercise.teacher_student.model.Teacher;
import ss13_search_algorithm.exercise.teacher_student.service.ITeacher;

import java.util.*;

public class TeacherService implements ITeacher {
    public Scanner scanner = new Scanner(System.in);
    private static List<Teacher> teacherList = new ArrayList<>();

    @Override
    public void deleteTeacher() {
        Teacher teacher = findTeacher("Xóa");
        if (teacher == null) {
            System.out.println("Id này trong danh sách không tồn tại");
            return;
        }
        System.out.println("Bạn có chắn chắn muốn xóa giáo viên không ");
        System.out.println("1.Có");
        System.out.println("2.Không");
        int choice = Integer.parseInt(scanner.nextLine());
        if (choice == 1) {
            teacherList.remove(teacher);
            System.out.println("Xóa giáo viên thành công ");
        } else {
            System.out.println("Xóa giáo viên không thành không");
        }

    }

    @Override
    public void searchTeach() {
        System.out.println("BẠn muốn chọn tìm kiếm theo hạng mục nào");
        System.out.println("1.Tìm kiếm theo id");
        System.out.println("2.Tìm kiếm theo têm");
        int choice = Integer.parseInt(scanner.nextLine());
        if (choice == 1) {
            Teacher teacher = this.inputTeacher();
            if(teacher == null) {
                System.out.println("không tìm thấy đối tượng");
            } else {
                System.out.println("Giáo viên bạn cần tìm là: \n" + teacher);
            }
        } else if (choice == 2) {
            Teacher teacher = this.inputNameTeacher();
            if (teacher == null) {
                System.out.println("không tìm thấy đối tượng");
            } else {
                System.out.println("Giáo viên bạn cần tìm là:\n" + teacher);
            }
        } else {
            System.out.println("Bạn chọn sai mục");
        }

    }

    @Override
    public void sortIdTeach() {
        System.out.println("1.Sắp xếp theo giá tăng dần");
        System.out.println("2.Sắp xếp theo giá giảm dần");
        int choice=Integer.parseInt(scanner.nextLine());
        if(choice==1){
            Collections.sort(teacherList, new Comparator<Teacher>() {
                @Override
                public int compare(Teacher o1, Teacher o2) {
                    return o1.getId().compareTo(o2.getId());
                }
            });
        }
        else
        if (choice==2){
            Collections.sort(teacherList, new Comparator<Teacher>() {
                @Override
                public int compare(Teacher o1, Teacher o2) {
                    return o2.getId().compareTo(o1.getId());
                }
            });
            Collections.reverse(teacherList);
        }
        else {
            System.out.println("bạn nhập số không đúng");
        }
    }

    @Override
    public void sortNameTeach() {
        boolean isSwap = true;
        for (int i = 0; i < teacherList.size() - 1 && isSwap; i++) {
            isSwap = false;
            for (int j = 0; j < teacherList.size() - 1 - i; j++) {
                if (teacherList.get(j).getName().compareTo(teacherList.get(j+1).getName())>0) {
                    isSwap = true;
                    Teacher temp = teacherList.get(j+1);
                    teacherList.set(j+1,teacherList.get(j));
                    teacherList.set(j,temp);
                }
            }
        }
    }

    @Override
    public void addTeacher() {
        teacherList.add(this.inforTeacher());
        System.out.println("Đã thêm thành công giáo viên");
    }

    @Override
    public void displayTeacher() {
        for (Teacher item : teacherList
        ) {
            System.out.println(item.toString());
        }
    }

    @Override
    public void editTeacher() {
        Teacher teacher = findTeacher("chỉnh sửa");
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
                    teacher.setId(editInfoTeacher("ID"));
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

    public Teacher inforTeacher() {
        System.out.println("Mời bạn nhập vào thông tin giáo viên:");
        System.out.println("Nhập vào id=");
        String id = scanner.nextLine();
        System.out.println("Nhập vào tên giáo viên");
        String name = scanner.nextLine();
        System.out.println("Nhập vào ngày sinh của giáo viên:");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Nhập vào giới tính giáo viên:");
        String gender = scanner.nextLine();
        System.out.println("Nhập vào chuyên môn của giáo viên");
        String speciality = scanner.nextLine();
        return new Teacher(id, name, dateOfBirth, gender, speciality);
    }

    public Teacher findTeacher(String taskName) {
        System.out.println("Mời bạn nhập vào id cần tìm:" + taskName);
        String id =scanner.nextLine();
        for (Teacher teacher : teacherList
        ) {
            if (teacher.getId().equals(id)) {
                System.out.println(teacher);
            }
        }
        return null;
    }

    public String editInfoTeacher(String editContent) {
        System.out.println("Mời bạn nhập " + editContent + "mới:");
        return scanner.nextLine();
    }

    public Teacher inputTeacher() {
        System.out.println("mời bạn nhập vào id cần tìm");
        String id = scanner.nextLine();
        for (Teacher teacher : teacherList
        ) {
            if (teacher.getId().equals(id)) {
                System.out.println(teacher);
            }

        }
        return null;
    }

    public Teacher inputNameTeacher() {
        System.out.println("mời bạn nhập vào tên bạn cần tìm");
        String name = scanner.nextLine();
        for (Teacher teacher : teacherList
        ) {
            if (teacher.getName().contains(name)) {
                System.out.println(teacher);
            }

        }
        return null;
    }

}
