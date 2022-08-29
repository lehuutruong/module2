package case_study.sercive.util.read_write.employee;

import case_study.model.person.Employee;
import util.read_write.WriteFileUtil;

import java.util.List;

public class WriteFileEmployee {
    public void writeFileEmployee(String path, List<Employee>employees)  {
        String data="name,dateOfBirth,gender,identityCard,numberPhone,email,codeEmployee,level,location,wage\n";
        for (Employee employee:employees
             ) {data+=employee.toString()+"\n";

        }
        WriteFileUtil.writeFile(path,data);
    }
    }
