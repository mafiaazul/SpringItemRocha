package beans;

import java.util.List;

public interface ItemDao {
	
	public void insert(Item item);
	public void update(Item item);
	public void update(List<Item> items);
	public void delete(long itemId);
	public Item find(long itemId);
	public List<Item> find(List<Long> itemIds);
	public List<Item> find(String name);
	public List<Item> find(boolean forSale);	

}
