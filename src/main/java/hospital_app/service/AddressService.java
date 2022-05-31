package hospital_app.service;

import hospital_app.dao.AddressDao;
import hospital_app.dto.Address;

public class AddressService {
	
	AddressDao addressDao=new AddressDao();
	public Address saveAddress( Address address) {
			
			return addressDao.saveAddress(address);
			
		}
		

	public Address getAddressById(int id) {
		
		return addressDao.getAddressById(id);
		
	}

	public Address updateAddressById(int id) {
		return addressDao.updateAddressById(id);
		
	}

}
