package case_study.model;

public class Contract {
    private String numberContracts;
    private String codeBooking;
    private double advanceDepositAmount;
    private double totalPaymentAmount;
    private String codeCustomer;

    public Contract() {
    }

    public Contract(String numberContracts, String codeBooking, double advanceDepositAmount, double totalPaymentAmount, String codeCustomer) {
        this.numberContracts = numberContracts;
        this.codeBooking = codeBooking;
        this.advanceDepositAmount = advanceDepositAmount;
        this.totalPaymentAmount = totalPaymentAmount;
        this.codeCustomer = codeCustomer;
    }

    public String getNumberContracts() {
        return numberContracts;
    }

    public void setNumberContracts(String numberContracts) {
        this.numberContracts = numberContracts;
    }

    public String getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(String codeBooking) {
        this.codeBooking = codeBooking;
    }

    public double getAdvanceDepositAmount() {
        return advanceDepositAmount;
    }

    public void setAdvanceDepositAmount(double advanceDepositAmount) {
        this.advanceDepositAmount = advanceDepositAmount;
    }

    public double getTotalPaymentAmount() {
        return totalPaymentAmount;
    }

    public void setTotalPaymentAmount(double totalPaymentAmount) {
        this.totalPaymentAmount = totalPaymentAmount;
    }

    public String getCodeCustomer() {
        return codeCustomer;
    }

    public void setCodeCustomer(String codeCustomer) {
        this.codeCustomer = codeCustomer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "numberContracts='" + numberContracts + '\'' +
                ", codeBooking='" + codeBooking + '\'' +
                ", advanceDepositAmount=" + advanceDepositAmount +
                ", totalPaymentAmount=" + totalPaymentAmount +
                ", codeCustomer='" + codeCustomer + '\'' +
                '}';
    }
}
