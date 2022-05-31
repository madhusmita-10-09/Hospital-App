package hospital_app.service;

import java.util.List;

import hospital_app.dao.EncounterDao;
import hospital_app.dto.Encounter;

public class EncounterService {
	public Encounter createEncounter(Encounter encounter) {
		
		EncounterDao encounterDao=new EncounterDao();
		
			return encounterDao.createEncounter(encounter);
		
		
	
	}

	public List<Encounter> getAllEncounterByPersonId(int personId) {
		return null;
	}

	public Encounter updateEncounterStatus(int encounterId, Encounter encounter) {
		return null;
	}
	
	public Encounter getEncounterByPersonId(int personId) {
		EncounterDao encounterDao=new EncounterDao();
		
		return encounterDao.getEncounterByPersonId(personId);
		
	}

}
