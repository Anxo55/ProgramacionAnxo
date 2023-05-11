package capitulo5.ejemplo49;

import java.util.ArrayList;

import capitulo5.ejemplo49.Ortopedista.tipos;

public class test {
    
public static void main(String[] args) {
    ArrayList<Medico> listaMedicos = new ArrayList<Medico>();

    Medico med1 = new Medico("Pepe");
    Ortopedista ortopedista1 = new Ortopedista("Angel", Ortopedista.tipos.MAXILOFACIAL);
    Pediatra pediatra1 = new Pediatra("Toni", Pediatra.tipos.NEUROLOGO); 

    listaMedicos.add(med1);
    listaMedicos.add(ortopedista1);
    listaMedicos.add(pediatra1);

    for(int i=0; i<listaMedicos.size(); i++) {
        Medico a = (Medico) listaMedicos.get(i);
        if(a instanceof Ortopedista)  {
            System.err.println("El objeto en el indice "+i+ " es de la calse Ortopedista");
            continue;
        }
        if(a instanceof Pediatra) {
            System.out.println("El objeto en el inice "+i+ " es de la clase Pediatra");
            continue;
        }
        if(a instanceof  Medico) {
            System.out.println("El objeto en el inice "+i+ " es de la clase Medico");
            continue;
        }
    }
    System.out.println("con foreach");
    for(Medico medico : listaMedicos) {
        System.out.println(medico.toString());
    }

}

}
