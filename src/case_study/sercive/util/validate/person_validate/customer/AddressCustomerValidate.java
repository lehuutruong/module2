package case_study.sercive.util.validate.person_validate.customer;

import case_study.sercive.util.exeption.customer_exception.AddressCustomerException;

import java.util.Scanner;

public class AddressCustomerValidate {
    private static Scanner scanner=new Scanner(System.in);
    public static String addressCustomerValidate(){
        String addressCustomer;
        while (true) {
            try {
                System.out.println("Enter address customer");
                addressCustomer = scanner.nextLine();
                if (addressCustomer.equals("")) {
                    throw new AddressCustomerException("AddressCustomer cannot be blank");
                }
                break;
            } catch (AddressCustomerException e) {
                System.out.println(e.getMessage());
            }
        }
        return addressCustomer;
    }
}
