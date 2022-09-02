package case_study.sercive.impl;

import case_study.model.facility.Facility;
import case_study.model.facility.House;
import case_study.model.facility.Room;
import case_study.model.facility.Villa;
import case_study.sercive.IFacilityService;
import case_study.sercive.util.read_write.facility.ReadFileFacility;
import case_study.sercive.util.read_write.facility.WriteFileFacility;
import case_study.sercive.util.read_write.house.ReadFileHouse;
import case_study.sercive.util.read_write.house.WriteFileHouse;
import case_study.sercive.util.read_write.room.ReadFileRoom;
import case_study.sercive.util.read_write.room.WriteFileRoom;
import case_study.sercive.util.read_write.villa.ReadFileVilla;
import case_study.sercive.util.read_write.villa.WriteFileVilla;
import case_study.sercive.util.validate.facility_validate.facility.*;
import case_study.sercive.util.validate.facility_validate.house.CodeHouseServiceValidate;
import case_study.sercive.util.validate.facility_validate.room.CodeRoomServiceValidate;
import case_study.sercive.util.validate.facility_validate.room.FreeServiceValidate;
import case_study.sercive.util.validate.facility_validate.villa.AreaPoolValidate;
import case_study.sercive.util.validate.facility_validate.villa.CodeVillaServiceValidate;
import case_study.sercive.util.validate.facility_validate.villa.NumberOfFloorsValidate;
import case_study.sercive.util.validate.facility_validate.villa.RoomStandardValidate;

import java.util.*;

public class FacilityServiceImpl implements IFacilityService {
    private static Scanner scanner = new Scanner(System.in);
    private List<Villa> villas = new ArrayList<>();
    //    ReadFileVilla readFileVilla = new ReadFileVilla();
//    WriteFileVilla writeFileVilla = new WriteFileVilla();
    final String PATH_VILLA = "module2\\src\\case_study\\data\\Villa.csv";
    private List<House> houses = new ArrayList<>();
    //    ReadFileHouse readFileHouse = new ReadFileHouse();
//    WriteFileHouse writeFileHouse = new WriteFileHouse();
    final String PATH_HOUSE = "module2\\src\\case_study\\data\\House.csv";
    private List<Room> rooms = new ArrayList<>();
    //    ReadFileRoom readFileRoom = new ReadFileRoom();
//    WriteFileRoom writeFileRoom = new WriteFileRoom();
    final String PATH_ROOM = "module2\\src\\case_study\\data\\Room.csv";
    final String PATH_FACILITY="module2\\src\\case_study\\data\\Facilyti.csv";
    public static Map<Facility, Integer> facilities = new LinkedHashMap<>();
    private static final Map<Facility, Integer> facilityMaintenance = new LinkedHashMap<>();
    static int choice;

    @Override
    public void displayListFacility() {
        facilities = ReadFileFacility.readFacilityFile(PATH_FACILITY);
        Set<Facility> facilitySet = facilities.keySet();
        for (Facility facility : facilitySet) {
            System.out.println(facility.toString() + "," + facilities.get(facility));
        }
        WriteFileFacility.writeFacilityFile(PATH_FACILITY,facilities);
    }

