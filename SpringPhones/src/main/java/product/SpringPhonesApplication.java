package product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import product.beans.Manufacturer;
import product.beans.Phone;
import product.controller.BeanConfiguration;
import product.repository.PhoneRepository;

@SpringBootApplication
public class SpringPhonesApplication  {

	public static void main(String[] args) {
		SpringApplication.run(SpringPhonesApplication.class, args);
	}
	@Autowired
	PhoneRepository repo;
		
		/*ApplicationContext appContext = new AnnotationConfigApplicationContext (BeanConfiguration.class);
		Phone p = appContext.getBean("phone", Phone.class);
		System.out.println (p.toString());*/
		
		
		@Override
		public void run(String [] args) throws Exception{
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		Phone p = appContext.getBean("phone", Phone.class);
		p.setPrice(2100);
		repo.save(p);
		Phone d = new Phone ("X20", 1500, "Rose");
		Manufacturer m = new Manufacturer("India", 3500, "CMD965");
		d.setManufacturer(m);
		repo.save(d);
		
		List<Phone> allMyContacts = repo.findAll();
		for(Phone people: allMyContacts) {
			System.out.println(people.toString());
		}
		((AbstractApplicationContext) appContext).close();
		}
		
	

}
