package case_study.sercive.impl;

import case_study.model.person.Employee;
import case_study.sercive.IEmployeeService;
import case_study.sercive.util.exeption.*;
import case_study.sercive.util.read_write.ReadFileEmployee;
import case_study.sercive.util.read_write.WriteFileEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EmployeeServiceImpl implements IEmployeeService {
    private final Scanner scanner = new Scanner(System.in);
    private static final String PATH = "module2\\src\\case_study\\data\\Employee.csv";
    ReadFileEmployee readFileEmployee = new ReadFileEmployee();
    WriteFileEmployee writeFileEmployee = new WriteFileEmployee();
    private List<Employee> employees = new ArrayList<>();
    static int choice;

    @Override
    public void displayListEmployees() {
        System.out.println(" Employee List");
        employees = readFileEmployee.readFileEmployee(PATH);
        for (Employee employee : employees
        ) {
            System.out.println(employee.toString());

        }
    }

    @Override
    public void addNewEmployee() {
        employees = readFileEmployee.readFileEmployee(PATH);
        Employee employee = this.getInfoEmployee();
        employees.add(employee);
        writeFileEmployee.writeFileEmployee(PATH, employees);
        displayListEmployees();
        System.out.println("Added employee ");
    }

    @Override
    public void editEmployee() {
        employees=readFileEmployee.readFileEmployee(PATH);
      Employee employee=findEmployeeByCode("Edit");
        if(employee==null){
            System.out.println("Code Employee is not exist");
            return;
        }
      do {
          System.out.println("-----------------------------");
          System.out.println("Employ you need edit");
          System.out.println("What content do you want to edit? ");
          System.out.println("1. Name");
          System.out.println("2. Date of birth");
          System.out.println("3. Gender");
          System.out.println("4. IdentityCard");
          System.out.println("5. NumberPhone");
          System.out.println("6. Email");
          System.out.println("7. Code employee");
          System.out.println("8. Level");
          System.out.println("9. Location");
          System.out.println("10. Wage");
          System.out.println("11.Exit");
          choice=Integer.parseInt(scanner.nextLine());
          switch (choice){
              case 1:
                  employee.setName(getEditInfo("Name"));
                  break;
              case 2:
                  employee.setDateOfBirth(getEditInfo("Date of Birth"));
                  break;
              case 3:
                  employee.setGender(getEditInfo("Gender"));
                  break;
              case 4:
                  employee.setIdentityCard(getEditInfo("IdentityCard"));
                  break;
              case 5:
                  employee.setNumberPhone(getEditInfo("NumberPhone"));
                  break;
              case 6:
                  employee.setEmail(getEditInfo("Email"));
                  break;
              case 7:
                  employee.setCodeEmployee(getEditInfo("CodeEmployee"));
                  break;
              case 8:
                  employee.setLevel(getEditInfo("Level"));
                  break;
              case 9:
                  employee.setLocationEmployee(getEditInfo("Location"));
                  break;
              case 10:
                  employee.setWage(getEditInfo("Wage"));
                  break;
              case 11:
                  return;
          }
          writeFileEmployee.writeFileEmployee(PATH,employees);
          System.out.println("Edit successfully");
          System.out.println("Do you continue edit");
          System.out.println("1.Yes 2.No");
          choice=Integer.parseInt(scanner.nextLine());
          if(choice!=1){
              return;
          }
      }while (true);
    }

    public Employee getInfoEmployee() {
        System.out.println("Enter info employee");
        String name;
        while (true) {

            try {
                System.out.println("Enter name employee");
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
        String codeEmployee;
        while (true) {
            try {
                System.out.println("Enter code employee");
                codeEmployee = scanner.nextLine();
                if (codeEmployee.equals("")) {
                    throw new CodeEmployeeException("CodeEmployee cannot be blank");
                }
                if (codeEmployee.equals(employees)) {
                    throw new CodeEmployeeException(" CodeEmploy appeared");
                }
                break;
            } catch (CodeEmployeeException e) {
                System.out.println(e.getMessage());
            }
        }
        String level = "";
        while (true) {
            boolean checkLevel = false;
            System.out.println("Choice level ");
            System.out.println("1. Intermediate");
            System.out.println("2. College");
            System.out.println("3. University");
            System.out.println("4. Masters");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    level = "Intermediate";
                    checkLevel = true;
                    break;
                case 2:
                    level = "College";
                    checkLevel = true;
                    break;
                case 3:
                    level = "University";
                    checkLevel = true;
                    break;
                case 4:
                    level = "Masters";
                    checkLevel = true;
                    break;
                default:
                    System.out.println(" Only select one to four");
            }
            if (checkLevel) {
                break;
            }
        }
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
            choice = Integer.parseInt(scanner.nextLine());
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
                    checkLocation=true;
                    break;
                case 6:
                    locationEmployee = "Manager";
                    checkLocation=true;
                    break;
                default:
                    System.out.println("Only select from one to six");
            }
            if (checkLocation) {
                break;
            }
        }

        String wage;
        while (true) {
            try {
                System.out.println("Enter wage");
                wage = scanner.nextLine();
                if (wage.equals("")) {
                    throw new WageException("Wage cannot be blank");
                }
                break;
            } catch (WageException e) {
                System.out.println(e.getMessage());
            }
        }
        return new Employee(name, dateOfBirth, gender, identityCard, numberPhone, email, codeEmployee, level, locationEmployee, wage);
    }
    public Employee findEmployeeByCode(String taskName){
        System.out.println("Enter codeEmployee");
        String codeEmployee=scanner.nextLine();
        for (Employee employee:employees
             ) {if(employee.getCodeEmployee().equals(codeEmployee)){
            return employee;
        }

        }
        return null;
    }
    public String getEditInfo(String editContent){
        System.out.println("Enter"+editContent+ "New");
        return scanner.nextLine();
    }

}
