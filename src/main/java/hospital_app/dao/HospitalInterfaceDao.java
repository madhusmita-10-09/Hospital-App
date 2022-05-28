package hospital_app.dao;

import java.util.List;

import hospital_app.dto.Hospital;

public interface HospitalInterfaceDao {
	public abstract Hospital saveHospital(Hospital hospital);
	public abstract List<Hospital> getAllHospital();
	public abstract Hospital getHospitalById(int id);

}
