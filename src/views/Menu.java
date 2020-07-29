package views;


public class Menu {
	
	
	// retornar opcion seleccionada
	public static int viewMainMenu()
	{		
		int optionMainMenu=0;
		boolean c=false;
		
		do {
			c=false;
			System.out.println("-----------------------------------------------");
			System.out.println("\n\tWelcome to FloristApp");
			System.out.println("Choose an option: ");
			System.out.println("1. Create New Florist");
			System.out.println("2. Edit Existing Florist");
			System.out.println("3. Show Stock From Florist");
			System.out.println("4. Exit");
			try {
				optionMainMenu=Integer.parseInt(UserInput.inPut());
			}
			catch(NumberFormatException e) {
				c=true;
			}
			
			if(optionMainMenu!=1 && optionMainMenu!=2 && optionMainMenu!=3 && optionMainMenu!=4)
			{
				System.out.println("\n You must put a correct option... please try again\n");
			}
			
		}while(optionMainMenu!=1 && optionMainMenu!=2 && optionMainMenu!=3 && optionMainMenu!=4 || c==true);
		
		return optionMainMenu;		
	}
	
	
	//menu editar floristeria
	public static int editMenu(String name)
	{		
		int optionEditMenu=0;
		boolean c=false;
		
		do {
			c=false;
			System.out.println("-----------------------------------------------");
			System.out.println("\n\tADD ITEM to Florist "+ name.toUpperCase());
			System.out.println("Choose an option: ");
			System.out.println("1. Add New Tree");
			System.out.println("2. Add New Flower");
			System.out.println("3. Add New Decoration");
			System.out.println("4. Exit");
			try {
				optionEditMenu=Integer.parseInt(UserInput.inPut());
			}
			catch(NumberFormatException e) {
				c=true;
			}
			
			if(optionEditMenu!=1 && optionEditMenu!=2 && optionEditMenu!=3 && optionEditMenu!=4)
			{
				System.out.println("\n You must put a correct option... please try again\n");
			}
			
		}while(optionEditMenu!=1 && optionEditMenu!=2 && optionEditMenu!=3 && optionEditMenu!=4 || c==true);
		
		return optionEditMenu;		
	}
	
	
	

}
