package ss12_collection_framework.exercise.practice_using_arraylist_linkedlist.controller;

import ss12_collection_framework.exercise.practice_using_arraylist_linkedlist.sercive.IProduct;
import ss12_collection_framework.exercise.practice_using_arraylist_linkedlist.sercive.impl.ProductSercive;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductController {
    private static Scanner scanner = new Scanner(System.in);
    private IProduct productService = new ProductSercive();

    public void menuMagagement() {
        while (true) {
            System.out.println("------------------");
            System.out.println("1.Hiển thị danh sách sản phẩm");
            System.out.println("2 Thêm mới sản phẩm");
            System.out.println("3.Cập nhật thông tin sản phẩm");
            System.out.println("4.Xóa sản phẩm");
            System.out.println("5.Sắp xếp theo giá tiền ");
            System.out.println("6. exit");
            System.out.println("Mời bạn nhập chức năng 1-5");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productService.displayProduct();
                    break;
                case 2:
                    productService.addProduct();
                    break;
                case 3:
                    productService.editProduct();
                    break;
                case 4:
                    productService.deleteProduct();
                    break;
                case 5:
                    productService.sortProduct();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("lựa chọn của bạn không đúng");
            }
        }
    }
}
