package ss13_search_algorithm.exercise.teacher_student.service.impl;

import ss13_search_algorithm.exercise.teacher_student.model.Student;
import ss13_search_algorithm.exercise.teacher_student.service.IStudent;
import ss13_search_algorithm.exercise.teacher_student.service.util.PointException;
import ss13_search_algorithm.exercise.teacher_student.service.util.ReadStudentFile;
import ss13_search_algorithm.exercise.teacher_student.service.util.WriteStudentFile;

import java.io.IOException;
import java.util.*;

public class StudentService implements IStudent {
    public Scanner scanner = new Scanner(System.in);
    private static final String PATH="module2\\src\\ss13_search_algorithm\\exercise\\teacher_student\\data\\Student.csv";
    ReadStudentFile readStudentFile=new ReadStudentFile();
    WriteStudentFile writeStudentFile=new WriteStudentFile();
    private static List<Student> studentList;
    @Override
    public void addStudent() throws IOException {
        studentList=readStudentFile.readStudentFile(PATH);
        Student student=this.getInforStudent();
        studentList.add(student);
        writeStudentFile.writeStudentFile(PATH,studentList);
        System.out.println("Thêm học sinh mới thành công");
    }

    @Override
    public void displayStudent() throws IOException {
        System.out.println("-------Danh sách sinh viên-----------");
        studentList=readStudentFile.readStudentFile(PATH);
        for (Student student : studentList
        ) {
            System.out.println(student.toString());
        }
    }

    @Override
    public void deleteStudent() {
        Student student = findStudentByID("xóa");
        if (student == null) {
            System.out.println("ID không tồn tại trong danh sách!");
            return;
        }
        System.out.println("Bạn có chắc chắn xóa sinh viên này không?");
        System.out.println(student.toString());
        System.out.println("1- Có -----------2- Không");
        int choose = Integer.parseInt(scanner.nextLine());
        if (choose == 1) {
            studentList.remove(student);
            System.out.println("Xóa sinh viên thành công");
        } else {
            System.out.println("Xóa sinh viên không thành công");
        }
    }

    @Override
    public void editStudent() {
        Student student = findStudentByID("chỉnh sửa");
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
                    student.setId(getEditInfor("ID"));
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
                    student.setNameClass(getEditInfor("tên lớp"));
                    break;
                case 7:
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

    @Override
    public void searchStudent() {
        System.out.println("BẠn muốn chọn tìm kiếm theo hạng mục nào");
        System.out.println("1.Tìm kiếm theo id");
        System.out.println("2.Tìm kiếm theo têm");
        int choice = Integer.parseInt(scanner.nextLine());
        if (choice == 1) {
            Student student = this.inputStudent();
            if (student == null) {
                System.out.println("không tìm thấy đối tượng");
            } else {
                System.out.println("Giáo viên bạn cần tìm là: \n" + student);
            }
        } else if (choice == 2) {
            Student student = this.inputNameStudent();
            if (student == null) {
                System.out.println("không tìm thấy đối tượng");
            } else {
                System.out.println("Giáo viên bạn cần tìm là:\n" + student);
            }
        } else {
            System.out.println("Bạn chọn sai mục");
        }
    }

    @Override
    public void sortIdStudent() {

    }

    @Override
    public void sortNameStudent() {
        boolean isSwap = true;
        for (int i = 0; i < studentList.size() - 1 && isSwap; i++) {
            isSwap = false;
            for (int j = 0; j < studentList.size() - 1 - i; j++) {
                if (studentList.get(j).getName().compareTo(studentList.get(j + 1).getName()) > 0) {
                    isSwap = true;
                    Student temp = studentList.get(j + 1);
                    studentList.set(j + 1, studentList.get(j));
                    studentList.set(j, temp);
                }
            }
        }
    }

    public Student getInforStudent() {
        System.out.println("Vui lòng nhập thông tin cho sinh viên: ");
        String id;
        while (true) {
            boolean checkId = false;
            boolean checkId2=false;
            System.out.println("Mời bạn nhập id");
            id = scanner.nextLine();
            for (Student item : studentList
            ) {
                if (item.getId().equalsIgnoreCase(id)) {
                    System.out.println("đã có id này rồi");
                    checkId = true;
                }
            }
           try {
               if(id.equals("")){
                   checkId2=true;
                   throw new PointException("Bạn không thể để trông id:");
               }
           }
           catch (PointException e){
               System.out.println(e.getMessage());
           }
            if (!checkId&&!checkId2) {
                break;
            }
        }

        String name;
        while (true){
            try {
                System.out.print("Tên = ");
                name = scanner.nextLine();
                if(!name.matches("[\\W\\D]{5,50}")){
                    throw new PointException("Bạn nhập sai định dạng");
                }
                break;
            }catch (PointException e){
                System.out.println(e.getMessage());
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        String dateOfBirth;
        while (true){
            try {
                System.out.print("Ngày sinh = ");
               dateOfBirth = scanner.nextLine();
                if(!dateOfBirth.matches("\\d{1,2}+[/]+\\d{1,2}+[/]+\\d{4}")){
                    throw new PointException("Bạn nhập sai định dạng");
                }
                break;
            }catch (PointException e){
                System.out.println(e.getMessage());
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

        double score;
        while (true) {
            try {
                System.out.print("Mời bạn nhập điểm: ");
                score = Double.parseDouble(scanner.nextLine());
                if (score < 0 || score > 100) {
                    throw new PointException("Bạn không thể nhập điểm nhỏ hơn 0 hoặc lớn hơn 100");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Bạn nhập không phải là số. Yêu cầu nhập lại.");
            } catch (PointException p) {
                System.err.println(p.getMessage());
            } catch (Exception e) {

            }

        }
        String gender;
        while (true) {
            try {
                System.out.print("Mời bạn nhập giới tính: ");
                gender = scanner.nextLine();
                if (!gender.equals("nam") && (!gender.equals("nu"))) {
                    throw new PointException("Dữ liệu bạn nhập không hợp lệ");
                }
                break;
            } catch (PointException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        String className;
        while (true) {
            try {
                System.out.print("Mời bạn nhập tên lớp: ");
                className = scanner.nextLine();
                if (!className.matches("[AC]\\d{4}[GI][1]")) {
                    throw new PointException("Tên lớp không hợp lệ");
                }
                break;
            } catch (PointException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return new Student(id, name, dateOfBirth, gender, score, className);
    }

    public String getEditInfor(String editContent) {
        System.out.print("Vui lòng nhập " + editContent + " mới: ");
        return scanner.nextLine();
    }

    public Student findStudentByID(String taskName) {
        System.out.print("Vui lòng nhập ID của Học sinh cần " + taskName);
        String id = scanner.nextLine();
        for (Student student : studentList
        ) {
            if (student.getId().equals(id)) {
                System.out.println(student);
            }

        }
        return null;
    }

    public Student inputStudent() {
        System.out.println("mời bạn nhập vào id cần tìm");
        String id = scanner.nextLine();
        for (Student student : studentList
        ) {
            if (student.getId().equals(id)) {
                return student;
            }

        }
        return null;
    }

    public Student inputNameStudent() {
        System.out.println("mời bạn nhập vào tên bạn cần tìm");
        String name = scanner.nextLine();
        for (Student student : studentList
        ) {
            if (student.getName().contains(name)) {
                return student;
            }

        }
        return null;
    }
}

