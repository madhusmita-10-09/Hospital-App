package hospital_app.controller;

import hospital_app.dto.Address;
import hospital_app.dto.Person;
import hospital_app.service.AddressService;
import hospital_app.service.PersonService;

public class TestUpdateAddressById {

	public static void main(String[] args) {
		
		
		
		Address address=new Address();
		address.setCity("banglore");
		address.setCountry("usa");
		address.setState("karnataka");
		address.setAddressId(1);
		
		AddressService addressService=new AddressService();
		Address address1=addressService.updateAddressById(1);
	
		if(address1!=null)
		{
			System.out.println("data insertd");
		}
		else
		{
			System.out.println("data not inserted");
		}
		

	}

}
