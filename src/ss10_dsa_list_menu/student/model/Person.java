package ss10_dsa_list_menu.student.model;

public abstract class Person {
    private int id;
    private String name;
    private String dateOfBirth;
    private String gener;

    public Person( ) {

    }

    public Person(int id, String name, String dateOfBirth,String gener) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gener=gener;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public String getGener(){
        return gener;
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
    public String  setGener(){
        return gener;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gener= " + gener+
                '}';
    }

    public abstract void setGender(String giới_tính);

    public abstract void setScore(int điểm);

    public abstract void setClassName(String tên_lớp);
}