    @Override
    public void addNewFacility() {
        facilities = ReadFileFacility.readFacilityFile(PATH_FACILITY);
        System.out.println("Facility wants to add");
        System.out.println("1. Add New Villa");
        System.out.println("2. Add New House");
        System.out.println("3. Add New Room");
        System.out.println("4. Back to menu");
        choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                addNewVilla();
                break;
            case 2:
                addNewHouse();
                break;
            case 3:
                addNewRoom();
                break;
            case 4:
                return;
            default:
                System.out.println("Only select from one to four");
        }
        WriteFileFacility.writeFacilityFile(PATH_FACILITY,facilities);
    }

    @Override
    public void displayListFacilityMaintenance() {
        facilities = ReadFileFacility.readFacilityFile(PATH_FACILITY);
             for (Facility facility : facilities.keySet()) {
            if (facilities.get(facility) >= 5) {
                facilityMaintenance.put(facility, facilities.get(facility));
            }
        }
        for (Facility facility : facilityMaintenance.keySet()) {
            System.out.println(facility + "has been used: " + facilityMaintenance.get(facility) + "times");
        }
        WriteFileFacility.writeFacilityFile(PATH_FACILITY,facilities);
    }

    public void addNewVilla() {
        List<Villa> villas = ReadFileVilla.readFileVilla(PATH_VILLA);
        Villa villa = this.getInfoVilla();
        villas.add(villa);
        facilities.put(villa, 0);
        WriteFileVilla.writeFileVilla(PATH_VILLA, villas);
        System.out.println("Added New Villa");
    }

    public void addNewHouse() {
        List<House> houses = ReadFileHouse.readFileHouse(PATH_HOUSE);
        House house = this.getInfoHouse();
        houses.add(house);
        facilities.put(house, 0);
        WriteFileHouse.writeFileHouse(PATH_HOUSE, houses);
        System.out.println("Added new House");
    }

    public void addNewRoom() {
        List<Room> rooms = ReadFileRoom.readFileRoom(PATH_ROOM);
        Room room = this.getInfoRoom();
        rooms.add(room);
        facilities.put(room, 0);
        WriteFileRoom.writeFileRoom(PATH_ROOM, rooms);
        System.out.println("Added New Room");

    }

    public Villa getInfoVilla() {
        System.out.println("Enter info Villa");
        String codeVillaService = CodeVillaServiceValidate.codeVillaServiceValidate();
        String nameService = NameServiceValidate.nameServiceValidate();
        double areaUsable = AreaUsableValidate.areaUsableValidate();
        double costsRental = CostsRentalValidate.costsRentalValidate();
        int numberPeopleMax = NumberPeopleMaxValidate.numberPeopleMaxValidate();
        String typeRental = TypeRentalValidate.typeRentalValidate();
        String roomStandard = RoomStandardValidate.roomStandardValidate();
        double areaPool = AreaPoolValidate.areaPoolValidate();
        int numberOfFloors = NumberOfFloorsValidate.numberOfFloorsValidate();
        return new Villa(codeVillaService, nameService, areaUsable, costsRental, numberPeopleMax, typeRental, roomStandard, areaPool, numberOfFloors);
    }

    public House getInfoHouse() {
        System.out.println("Enter info House");
        String codeHouseService = CodeHouseServiceValidate.codeHouseServiceValidate();
        String nameService = NameServiceValidate.nameServiceValidate();
        double areaUsable = AreaUsableValidate.areaUsableValidate();
        double costsRental = CostsRentalValidate.costsRentalValidate();
        int numberPeopleMax = NumberPeopleMaxValidate.numberPeopleMaxValidate();
        String typeRental = TypeRentalValidate.typeRentalValidate();
        String roomStandard = RoomStandardValidate.roomStandardValidate();
        int numberOfFloors = NumberOfFloorsValidate.numberOfFloorsValidate();
        return new House(codeHouseService, nameService, areaUsable, costsRental, numberPeopleMax, typeRental, roomStandard, numberOfFloors);
    }
    public Room getInfoRoom() {
        System.out.println("Enter info Room");
        String codeRoomService = CodeRoomServiceValidate.codeRoomServiceValidate();
        String nameService = NameServiceValidate.nameServiceValidate();
        double areaUsable = AreaUsableValidate.areaUsableValidate();
        double costsRental = CostsRentalValidate.costsRentalValidate();
        int numberPeopleMax = NumberPeopleMaxValidate.numberPeopleMaxValidate();
        String typeRental = TypeRentalValidate.typeRentalValidate();
        String freeService = FreeServiceValidate.freeServiceValidate();
        return new Room(codeRoomService, nameService, areaUsable, costsRental, numberPeopleMax, typeRental, freeService);
    }
}
