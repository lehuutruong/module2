package case_study.sercive.impl;

import case_study.model.person.Employee;
import case_study.sercive.IEmployeeService;
import case_study.sercive.util.exeption.employee_exception.*;
import case_study.sercive.util.read_write.employee.ReadFileEmployee;
import case_study.sercive.util.read_write.employee.WriteFileEmployee;
import case_study.sercive.util.validate.person_validate.employee.CodeEmployeeValidate;
import case_study.sercive.util.validate.person_validate.employee.LevelValidate;
import case_study.sercive.util.validate.person_validate.employee.LocationValidate;
import case_study.sercive.util.validate.person_validate.employee.WageValidate;
import case_study.sercive.util.validate.person_validate.person.*;

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
        employees = readFileEmployee.readFileEmployee(PATH);
        Employee employee = findEmployeeByCode("Edit");
        if (employee == null) {
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
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
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
            writeFileEmployee.writeFileEmployee(PATH, employees);
            System.out.println("Edit successfully");
            System.out.println("Do you continue edit");
            System.out.println("1.Yes 2.No");
            choice = Integer.parseInt(scanner.nextLine());
            if (choice != 1) {
                return;
            }
        } while (true);
    }

    public Employee getInfoEmployee() {
        System.out.println("Enter info employee");
        String name = NameValidate.nameValidate();
        String dateOfBirth = DateOfBirthValidate.dateOfBirthValidate();
        String gender = GenderValidate.genderValidate();
        String identityCard = IdentityCardValidate.identityCard();
        String numberPhone = NumberPhoneValidate.numberPhoneValidate();
        String email = EmailValidate.emailValidate();
        String codeEmployee = CodeEmployeeValidate.codeEmployeeValidate();
        String level = LevelValidate.levelValidate();
        String locationEmployee = LocationValidate.locationValidate();
        String wage = WageValidate.wageValidate();
        return new Employee(name, dateOfBirth, gender, identityCard, numberPhone, email, codeEmployee, level, locationEmployee, wage);
    }

    public Employee findEmployeeByCode(String taskName) {
        System.out.println("Enter codeEmployee");
        String codeEmployee = scanner.nextLine();
        employees = readFileEmployee.readFileEmployee(PATH);
        for (Employee employee : employees
        ) {
            if (employee.getCodeEmployee().equals(codeEmployee)) {
                return employee;
            }

        }
        return null;
    }

    public String getEditInfo(String editContent) {
        System.out.println("Enter" + editContent + "New");
        return scanner.nextLine();
    }

}
