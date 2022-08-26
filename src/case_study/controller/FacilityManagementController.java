package case_study.controller;

import case_study.sercive.impl.FacilityServiceImpl;

import java.util.Scanner;

public class FacilityManagementController {
    private Scanner scanner=new Scanner(System.in);
    private FacilityServiceImpl facilityService=new FacilityServiceImpl();
    public void facilityManagement(){
        while (true){
            System.out.println("");
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return main menu");
            int choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    facilityService.displayListFacility();
                    break;
                case 2:
                    facilityService.addNewFacility();
                    break;
                case 3:
                    facilityService.displayListFacilityMaintenance();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Only select from one to three");
            }
        }
    }
}
