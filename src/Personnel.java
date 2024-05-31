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

	public Person getPersonByID(int id) {return personList.get(id);}

}