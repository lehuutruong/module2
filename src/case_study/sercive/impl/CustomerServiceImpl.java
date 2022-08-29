package case_study.sercive.impl;

import case_study.model.person.Customer;
import case_study.sercive.ICustomerService;
import case_study.sercive.util.exeption.customer_exception.AddressCustomerException;
import case_study.sercive.util.exeption.customer_exception.CodeCustomerException;
import case_study.sercive.util.exeption.employee_exception.*;
import case_study.sercive.util.read_write.customer.ReadFileCustomer;
import case_study.sercive.util.read_write.customer.WriteFileCustomer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    private final Scanner scanner = new Scanner(System.in);
    private static final String PATH = "module2\\src\\case_study\\data\\Customer.csv";
    ReadFileCustomer readFileCustomer = new ReadFileCustomer();
    WriteFileCustomer writeFileCustomer = new WriteFileCustomer();
    private List<Customer> customers = new ArrayList<>();
    static int choice;

    @Override
    public void displayListCustomers() {
        System.out.println("Customer list");
        customers = readFileCustomer.readFileCustomer(PATH);
        for (Customer customer : customers
        ) {
            System.out.println(customer.toString());

        }
    }

    @Override
    public void addNewCustomer() {
        customers = readFileCustomer.readFileCustomer(PATH);
        Customer customer = this.getInfoCustomer();
        customers.add(customer);
        writeFileCustomer.writeFileCustomer(PATH, customers);
        displayListCustomers();
        System.out.println("Added Customer");
    }

    @Override
    public void editCustomer() {
        customers = readFileCustomer.readFileCustomer(PATH);
        Customer customer = findCustomerByCode("Edit");
        if (customer == null) {
            System.out.println("Code Customer is not exist");
            return;
        }
        do {
            System.out.println("-----------------------------");
            System.out.println("Customer you need edit");
            System.out.println("What content do you want to edit? ");
            System.out.println("1. Name");
            System.out.println("2. Date of birth");
            System.out.println("3. Gender");
            System.out.println("4. IdentityCard");
            System.out.println("5. NumberPhone");
            System.out.println("6. Email");
            System.out.println("7. Code Customer");
            System.out.println("8. Type Of Customer");
            System.out.println("9. Address Customer");
            System.out.println("10. Exit");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    customer.setName(getEditInfo("Name"));
                    break;
                case 2:
                    customer.setDateOfBirth(getEditInfo("Date of Birth"));
                    break;
                case 3:
                    customer.setGender(getEditInfo("Gender"));
                    break;
                case 4:
                    customer.setIdentityCard(getEditInfo("IdentityCard"));
                    break;
                case 5:
                    customer.setNumberPhone(getEditInfo("NumberPhone"));
                    break;
                case 6:
                    customer.setEmail(getEditInfo("Email"));
                    break;
                case 7:
                    customer.setCodeCustomer(getEditInfo("CodeCustomer"));
                    break;
                case 8:
                    customer.setTypeCustomer(getEditInfo("TypeOfCustomer"));
                    break;
                case 9:
                    customer.setAddressCustomer(getEditInfo("AddressCustomer"));
                    break;
                case 10:
                    return;
            }
            writeFileCustomer.writeFileCustomer(PATH, customers);
            System.out.println("Edit successfully");
            System.out.println("Do you continue edit");
            System.out.println("1.Yes 2.No");
            choice = Integer.parseInt(scanner.nextLine());
            if (choice != 1) {
                return;
            }
        } while (true);
    }

    public Customer getInfoCustomer() {
        System.out.println("Enter info customer");
        String name;
        while (true) {

            try {
                System.out.println("Enter name customer");
                name = scanner.nextLine();
                if (!name.matches("\\D{5,50}")) {
                    throw new NameException("Your name from 5 to 50 characters");
                }
                break;
            } catch (NameException e) {
                System.out.println(e.getMessage());
            }
        }
        String dateOfBirth;
        while (true) {
            try {
                System.out.println("Enter date of birth");
                dateOfBirth = scanner.nextLine();
                if (!dateOfBirth.matches("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$")) {
                    throw new DateOfBirthException("The date of birth must be in the correct format");
                }
                break;
            } catch (DateOfBirthException e) {
                System.out.println(e.getMessage());
            }
        }
        String gender;
        while (true) {
            try {
                System.out.println("Enter gender");
                gender = scanner.nextLine();
                if (!gender.equals("Male") && !gender.equals("Female")) {
                    throw new GenderException("Male or Female Only");
                }
                break;
            } catch (GenderException e) {
                System.out.println(e.getMessage());
            }
        }
        String identityCard;
        while (true) {
            try {
                System.out.println("Enter identityCard");
                identityCard = scanner.nextLine();
                if (!identityCard.matches("[0-9]{9}")) {
                    throw new IdentityCardException("Identity cad has only nine numbers");
                }
                break;
            } catch (IdentityCardException e) {
                System.out.println(e.getMessage());
            }
        }
        String numberPhone;
        while (true) {
            try {
                System.out.println("Enter number phone");
                numberPhone = scanner.nextLine();
                if (!numberPhone.matches("[(][8][4][)][-][(][0][1-9]\\d{8}[)]")) {
                    throw new NumberPhoneException("The phone number cannot be format");
                }
                break;
            } catch (NumberPhoneException e) {
                System.out.println(e.getMessage());
            }
        }
        String email;
        while (true) {
            try {
                System.out.println("Enter email");
                email = scanner.nextLine();
                if (!email.matches("[a-zA-Z0-9._%-]+@[a-z0-9.-]+\\.[a-z]{2,4}")) {
                    throw new EmailException("The email cannot be format");
                }
                break;
            } catch (EmailException e) {
                System.out.println(e.getMessage());
            }
        }
        String codeCustomer;
        while (true) {
            try {
                System.out.println("Enter code customer");
                codeCustomer = scanner.nextLine();
                if (codeCustomer.equals("")) {
                    throw new CodeCustomerException("CodeCustomer cannot be blank");
                }
                if (codeCustomer.equals(customers)) {
                    throw new CodeCustomerException(" CodeCustomer appeared");
                }
                break;
            } catch (CodeCustomerException e) {
                System.out.println(e.getMessage());
            }
        }
        String typeCustomer = "";
        while (true) {
            boolean checkCustomer = false;
            System.out.println("Choice type of customer ");
            System.out.println("1. Diamond");
            System.out.println("2. Platinum");
            System.out.println("3. Gold");
            System.out.println("4. Silver");
            System.out.println("5. Member");
            choice = Integer.parseInt(scanner.nextLine());
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
        return new Customer(name, dateOfBirth, gender, identityCard, numberPhone, email, codeCustomer, typeCustomer, addressCustomer);
    }

    public Customer findCustomerByCode(String taskName) {
        System.out.println("Enter codeCustomer");
        String codeCustomer = scanner.nextLine();
        for (Customer customer : customers
        ) {
            if (customer.getCodeCustomer().equals(codeCustomer)) {
                return customer;
            }

        }
        return null;
    }

    public String getEditInfo(String editContent) {
        System.out.println("Enter" + editContent + "New");
        return scanner.nextLine();
    }
}
