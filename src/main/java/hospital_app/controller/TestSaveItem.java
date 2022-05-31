package hospital_app.controller;

import java.util.ArrayList;
import java.util.List;

import hospital_app.dto.Encounter;
import hospital_app.dto.Item;
import hospital_app.dto.MedOrder;
import hospital_app.service.EncounterService;
import hospital_app.service.ItemService;
import hospital_app.service.MedOrderService;

public class TestSaveItem {

	public static void main(String[] args) {
		
		Item item1=new Item();
		item1.setName("hdhdh");
		item1.setQuantity(3);
		item1.setCost(5464);
		
		Item item2=new Item();
		item2.setName("hghh");
		item2.setQuantity(5);
		item2.setCost(4464);
		
		MedOrderService medOrderSrvice=new MedOrderService();
		MedOrder medOrder=medOrderSrvice.getMedOrderById(1);
		System.out.println(medOrder);
		item1.setMedOrder(medOrder);
		
		
		ItemService itemService=new ItemService();
		itemService.saveItem(item1);
		
		List<Item> item=new ArrayList();
		
		medOrderSrvice.totalBill(item, medOrder);
		
		 
		 if(item1!=null)
		 {
			 System.out.println("data inserted");
		 }
		 else
		 {
			 System.out.println("data not found");
		 }

	}

}
