package hospital_app.controller;

import java.time.LocalDateTime;

import hospital_app.dto.Observation;
import hospital_app.service.ObservationService;

public class TestUpdateObservationById {

	public static void main(String[] args) {
		
		ObservationService observationService=new ObservationService();
		Observation observation=new Observation();
	    observationService.updateObservationById(1);
	    
	    observation.setObservationId(1);
	    observation.setDescription("you should eat properly");
	    observation.setDate(LocalDateTime.of(2022, 05, 12, 2, 15));
	    observation.setDate(LocalDateTime.of(2022, 06, 23, 45, 13));

		
	}

}
