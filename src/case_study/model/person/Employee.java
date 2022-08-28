package case_study.model.person;

public class Employee extends Person {
    private String codeEmployee;
    private String level;
    private String locationEmployee;
    private String wage;

    public Employee() {
    }

    public Employee(String codeEmployee, String level, String locationEmployee, String wage) {
        this.codeEmployee = codeEmployee;
        this.level = level;
        this.locationEmployee = locationEmployee;
        this.wage = wage;
    }

    public Employee(String name, String dateOfBirth, String gender, String identityCard, String numberPhone, String email, String codeEmployee, String level, String locationEmployee, String wage) {
        super(name, dateOfBirth, gender, identityCard, numberPhone, email);
        this.codeEmployee = codeEmployee;
        this.level = level;
        this.locationEmployee = locationEmployee;
        this.wage = wage;
    }

    public String getCodeEmployee() {
        return codeEmployee;
    }

    public void setCodeEmployee(String codeEmployee) {
        this.codeEmployee = codeEmployee;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocationEmployee() {
        return locationEmployee;
    }

    public void setLocationEmployee(String locationEmployee) {
        this.locationEmployee = locationEmployee;
    }

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,",getName(),getDateOfBirth(),getGender(),getIdentityCard(),getNumberPhone(),getEmail(),getCodeEmployee(),getLevel(),getLocationEmployee(),getWage());
    }
}
