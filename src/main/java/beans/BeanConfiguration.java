package beans;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public ItemDao itemDao() {
		ItemDaoInMemoryImpl bean = new ItemDaoInMemoryImpl();
		return bean;
	}
	
	@Bean(autowire=Autowire.BY_NAME)
	public ItemService itemService() {
		ItemServiceImpl bean = new ItemServiceImpl(itemDao());
		//bean.setItemDao(itemDao());
		return bean;
	}
	
	@Bean
	public ItemDao itemDaoJpa() {
		ItemDaoJpaImpl bean = new ItemDaoJpaImpl();
		return bean;
	}

}
