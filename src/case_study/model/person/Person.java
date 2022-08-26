package case_study.model.person;

public abstract class Person {
    private String name;
    private String dateOfBirth;
    private String gender;
    private String identityCard;
    private String numberPhone;
    private String email;

    public Person() {
    }

    public Person(String name, String dateOfBirth, String gender, String identityCard, String numberPhone, String email) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.identityCard = identityCard;
        this.numberPhone = numberPhone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", identityCard='" + identityCard + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
