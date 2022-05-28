package hospital_app.dao;

import hospital_app.dto.Observation;

public interface ObservationInterfaceDao {
	public abstract Observation saveObservation(Observation observation);
	public abstract boolean updateObservationById(int id);
	public abstract Observation getById(int id);
	

}
