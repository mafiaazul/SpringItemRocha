package beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartProgram {

	public static void main(String[] args) throws Exception {

		//AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans/beans.xml");
		
		ItemService itemService = applicationContext.getBean("itemService", ItemService.class);
		
		System.out.println("Before increasing amount");
		System.out.println("Item 1 price: " + itemService.getItem(1).getPrice());
		System.out.println("Item 2 price: " + itemService.getItem(2).getPrice());

		itemService.increasePrice(1, 10);
		itemService.increasePrice(2, 20);
		
		System.out.println("After increasing amount");
		System.out.println("Item 1 price: " + itemService.getItem(1).getPrice());
		System.out.println("Item 2 price: " + itemService.getItem(2).getPrice());
		
	}

}
