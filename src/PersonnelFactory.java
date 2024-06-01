public class PersonnelFactory implements IPersonnelFactory {

    public Person createPersonnel(String type, String last, String first, String middle, int id, double salary) {
        switch (type) {
            case "employee":
                return new Employee(last, first, middle, id, salary);
            case "executive":
                return new Executive(last, first, middle, id, salary);
            case "security":
                return new Security(last, first, middle, id, salary);
            case "volunteer":
                return new Volunteers(last, first, middle, id, salary);
            default:
                return new Person(last, first, middle);
        }
    }
}
