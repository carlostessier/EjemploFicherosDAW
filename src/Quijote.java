import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Quijote {

    int contarPalabras(String fichero){
        int numeroPalabras = 0;
        String linea;

        try( BufferedReader bf = new BufferedReader(new FileReader(fichero))) {
            while( (linea = bf.readLine()) != null){
                String [] palabras = linea.split(" ");
                for (String palabra: palabras){

                    if(palabra!=null && !palabra.equals("")) {
                        numeroPalabras++;
                        System.out.println(palabra);
                    }
                }

            }
        }
        catch (FileNotFoundException e){
            System.err.println("No se ha encontrado el fichero "+fichero);
        }
        catch (IOException e){
            System.out.println("Error de E/S: "+e.getMessage());
        }
        return numeroPalabras;
    }

    int contarLineas(String fichero){
        int numeroLineas = 0;
        String linea;

        try( BufferedReader bf = new BufferedReader(new FileReader(fichero))) {

           while( (linea = bf.readLine()) != null){
               numeroLineas++;
           }
        }
        catch (FileNotFoundException e){
                System.err.println("No se ha encontrado el fichero "+fichero);
            }
        catch (IOException e){
                System.out.println("Error de E/S: "+e.getMessage());
            }
        return numeroLineas;
    }

    int contarCaracteres(String fichero){
        int numeroLetras = 0;
        int letra;

        try(FileReader fr = new FileReader(fichero)){
            while  ( (letra = fr.read())!=-1){
                numeroLetras++;
            }

        }
        catch (FileNotFoundException e){
            System.err.println("No se ha encontrado el fichero "+fichero);
        }
        catch (IOException e){
            System.out.println("Error de E/S: "+e.getMessage());
        }

        return numeroLetras;


    }

    int contarLetrasMinusculas(String fichero){
        int numeroLetras = 0;
        int letra;

        try(FileReader fr = new FileReader(fichero)){
          while  ( (letra = fr.read())!=-1){
              if( (letra >= 'a' && letra <='z') || letra =='ñ' ){
                  numeroLetras++;
              }
            }

        }
        catch (FileNotFoundException e){
            System.err.println("No se ha encontrado el fichero "+fichero);
        }
        catch (IOException e){
            System.out.println("Error de E/S: "+e.getMessage());
        }

        return numeroLetras;


    }
}
