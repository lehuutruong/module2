package case_study.model.facility;

import case_study.model.facility.Facility;

public class Room  extends Facility {
    private String freeServiceIncluded;

    public Room() {
    }

    public Room(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public Room(String codeService, String nameService, double areaUsable, double costsRental, int numberPeopleMax, String typeRental, String freeServiceIncluded) {
        super(codeService, nameService, areaUsable, costsRental, numberPeopleMax, typeRental);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%s,%s,%s",getCodeService(),getNameService(),getAreaUsable(),getCostsRental(),getNumberPeopleMax(),getTypeRental(),getFreeServiceIncluded());
    }
}
