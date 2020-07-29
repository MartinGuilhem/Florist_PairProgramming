package model;

import java.util.ArrayList;
import java.util.List;

public class Florist {

	//ATRIBUTOS
	private String name;
	private List<Flower> flowers;
	private List<Tree> trees;
	private List<Decoration> decorations;
	
	
	//CONSTRUCTORES
	public Florist() { }
	
	public Florist(String name) {
		this.name = name;
		this.flowers = new ArrayList<Flower>();
		this.trees = new ArrayList<Tree>();
		this.decorations = new ArrayList<Decoration>();
	}

		
	//GETTERS & SETTERS
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Flower> getFlowers() {
		return flowers;
	}

	public void setFlowers(List<Flower> flowers) {
		this.flowers = flowers;
	}

	public List<Tree> getTrees() {
		return trees;
	}

	public void setTrees(List<Tree> trees) {
		this.trees = trees;
	}

	public List<Decoration> getDecorations() {
		return decorations;
	}

	public void setDecorations(List<Decoration> decorations) {
		this.decorations = decorations;
	}
	
	
	//METODOS
	
	//Añadir árbol
	public void addTree(double height, double price) {
		Tree tree = new Tree(height,price);
		trees.add(tree);
	}
	
	//Añadir flor
	public void addFlower(String color, double price) {
		Flower flower = new Flower(color,price);	
		flowers.add(flower);
	}
	
	//Añadir decoración
	public void addDecoration(String material, double price) {
		Decoration decoration = new Decoration(material, price);
		decorations.add(decoration);
	}
	
	//Muestra stock
	public void showStock() {
		String stock = "\n" + this.name.toUpperCase() +"'S FLORIST STOCK:\n";
		//Get trees
		stock += "\n<-- Trees -->\n";
		for(int i=0; i<trees.size();i++) {
			stock += trees.get(i).toString() + "\n";
		}
		//Get flowers
		stock += "\n<-- Flowers -->\n";
		for(int i=0; i<flowers.size();i++) {
			stock += flowers.get(i).toString() + "\n";
		}
		//Get decorations
		stock += "\n<-- Decorations -->\n";
		for(int i=0; i<decorations.size();i++) {
			stock += decorations.get(i).toString() + "\n";
		}
		//Show stock
		System.out.println(stock);
	}
	
	
}
