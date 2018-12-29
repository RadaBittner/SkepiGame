package Game;

/*@ created by Rada Bittner
* 2018
* This class outlines variables and methods for the Event in the SkepiGame.
* Each Event has options for the player to choose from and each option has effect on health, mood and money
* variables of the Skepi object.
* 
*
*
*
*/

public class Event {
	
	private String event;
	private String description;
	private String opt1;
	private int health1;
	private int mood1;
	private int money1;
	private String feedback1;
	private String opt2;
	private int health2;
	private int mood2;
	private int money2;
	private String feedback2;
	private String opt3;
	private int health3;
	private int mood3;
	private int money3;
	private String feedback3;
	
	/**
	 * Constructor method to initialize an Event object
	 * @param event
	 * @param description
	 * @param opt1
	 * @param health1
	 * @param mood1
	 * @param money1
	 * @param feedback1
	 * @param opt2
	 * @param health2
	 * @param mood2
	 * @param money2
	 * @param feedback2
	 * @param opt3
	 * @param health3
	 * @param mood3
	 * @param money3
	 * @param feedback3
	 */
	
	public Event(String event, String description, String opt1, int health1, int mood1, int money1, String feedback1,
			String opt2, int health2, int mood2, int money2, String feedback2,
			String opt3, int health3, int mood3, int money3, String feedback3) {
		    this.event = event;
		    this.description = description;
		    this.opt1 = opt1;
		    this.health1 = health1;
		    this.mood1 = mood1;
		    this.money1 = money1;
		    this.feedback1 = feedback1;
		    this.opt2 = opt2;
		    this.health2 = health2;
		    this.mood2 = mood2;
		    this.money2 = money2;
		    this.feedback2 = feedback2;
		    this.opt3 = opt3;
		    this.health3 = health3;
		    this.mood3 = mood3;
		    this.money3 = money3;
		    this.feedback3 = feedback3;
		    
		    
	}
	

}
