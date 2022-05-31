package hospital_app.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import hospital_app.dto.Branch;
import hospital_app.dto.Encounter;
import hospital_app.dto.Hospital;
import hospital_app.dto.Person;
import hospital_app.service.BranchService;
import hospital_app.service.EncounterService;
import hospital_app.service.HospitalService;
import hospital_app.service.PersonService;

public class TestSaveEncounter {

	public static void main(String[] args) {
		
		Encounter encounter1=new Encounter();
		encounter1.setAdmitDateTime(LocalDateTime.now());
		encounter1.setDischargeDateTime(LocalDateTime.now());
		encounter1.setReason("cold");
		
		Encounter encounter2=new Encounter();
		encounter2.setAdmitDateTime(LocalDateTime.now());
		encounter2.setDischargeDateTime(LocalDateTime.now());
		encounter2.setReason("fever");
		
		Encounter encounter3=new Encounter();
		encounter3.setAdmitDateTime(LocalDateTime.now());
		encounter3.setDischargeDateTime(LocalDateTime.now());
		encounter3.setReason("bone fracture");
		
		List<Encounter> encounters=new ArrayList<Encounter>();
		encounters.add(encounter1);
		encounters.add(encounter2);
		encounters.add(encounter3);
		
		PersonService personService=new PersonService();
		Person person=personService.getPersonById(1);
		encounter1.setPerson(person);
		encounter2.setPerson(person);
		encounter3.setPerson(person);
		
		
		BranchService branchService=new BranchService();
		Branch branch=branchService.getBranchById(1);
		System.out.println(branch);
		encounter1.setBranch(branch);
		
		
		EncounterService encounterService=new EncounterService();
		 encounterService.createEncounter(encounter1);
		 encounterService.createEncounter(encounter2);
		 encounterService.createEncounter(encounter3);
		 


	}

}
