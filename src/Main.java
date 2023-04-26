import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)  {
       ArrayList<Pokemon> pokemons = new ArrayList<>();
         pokemons.add(new Pokemon("Pikachu", 10));
         pokemons.add(new Pokemon("Charmander", 5));
         pokemons.add(new Pokemon("Bulbasaur", 7));
       Binario binario = new Binario();

       binario.guardarObjetosPokemons(pokemons, "pokemonsObjetos.dat");
       List<Pokemon> pokemonsLeidos;
       pokemonsLeidos = binario.leerObjetosPokemons("pokemonsObjetos.dat");
       for (Pokemon pokemon: pokemonsLeidos){
           System.out.println(pokemon);
       }
    }
}