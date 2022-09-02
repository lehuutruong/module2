package case_study.sercive.impl;

import case_study.model.person.Customer;
import case_study.sercive.ICustomerService;
import case_study.sercive.util.exeption.customer_exception.AddressCustomerException;
import case_study.sercive.util.exeption.customer_exception.CodeCustomerException;
import case_study.sercive.util.read_write.customer.ReadFileCustomer;
import case_study.sercive.util.read_write.customer.WriteFileCustomer;
import case_study.sercive.util.validate.person_validate.customer.AddressCustomerValidate;
import case_study.sercive.util.validate.person_validate.customer.CodeCustomerValidate;
import case_study.sercive.util.validate.person_validate.customer.TypeCustomerValidate;
import case_study.sercive.util.validate.person_validate.person.*;

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
        String name = NameValidate.nameValidate();
        String dateOfBirth = DateOfBirthValidate.dateOfBirthValidate();
        String gender = GenderValidate.genderValidate();
        String identityCard = IdentityCardValidate.identityCard();
        String numberPhone = NumberPhoneValidate.numberPhoneValidate();
        String email = EmailValidate.emailValidate();
        String codeCustomer= CodeCustomerValidate.codeCustomerValidate();
        String typeCustomer = TypeCustomerValidate.typeCustomerValidate();
        String addressCustomer = AddressCustomerValidate.addressCustomerValidate();
        return new Customer(name, dateOfBirth, gender, identityCard, numberPhone, email, codeCustomer, typeCustomer, addressCustomer);
    }

    public Customer findCustomerByCode(String taskName) {
        System.out.println("Enter codeCustomer");
        String codeCustomer = scanner.nextLine();
        customers = readFileCustomer.readFileCustomer(PATH);
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
