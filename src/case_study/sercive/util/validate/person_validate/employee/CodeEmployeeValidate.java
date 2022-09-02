package case_study.sercive.util.validate.person_validate.employee;

import case_study.model.person.Employee;
import case_study.sercive.util.exeption.employee_exception.CodeEmployeeException;
import case_study.sercive.util.read_write.employee.ReadFileEmployee;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class CodeEmployeeValidate {
    private static Scanner scanner = new Scanner(System.in);
    public static String codeEmployeeValidate() {
//        String src = "module2\\src\\case_study\\data\\Employee.csv";
//        ReadFileEmployee readFileEmployee = new ReadFileEmployee();
//        List<Employee> employees = readFileEmployee.readFileEmployee(src);
//        String codeEmployee;
//        while (true) {
//            try {
//                System.out.println("Enter code employee");
//                codeEmployee = scanner.nextLine();
//                if (codeEmployee.equals("")) {
//                    throw new CodeEmployeeException("CodeEmployee cannot be blank");
//                }
//                for (Employee employee : employees
//                ) {
//                    if (codeEmployee.equals(employee.getCodeEmployee())) {
//                        throw new CodeEmployeeException(" CodeEmploy appeared");
//                    }
//                }
//                break;
//            } catch (CodeEmployeeException e) {
//                System.out.println(e.getMessage());
//            }
//        }
//        return codeEmployee;
        File file = new File("module2\\src\\case_study\\data\\Employee.csv");
        int nbrOfLine = 0;
        FileReader fr = null;
        try {
            fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader br = new BufferedReader(fr);
        String str;
        while (true){
            try {
                if (!((str=br.readLine())!=null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            nbrOfLine++;
        }
        try {
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String string="";
        if(nbrOfLine<10){
            string="EMPLOYEE-0"+String.valueOf(nbrOfLine);
        }
        else if(nbrOfLine<100){
            string="EMPLOYEE-"+String.valueOf(nbrOfLine);
        }
       return string;
    }

}
