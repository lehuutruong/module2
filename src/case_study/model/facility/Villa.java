package case_study.model.facility;

public class Villa  extends Facility {
    private String roomStandard;
    private double areaPool;
    private int numberOfFloors;

    public Villa() {
    }

    public Villa(String roomStandard, double areaPool, int numberOfFloors) {
        this.roomStandard = roomStandard;
        this.areaPool = areaPool;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa(String codeService, String nameService, double areaUsable, double costsRental, int numberPeopleMax, String typeRental, String roomStandard, double areaPool, int numberOfFloors) {
        super(codeService, nameService, areaUsable, costsRental, numberPeopleMax, typeRental);
        this.roomStandard = roomStandard;
        this.areaPool = areaPool;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s",getCodeService(),getNameService(),getAreaUsable(),getCostsRental(),getNumberPeopleMax(),getTypeRental(),getRoomStandard(),getAreaPool(),getNumberOfFloors());
    }
}
