package Animales;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Leopardo extends Felino implements Serializable{

    private boolean pelajeManchado;
    private String habitat;

    public Leopardo(String esp, int ed, String color, boolean pelajeManchado, String habitat) {
        super(esp, ed, color);
        this.pelajeManchado = pelajeManchado;
        this.habitat = habitat;
    }

    public Leopardo(boolean pelajeManchado, String habitat) {
        this.pelajeManchado = pelajeManchado;
        this.habitat = habitat;
    }

    public boolean isPelajeManchado() {
        return pelajeManchado;
    }

    public void setPelajeManchado(boolean pelajeManchado) {
        this.pelajeManchado = pelajeManchado;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

     void imprimir(){
        System.out.println("Codigo de la asignatura = "+habitat);
        System.out.println("Nombre de la asignatura = "+pelajeManchado);
        
    }

      public void guardar(){
        try {
            FileOutputStream archivo= new FileOutputStream("Leopardo.dat");
            ObjectOutputStream salida= new ObjectOutputStream(archivo);
            salida.writeObject(this);
            salida.close();
        } catch (IOException e) {
           System.out.println("No se pudo escribir en el archivo");
        }
    }

    void leerAsignatura() {
        try{
            FileInputStream archivo = new FileInputStream("Leopardo.dat");
            ObjectInputStream entrada = new ObjectInputStream(archivo);
            Leopardo leopardo = (Leopardo) entrada.readObject();
            leopardo.imprimir();
            entrada.close();
        }catch (FileNotFoundException e) {
            System.out.println("No se pudo leer el archivo");
        }catch (IOException e) {
            System.out.println("Error de entrada/salida");
        }catch (Exception e) {
            System.out.println("Error al leer al archivo");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Leopardo [pelajeManchado=" + pelajeManchado + ", habitat=" + habitat + "]";
    }

    


    
}
