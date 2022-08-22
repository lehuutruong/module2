package demo.util;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileUtil {
    private static List<String> readFile(String path) throws IOException {
        File file=new File(path);
        FileReader fileReader=new FileReader(file);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String line;
        List<String> strings=new ArrayList<>();
        while((line=bufferedReader.readLine())!=null){
            strings.add(line);
        }
        bufferedReader.close();
        return strings;
    }
}
