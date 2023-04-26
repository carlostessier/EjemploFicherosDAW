import java.io.Serializable;
import java.util.Objects;

public class Pokemon implements Serializable {
    private String nombre;
    private int nivel;

    public Pokemon(){
       this("",0);
    }

    public Pokemon(String nombre, int nivel){
        this.nombre = nombre;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pokemon pokemon = (Pokemon) o;

        if (nivel != pokemon.nivel) return false;
        return Objects.equals(nombre, pokemon.nombre);
    }

    @Override
    public int hashCode() {
        int result = nombre != null ? nombre.hashCode() : 0;
        result = 31 * result + nivel;
        return result;
    }
}
