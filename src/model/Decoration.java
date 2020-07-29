package model;

public class Decoration {
	
	//ATTRIBUTES
	private String material;
	private double price;
	
	
	//CONSTRUCTORS
	public Decoration() { }
	
	public Decoration(String material, double price) {
		super();
		this.material = material;
		this.price = price;
	}

	
	//GETTERS & SETTERS
	
	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	//METHODS
	
	//Show Decoration information
	@Override
	public String toString() {
		String roundPrice = String.format("%.2f", price);
		String info = "    • Material = " + material + " --> price = " + roundPrice + " €";
		return info; 
	}
	
}
