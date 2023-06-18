package Ejercicio1B;

public class Cine {
    private String Nombre;
    private int capacidad;
    private int numPersonas;

    public Cine(String nombre, int capacidad, int numPersonas) {
        Nombre = nombre;
        capacidad = capacidad;
        numPersonas = numPersonas;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getNumPersonas() {
        return numPersonas;
    }

  public boolean HayHueco() {
        return (numPersonas != capacidad);
    }

    public boolean Haypersonas() {
        return (numPersonas != 0);
    }

    public void MetePersona() {
        System.out.println(this.toString());
        numPersonas++;
    }

    public void SacaPersonas() {
        System.out.println(this.toString());
        numPersonas--;
    }

    @Override
    public String toString() {
        return "Hotel [Nombre=" + Nombre + ", Capacidad=" + capacidad + ", numPersonas=" +numPersonas + "]";
    }


    
    
}
