package case_study.sercive.util.read_write.customer;

import case_study.model.person.Customer;
import util.read_write.WriteFileUtil;

import java.util.List;

public class WriteFileCustomer {
    public void writeFileCustomer(String path, List<Customer> customers)  {
        String data="name,dateOfBirth,gender,identityCard,numberPhone,email,codeCustomer,typeCustomer,addressCustomer\n";
        for (Customer customer:customers
        ) {data+=customer.toString()+"\n";

        }
        WriteFileUtil.writeFile(path,data);
    }

}
