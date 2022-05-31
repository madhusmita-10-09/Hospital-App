package hospital_app.service;

import java.util.List;

import hospital_app.dao.HospitalDao;
import hospital_app.dto.Hospital;

public class HospitalService {
	
	HospitalDao hospitalDao=new HospitalDao();
	public  Hospital saveHospital(Hospital hospital)
	{
		
		return hospitalDao.saveHospital(hospital);
		
	}
	public List<Hospital> getAllHospital()
	{
		return hospitalDao.getAllHospital();
	}
	public Hospital getHospitalById(int id)
	{
		return hospitalDao.getHospitalById(id);
	}

}
