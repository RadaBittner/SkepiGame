package Game;

/*@ created by Rada Bittner
* 2018
* This class defines an Array of Event objects that will be occuring randomly through the game.
*
*
*
*/

public class RandomEvents {
	
		
	private String[] event = {"SLeepy", "Hungry"};
	private String[] description = {"Hey, I'm sleepy", "Hey, I'm hungry"};
	private String[] opt1 = {"Send Skepi to bed", "Make a healthy home made meal"};
	private int[] health1 = {5, 5};
	private int[] mood1 = {0, 3};
	private int[] money1 = {0, -3};
	private String[] feedback1 = {"Good choice! zzzzz", "Look at this presentation! Good choice chef!"};
	private String[] opt2 = {"Let Skepi watch some YouTube","Make a healthy home made meal with organic ingridients" };
	private int[] health2 = {-5, 5};
	private int[] mood2 = {3, 3};
	private int[] money2 = {0, -7};
	private String[] feedback2 = {"Not a healthy choice! But Skepi seems to be happy", "Good cooking, but you overspent on"
			+ "your ingridients for no good reason"};
	private String[] opt3 = {"Put Skepi in bed and reah a bedtime story", "Get some fast food"};
	private int[] health3 = {5, 0};
	private int[] mood3 = {5, 5};
	private int[] money3 = {0, -3};
	private String[] feedback3 = {"That is so nice of you!", "It's beeter than going hungrry...but not the healthiest "
			+ "choice"};
	
	private int size = event.length;
	
	private Event[] random;
	
	/**
	 * Constructor method that creates and array of Event objects that pass arguments from the array of variables
	 * defined as class variables for this class.
	 */
	public RandomEvents(){
		Event[]random = new Event[size];
		for(int i = 0; i < size ; i++) {
			random[i] = new Event(event[i], description[i], opt1[i], health1[i], mood1[i], money1[i], feedback1[i],
					opt2[i], health2[i], mood2[i], money2[i], feedback2[i],
					opt3[i], health3[i], mood3[i], money3[i], feedback3[i]);
			System.out.println("*******Random Event " + i + " created");
		}
		System.out.println("****** Array of random events created");
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Event[] getRandom() {
		return random;
	}

	public void setRandom(Event[] random) {
		this.random = random;
	}

	
}
