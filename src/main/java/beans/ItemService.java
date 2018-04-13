package beans;

public interface ItemService {

	public void setForSale(long itemId, boolean forSale);
	public void increasePrice(long itemId, double amount) throws Exception;
	public Item getItem(long itemId);
	
}
