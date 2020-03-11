package product.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
@Entity
public class Phone {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	private String model;
	private String color;
	private double price;
	@Autowired	
	private Manufacturer manufacturer;
	
	public Phone() {
		super();
	}
	

	public Phone(String model) {
		super();
		this.model = model;
		this.price = 550;
	}
	
	public Phone(String model, double price, String color) {
		super();
		this.model = model;
		this.price = price;
		this.color = color;
	}


	public Phone(long id, String model, double price, String color) {
		super();
		this.id = id;
		this.model = model;
		this.price = price;
		this.color = color;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public Manufacturer getManufacturer() {
		return manufacturer;
	}


	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}


	@Override
	public String toString() {
		return "Phone [id=" + id + ", model=" + model + ", color=" + color + ", price=" + price + ", manufacturer="
				+ manufacturer + "]";
	}


	
	

}
