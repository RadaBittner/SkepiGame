package Game;

import java.util.Scanner;

public class Controller {

	public static void main(String[] args) {
		
		//creating scanner to get user to input Skepi name
		Scanner in = new Scanner(System.in);
		System.out.println("Hello! How do you want to name your skepi?");
		String name = in.next();
		
		//instantiating Model object
		Model model = new Model(name);
				
		//instantiating View object
		View display = new View(model);
		
		//display current status of skepi
		display.showStatus();
		
		model.runRandomEvent();
	}

}
