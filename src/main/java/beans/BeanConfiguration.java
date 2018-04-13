package beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public ItemDao itemDao() {
		ItemDaoInMemoryImpl bean = new ItemDaoInMemoryImpl();
		return bean;
	}
	
	@Bean
	public ItemService itemService() {
		ItemServiceImpl bean = new ItemServiceImpl();
		bean.setItemDao(itemDao());
		return bean;
	}

}
