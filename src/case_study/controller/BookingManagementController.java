package case_study.controller;

import case_study.sercive.impl.BookingServiceImpl;

import java.util.Scanner;

public class BookingManagementController {
    private Scanner scanner=new Scanner(System.in);
    private BookingServiceImpl bookingService=new BookingServiceImpl();
    public void  bookingManagement(){
        while (true){
            System.out.println("");
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new contracts");
            System.out.println("4. Display list contracts");
            System.out.println("5. Edit contracts");
            System.out.println("6. Return main menu");
            int choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    bookingService.addNewBooking();
                    break;
                case 2:
                    bookingService.displayListBooking();
                    break;
                case 3:
                    bookingService.createNewContracts();
                    break;
                case 4:
                    bookingService.displayListContracts();
                    break;
                case 5:
                    bookingService.editContracts();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Only select from one to five");
            }
        }
    }

}
