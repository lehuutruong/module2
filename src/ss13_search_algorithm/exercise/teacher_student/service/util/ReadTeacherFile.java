package ss13_search_algorithm.exercise.teacher_student.service.util;

import ss13_search_algorithm.exercise.teacher_student.model.Teacher;
import util.read_write.ReadFileUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadTeacherFile {
    public static List<Teacher> readTeacherFile(String path) throws IOException {
        List<String>strings= ReadFileUtil.readFile(path);
        List<Teacher>teacherList=new ArrayList<>();
        String[] info;
        for (String string :
                strings) {
            info = string.split(",");
            teacherList.add(new Teacher(info[0], info[1], info[2], info[3], info[4]));
        }
        return teacherList;
    }
}
