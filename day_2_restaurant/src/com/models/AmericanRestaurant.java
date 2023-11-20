package com.models;

public class AmericanRestaurant implements Restaurant {

	@Override
	public String prepareFood(String order) {
		// TODO Auto-generated method stub
		return "preparing " + order + " with lots of cheese and breads";
	}

}
