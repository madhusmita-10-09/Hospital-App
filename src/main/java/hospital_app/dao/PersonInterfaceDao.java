package hospital_app.dao;

import java.util.List;

import hospital_app.dto.Person;

public interface PersonInterfaceDao {
	public abstract Person savePerson(Person person);
	public abstract Person getPersonById(int id);
	public Person updatePersonById(int id,Person person);
	public abstract List<Person> getAllPerson();
	public abstract boolean deletePersonById(int id);

}
