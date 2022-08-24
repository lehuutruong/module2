package ss13_search_algorithm.exercise.teacher_student.service.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFileUtil {
    public static void writelFile(String src, boolean append, List<String>list){
        FileWriter fileWriter;
        try{
            fileWriter=new FileWriter(src,append);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            for (int i = 0; i <list.size() ; i++) {
                bufferedWriter.write(list.get(i));
                bufferedWriter.newLine();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
