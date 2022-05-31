package hospital_app.controller;

import java.util.ArrayList;
import java.util.List;

import hospital_app.dto.Encounter;
import hospital_app.service.EncounterService;

public class TestGetAllEncounterByPersonId {

	public static void main(String[] args) {
		EncounterService encounterService=new EncounterService();
		encounterService.getEncounterByPersonId(1);
		List<Encounter> encounters=new ArrayList<Encounter>();
		for(Encounter encounter:encounters)
		{
			System.out.println(""+encounter.getEncounterId());
			System.out.println(""+encounter.getDischargeDateTime());
			System.out.println(""+encounter.getAdmitDateTime());
			System.out.println(""+encounter.getReason());
		}

	}

}
