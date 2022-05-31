package hospital_app.controller;

import java.util.List;

import hospital_app.dto.Branch;
import hospital_app.dto.Hospital;
import hospital_app.service.BranchService;
import hospital_app.service.HospitalService;

public class TestGetAllBranchByHospitalId {

	public static void main(String[] args) {
		BranchService branchService=new BranchService();
		List<Branch> branchs=branchService.getAllBranchHospitalById(1);
		
		for(Branch branch:branchs)
		{
			System.out.println("branch name: "+branch.getName());
			System.out.println("email :"+branch.getNumberOfStaff());
			System.out.println(" phone :"+branch.getPhone());
		}

		
		

	}

}
