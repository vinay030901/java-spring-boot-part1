package com.guest;

import com.models.IndianRestaurant;
import com.models.LaundaryImpl;
import com.service.GuestService;
import com.service.GuestServiceImpl;

public class Guest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuestService service1=new GuestServiceImpl(new IndianRestaurant());
		GuestService service2=new GuestServiceImpl(new LaundaryImpl());
		System.out.println(service1.orderDining("dosa"));
		System.out.println(service2.orderLaundary(2));


	}

}
