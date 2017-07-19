package pokemon;

/**
 * 
 * @author Bisrat W Tadesse
 *
 */
public class Pokemon {
	String name, type;
	int health;
	static int count_pokemon = 0;
	
	public Pokemon(String name, String type, int health) {
		this.name = name;
		this.type = type;
		this.health = health;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public static int getCount_pokemon() {
		return count_pokemon;
	}

	public static void setCount_pokemon(int count_pokemon) {
		Pokemon.count_pokemon = count_pokemon;
	}
	
	
	
}
