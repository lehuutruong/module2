package case_study.sercive.util.read_write.villa;

import case_study.model.facility.Villa;
import case_study.model.person.Customer;
import util.read_write.ReadFileUtil;

import java.util.ArrayList;
import java.util.List;

public class ReadFileVilla {
    public static List<Villa> readFileVilla(String path) {
        List<String> strings = ReadFileUtil.readFile(path);
        List<Villa> villas = new ArrayList<>();
        String[] info;
        for (String string : strings
        ) {
            info = string.split(",");
            villas.add(new Villa(info[0], info[1], Double.parseDouble(info[2]), Double.parseDouble(info[3]),Integer.parseInt(info[4]), info[5], info[6], Double.parseDouble(info[7]), Integer.parseInt(info[8])));

        }
        return villas;
    }
}
