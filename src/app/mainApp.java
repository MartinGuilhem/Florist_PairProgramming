package app;

import java.util.List;

import controller.FloristController;
import model.Florist;
import model.Sample;

public class mainApp {

	public static void main(String[] args) {
		
		//Cargar muestra de floristerias desde Sample
		List<Florist> florists = Sample.getSample();
		
		//Cargar menu con las opciones de la aplicación
		FloristController.mainMenu(florists);
	
	}

}
