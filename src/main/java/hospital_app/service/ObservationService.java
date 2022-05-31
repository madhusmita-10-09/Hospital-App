package hospital_app.service;

import hospital_app.dao.ObservationDao;
import hospital_app.dto.Observation;

public class ObservationService {
	ObservationDao observationDao=new ObservationDao();
	public Observation saveObservation(Observation observation) {
		
		
		
		return observationDao.saveObservation(observation);
		
		
	}

	public boolean updateObservationById(int id) {
		return observationDao.updateObservationById(id);
		
		
	}

	public Observation getById(int id) {
		return observationDao.getById(id);
		
	}

}
