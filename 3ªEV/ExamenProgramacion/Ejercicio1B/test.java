package Ejercicio1B;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        
        Cine uno = new Cine("Cine1",4, 0);
        Cine dos = new Cine("Cine2", 3, 0);
        Cine tres = new Cine("Cine3", 2, 0);
String Accion;
        Scanner sc = new Scanner(System.in);
        

        do{
            System.out.println("e meter persona cine // s sacar persona cine // Salir");
            Accion = sc.nextLine();

            if(Accion.equals("e")) {
                if(uno.HayHueco()) {
                    uno.MetePersona();;
                    uno.toString();
                    dos.toString();
                    tres.toString();
                }
                else if (dos.HayHueco()) {
                    dos.MetePersona();
                    uno.toString();
                    dos.toString();
                    tres.toString();
                }
                else if (tres.HayHueco()) {
                    tres.MetePersona();
                    uno.toString();
                    dos.toString();
                    tres.toString();
                }
                else
                    System.out.println("Todo completo, hay que esperar a que salga la gente");
                    uno.toString();
                    dos.toString();
                    tres.toString();
            }
            else{
                if(uno.Haypersonas()) {
                    uno.SacaPersonas();
                    uno.toString();
                    dos.toString();
                    tres.toString();
                }
                else if (dos.Haypersonas()) {
                    dos.SacaPersonas();
                    uno.toString();
                    dos.toString();
                    tres.toString();
                }
                else if (tres.Haypersonas()) {
                    tres.SacaPersonas();
                    uno.toString();
                    dos.toString();
                    tres.toString();
                }
                
                else {
                    System.out.println("Todo vacio, no hay gente en el cine");
                    uno.toString();
                    dos.toString();
                    tres.toString();
                }
            }
        }while(!Accion.equals("Salir"));

    }
    
}
