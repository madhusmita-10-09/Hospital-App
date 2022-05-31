package hospital_app.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import hospital_app.dao.MedOrderDao;
import hospital_app.dto.Item;
import hospital_app.dto.MedOrder;

public class MedOrderService {
	MedOrderDao medOrderDao=new MedOrderDao();
	
	public MedOrder saveMedOrder(MedOrder medOrder) {
		
		
		
		return medOrderDao.saveMedOrder(medOrder);
	}
	public  double  totalBill(List<Item> items,MedOrder medOrder) {
		return medOrderDao.totalBill(items, medOrder);
	}
	
	public MedOrder getMedOrderById(int id) {
		
		return  medOrderDao.getMedOrderById(id);
		
		
	}

}
