package hospital_app.controller;

import hospital_app.service.HospitalService;

public class TestGetHospitalById {

	public static void main(String[] args) {
		
		HospitalService hospitalService=new HospitalService();
		hospitalService.getHospitalById(1);

	}

}
