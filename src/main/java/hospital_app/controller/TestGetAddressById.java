package hospital_app.controller;

import hospital_app.service.AddressService;

public class TestGetAddressById {

	public static void main(String[] args) {
		
		AddressService addressService=new AddressService();
		addressService.getAddressById(1);

	}

}
