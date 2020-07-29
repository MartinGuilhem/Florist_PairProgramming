package views;

import java.util.Scanner;

public class UserInput {
	
//	LECTURA DE TECLADO
	
	public static String inPut()
	{
		Scanner sc = new Scanner(System.in);
		
		String input=sc.nextLine();
		
		return input;
	}
	
	public static double inPutDouble()
	{
		Scanner sc = new Scanner(System.in);
		
		double input=sc.nextDouble();
		
		return input;
	}

}
