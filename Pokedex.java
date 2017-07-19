package pokemon;

public class Pokedex extends PokemonAbstract{

	@Override
	public String pokemonInfo(Pokemon pokemon) {
		return "The name of the Pokemon : " + pokemon.name +
				" the type : " + pokemon.type + " its health : " + pokemon.health;
	}
	
	
	public static void main(String[] args){
		Pokedex pok = new Pokedex();
		Pokemon pokm = pok.createPokemon("hutt", "Bulbasaur", 100);
		System.out.println(pok.pokemonInfo(pokm));
		pok.attackPokemon(pokm);
		System.out.println(pok.pokemonInfo(pokm));
		
	}

}
