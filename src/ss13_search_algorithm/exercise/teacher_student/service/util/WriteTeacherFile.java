package ss13_search_algorithm.exercise.teacher_student.service.util;

import ss13_search_algorithm.exercise.teacher_student.model.Teacher;
import util.read_write.WriteFileUtil;

import java.io.IOException;
import java.util.List;

public class WriteTeacherFile {
    public void writeTeacherFile(String path, List<Teacher> teachers) throws IOException {
        String data = "id,name,dateOfBirth,gender,speciality\n";
                 for (Teacher teacher : teachers) {
            data += teacher.toString() + "\n";
        }

        WriteFileUtil.writeFile(path, data);
    }
}
