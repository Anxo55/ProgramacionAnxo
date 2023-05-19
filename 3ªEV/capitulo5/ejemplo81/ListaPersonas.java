package capitulo5.ejemplo81;

import java.util.ArrayList;

public class ListaPersonas {
    ArrayList<Persona> listaPersonas;
    public ListaPersonas(){
    listaPersonas = new ArrayList<>();
    }
    public void añadirPersona(Persona p) {
    listaPersonas.add(p);
    }
    public void eliminarPersona(int i) {
    if (i<listaPersonas.size()) listaPersonas.remove(i);
    }
    public void borrarLista() {
    listaPersonas.removeAll(listaPersonas);
    }
    public void listar() {
    for (int i = 0; i <listaPersonas.size(); i++) {
    System.out.println(listaPersonas.get(i).toString());
    }
    }
    
    
    }