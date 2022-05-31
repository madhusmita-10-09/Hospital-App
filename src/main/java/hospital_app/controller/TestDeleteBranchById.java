package hospital_app.controller;

import hospital_app.dto.Branch;
import hospital_app.service.BranchService;

public class TestDeleteBranchById {

	public static void main(String[] args) {
		BranchService branchService=new BranchService();
		Branch branch=new Branch();
		branchService.deleteBranchById(1);
		if(branch != null)
		{
			System.out.println("Deleted successfully");
		} else {
			System.out.println("no data is found");
		}
		

	}

}
