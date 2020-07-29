package model;

public class Tree {

	//ATTRIBUTES
	
	private double height;
	private double price;
	
	
	//CONSTRUCTORS
	
	public Tree() { }

	public Tree(double height, double price) {
		
		this.height = height;
		this.price = price;
	}


	//GETTERS & SETTERS
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	//METHODS
	
	//Show Tree information
	@Override
	public String toString() {
		String roundPrice = String.format("%.2f", price);
		String info = "    • Height = " + height + " meters --> price = " + roundPrice + " €";
		return info; 
	}
	
}
