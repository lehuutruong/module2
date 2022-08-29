package case_study.sercive.util.read_write.customer;

import case_study.model.person.Customer;
import case_study.model.person.Employee;
import util.read_write.ReadFileUtil;

import java.util.ArrayList;
import java.util.List;

public class ReadFileCustomer {
    public static List<Customer> readFileCustomer(String path) {
        List<String> strings = ReadFileUtil.readFile(path);
        List<Customer> customers = new ArrayList<>();
        String[] info;
        for (String string : strings
        ) {
            info = string.split(",");
            customers.add(new Customer(info[0], info[1], info[2], info[3], info[4], info[5], info[6], info[7], info[8]));

        }
        return customers;
    }
}