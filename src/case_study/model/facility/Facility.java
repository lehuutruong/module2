package case_study.model.facility;

public abstract class Facility {
    private String codeService;
    private String nameService;
    private double areaUsable;
    private double costsRental;
    private int numberPeopleMax;
    private String typeRental;

    public Facility() {
    }

    public Facility(String codeService, String nameService, double areaUsable, double costsRental, int numberPeopleMax, String typeRental) {
        this.codeService = codeService;
        this.nameService = nameService;
        this.areaUsable = areaUsable;
        this.costsRental = costsRental;
        this.numberPeopleMax = numberPeopleMax;
        this.typeRental = typeRental;
    }

    public String getCodeService() {
        return codeService;
    }

    public void setCodeService(String codeService) {
        this.codeService = codeService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getAreaUsable() {
        return areaUsable;
    }

    public void setAreaUsable(double areaUsable) {
        this.areaUsable = areaUsable;
    }

    public double getCostsRental() {
        return costsRental;
    }

    public void setCostsRental(double costsRental) {
        this.costsRental = costsRental;
    }

    public int getNumberPeopleMax() {
        return numberPeopleMax;
    }

    public void setNumberPeopleMax(int numberPeopleMax) {
        this.numberPeopleMax = numberPeopleMax;
    }

    public String getTypeRental() {
        return typeRental;
    }

    public void setTypeRental(String typeRental) {
        this.typeRental = typeRental;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "codeService='" + codeService + '\'' +
                ", nameService='" + nameService + '\'' +
                ", areaUsable=" + areaUsable +
                ", costsRental=" + costsRental +
                ", numberPeopleMax=" + numberPeopleMax +
                ", typeRental='" + typeRental + '\'' +
                '}';
    }
}
