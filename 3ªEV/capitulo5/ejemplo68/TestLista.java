package capitulo5.ejemplo68;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class TestLista {
    @SuppressWarnings({"unchecked"})
    public static void main(String[] args) {
        ArrayList <Asignatura> arrayEscribir = new ArrayList<Asignatura>();
        ArrayList <Asignatura> arrayLeer;
        
        System.out.println("Asignaturas que vamos a escribir en el fichero: ");
        for(int i=0; i<5; i++) {
            Asignatura nuevoObjeto = new Asignatura(i, "Cadena"+  i,5*i);
            arrayEscribir.add(nuevoObjeto);
            System.out.println("arrayList[" + i +"] = " + arrayEscribir.get(i).toString());
        }
        
        try{
            System.out.println("Guardando ArrayList en el fichero objetos.dat..");

            //escritura
            ObjectOutputStream escribiendoFichero = new ObjectOutputStream(
                new FileOutputStream("objetos.dat") );
                //escribe todo el arrayList!!!!!
                escribiendoFichero.writeObject(arrayEscribir);
                escribiendoFichero.close();

                System.out.println("GUARDANDO ok!");

                //lectura
                System.out.println("Leyendo ArrayList del fichero objetos.dat..");

                ObjectInputStream leyendoFichero = new ObjectInputStream(
                    new FileInputStream("objetos.dat"));
                    arrayLeer = (ArrayList <Asignatura> ) leyendoFichero.readObject();
                    leyendoFichero.close();
                    System.out.println("LEIDO ok");

                    System.out.println("Datos leidos del fichero: ");

                    for(int i=0; i<arrayLeer.size(); i++) {
                        System.out.println("arrayLeer[" + i + "] = "
                        + arrayLeer.get(i).toString());
                    }
                
            
        }catch (Exception e) {
            
        }
    }
    
}
