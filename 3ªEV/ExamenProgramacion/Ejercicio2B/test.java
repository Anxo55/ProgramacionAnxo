package Ejercicio2B;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class test {

    public static void main(String[] args) {
        FileWriter archivo = null;
        PrintWriter impresor = null;
        ArrayList<Jugador> jugadores = new ArrayList<Jugador>();

        Portero uno = new Portero("Pepe", "Portero", 5, 10, 4, 2, 20, 8);
        Portero dos = new Portero("Angel", "Portero", 4, 6, 7, 5, 18, 6);
        Portero tres = new Portero("Antonio", "Portero", 3, 8, 9, 7, 16, 4);

        Jugador cuatro = new Jugador("Miguel", "Delantero Centro", 10, 5, 2, 1);
        Jugador cinco = new Jugador("Alejandro", "Lateral Derecho", 6, 3, 5, 5);

        jugadores.add(uno);
        jugadores.add(dos);
        jugadores.add(tres);
        jugadores.add(cuatro);
        jugadores.add(cinco);

         try {
             archivo = new FileWriter("porteros.dat");
             impresor = new PrintWriter(archivo);
             for (Jugador jugador : jugadores) {
                 if (jugador instanceof Portero)
                     jugador.imprimir();
                 impresor.println(jugador.toString());
             }
         } catch (Exception e) {
             e.printStackTrace();
         } finally {
             try {
                 if (archivo != null) {
                     archivo.close();
                 }

             } catch (Exception e2) {
                 e2.printStackTrace();
             }
         }

    }
    }

    

