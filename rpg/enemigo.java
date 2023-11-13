package rpg;

public class enemigo {
    private String Nombre;
    private int Ataque;

    // constructor
    public enemigo(String nombre) {
        this.Nombre = nombre;
    }
    // getters

    public String getNombre() {
        return Nombre;
    }

    public int getAtaque() {
        return Ataque;
    }

    // setters
    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setAtaque(int ataque) {
        Ataque = ataque;
    }

    @Override
    public String toString() {
        return "enemigo [Nombre=" + Nombre + ", Ataque=" + Ataque + "]";
    }

}// class enemigo
