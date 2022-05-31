package hospital_app.controller;

import hospital_app.dto.Observation;
import hospital_app.service.ObservationService;

public class TestObservationById {

	public static void main(String[] args) {
		ObservationService observationService=new ObservationService();
		Observation observation=observationService.getById(1);
		
		System.out.println(observation.getObservationId());
		System.out.println(observation.getDescription());
		System.out.println(observation.getDate());
		System.out.println(observation.getTime());
	}

}
