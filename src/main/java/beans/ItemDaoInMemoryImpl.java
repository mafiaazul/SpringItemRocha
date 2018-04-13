package beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
		itemsMap.put(item.getId(), item);
	}
	
	public void update(Item item) {
		itemsMap.put(item.getId(), item);
	}
	
	public void update(List<Item> items) {
		for(Item item : items) {
			update(item);
		}
	}
	
	public void delete(long itemId) {
		itemsMap.remove(itemId);
	}
	
	public Item find(long itemId) {
		return itemsMap.get(itemId);
	}
	
	public List<Item> find(List<Long> itemIds) {
		List<Item> items = new ArrayList<Item>();
		for(Long Id : itemIds) {
			items.add(itemsMap.get(Id));
		}
		return items;
	}
	
	public List<Item> find(String name) {
		List<Item> items = new ArrayList<Item>();
		for(Item item : itemsMap.values()) {
			if(name.equals(item.getName())) {
				items.add(item);
			}
		}
		return items;
	}
	
	public List<Item> find(boolean forSale) {
		List<Item> items = new ArrayList<Item>();
		for(Item item : itemsMap.values()) {
			if(forSale == item.isForSale()) {
				items.add(item);
			}
		}
		return items;
	}

}