package beans;

public class ItemServiceImpl implements ItemService {
	
	private ItemDao itemDao;
	
	public ItemServiceImpl(ItemDao itemDao) {
		this.itemDao = itemDao;
	}
	
	public ItemDao getItemDao() {
		return itemDao;
	}

	public void setItemDao(ItemDao itemDao) {
		this.itemDao = itemDao;
	}
	
	public void setForSale(long itemId, boolean forSale) {
		Item item = itemDao.find(itemId);
		
		item.setForSale(forSale);
		
		itemDao.update(item);
	}
	
	public void increasePrice(long itemId, double amount) throws Exception {
		Item item = itemDao.find(itemId);
		item.setPrice(item.getPrice() + amount);
		itemDao.update(item);
	}
	
	public Item getItem(long itemId) {
		return itemDao.find(itemId);
	}

}
