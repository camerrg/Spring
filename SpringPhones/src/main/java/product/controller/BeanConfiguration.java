package product.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import product.beans.Manufacturer;
import product.beans.Phone;

@Configuration
public class BeanConfiguration {
	@Bean
	public Phone phone() {
		Phone bean = new Phone("Samsung");
		bean.setModel("X12");
		bean.setColor("mystic blue");
		bean.setPrice(1250.75);
			return bean;
		} 
	@Bean
	public Manufacturer manufacturer() {
		Manufacturer bean = new Manufacturer("China", 500, "XMD2.2");
		return bean;
	}
	
	
	

}
