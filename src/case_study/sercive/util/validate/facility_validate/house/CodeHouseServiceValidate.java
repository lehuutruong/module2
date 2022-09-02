package case_study.sercive.util.validate.facility_validate.house;

import case_study.model.facility.House;
import case_study.sercive.util.exeption.customer_exception.CodeCustomerException;
import case_study.sercive.util.read_write.house.ReadFileHouse;

import java.util.List;
import java.util.Scanner;

public class CodeHouseServiceValidate {
    private static Scanner scanner = new Scanner(System.in);
    public static String codeHouseServiceValidate(){
        ReadFileHouse readFileHouse=new ReadFileHouse();
        String src="module2\\src\\case_study\\data\\House.csv";
        List<House>houses=readFileHouse.readFileHouse(src);
        String codeHouseService;
        while (true) {
            try {
                System.out.println("Enter code service");
                codeHouseService = scanner.nextLine();
                if (codeHouseService.equals("")) {
                    throw new CodeCustomerException("CodeService cannot be blank");
                }
                for (House house : houses
                ) {
                    if (codeHouseService.equals(house.getCodeService())) {
                        throw new CodeCustomerException(" CodeService appeared");

                    }

                }
                if (!codeHouseService.matches("[S]+[V]+[H]+[O]+[-]+[0-9]{4}"))
                    throw new CodeCustomerException("Code Service is not correct format");
                break;
            } catch (CodeCustomerException e) {
                System.out.println(e.getMessage());
            }
        }
        return codeHouseService;
    }
}
