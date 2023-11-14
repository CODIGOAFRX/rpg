package rpg;

public class Jugador {
    private String Nombre;
    private int Salud, Ataque, Dinero;

    // constructor

    public Jugador(String nombre, int salud, int ataque, int dinero) {
        this.Nombre = nombre;
        this.Salud = salud;
        this.Ataque = ataque;
        this.Dinero = dinero;
    }

    // getters

    public String getNombre() {
        return Nombre;
    }

    public int getSalud() {
        return Salud;
    }

    public int getAtaque() {
        return Ataque;
    }

    public int getDinero() {
        return Dinero;
    }

    // setters
    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setSalud(int salud) {
        Salud = salud;
    }

    public void setAtaque(int ataque) {
        Ataque = ataque;
    }

    public void setDinero(int dinero) {
        Dinero = dinero;
    }

    @Override
    public String toString() {
        String mensaje = "Nombre : " + Nombre + "\n" + "Salud :  " + Salud + "\n" + "Ataque : " + Ataque + "\n"
                + "Dinero :  "
                + Dinero;
        return mensaje;
    }
}// cierre clase