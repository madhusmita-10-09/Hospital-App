package hospital_app.dao;

import hospital_app.dto.Item;

public interface ItemInterfaceDao {
	public abstract Item saveItem(Item item);
	public abstract double calculateCost(double price,int quantity);

}
