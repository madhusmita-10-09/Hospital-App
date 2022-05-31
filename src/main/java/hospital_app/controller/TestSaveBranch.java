package hospital_app.controller;

import java.util.ArrayList;
import java.util.List;

import hospital_app.dto.Branch;
import hospital_app.dto.Hospital;
import hospital_app.service.BranchService;
import hospital_app.service.HospitalService;

public class TestSaveBranch {

	public static void main(String[] args) {
		
		
		
		
		Branch branch1=new Branch();
		branch1.setName("Apollo-banglore");
		branch1.setEmail("apollo@gmail.com");
		branch1.setPhone(938383387l);
		branch1.setNumberOfStaff(200);
		
		
		HospitalService hospitalService=new HospitalService();
		Hospital hospital=hospitalService.getHospitalById(1);
		System.out.println(hospital);
		branch1.setHospital(hospital);
		
		
		BranchService branchService=new BranchService();
	    branchService.saveBranch(branch1);
		
		
//		Branch branch2=new Branch();
//		branch2.setName("Apollo-majestic");
//		branch2.setEmail("apollomajestic@gmail.com");
//		branch2.setPhone(878383387l);
//		branch2.setNumberOfStaff(100);
		
//		Branch branch3=new Branch();
//		branch3.setName("Apollo-basavagudi");
//		branch3.setEmail("apollobas@gmail.com");
//		branch3.setPhone(938765387l);
//		branch3.setNumberOfStaff(123);
		
//		List<Branch> branches=new ArrayList();
//		branches.add(branch1);
//		branches.add(branch2);
//		branches.add(branch3);
		
	  
	   
	  
		 
		
		
		
		
		

	}

}
