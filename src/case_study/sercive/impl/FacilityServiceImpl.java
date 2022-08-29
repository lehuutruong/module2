package case_study.sercive.impl;

import case_study.model.facility.House;
import case_study.model.facility.Room;
import case_study.model.facility.Villa;
import case_study.sercive.IFacilityService;
import case_study.sercive.util.exeption.customer_exception.CodeCustomerException;
import case_study.sercive.util.exeption.employee_exception.DateOfBirthException;
import case_study.sercive.util.exeption.employee_exception.NameException;
import case_study.sercive.util.read_write.house.ReadFileHouse;
import case_study.sercive.util.read_write.house.WriteFileHouse;
import case_study.sercive.util.read_write.room.ReadFileRoom;
import case_study.sercive.util.read_write.room.WriteFileRoom;
import case_study.sercive.util.read_write.villa.ReadFileVilla;
import case_study.sercive.util.read_write.villa.WriteFileVilla;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FacilityServiceImpl implements IFacilityService {
    private static Scanner scanner = new Scanner(System.in);
    private List<Villa> villas = new ArrayList<>();
    ReadFileVilla readFileVilla = new ReadFileVilla();
    WriteFileVilla writeFileVilla = new WriteFileVilla();
    final String PATH_VILLA = "module2\\src\\case_study\\data\\Villa.csv";
    private List<House>houses=new ArrayList<>();
    ReadFileHouse readFileHouse=new ReadFileHouse();
    WriteFileHouse writeFileHouse=new WriteFileHouse();
    final String PATH_HOUSE="module2\\src\\case_study\\data\\House.csv";
    private List<Room>rooms=new ArrayList<>();
    ReadFileRoom readFileRoom=new ReadFileRoom();
    WriteFileRoom writeFileRoom=new WriteFileRoom();
    final String PATH_ROOM="module2\\src\\case_study\\data\\Room.csv";
    static int choice;

    @Override
    public void displayListFacility() {
        System.out.println("Facility wants to display");
        System.out.println("1. Display New Villa");
        System.out.println("2. Display New House");
        System.out.println("3. Display New Room");
        System.out.println("4. Back to menu");
        choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                displayVilla();
                break;
            case 2:
                displayHouse();
                break;
            case 3:
                displayRoom();
                break;
            case 4:
                return;
            default:
                System.out.println("Only select from one to four");
        }
    }

    @Override
    public void addNewFacility() {
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
    }

    @Override
    public void displayListFacilityMaintenance() {

    }

    public void addNewVilla() {
               villas = readFileVilla.readFileVilla(PATH_VILLA);
        Villa villa = this.getInfoVilla();
        villas.add(villa);
        writeFileVilla.writeFileVilla(PATH_VILLA,villas);
        System.out.println("Added New Villa");
    }
    public void addNewHouse(){
        houses=readFileHouse.readFileHouse(PATH_HOUSE);
     House house=this.getInfoHouse();
     houses.add(house);
     writeFileHouse.writeFileHouse(PATH_HOUSE,houses);
        System.out.println("Added new House");
    }
    public void addNewRoom(){
        rooms=readFileRoom.readFileRoom(PATH_ROOM);
        Room room=this.getInfoRoom();
        rooms.add(room);
        writeFileRoom.writeFileRoom(PATH_ROOM,rooms);
        System.out.println("Added New Room");

    }
     public void displayHouse(){
              houses=readFileHouse.readFileHouse(PATH_HOUSE);
         System.out.println("Display List House");
         for (House house:houses
              ) {
             System.out.println(house.toString());

         }
     }
    public void displayRoom(){
              rooms=readFileRoom.readFileRoom(PATH_ROOM);
        System.out.println("Display List Room");
        for (Room room:rooms
        ) {
            System.out.println(room.toString());

        }
    }
    public void displayVilla(){
        villas=readFileVilla.readFileVilla(PATH_VILLA);
        System.out.println("Display List Villa");
        for (Villa villa:villas
        ) {
            System.out.println(villa.toString());

        }
    }
    public Villa getInfoVilla() {
        System.out.println("Enter info Villa");
        String codeService;
        while (true) {
            try {
                System.out.println("Enter code service");
                codeService = scanner.nextLine();
                if (codeService.equals("")) {
                    throw new CodeCustomerException("CodeService cannot be blank");
                }
                if (codeService.equals(villas)) {
                    throw new CodeCustomerException(" CodeService appeared");
                }
                if(!codeService.matches("[S]+[V]+[V]+[L]+[-]+[0-9]{4}"))
                    throw new CodeCustomerException("Code Service is not correct format");
                break;
            } catch (CodeCustomerException e) {
                System.out.println(e.getMessage());
            }
        }
        String nameService;
        while (true) {

            try {
                System.out.println("Enter name service");
                nameService = scanner.nextLine();
                if (!nameService.matches("[A-Z]+[a-z]{5,50}")) {
                    throw new NameException("Your name from 5 to 50 characters");
                }
                break;
            } catch (NameException e) {
                System.out.println(e.getMessage());
            }
        }
        double areaUsable;
        while (true) {
            try {
                System.out.println("Enter Area Usable");
                areaUsable = Double.parseDouble(scanner.nextLine());
                if (areaUsable < 30 || areaUsable > 1000000000) {
                    throw new DateOfBirthException("The Area usable is not correct ");
                }
                break;
            } catch (DateOfBirthException e) {
                System.out.println(e.getMessage());
            }
        }
        double costsRental;
        while (true) {
            try {
                System.out.println("Enter Cost Rental");
                costsRental = Double.parseDouble(scanner.nextLine());
                if (costsRental < 0) {
                    throw new DateOfBirthException("The Cost Rentla is not correct ");
                }
                break;
            } catch (DateOfBirthException e) {
                System.out.println(e.getMessage());
            }
        }
        int numberPeopleMax;
        while (true) {
            try {
                System.out.println("Enter Number People Maximum");
                numberPeopleMax = Integer.parseInt(scanner.nextLine());
                if (numberPeopleMax < 0||numberPeopleMax>20) {
                    throw new DateOfBirthException("The Number People maximum is not correct ");
                }
                break;
            } catch (DateOfBirthException e) {
                System.out.println(e.getMessage());
            }
        }
        String typeRental = "";
        while (true) {
            boolean checkRental = false;
            System.out.println("Choice type of rental ");
            System.out.println("1. Year");
            System.out.println("2. Month");
            System.out.println("3. Day");
            System.out.println("4. Hour");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    typeRental = " Year";
                    checkRental = true;
                    break;
                case 2:
                    typeRental = "Month";
                    checkRental = true;
                    break;
                case 3:
                    typeRental = "Day";
                    checkRental = true;
                    break;
                case 4:
                    typeRental = "Hour";
                    checkRental = true;
                    break;
                default:
                    System.out.println(" Only select one to four");
            }
            if (checkRental) {
                break;
            }
        }
        String roomStandard;
        while (true) {

            try {
                System.out.println("Enter Room Standard");
                roomStandard = scanner.nextLine();
                if (!roomStandard.matches("\\D{5,50}")) {
                    throw new NameException("Your Room Standard from 5 to 50 characters");
                }
                break;
            } catch (NameException e) {
                System.out.println(e.getMessage());
            }
        }
        double areaPool;
        while (true) {
            try {
                System.out.println("Enter Area Pool");
                areaPool = Double.parseDouble(scanner.nextLine());
                if (areaPool < 30 || areaPool > 1000000000) {
                    throw new DateOfBirthException("The Area Pool is not correct ");
                }
                break;
            } catch (DateOfBirthException e) {
                System.out.println(e.getMessage());
            }
        }
        int numberOfFloors;
        while (true) {
            try {
                System.out.println("Enter Number Of Floors");
                numberOfFloors = Integer.parseInt(scanner.nextLine());
                if (numberOfFloors < 0 || numberOfFloors > 200) {
                    throw new DateOfBirthException("The Number Of Floors is not correct ");
                }
                break;
            } catch (DateOfBirthException e) {
                System.out.println(e.getMessage());
            }
        }
        return new Villa(codeService, nameService, areaUsable, costsRental, numberPeopleMax, typeRental, roomStandard, areaPool, numberOfFloors);
    }
    public House getInfoHouse() {
        System.out.println("Enter info House");
        String codeService;
        while (true) {
            try {
                System.out.println("Enter code service");
                codeService = scanner.nextLine();
                if (codeService.equals("")) {
                    throw new CodeCustomerException("CodeService cannot be blank");
                }
                if (codeService.equals(houses)) {
                    throw new CodeCustomerException(" CodeService appeared");
                }
                if(!codeService.matches("[S]+[V]+[H]+[O]+[-]+[0-9]{4}"))
                    throw new CodeCustomerException("Code Service is not correct format");
                break;
            } catch (CodeCustomerException e) {
                System.out.println(e.getMessage());
            }
        }
        String nameService;
        while (true) {

            try {
                System.out.println("Enter name service");
                nameService = scanner.nextLine();
                if (!nameService.matches("[A-Z]+[a-z]{5,50}")) {
                    throw new NameException("Your name from 5 to 50 characters");
                }
                break;
            } catch (NameException e) {
                System.out.println(e.getMessage());
            }
        }
        double areaUsable;
        while (true) {
            try {
                System.out.println("Enter Area Usable");
                areaUsable = Double.parseDouble(scanner.nextLine());
                if (areaUsable < 30 || areaUsable > 1000000000) {
                    throw new DateOfBirthException("The Area usable is not correct ");
                }
                break;
            } catch (DateOfBirthException e) {
                System.out.println(e.getMessage());
            }
        }
        double costsRental;
        while (true) {
            try {
                System.out.println("Enter Cost Rental");
                costsRental = Double.parseDouble(scanner.nextLine());
                if (costsRental < 0) {
                    throw new DateOfBirthException("The Cost Rentla is not correct ");
                }
                break;
            } catch (DateOfBirthException e) {
                System.out.println(e.getMessage());
            }
        }
        int numberPeopleMax;
        while (true) {
            try {
                System.out.println("Enter Number People Maximum");
                numberPeopleMax = Integer.parseInt(scanner.nextLine());
                if (numberPeopleMax < 0||numberPeopleMax>20) {
                    throw new DateOfBirthException("The Number People maximum is not correct ");
                }
                break;
            } catch (DateOfBirthException e) {
                System.out.println(e.getMessage());
            }
        }
        String typeRental = "";
        while (true) {
            boolean checkRental = false;
            System.out.println("Choice type of rental ");
            System.out.println("1. Year");
            System.out.println("2. Month");
            System.out.println("3. Day");
            System.out.println("4. Hour");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    typeRental = " Year";
                    checkRental = true;
                    break;
                case 2:
                    typeRental = "Month";
                    checkRental = true;
                    break;
                case 3:
                    typeRental = "Day";
                    checkRental = true;
                    break;
                case 4:
                    typeRental = "Hour";
                    checkRental = true;
                    break;
                default:
                    System.out.println(" Only select one to four");
            }
            if (checkRental) {
                break;
            }
        }
        String roomStandard;
        while (true) {

            try {
                System.out.println("Enter Room Standard");
                roomStandard = scanner.nextLine();
                if (!roomStandard.matches("\\D{5,50}")) {
                    throw new NameException("Your Room Standard from 5 to 50 characters");
                }
                break;
            } catch (NameException e) {
                System.out.println(e.getMessage());
            }
        }
        int numberOfFloors;
        while (true) {
            try {
                System.out.println("Enter Number Of Floors");
                numberOfFloors = Integer.parseInt(scanner.nextLine());
                if (numberOfFloors < 0 || numberOfFloors > 200) {
                    throw new DateOfBirthException("The Number Of Floors is not correct ");
                }
                break;
            } catch (DateOfBirthException e) {
                System.out.println(e.getMessage());
            }
        }
        return new House(codeService, nameService, areaUsable, costsRental, numberPeopleMax, typeRental, roomStandard,  numberOfFloors);
    }
    public Room getInfoRoom() {
        System.out.println("Enter info Room");
        String codeService;
        while (true) {
            try {
                System.out.println("Enter code service");
                codeService = scanner.nextLine();
                if (codeService.equals("")) {
                    throw new CodeCustomerException("CodeService cannot be blank");
                }
                if (codeService.equals(rooms)) {
                    throw new CodeCustomerException(" CodeService appeared");
                }if(!codeService.matches("[S]+[V]+[R]+[O]+[-]+[0-9]{4}"))
                    throw new CodeCustomerException("Code Service is not correct format");
                break;
            } catch (CodeCustomerException e) {
                System.out.println(e.getMessage());
            }
        }
        String nameService;
        while (true) {

            try {
                System.out.println("Enter name service");
                nameService = scanner.nextLine();
                if (!nameService.matches("[A-Z]+[a-z]{5,50}")) {
                    throw new NameException("Your name from 5 to 50 characters");
                }
                break;
            } catch (NameException e) {
                System.out.println(e.getMessage());
            }
        }
        double areaUsable;
        while (true) {
            try {
                System.out.println("Enter Area Usable");
                areaUsable = Double.parseDouble(scanner.nextLine());
                if (areaUsable < 0 || areaUsable > 1000000000) {
                    throw new DateOfBirthException("The Area usable is not correct ");
                }
                break;
            } catch (DateOfBirthException e) {
                System.out.println(e.getMessage());
            }
        }
        double costsRental;
        while (true) {
            try {
                System.out.println("Enter Cost Rental");
                costsRental = Double.parseDouble(scanner.nextLine());
                if (costsRental < 0) {
                    throw new DateOfBirthException("The Cost Rentla is not correct ");
                }
                break;
            } catch (DateOfBirthException e) {
                System.out.println(e.getMessage());
            }
        }
        int numberPeopleMax;
        while (true) {
            try {
                System.out.println("Enter Number People Maximum");
                numberPeopleMax = Integer.parseInt(scanner.nextLine());
                if (numberPeopleMax < 0||numberPeopleMax>20) {
                    throw new DateOfBirthException("The Number People maximum is not correct ");
                }
                break;
            } catch (DateOfBirthException e) {
                System.out.println(e.getMessage());
            }
        }
        String typeRental = "";
        while (true) {
            boolean checkRental = false;
            System.out.println("Choice type of rental ");
            System.out.println("1. Year");
            System.out.println("2. Month");
            System.out.println("3. Day");
            System.out.println("4. Hour");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    typeRental = " Year";
                    checkRental = true;
                    break;
                case 2:
                    typeRental = "Month";
                    checkRental = true;
                    break;
                case 3:
                    typeRental = "Day";
                    checkRental = true;
                    break;
                case 4:
                    typeRental = "Hour";
                    checkRental = true;
                    break;
                default:
                    System.out.println(" Only select one to four");
            }
            if (checkRental) {
                break;
            }
        }
        String freeService;
        while (true) {
            try {
                System.out.println("Enter free service");
                freeService = scanner.nextLine();
                if (!freeService.matches("\\D{5,50}")) {
                    throw new NameException("Your name from 5 to 50 characters");
                }
                break;
            } catch (NameException e) {
                System.out.println(e.getMessage());
            }
        }
        return new Room(codeService, nameService, areaUsable, costsRental, numberPeopleMax, typeRental, freeService);
    }
}
