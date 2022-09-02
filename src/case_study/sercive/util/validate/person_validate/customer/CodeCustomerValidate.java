package case_study.sercive.util.validate.person_validate.customer;

import case_study.model.person.Customer;
import case_study.sercive.util.exeption.customer_exception.CodeCustomerException;
import case_study.sercive.util.read_write.customer.ReadFileCustomer;

import java.util.List;
import java.util.Scanner;

public class CodeCustomerValidate {

    private static Scanner scanner = new Scanner(System.in);
    public static String codeCustomerValidate(){
        ReadFileCustomer readFileCustomer=new ReadFileCustomer();
        String src="module2\\src\\case_study\\data\\Customer.csv";
        List<Customer>customers=readFileCustomer.readFileCustomer(src);
        String codeCustomer;
        while (true) {
            try {
                System.out.println("Enter code customer");
                codeCustomer = scanner.nextLine();
                if (codeCustomer.equals("")) {
                    throw new CodeCustomerException("CodeCustomer cannot be blank");
                }
                for (Customer customer : customers
                ) {
                    if (codeCustomer.equals(customer.getCodeCustomer())) {
                        throw new CodeCustomerException(" CodeCustomer appeared");
                    }
                }
                break;
            } catch (CodeCustomerException e) {
                System.out.println(e.getMessage());
            }
        }
        return codeCustomer;
    }


}
