import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Binario {

    public List<Pokemon> leerObjetosPokemons(String fichero){
        ArrayList<Pokemon> pokemons = new ArrayList<>();
        try(ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(fichero))){
            try{
                while(true){
                    pokemons.add((Pokemon) ois.readObject());
                }
            }
            catch (EOFException e){

            }

        } catch (FileNotFoundException e){
            System.err.println("No se ha encontrado el fichero "+fichero);
        }
        catch (IOException e){
            System.out.println("Error de E/S: "+e.getMessage());
        }
        catch (ClassNotFoundException e){
            System.out.println("Error de clase no encontrada: "+e.getMessage());
        }
        return pokemons;
    }

    public void guardarObjetosPokemons(List <Pokemon> pokemons, String fichero){

        try(ObjectOutputStream oos =
                    new ObjectOutputStream(new FileOutputStream(fichero))){

            for (Pokemon pokemon: pokemons){
                oos.writeObject(pokemon);
            }

        } catch (IOException e){
            System.err.println("Error de E/S: "+e.getMessage());
        }
    }

    public List<Pokemon> leerPokemons(String fichero){
        ArrayList<Pokemon> pokemons = new ArrayList<>();
        try(DataInputStream dis = new DataInputStream(
                new FileInputStream(fichero))){
            try{
                while(true){
                    String nombre = dis.readUTF();
                    int nivel = dis.readInt();
                    pokemons.add(new Pokemon(nombre, nivel));
                }
            }
            catch (EOFException e){

            }

        } catch (FileNotFoundException e){
            System.err.println("No se ha encontrado el fichero "+fichero);
        }
        catch (IOException e){
            System.out.println("Error de E/S: "+e.getMessage());
        }
        return pokemons;
    }

    public void guardarPokemons(List <Pokemon> pokemons, String fichero){

        try(DataOutputStream dos =
                new DataOutputStream(new FileOutputStream(fichero))){

            for (Pokemon pokemon: pokemons){
                dos.writeUTF(pokemon.getNombre());
                dos.writeInt(pokemon.getNivel());
            }

        } catch (IOException e){
            System.err.println("Error de E/S: "+e.getMessage());
        }
    }
    
    public List<Integer> leerNumeros(String fichero){
        ArrayList<Integer> numeros = new ArrayList<>();
        int numero;
        try(DataInputStream dis = new DataInputStream ( new FileInputStream(fichero))){
            while( (numero = dis.readInt())!=-1){
                numeros.add(numero);
            }
        } catch (FileNotFoundException e){
            System.err.println("No se ha encontrado el fichero "+fichero);

        }
        catch (IOException e){
            System.out.println("Error de E/S: "+e.getMessage());
        }

                
        return numeros;
    }

    public void escribirNumeros(List<Integer> numeros, String fichero){
        
        try(DataOutputStream dos = new DataOutputStream (new FileOutputStream(fichero))){
            for (Integer numero:numeros ){
                dos.writeInt(numero);
            }
        } catch (IOException e){
            System.out.println("Error de E/S: "+e.getMessage());
        }
    }
}
