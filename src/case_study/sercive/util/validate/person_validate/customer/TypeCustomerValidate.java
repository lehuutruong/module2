package case_study.sercive.util.validate.person_validate.customer;

import java.util.Scanner;

public class TypeCustomerValidate {
    private static Scanner scanner=new Scanner(System.in);
    public static String typeCustomerValidate(){
        String typeCustomer = "";
        while (true) {
            boolean checkCustomer = false;
            System.out.println("Choice type of customer ");
            System.out.println("1. Diamond");
            System.out.println("2. Platinum");
            System.out.println("3. Gold");
            System.out.println("4. Silver");
            System.out.println("5. Member");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    typeCustomer = " Diamond";
                    checkCustomer = true;
                    break;
                case 2:
                    typeCustomer = "Platinum";
                    checkCustomer = true;
                    break;
                case 3:
                    typeCustomer = "Gold";
                    checkCustomer = true;
                    break;
                case 4:
                    typeCustomer = "Silver";
                    checkCustomer = true;
                    break;
                case 5:
                    typeCustomer = "Member";
                    checkCustomer = true;
                    break;
                default:
                    System.out.println(" Only select one to four");
            }
            if (checkCustomer) {
                break;
            }
        }
        return typeCustomer;
    }
}
