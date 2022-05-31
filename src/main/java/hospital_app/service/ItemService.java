package hospital_app.service;

import hospital_app.dao.ItemDao;
import hospital_app.dto.Item;

public class ItemService {
	
	ItemDao itemDao=new ItemDao();
	public Item saveItem(Item item) {
		
		
		return itemDao.saveItem(item);
	}

	public double calculateCost(double price,int quantity) {
		return 0;
	}

}
