package hospital_app.controller;

import hospital_app.dto.Encounter;
import hospital_app.dto.Hospital;
import hospital_app.dto.Person;
import hospital_app.service.EncounterService;
import hospital_app.service.HospitalService;
import hospital_app.service.PersonService;

public class TestSavePerson {

	public static void main(String[] args) {
		
		Person person1 =new Person();
		person1.setName("madhu");
		person1.setAge(21);
		person1.setPhone(7328032390l);
		person1.setEmail("madhu@gmail.com");
		person1.setBloodGroup("O+");
		
//		EncounterService encounterService=new EncounterService();
//     	Encounter encounter=encounterService.createEncounter(encounter);
//		System.out.println(encounter);
//		person1.setEncounter(encounter);
//		
		
		PersonService personService=new PersonService();
		personService.savePerson(person1);
  
	}

}
