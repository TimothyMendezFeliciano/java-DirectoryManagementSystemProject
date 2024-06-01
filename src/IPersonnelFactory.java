public interface IPersonnelFactory {
    Person createPersonnel(String type, String last, String first, String middle, int id, double salary);
}
