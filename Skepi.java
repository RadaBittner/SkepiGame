package Game;

/*@ created by Rada Bittner
* 2018
* This class outlines variables and methods for the Skepi virtual creature in the SkepiGame.
* 
*
*
*
*/

public class Skepi {

	private int id;
	private String name;
	private int age;
	private int health;
	private int mood;
	private int money;
	private boolean alive;
	private int counter = 1;
	
	
	/**
	 * Constructor method to initialize a Skepi object.
	 * User provides name.
	 * All other variables are set with values listed below.
	 * @param name
	 */
	public Skepi(String name) {
		this.id = counter;
		this.name = name;
		this.age = 0;
		this.health = 50;
		this.mood = 50;
		this.money = 100;
		this.alive = true;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getHealth() {
		return health;
	}


	public void setHealth(int health) {
		this.health = health;
	}


	public int getMood() {
		return mood;
	}


	public void setMood(int mood) {
		this.mood = mood;
	}


	public int getMoney() {
		return money;
	}


	public void setMoney(int money) {
		this.money = money;
	}
	
	
}
