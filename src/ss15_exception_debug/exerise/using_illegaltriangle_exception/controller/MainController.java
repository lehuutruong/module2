package ss15_exception_debug.exerise.using_illegaltriangle_exception.controller;

import ss15_exception_debug.exerise.using_illegaltriangle_exception.model.SidesOfTheTriangle;
import ss15_exception_debug.exerise.using_illegaltriangle_exception.service.ITriangleService;
import ss15_exception_debug.exerise.using_illegaltriangle_exception.service.impl.TriangleService;

import java.util.Scanner;

public class MainController {
    private Scanner scanner = new Scanner(System.in);
    private ITriangleService iTriangleService = new TriangleService();

    public void running() {
        while (true) {
            System.out.println("1. Tạo một hình tam giác");
            System.out.println("2. Hiển thị danh sách các hình tam giác");
            System.out.println("3. Thoát");
            System.out.print("Chọn chức năng: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    iTriangleService.addSidesOfTriangle();
                    break;
                case 2:
                    iTriangleService.displaySidesOfTriangle();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Vui lòng chọn chức năng 1 - 3");
            }
        }
    }

}
