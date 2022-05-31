package hospital_app.controller;

import hospital_app.dto.Address;
import hospital_app.dto.Branch;
import hospital_app.dto.Hospital;
import hospital_app.service.AddressService;
import hospital_app.service.BranchService;
import hospital_app.service.HospitalService;

public class TestSaveAddress {

	public static void main(String[] args) {
		
		Address address1=new Address();
		AddressService addressService=new AddressService();
		
		address1.setCity("rajajinagar");
		address1.setStreet("rajkumar road");
		address1.setState("karnataka");
		address1.setPincode(7383);
		address1.setCountry("india");
		BranchService branchService= new BranchService();
		Branch branch=branchService.getBranchById(1);
		System.out.println(branch);
		address1.setBranch(branch);
		addressService.saveAddress(address1);
		

	}

}
