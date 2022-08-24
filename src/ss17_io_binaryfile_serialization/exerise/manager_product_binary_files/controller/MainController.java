package ss17_io_binaryfile_serialization.exerise.manager_product_binary_files.controller;

import ss17_io_binaryfile_serialization.exerise.manager_product_binary_files.service.impl.ProductService;

import java.io.IOException;
import java.util.Scanner;

public class MainController {
    public void mainController() throws IOException, ClassNotFoundException {
        ProductService productService = new ProductService();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Mời bạn nhập lựa chọn");
            System.out.println("1.Thêm vào sản phẩm");
            System.out.println("2.Hiển thị sản phẩm");
            System.out.println("3.Tìm kiếm sản phẩm");
            System.out.println("4.Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productService.addProduct();
                    break;
                case 2:
                    productService.displayProduct();
                    break;
                case 3:
                    productService.searchProduct();
                    break;
                case 4:
                    return;
            }
        }

    }
}
