package ss17_io_binaryfile_serialization.exerise.manager_product_binary_files.service.impl;

import ss17_io_binaryfile_serialization.exerise.manager_product_binary_files.model.Product;
import ss17_io_binaryfile_serialization.exerise.manager_product_binary_files.service.IProduct;
import ss17_io_binaryfile_serialization.exerise.manager_product_binary_files.service.util.ReadFileProduct;
import ss17_io_binaryfile_serialization.exerise.manager_product_binary_files.service.util.WriteFileProduct;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProduct {
    Scanner scanner = new Scanner(System.in);
    List<Product> products = new ArrayList<>();
     private  String path ="src/ss17_io_binaryfile_serialization/exerise/manager_product_binary_files/data/product.dat";


    @Override
    public void addProduct() throws IOException, ClassNotFoundException {
        ReadFileProduct.ReadFile(path,products);
        Product product = getInfo();
        products.add(product);
        System.out.println("bạn đã thêm thành công");
        displayProduct();
        WriteFileProduct.WriteFile(path,products);
    }

    @Override
    public void displayProduct() throws IOException, ClassNotFoundException {
        ReadFileProduct.ReadFile(path,products);
        for (Product product : products
        ) {
            System.out.println(product);
        }
    }

    @Override
    public void searchProduct() throws IOException, ClassNotFoundException {
        ReadFileProduct.ReadFile(path,products);
        Product product=getFind();
        if(product==null){
            System.out.println("Không có mã sản phẩm bạn cần tìm");
        }
        else System.out.println(product);
    }

    private Product getInfo() {
        System.out.println("Mời bạn điền thông tin sản phẩm");
        System.out.println("Mời bạn nhập vào vào mã sản phẩm");
        String codeProduct = scanner.nextLine();
        System.out.println("Mời bạn nhập vào tên sản phẩm");
        String nameProduct = scanner.nextLine();
        System.out.println("Mời bạn nhập vào hãng sản phẩm");
        String companyProduct = scanner.nextLine();
        System.out.println("Mời bạn nhập  vào giá sản phẩm");
        double priceProduct = Double.parseDouble(scanner.nextLine());
        return new Product(codeProduct, nameProduct, companyProduct, priceProduct);
    }

    private   Product getFind() {
        String codeProduct;
        while (true) {
            System.out.println("Mời bạn nhập vào mã sản phẩm cần tìm kiếm");
            codeProduct = scanner.nextLine();
            for (Product product : products
            ) {
                if (product.getCodeProduct().equals(codeProduct)) {
                    return product;
                }
            }
            break;
        }
        return null;
    }
}
