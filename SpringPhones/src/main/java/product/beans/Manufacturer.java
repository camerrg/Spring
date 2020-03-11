package product.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Manufacturer {
	private String country;
	private String processor;
	private int units;
	
	public Manufacturer() {
		super();
		
	}

	public Manufacturer(String country, int units, String processor) {
		super();
		this.country = country;
		this.units = units;
		this.processor = processor;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

	@Override
	public String toString() {
		return "Manufacturer [country=" + country + ", processor=" + processor + ", units=" + units + "]";
	}
	
	
	

}
