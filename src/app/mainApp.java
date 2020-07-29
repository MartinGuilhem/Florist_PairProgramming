package app;

import java.util.List;

import controller.FloristController;
import model.Florist;
import model.Sample;

public class mainApp {

	public static void main(String[] args) {
		
		//cargar muestra de floristerias desde Sample
		List<Florist> florists = Sample.getSample();
		
		//cargar menu con las opciones de la aplicación
		FloristController.mainMenu(florists);
	
	}

}
