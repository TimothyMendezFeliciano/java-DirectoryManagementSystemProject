public class Volunteers extends Person implements IPersonnelWorker {
    private int volID;
    private double baseSalary;


    public Volunteers(String last, String first, String middle, int id, double sal) {
        super(last, first, middle);
        this.volID = id;
        this.baseSalary = sal;
    }

    public int getID()
    {
        return volID;

    }

    public double getBaseSalary() {
        return this.baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

}
