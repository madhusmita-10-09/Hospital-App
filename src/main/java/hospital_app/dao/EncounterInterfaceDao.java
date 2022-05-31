package hospital_app.dao;

import java.util.List;

import hospital_app.dto.Encounter;

public interface EncounterInterfaceDao {
	public abstract Encounter createEncounter(Encounter encounter);
	public abstract Encounter getEncounterByPersonId(int personId);
	public abstract List<Encounter> getAllEncounterByPersonId(int personId);
	public abstract Encounter updateEncounterStatus(int encounterId,Encounter encounter);


}
