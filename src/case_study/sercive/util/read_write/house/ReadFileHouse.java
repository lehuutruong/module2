package case_study.sercive.util.read_write.house;

import case_study.model.facility.House;
import case_study.model.facility.Villa;
import util.read_write.ReadFileUtil;

import java.util.ArrayList;
import java.util.List;

public class ReadFileHouse {
    public static List<House> readFileHouse(String path) {
        List<String> strings = ReadFileUtil.readFile(path);
        List<House> houses = new ArrayList<>();
        String[] info;
        for (String string : strings
        ) {
            info = string.split(",");
            houses.add(new House(info[0], info[1], Double.parseDouble(info[2]), Double.parseDouble(info[3]),Integer.parseInt(info[4]), info[5], info[6],Integer.parseInt(info[7])));

        }
        return houses;
    }
}
