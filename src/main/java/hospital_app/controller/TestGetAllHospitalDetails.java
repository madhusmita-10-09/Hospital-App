package hospital_app.controller;

import java.util.List;

import hospital_app.dto.Hospital;
import hospital_app.service.HospitalService;

public class TestGetAllHospitalDetails {

	public static void main(String[] args) {
		
		HospitalService hospitalService=new HospitalService();
		List<Hospital> hospitals=hospitalService.getAllHospital();
		
		for(Hospital hospital:hospitals)
		{
			System.out.println("id :"+hospital.getHospitalId());
			System.out.println("name :"+hospital.getName());
			System.out.println(" gst number:"+hospital.getGstNumber());
		}

	}

}
