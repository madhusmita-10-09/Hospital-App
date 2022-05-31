package hospital_app.controller;

import java.util.List;

import hospital_app.dto.Hospital;
import hospital_app.dto.Person;
import hospital_app.service.HospitalService;
import hospital_app.service.PersonService;

public class TestGetAllPersonDetails {

	public static void main(String[] args) {
		
		PersonService personService=new PersonService();
		List<Person> persons=personService.getAllPerson();
		
		for(Person person:persons)
		{
			System.out.println("person id :"+person.getPersonId());
			System.out.println("name :"+person.getName());
			System.out.println("person age :"+person.getAge());
			System.out.println("person email: "+person.getEmail());
			System.out.println("person "+person.getPhone());
			System.out.println("person :"+person.getDob());
			System.out.println("person: "+person.getBloodGroup());
		}

	}

}
