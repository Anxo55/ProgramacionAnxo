package Animales;

import java.util.ArrayList;

public class test {

    public static void main(String[] args) {
        
    ArrayList<Felino> felino = new ArrayList<>();

    Felino habil = new Felino("Peligrosa", 10, "Marron");
    Felino macho = new Felino("poco comun", 7, "Anaranjado");
    Felino hembra = new Felino("Peligrosa", 6, "Beis");

    felino.add(habil);
    felino.add(macho);
    felino.add(hembra);

    for(Felino f : felino) {
        System.out.println(f);

    }

        //Intente crear el archivo dat pero no fui capaz por alguna clase o metodo que me faltaba.

    }
    
}
