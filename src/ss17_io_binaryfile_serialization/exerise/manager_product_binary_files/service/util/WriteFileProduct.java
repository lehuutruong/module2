package ss17_io_binaryfile_serialization.exerise.manager_product_binary_files.service.util;


import java.io.*;
import java.util.List;

public class WriteFileProduct {
    public static <E> void WriteFile(String path, List<E> object) throws IOException {
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(object);
        objectOutputStream.close();
    }
}
