package ss13_search_algorithm.exercise.teacher_student.service.util;

import ss13_search_algorithm.exercise.teacher_student.model.Student;
import util.read_write.ReadFileUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadStudentFile {
    public static List<Student> readStudentFile(String path) throws IOException {
        List<String>strings= ReadFileUtil.readFile(path);
        List<Student>studentList=new ArrayList<>();
        String[] info;
        for (String string :
                strings) {
            info = string.split(",");
            studentList.add(new Student(info[0], info[1], info[2], info[3], Double.parseDouble(info[4]), info[5]));
        }
        return studentList;
    }
}