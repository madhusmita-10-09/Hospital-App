package hospital_app.controller;

import hospital_app.dto.Person;
import hospital_app.service.PersonService;

public class TestUpdatePersonById {

	public static void main(String[] args) {
		Person person=new Person();
		person.setAge(21);
		person.setName("madhu");
		person.setEmail("smita@gmail.com");
		person.setDob("10-09-2000");
		person.setBloodGroup("O+");
		PersonService personService=new PersonService();
		Person person1=personService.updatePersonById(1, person);
		if(person!=null)
		{
			System.out.println("data insertd");
		}
		else
		{
			System.out.println("data not inserted");
		}
		

	}

}
