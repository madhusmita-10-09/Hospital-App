package hospital_app.controller;

import hospital_app.dto.Encounter;
import hospital_app.dto.MedOrder;
import hospital_app.service.EncounterService;
import hospital_app.service.MedOrderService;
import hospital_app.service.ObservationService;

public class TsetSaveMedOrder {

	public static void main(String[] args) {
		
		MedOrder medOrder1=new MedOrder();
		medOrder1.setDsecription("yeyey");
		medOrder1.setTotalcost(555);
		
		EncounterService encounterSrvice=new EncounterService();
		Encounter encounter=encounterSrvice.getEncounterByPersonId(1);
		System.out.println(encounter);
		medOrder1.setEncounter(encounter);
		
		
		MedOrderService medOrderService=new MedOrderService();
		medOrderService.saveMedOrder(medOrder1);
		 
		 if(medOrder1!=null)
		 {
			 System.out.println("data inserted");
		 }
		 else
		 {
			 System.out.println("data not found");
		 }

	}


}
