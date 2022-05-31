package hospital_app.dao;

import hospital_app.dto.Address;

public interface AddressInterfaceDao {
	public abstract Address saveAddress(Address address);
	public abstract Address getAddressById(int id);
	public abstract Address updateAddressById(int id);
	

}
