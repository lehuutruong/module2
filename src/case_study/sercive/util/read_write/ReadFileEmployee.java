package case_study.sercive.util.read_write;

import case_study.model.person.Employee;
import util.read_write.ReadFileUtil;

import java.util.ArrayList;
import java.util.List;

public class ReadFileEmployee {
    public static List<Employee>readFileEmployee(String path)  {
        List<String>strings= ReadFileUtil.readFile(path);
        List<Employee>employeeList=new ArrayList<>();
        String[]info;
        for (String string:strings
             ) { info=string.split(",");
             employeeList.add(new Employee(info[0],info[1],info[2],info[3],info[4],info[5],info[6],info[7],info[8],info[9]));

        }
        return employeeList;
    }
}
