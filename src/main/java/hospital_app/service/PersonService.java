package hospital_app.service;

import java.util.List;

import hospital_app.dao.PersonDao;
import hospital_app.dto.Person;

public class PersonService {
	PersonDao personDao=new PersonDao();
		public Person savePerson(Person person) {
			
			
			return personDao.savePerson(person);
			
			
		}
		

	public Person getPersonById(int id) {
		return personDao.getPersonById(id);
		
	}

	public Person updatePersonById(int id, Person person) {
		return personDao.updatePersonById(id, person);
		
	}

	public List<Person> getAllPerson() {
		return personDao.getAllPerson();
		
	}

	public boolean deletePersonById(int id) {
		return personDao.deletePersonById(id);

	}

}
