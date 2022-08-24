package ss17_io_binaryfile_serialization.exerise.manager_product_binary_files.view;

import ss17_io_binaryfile_serialization.exerise.manager_product_binary_files.controller.MainController;
import ss7_abstract_class_and_interface.exercise.interface_colorable.main.Main;

import java.io.IOException;

public class MainView {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        MainController mainController=new MainController();
        mainController.mainController();
    }
}
