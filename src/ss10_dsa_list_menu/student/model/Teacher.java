package ss10_dsa_list_menu.student.model;

public class Teacher extends Person {
    private String position;
    public Teacher(){

    }

    public Teacher(String position) {
        this.position = position;
    }

    public Teacher(int id, String name, String dateOfBirth, String gener, String position) {
        super(id, name, dateOfBirth, gener);
        this.position = position;
    }

    @Override
    public String toString() {
        return "Teacher{" + super.toString()+
                "position='" + position + '\'' +
                '}';
    }

    @Override
    public void setGender(String giới_tính) {

    }

    @Override
    public void setScore(int điểm) {

    }

    @Override
    public void setClassName(String tên_lớp) {

    }
}
