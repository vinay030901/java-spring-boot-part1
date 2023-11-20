package com.layer1;

public class Shuttle {

	private String routeName;
	private int shutId, capacity;

	public Shuttle(String routeName, int shutId, int capacity) {
		super();
		this.routeName = routeName;
		this.shutId = shutId;
		this.capacity = capacity;
	}

	public String getRouteName() {
		return routeName;
	}

	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}

	public int getShutId() {
		return shutId;
	}

	public void setShutId(int shutId) {
		this.shutId = shutId;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Shuttle [routeName=" + routeName + ", shutId=" + shutId + ", capacity=" + capacity + "]";
	}

}
