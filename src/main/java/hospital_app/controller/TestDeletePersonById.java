package hospital_app.controller;

import hospital_app.service.PersonService;

public class TestDeletePersonById {

	public static void main(String[] args) {
		PersonService personService=new PersonService();
		personService.deletePersonById(1);

	}
}
