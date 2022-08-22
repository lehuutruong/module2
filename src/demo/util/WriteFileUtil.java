package demo.util;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import javax.print.DocFlavor;
import java.io.*;
import java.util.List;

public class WriteFileUtil {
    private static void writeFile(String path,String data) throws IOException {
        File file=new File(path);
        FileWriter fileWriter=new FileWriter(file);
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        bufferedWriter.close();
    }
}
