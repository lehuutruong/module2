package case_study.controller;

import java.util.Scanner;

public class FuramaController {
    private final Scanner scanner=new Scanner(System.in);
    private  EmployeeManagementController employeeManagementController=new EmployeeManagementController();
    private CustomerManagementController customerManagementController=new CustomerManagementController();
    private FacilityManagementController facilityManagementController=new FacilityManagementController();
    private BookingManagementController bookingManagementController=new BookingManagementController();
    private PromotionManagementController promotionManagementController=new PromotionManagementController();
    public void furama(){
        while (true){
            System.out.println("");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management ");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            int choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    employeeManagementController.employeeManagement();
                    break;
                case 2:
                    customerManagementController.customerManagement();
                    break;
                case 3:
                    facilityManagementController.facilityManagement();
                    break;
                case 4:
                    bookingManagementController.bookingManagement();
                    break;
                case 5:
                    promotionManagementController.promotionManagement();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Only select from one to six");
            }
        }
    }
}
