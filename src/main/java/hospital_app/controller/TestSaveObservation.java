package hospital_app.controller;

import java.time.LocalDateTime;
import java.util.List;

import hospital_app.dto.Encounter;
import hospital_app.dto.Hospital;
import hospital_app.dto.Observation;
import hospital_app.service.BranchService;
import hospital_app.service.EncounterService;
import hospital_app.service.HospitalService;
import hospital_app.service.ObservationService;

public class TestSaveObservation {

	public static void main(String[] args) {
		
		Observation observation1=new Observation();
		observation1.setDate(LocalDateTime.now());
		observation1.setDate(LocalDateTime.now());
		observation1.setDescription("Drink more water");
		
		EncounterService encounterService=new EncounterService();
		Encounter encounter=encounterService.getEncounterByPersonId(1);
		System.out.println(encounter);
		observation1.setEncounter(encounter);
		
		
		ObservationService observationService=new ObservationService();
		 observationService.saveObservation(observation1);
		 
		 if(observation1!=null)
		 {
			 System.out.println("data inserted");
		 }
		 else
		 {
			 System.out.println("data not found");
		 }

	}

}
