package pokemon;

public abstract class PokemonAbstract implements PokemonInterface{
	public Pokemon createPokemon(String name, String type, int health){
		return new Pokemon(name, type, health);
	}
	
	public void attackPokemon(Pokemon pokemon){
		pokemon.health -= 10;
	}
}
