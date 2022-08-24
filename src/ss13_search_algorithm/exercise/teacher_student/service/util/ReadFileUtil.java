package ss13_search_algorithm.exercise.teacher_student.service.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileUtil {
    public static List<String>readFile(String src){
        FileReader file=null;
        String line="";
        List<String>strings=new ArrayList<>();
        BufferedReader bufferedReader=null;
        try{
            file=new FileReader(src);
            bufferedReader=new BufferedReader(file);
            while ((line=bufferedReader.readLine())!=null){
                strings.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try{
                bufferedReader.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
       return strings;
    }
}
