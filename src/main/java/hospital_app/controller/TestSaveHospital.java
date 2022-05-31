package hospital_app.controller;

import hospital_app.dto.Hospital;
import hospital_app.service.HospitalService;

public class TestSaveHospital {

	public static void main(String[] args) {
		Hospital hospital=new Hospital();
		HospitalService hospitalService=new HospitalService();
		
		hospital.setName("Aswini Hospital");
		hospital.setGstNumber("aswin0234");
		
		hospitalService.saveHospital(hospital);
		
		
	

	}

}
