package case_study.controller;

import case_study.sercive.impl.EmployeeServiceImpl;

import java.io.IOException;
import java.util.Scanner;
public class EmployeeManagementController {
     private Scanner scanner=new Scanner(System.in);
     private EmployeeServiceImpl employeeService=new EmployeeServiceImpl();
     public void employeeManagement() {
         while (true){
             System.out.println("");
             System.out.println("1. Display list employees");
             System.out.println("2. Add new employee");
             System.out.println("3. Edit employee");
             System.out.println("4. Return main menu");
             int choice=Integer.parseInt(scanner.nextLine());
             switch (choice){
                 case 1:
                     employeeService.displayListEmployees();
                     break;
                 case 2:
                     employeeService.addNewEmployee();
                     break;
                 case 3:
                     employeeService.editEmployee();
                     break;
                 case 4:
                     return;
                 default:
                     System.out.println("Only select from one to three");
             }
         }
     }
}
