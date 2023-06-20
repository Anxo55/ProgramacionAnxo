package Animales;

import java.io.Serializable;

public class Felino implements Serializable{
private String nombre;
private String especie;
private int edad;
private String colorPelaje;
protected static int numeroEjemplares;
private int id;

public Felino (String esp, int ed, String color){
especie = esp;
edad = ed;
colorPelaje = color;
numeroEjemplares++;
id = numeroEjemplares;
}

public Felino (){
this ("indeterminado",0,"indeterminado");
}

@Override
public String toString() {
    return "Felino [nombre=" + nombre + ", especie=" + especie + ", edad=" + edad + ", colorPelaje=" + colorPelaje
            + ", id=" + id + "]";
}



}
