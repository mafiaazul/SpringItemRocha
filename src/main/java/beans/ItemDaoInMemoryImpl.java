package beans;

import java.util.HashMap;
import java.util.Map;

public class ItemDaoInMemoryImpl implements ItemDao {
	
	private Map<Long, Item> itemsMap = new HashMap<Long, Item>();
	
	{
		Item item1 = new Item(1L, "Table", 10, false);
		Item item2 = new Item(2L, "Jar", 20, true);
		
		itemsMap.put(item1.getId(),  item1);
		itemsMap.put(item2.getId(), item2);
	}
	
	public void insert(Item item) {
		itemsMap.pu
	}

}