package case_study.model.facility;

import case_study.model.facility.Facility;

public class House  extends Facility {
    private String roomStandard;
    private int numberOfFloors;

    public House() {
    }

    public House(String roomStandard, int numberOfFloors) {
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public House(String codeService, String nameService, double areaUsable, double costsRental, int numberPeopleMax, String typeRental, String roomStandard, int numberOfFloors) {
        super(codeService, nameService, areaUsable, costsRental, numberPeopleMax, typeRental);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" +super.toString()+
                "roomStandard='" + roomStandard + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}
