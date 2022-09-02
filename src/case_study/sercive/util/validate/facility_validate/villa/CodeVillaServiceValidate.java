package case_study.sercive.util.validate.facility_validate.villa;

import case_study.model.facility.Villa;
import case_study.sercive.util.exeption.customer_exception.CodeCustomerException;
import case_study.sercive.util.read_write.villa.ReadFileVilla;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CodeVillaServiceValidate {
    private static Scanner scanner = new Scanner(System.in);
    public static String codeVillaServiceValidate() {
        ReadFileVilla readFileVilla=new ReadFileVilla();
        String src="module2\\src\\case_study\\data\\Villa.csv";
        List<Villa>villas=readFileVilla.readFileVilla(src);
        String codeVillaService;
                        while (true) {
            try {
                System.out.println("Enter code service");
                codeVillaService = scanner.nextLine();
                if (codeVillaService.equals("")) {
                    throw new CodeCustomerException("CodeService cannot be blank");
                }
                for (Villa villa : villas
                ) {
                    if (codeVillaService.equals(villa.getCodeService())) {
                        throw new CodeCustomerException(" CodeService appeared");
                    }

                }

                if (!codeVillaService.matches("[S]+[V]+[V]+[L]+[-]+[0-9]{4}"))
                    throw new CodeCustomerException("Code Service is not correct format");
                break;
            } catch (CodeCustomerException e) {
                System.out.println(e.getMessage());
            }
        }
        return  codeVillaService;
    }
}
