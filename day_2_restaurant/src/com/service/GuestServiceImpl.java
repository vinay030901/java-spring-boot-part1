package com.service;

import com.models.Laundary;
import com.models.Restaurant;

public class GuestServiceImpl implements GuestService {

	private Restaurant restaurant;
	private Laundary laundary;

	public GuestServiceImpl(Restaurant restaurant) {
		super();
		this.restaurant = restaurant;
	}

	public GuestServiceImpl(Laundary laundary) {
		super();
		this.laundary = laundary;
	}

	@Override
	public String orderDining(String food) {
		// TODO Auto-generated method stub
		return restaurant.prepareFood(food);
	}

	@Override
	public String orderLaundary(int no) {
		// TODO Auto-generated method stub
		return laundary.washClothes(no);
	}

}