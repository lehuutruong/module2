package case_study.controller;

import case_study.sercive.impl.CustomerServiceImpl;

import java.util.Scanner;

public class CustomerManagementController {
    private Scanner scanner=new Scanner(System.in);
    private CustomerServiceImpl customerService=new CustomerServiceImpl();
    public void customerManagement(){
        while (true){
            System.out.println("");
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return main menu");
            int choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    customerService.displayListCustomers();
                    break;
                case 2:
                    customerService.addNewCustomer();
                    break;
                case 3:
                    customerService.editCustomer();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Only select from one to three");
            }
        }
    }
}
