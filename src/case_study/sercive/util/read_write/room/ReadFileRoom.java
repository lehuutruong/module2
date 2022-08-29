package case_study.sercive.util.read_write.room;

import case_study.model.facility.Room;
import util.read_write.ReadFileUtil;

import java.util.ArrayList;
import java.util.List;

public class ReadFileRoom {
    public static List<Room> readFileRoom(String path) {
        List<String> strings = ReadFileUtil.readFile(path);
        List<Room> rooms = new ArrayList<>();
        String[] info;
        for (String string : strings
        ) {
            info = string.split(",");
            rooms.add(new Room(info[0], info[1], Double.parseDouble(info[2]), Double.parseDouble(info[3]),Integer.parseInt(info[4]), info[5], info[6]));

        }
        return rooms;
    }
}
