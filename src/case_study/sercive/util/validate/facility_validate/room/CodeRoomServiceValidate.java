package case_study.sercive.util.validate.facility_validate.room;

import case_study.model.facility.Room;
import case_study.sercive.util.exeption.customer_exception.CodeCustomerException;
import case_study.sercive.util.read_write.room.ReadFileRoom;

import java.util.List;
import java.util.Scanner;

public class CodeRoomServiceValidate {
    private static Scanner scanner = new Scanner(System.in);

    public static String codeRoomServiceValidate() {
        ReadFileRoom readFileRoom = new ReadFileRoom();
        String src = "module2\\src\\case_study\\data\\Room.csv";
        List<Room>rooms=readFileRoom.readFileRoom(src);
        String codeRoomService;
        while (true) {
            try {
                System.out.println("Enter code service");
                codeRoomService = scanner.nextLine();
                if (codeRoomService.equals("")) {
                    throw new CodeCustomerException("CodeService cannot be blank");
                }
                for (Room room : rooms
                ) {
                    if (codeRoomService.equals(room.getCodeService())) {
                        throw new CodeCustomerException(" CodeService appeared");
                    }
                }
                if (!codeRoomService.matches("[S]+[V]+[R]+[O]+[-]+[0-9]{4}"))
                    throw new CodeCustomerException("Code Service is not correct format");
                break;
            } catch (CodeCustomerException e) {
                System.out.println(e.getMessage());
            }
        }
        return codeRoomService;
    }
}
