package hospital_app.service;

import java.util.List;

import hospital_app.dao.BranchDao;
import hospital_app.dao.HospitalDao;
import hospital_app.dto.Branch;

public class BranchService {
	public Branch saveBranch(Branch branch) {
		
		BranchDao branchDao=new BranchDao();
		return branchDao.saveBranch(branch);
		
	}

	public Branch getBranchById(int id) {
		BranchDao branchDao=new BranchDao();
		
		return branchDao.getBranchById(id);
	}

	public List<Branch> getAllBranchHospitalById(int id) {
		
		BranchDao branchDao=new BranchDao();
		return branchDao.getAllBranchHospitalById(id);
	}

	public Branch updateBranchById(int id, Branch branch) {
		BranchDao branchDao=new BranchDao();
		return branchDao.updateBranchById(id, branch);
		
	}

	public boolean deleteBranchById(int id) {
		
		BranchDao branchDao=new BranchDao();
		return branchDao.deleteBranchById(id);
	}

}
