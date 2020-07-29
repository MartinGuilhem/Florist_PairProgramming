package model;

public class Flower {
	
	//ATTRIBUTES
	
	private String color;
	private double price;
	
	
	//CONSTRUCTORS
	
	public Flower() { }
	
	public Flower(String color, double price) {
		this.color = color;
		this.price = price;
	}


	//GETTERS & SETTERS
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	//METHODS
	
	//Show Flower information
	@Override
	public String toString() {
		String roundPrice = String.format("%.2f", price);
		String info = "    • Color = " + color + " --> price = " + roundPrice + " €";
		return info; 
	}

}
