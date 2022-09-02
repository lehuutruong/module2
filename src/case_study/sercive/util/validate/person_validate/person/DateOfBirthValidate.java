package case_study.sercive.util.validate.person_validate.person;

import case_study.sercive.util.exeption.employee_exception.DateOfBirthException;

import java.util.Scanner;

public class DateOfBirthValidate {
    private static Scanner scanner=new Scanner(System.in);
    public static String dateOfBirthValidate(){
        String dateOfBirth;
        while (true) {
            try {
                System.out.println("Enter date of birth");
                dateOfBirth = scanner.nextLine();
                if (!dateOfBirth.matches("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$")) {
                    throw new DateOfBirthException("The date of birth must be in the correct format");
                }
                break;
            } catch (DateOfBirthException e) {
                System.out.println(e.getMessage());
            }
        }
return dateOfBirth;
    }
}
