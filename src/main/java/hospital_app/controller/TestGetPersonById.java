package hospital_app.controller;

import hospital_app.service.PersonService;

public class TestGetPersonById {

	public static void main(String[] args) {
		PersonService personService=new PersonService();
		personService.getPersonById(1);

	}

}
