package oneToOne;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Laptop {

	@Id
	@GeneratedValue
	private int laptopId;
	private String model;
	private int price;

	public int getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Laptop(String model, int price) {
		super();
		this.model = model;
		this.price = price;
	}

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", model=" + model + ", price=" + price + "]";
	}

}
