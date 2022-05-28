package hospital_app.dao;

import java.util.List;

import hospital_app.dto.Item;
import hospital_app.dto.MedOrder;

public interface MedOrderInterfaceDao {
	public abstract MedOrder saveMedOrder( MedOrder  medOrder);
	public abstract boolean totalBill(List<Item> item);
}
