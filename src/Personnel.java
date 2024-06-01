import java.util.*;
public class Personnel {

	private ArrayList<Person> personList;

	public Personnel() {
	   personList = new ArrayList<Person>();
	}

	public void addPersonnel(Person p)
	{
		personList.add(p);
	}

	public void removePersonnel(Person p) {personList.remove(p);}

	public ArrayList<Person> getPersonList() {return this.personList;}

	public Person getPersonByIndex(int index) {return personList.get(index);}

	public Person getPersonByName(String first, String last) {
			for (Person p : personList) {
			if (p.getFirst().equals(first) && p.getLast().equals(last)) {
				return p;
			}
		}
		return null;
	}

}