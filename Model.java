package Game;

/*@ created by Rada Bittner
* 2018
* This class defines the Model object for Skepi game.
* It contains methods for instantiating a Skepi object, arrays of random and timed events, and controls the logic of the game.
*
*
*
*/
public class Model {

	private Skepi skepi;
	private RandomEvents random;
	
	/**
	 * Constructor method instantiates Model object
	 * Calls method for instantiating a Skepi object
	 * Instantiates RandomEvents object
	 * @param name
	 */
	public Model(String name) {
		this.createSkepi(name);
		this.random = new RandomEvents();
		
	}
	
	/**
	 * This method creates a skepi object with the name provided by the user
	 * @param name
	 */
	public void createSkepi(String name) {
		skepi = new Skepi(name);
		System.out.println("Im a new skepi, my name is " + name);
		System.out.println("printing from Model constructor method");
	}


	public Skepi getSkepi() {
		return skepi;
	}
	
	public void runRandomEvent() {
		int number = (int)(Math.random() * random.getSize());
		displayEvent(number);
	}
	
	/**
	 * Method to diplay Event Object with event name, description and choices.
	 * @param number indicates the index of the event in the RandomEvent.Events[] array
	 */
	private void displayEvent(int number) {
		random.getRandom();
		System.out.ptintln(random.Event[number].event);
		
	}
	
	
}
