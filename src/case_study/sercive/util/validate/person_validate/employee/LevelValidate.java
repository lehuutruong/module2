package case_study.sercive.util.validate.person_validate.employee;

import java.util.Scanner;

public class LevelValidate {
    private static Scanner scanner=new Scanner(System.in);
        public static String levelValidate(){
            String level = "";
            while (true) {
                boolean checkLevel = false;
                System.out.println("Choice level ");
                System.out.println("1. Intermediate");
                System.out.println("2. College");
                System.out.println("3. University");
                System.out.println("4. Masters");
               int  choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        level = "Intermediate";
                        checkLevel = true;
                        break;
                    case 2:
                        level = "College";
                        checkLevel = true;
                        break;
                    case 3:
                        level = "University";
                        checkLevel = true;
                        break;
                    case 4:
                        level = "Masters";
                        checkLevel = true;
                        break;
                    default:
                        System.out.println(" Only select one to four");
                        break;
                }
                if (checkLevel) {
                    break;
                }
            }
            return level;
        }
}
