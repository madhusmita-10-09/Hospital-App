package hospital_app.controller;

import hospital_app.dto.Branch;
import hospital_app.service.BranchService;

public class TestUpdateBranch {
	public static void main(String[] args) {
		
		Branch branch=new Branch();
		branch.setBranchId(1);
		branch.setName("cardiology");
		branch.setEmail("card@gmail.com");
		branch.setNumberOfStaff(200);
		
		BranchService branchService=new BranchService();
		Branch branch1=branchService.updateBranchById(1,branch);
		
	}

}
