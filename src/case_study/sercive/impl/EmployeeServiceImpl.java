package case_study.sercive.impl;

import case_study.model.person.Employee;
import case_study.sercive.IEmployeeService;
import case_study.sercive.util.exeption.IdException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
    private Scanner scanner = new Scanner(System.in);
    private List<Employee> employees = new ArrayList<>();

    @Override
    public void displayListEmployees() {

    }

    @Override
    public void addNewEmployee() {

    }

    @Override
    public void editEmployee() {

    }

    public Employee getInfoEmployee() {
        System.out.println("Enter info employee");
        String codeEmployee;
        while (true) {
            boolean checkId = false;
            boolean checkIdTwo = false;
            System.out.println("Enter code employee");
            codeEmployee = scanner.nextLine();
            for (Employee employee : employees
            ) {
                if (employee.getCodeEmployee().equals(codeEmployee)) {
                    System.out.println("CodeEmploy already exists ");
                    checkId = true;
                }
              try{
                  if("".equals(codeEmployee)){
                      checkIdTwo=true;
                      throw new IdException("CodeEmployee cannot be blank");
                  }
              }
              catch (IdException e){
                  System.out.println(e.getMessage());
              }
            }
            if(checkId&&checkIdTwo){
                break;
            }
        }

    }
}
