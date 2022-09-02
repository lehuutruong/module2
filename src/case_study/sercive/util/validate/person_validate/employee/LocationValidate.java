package case_study.sercive.util.validate.person_validate.employee;

import java.util.Scanner;

public class LocationValidate {
    private static Scanner scanner=new Scanner(System.in);
    public static String locationValidate(){
        String locationEmployee = "";
        while (true) {
            boolean checkLocation = false;
            System.out.println("Enter location");
            System.out.println("1. Receptionist");
            System.out.println("2. Service");
            System.out.println("3. Expert");
            System.out.println("4. Monitoring");
            System.out.println("5. Manage");
            System.out.println("6. Manager");
            int  choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    locationEmployee = "Receptionist";
                    checkLocation = true;
                    break;
                case 2:
                    locationEmployee = "Service";
                    checkLocation = true;
                    break;
                case 3:
                    locationEmployee = " Expert";
                    checkLocation = true;
                    break;
                case 4:
                    locationEmployee = "Monitoring";
                    checkLocation = true;
                    break;
                case 5:
                    locationEmployee = "Manage";
                    checkLocation = true;
                    break;
                case 6:
                    locationEmployee = "Manager";
                    checkLocation = true;
                    break;
                default:
                    System.out.println("Only select from one to six");
            }
            if (checkLocation) {
                break;
            }
        }
        return locationEmployee;
    }
}
