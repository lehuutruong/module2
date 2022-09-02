package case_study.sercive.util.read_write.facility;

import case_study.model.facility.Facility;
import util.read_write.WriteFileUtil;

import java.util.Map;
import java.util.Set;

public class WriteFileFacility {
    public static void writeFacilityFile(String path, Map<Facility, Integer> facilities)  {
        String data = "codeService,nameService,areaUsable,costsRental,numberPeopleMax,typeRental,roomStandard,numberOfFloors\n";
        Set<Facility> facilitySet = facilities.keySet();
        for (Facility facility : facilitySet) {
            data += facility.toString() + "," + facilities.get(facility);
            data += "\n";
        }
        WriteFileUtil.writeFile(path, data);
    }
}
