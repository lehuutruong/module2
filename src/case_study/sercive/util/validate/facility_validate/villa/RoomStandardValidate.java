package case_study.sercive.util.validate.facility_validate.villa;

import case_study.sercive.util.exeption.employee_exception.NameException;

import java.util.Scanner;

public class RoomStandardValidate {
    private static Scanner scanner=new Scanner(System.in);
    public static String roomStandardValidate(){
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
        return roomStandard;

    }
}
