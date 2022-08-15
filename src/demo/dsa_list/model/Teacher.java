package demo.dsa_list.model;

public class Teacher  extends Person{
    private String speciality;
    public Teacher(){

    }

    public Teacher(String speciality) {
        this.speciality = speciality;
    }

    public Teacher(int id, String name, String speciality) {
        super(id, name);
        this.speciality = speciality;
    }

    public Teacher(int id, String name, String dateOfBirth, String gener, String speciality) {
        super(id, name, dateOfBirth, gener);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Teacher{" + super.toString()+
                "speciality='" + speciality + '\'' +
                '}';
    }
   }
