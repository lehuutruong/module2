package case_study.sercive.util.read_write.house;

import case_study.model.facility.House;
import case_study.model.facility.Villa;
import util.read_write.WriteFileUtil;

import java.util.List;

public class WriteFileHouse {
    public static void writeFileHouse(String path, List<House> houses)  {
        String data="codeService,nameService,areaUsable,costsRental,numberPeopleMax,typeRental,roomStandard,numberOfFloors\n";
        for (House house:houses
        ) {data+=house.toString()+"\n";

        }
        WriteFileUtil.writeFile(path,data);
    }

}
