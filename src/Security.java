public class Security extends Person implements IPersonnelWorker {
    private int secID;
    private double baseSalary;

    public Security(String last, String first, String middle, int id, double baseSalary) {
        super(last, first, middle);

        this.secID = id;
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return this.baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getSecID() {
        return secID;
    }

    public void setSecID(int secID) {
        this.secID = secID;
    }
}
