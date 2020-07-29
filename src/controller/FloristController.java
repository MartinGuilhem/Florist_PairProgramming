package controller;

import java.util.List;


import model.Florist;
import views.Menu;
import views.UserInput;

public class FloristController {
	
	
	
	public static void mainMenu(List<Florist> florists) {
	
		int ask=1;
	
		
		do {
			switch(Menu.viewMainMenu())
			{
	        	case 1: // Create new florist

	        		florists.add(createNewFlorist());
	        		
	        		break;
	        	
	        	case 2: // Edit Existing Florist
	        		
	        		editFlorist(florists);     		
	        		
	     	
	        		break;
	        
	        	case 3: // Show Stock From Florist
	        
	        		int floNum = chooseFloristFromList(florists);
	        		
	        		florists.get(floNum).showStock();
	        		

	        		break;
	        	
	        	case 4:  // Exit
	        		System.out.println("\nExit...");
	        		ask=0;	        		
	        		
	        		break;	        			        			
			}
		
						
		}while(ask==1);			
	}
	
	
	// crear floristeria y retorno el objeto	
	public static Florist createNewFlorist() {
		
		System.out.println("Introduce the new Florist Name: ");
		String name = views.UserInput.inPut();
		
		Florist florist = new Florist(name);
		
		return florist;
	}
	
	
	// mostrar floristerias (list)
	public static void showFloristList(List<Florist> florists) {
		
		System.out.println("FLORIST LIST: ");
		for(int i=0; i<florists.size(); i++)
		{
			System.out.println((i+1) + " - " + florists.get(i).getName());
		}
		
	}
	
	// elegir y editar floristeria
	public static void editFlorist(List<Florist> florists) {
		
		int floNum=chooseFloristFromList(florists);
		String floName=florists.get(floNum).getName();
		int item=Menu.editMenu(floName);

		
		switch(item)
		{
        	case 1: // agregar arbol

        		System.out.println("Tree HEIGHT: ");
        		
        		double height = views.UserInput.inPutDouble();
        		
        		System.out.println("Tree PRICE: ");
        		double priceTree = views.UserInput.inPutDouble();
        		
        		florists.get(floNum).addTree(height, priceTree);
        		break;
        	
        	case 2: // agregar flor
        		
        		System.out.println("Flower COLOR: ");
        		String color = views.UserInput.inPut();
        		
        		System.out.println("Flower PRICE: ");
        		double priceFlower = views.UserInput.inPutDouble();
        		
        		florists.get(floNum).addFlower(color, priceFlower);

     	
        		break;
        
        	case 3: // agregar deco
        
        		System.out.println("Decoration MATERIAL: ");
        		String material = views.UserInput.inPut();
        		
        		System.out.println("Decoration PRICE: ");
        		double priceDecoration = views.UserInput.inPutDouble();
        		
        		florists.get(floNum).addDecoration(material, priceDecoration);


        		break;
        	
        	case 4:  // Exit
        		System.out.println("\nExit...");		
        		
        		break;	        			        			
		}
				
	}
	
	// elegir floristeria desde lista
	public static int chooseFloristFromList(List<Florist> florists)
	{
		int floNum=0;
		boolean c=false;
		
		System.out.println(" * Edit an extisting Florist * ");
		
		// despliego lista de floristerias
		showFloristList(florists);
		
		
		//elijo floristeria
		System.out.println("Select Florist number: ");
		do {
			try {
				floNum=Integer.parseInt(UserInput.inPut());
			}
			catch(NumberFormatException e) {
				c=true;
			}
			if(floNum<florists.size() && floNum>florists.size())
			{
				System.out.println("\n You must put a correct option... please try again\n");
			}
			
		}while(floNum<florists.size() && floNum>florists.size() || c==true);
		
		return floNum-1;
		
	}
	
	
	
	
	

}
