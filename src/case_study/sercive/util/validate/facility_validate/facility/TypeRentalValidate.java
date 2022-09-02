package case_study.sercive.util.validate.facility_validate.facility;

import java.util.Scanner;

public class TypeRentalValidate {
    private static Scanner scanner=new Scanner(System.in);
    public static String typeRentalValidate(){
        String typeRental = "";
        while (true) {
            boolean checkRental = false;
            System.out.println("Choice type of rental ");
            System.out.println("1. Year");
            System.out.println("2. Month");
            System.out.println("3. Day");
            System.out.println("4. Hour");
            int  choice = Integer.parseInt(scanner.nextLine());
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
        return typeRental;
    }
}
