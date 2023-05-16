package capitulo5.ejemplo68;

import java.io.File;

public class LeerDirectorio {

    public static void main(String[] args) {
        File directorio = new File("C:\\Users\\Primero DAM\\Desktop\\GitHUb\\ProgramacionAnxo\\3ªEV\\capitulo5\\ejemplo68");
        String[] archivos = directorio.list();
        for( int i=0; i<archivos.length; i++) {
            System.out.println("Archivo: "+ archivos[i]);
        }
    }
    
}
