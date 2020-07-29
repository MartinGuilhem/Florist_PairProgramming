package model;

public class Flower {
	
	//ATRIBUTOS
	
	private String color;
	private double price;
	
	
	//CONSTRUCTORES
	
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
	
	
	//METODOS
	
	//muestra informacino de flores
	@Override
	public String toString() {
		String roundPrice = String.format("%.2f", price);
		String info = "    • Color = " + color + " --> price = " + roundPrice + " €";
		return info; 
	}

}
