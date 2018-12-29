package Game;



public class View {

	private Model model;
	
	//View object is created by passing Model object to it.
	public View(Model model) {
		this.model = model;
	}
	
	
	/**
	 * Method to display attributes of a Skepi object
	 */
	public void showStatus() {
		Skepi skepi = model.getSkepi();
		String name = skepi.getName();
		int age = skepi.getAge();
		int health = skepi.getHealth();
		int money = skepi.getMoney();
		int mood = skepi.getMood();
		
		System.out.println("**************************");
		System.out.println("Skepi: " + name);
		System.out.println("Age: " + age);
		System.out.println("Health: " + health);
		System.out.println("Mood: " + mood);
		System.out.println("Money: " + money);
		System.out.println("**************************");
		System.out.println("printed from view.display method");
	}
	
}
