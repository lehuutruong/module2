package util.read_write;

import java.io.*;

public class WriteFileUtil {
    public static void writeFile(String path, String data) throws IOException {
        File file=new File(path);
        FileWriter fileWriter=new FileWriter(file);
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        bufferedWriter.write(data);
        bufferedWriter.close();
    }
}
