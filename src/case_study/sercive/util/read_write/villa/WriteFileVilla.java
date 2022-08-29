package case_study.sercive.util.read_write.villa;

import case_study.model.facility.Villa;
import case_study.model.person.Customer;
import util.read_write.WriteFileUtil;

import java.util.List;

public class WriteFileVilla {
    public void writeFileVilla(String path, List<Villa> villas)  {
        String data="codeService,nameService,areaUsable,costsRental,numberPeopleMax,typeRental,roomStandard,areaPool,numberOfFloors\n";
        for (Villa villa:villas
        ) {data+=villa.toString()+"\n";

        }
        WriteFileUtil.writeFile(path,data);
    }

}
