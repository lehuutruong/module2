package ss17_io_binaryfile_serialization.exerise.manager_product_binary_files.service.util;


import java.io.*;
import java.util.List;

public class ReadFileProduct {
    public static <E> List<E> ReadFile(String path, List<E> object) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream=new FileInputStream(path);
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        object=(List<E>) objectInputStream.readObject();
        objectInputStream.close();
        return object;
    }

}
