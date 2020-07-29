package model;

import java.util.ArrayList;
import java.util.List;

public class Sample {

	//crear lista para guardar floristerias
	static List<Florist> florists = new ArrayList<Florist>();
	
	//crear y coger muestras de floristerias
	public static List<Florist> getSample(){
		
		//añadir muestra de 3 floristerias
	
		Florist f1 = new Florist("Navarro");
		f1.addTree(20, 50);
		f1.addTree(15, 40);
		f1.addTree(10, 30);
		f1.addFlower("red", 2);
		f1.addFlower("white", 3);
		f1.addFlower("blue", 4);
		f1.addDecoration("aluminium", 20);
		f1.addDecoration("wood", 35);
		f1.addDecoration("plastic", 20);		
		florists.add(f1);

		Florist f2 = new Florist("Lola");
		f2.addTree(7, 10);
		f2.addTree(5, 8);
		f2.addTree(2, 5);
		f2.addFlower("pink", 3);
		f2.addFlower("yellow", 4);
		f2.addFlower("violet", 5);
		f2.addDecoration("iron", 30);
		f2.addDecoration("plastic", 10);
		f2.addDecoration("paper", 5);		
		florists.add(f2);

		Florist f3 = new Florist("Kanna");
		f3.addTree(0.8, 15);
		f3.addTree(0.5, 12);
		f3.addTree(0.2, 9);
		f3.addFlower("green", 4);
		f3.addFlower("orange", 2);
		f3.addFlower("purple", 3);
		f3.addDecoration("wood", 17);
		f3.addDecoration("aluminium", 15);
		f3.addDecoration("glass", 20);		
		florists.add(f3);
				
		return florists;
	}
	
}
