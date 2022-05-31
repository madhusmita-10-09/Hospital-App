package hospital_app.controller;

import hospital_app.dto.MedOrder;
import hospital_app.service.MedOrderService;

public class TestGetMedOrderById {

	public static void main(String[] args) {
		
		MedOrderService medOrderService=new MedOrderService();
		MedOrder medOrder=medOrderService.getMedOrderById(1);
		
		System.out.println(medOrder.getMedOrderId());
		System.out.println(medOrder.getDsecription());
		System.out.println(medOrder.getTotalcost());
	}

}
