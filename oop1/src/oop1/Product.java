package oop1;
// Class adlari PascalCase yazilir
public class Product {
	// Buradaki variablelara FIELD denir ve buna camelCase yazilir.
	private String name;
	private double unitPrice;
	private double discount;
	private String imageUrl;
	private int unitsInStock;
	
	// Constructor methodlari
	public Product(String name, double unitPrice, double discount, String imageUrl, 
			int unitsInStock) {
		super();
		this.name = name;
		this.unitPrice = unitPrice;
		this.discount = discount;
		this.imageUrl = imageUrl;
		this.unitsInStock = unitsInStock;
	}

	public Product() {
		super();
	}

	public String getName() {
		return name;
	}
	
	//GETTER & SETTER methodlari
	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
}
