package beans;

public class Item {
	
	private long id;
	private String name;
	private double price;
	private boolean forSale;
	
	public Item() {

	}

	public Item(long id, String name, double price, boolean forSale) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.forSale = forSale;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isForSale() {
		return forSale;
	}

	public void setForSale(boolean forSale) {
		this.forSale = forSale;
	}

}
