package ss17_io_binaryfile_serialization.exerise.copy_binary_files;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CopyBinaryFiles {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        copy();
    }
// ghi file

    public static <List> void writeFile(String path, List object) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(object);
    }
//đọc file

    public static String readFile(String objectList) throws IOException, ClassNotFoundException {
        List<String> files = new ArrayList<>();
                FileInputStream fileInputStream = new FileInputStream(objectList);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        files = (List<String>) objectInputStream.readObject();
        return objectList;
    }
//copy file

    public static void copy() throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào cái source ");
        String source = scanner.nextLine();
        System.out.print("Nhập vào cái target ");
        String target = scanner.nextLine();
        File inputStream = new File(source);
        List<String> files = Collections.singletonList(readFile(source));
                writeFile(target, files);
        System.out.println(+inputStream.length());
    }
}
