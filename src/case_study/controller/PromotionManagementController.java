package case_study.controller;

import case_study.sercive.impl.PromotionServiceImpl;

import java.util.Scanner;

public class PromotionManagementController {
    private Scanner scanner=new Scanner(System.in);
    private PromotionServiceImpl promotionService=new PromotionServiceImpl();
    public void promotionManagement(){
        while (true){
            System.out.println("");
            System.out.println("1. Display list customers use service");
            System.out.println("2. Display list customers get voucher");
            System.out.println("3. Return main menu");
            int choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    promotionService.displayListCustomersUseService();
                    break;
                case 2:
                    promotionService.displayListCustomersGetVoucher();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Only select from one to two");
            }
        }
    }
}
