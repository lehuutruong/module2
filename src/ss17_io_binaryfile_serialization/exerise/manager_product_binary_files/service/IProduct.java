package ss17_io_binaryfile_serialization.exerise.manager_product_binary_files.service;

import java.io.IOException;

public interface IProduct {
    void addProduct() throws IOException, ClassNotFoundException;
    void displayProduct() throws IOException, ClassNotFoundException;
    void searchProduct() throws IOException, ClassNotFoundException;
}
