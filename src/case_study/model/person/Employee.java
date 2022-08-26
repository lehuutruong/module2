package case_study.model.person;

import case_study.model.person.Person;

public class Employee extends Person {
    private String codeEmployee;
    private String level;
    private String location;
    private String wage;

    public Employee() {
    }

    public Employee(String codeEmployee, String level, String location, String wage) {
        this.codeEmployee = codeEmployee;
        this.level = level;
        this.location = location;
        this.wage = wage;
    }

    public Employee(String name, String dateOfBirth, String gender, String identityCard, String numberPhone, String email, String codeEmployee, String level, String location, String wage) {
        super(name, dateOfBirth, gender, identityCard, numberPhone, email);
        this.codeEmployee = codeEmployee;
        this.level = level;
        this.location = location;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" +super.toString()+
                "codeEmployee='" + codeEmployee + '\'' +
                ", level='" + level + '\'' +
                ", location='" + location + '\'' +
                ", wage='" + wage + '\'' +
                '}';
    }
}
