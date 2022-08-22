package ss13_search_algorithm.exercise.teacher_student.service.util;

import ss13_search_algorithm.exercise.teacher_student.model.Student;

import java.util.List;

public class WriteFileUtil {
    public void writeStudentFile(String path, List<Student> studentList) throws IOException {
        String data = "id,name,dateOfBirth,gender,score,className\n";

        for (Student student : studentList) {
            data += student.toString() + "\n";
        }

        WriteFileUtil.writeFile(path, data);
    }
}
