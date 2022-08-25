package ss13_search_algorithm.exercise.teacher_student.service.util;

import ss13_search_algorithm.exercise.teacher_student.model.Student;
import util.read_write.WriteFileUtil;

import java.io.IOException;
import java.util.List;

public class WriteStudentFile {
    public void writeStudentFile(String path, List<Student>students) throws IOException {
        String data ="id,name,dateOfBirth,gender,Score,className\n";
        for (Student student : students) {
            data += student.toString() + "\n";
        }

        WriteFileUtil.writeFile(path, data);
    }
}

