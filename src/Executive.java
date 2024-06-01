public class Executive extends Person implements IPersonnelWorker {
    private int executiveID;
    private double baseSalary;

    public Executive(String last, String first, String middle, int id, double baseSalary) {
        super(last, first, middle);
        this.executiveID = id;
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return this.baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }


    public int getExecutiveID() {
        return executiveID;
    }

    public void setExecutiveID(int executiveID) {
        this.executiveID = executiveID;
    }
}
