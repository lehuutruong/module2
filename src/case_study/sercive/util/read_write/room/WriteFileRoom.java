package case_study.sercive.util.read_write.room;

import case_study.model.facility.House;
import case_study.model.facility.Room;
import util.read_write.WriteFileUtil;

import java.util.List;

public class WriteFileRoom {
    public void writeFileRoom(String path, List<Room> rooms)  {
        String data="codeService,nameService,areaUsable,costsRental,numberPeopleMax,typeRental,freeService\n";
        for (Room room:rooms
        ) {data+=room.toString()+"\n";

        }
        WriteFileUtil.writeFile(path,data);
    }
}
