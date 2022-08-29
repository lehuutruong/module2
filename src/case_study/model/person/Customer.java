package case_study.model.person;

import case_study.model.person.Person;

public class Customer extends Person {
    private String codeCustomer;
    private String typeCustomer;
    private String addressCustomer;

    public Customer() {
    }

    public Customer(String codeCustomer, String typeCustomer, String addressCustomer) {
        this.codeCustomer = codeCustomer;
        this.typeCustomer = typeCustomer;
        this.addressCustomer = addressCustomer;
    }

    public Customer(String name, String dateOfBirth, String gender, String identityCard, String numberPhone, String email, String codeCustomer, String typeCustomer, String addressCustomer) {
        super(name, dateOfBirth, gender, identityCard, numberPhone, email);
        this.codeCustomer = codeCustomer;
        this.typeCustomer = typeCustomer;
        this.addressCustomer = addressCustomer;
    }

    public String getCodeCustomer() {
        return codeCustomer;
    }

    public void setCodeCustomer(String codeCustomer) {
        this.codeCustomer = codeCustomer;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddressCustomer() {
        return addressCustomer;
    }

    public void setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s",getName(),getDateOfBirth(),getGender(),getIdentityCard(),getNumberPhone(),getEmail(),getCodeCustomer(),getTypeCustomer(),getAddressCustomer());
    }
}
