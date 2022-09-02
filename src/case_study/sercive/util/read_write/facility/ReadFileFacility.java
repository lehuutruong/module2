package case_study.sercive.util.read_write.facility;

import case_study.model.facility.Facility;
import case_study.model.facility.House;
import case_study.model.facility.Room;
import case_study.model.facility.Villa;
import util.read_write.ReadFileUtil;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ReadFileFacility {
    //    String codeService, String nameService, double areaUsable, double costsRental, int numberPeopleMax, String typeRental, String roomStandard, double areaPool, int numberOfFloors)
    public static Map<Facility, Integer> readFacilityFile(String path) {
        List<String> strings = ReadFileUtil.readFile(path);
        Map<Facility, Integer> facilityList = new LinkedHashMap<>();
        String[] info;
        for (String line : strings) {
            info = line.split(",");
            if (info[0].contains("SVVL")) {
                facilityList.put(new Villa(info[0], info[1], Double.parseDouble(info[2]), Double.parseDouble(info[3]), Integer.parseInt(info[4]), info[5], info[6], Double.parseDouble(info[7]), Integer.parseInt(info[8])), Integer.parseInt(info[9]));
            } else if (info[0].contains("SVHO")) {
                facilityList.put(new House(info[0], info[1], Double.parseDouble(info[2]), Double.parseDouble(info[3]), Integer.parseInt(info[4]), info[5], info[6], Integer.parseInt(info[7])), Integer.parseInt(info[8]));
            } else if (info[0].contains("SVRO")) {
                facilityList.put(new Room(info[0], info[1], Double.parseDouble(info[2]), Double.parseDouble(info[3]), Integer.parseInt(info[4]), info[5], info[6]), Integer.parseInt(info[7]));
            }
        }
        return facilityList;
    }
}
