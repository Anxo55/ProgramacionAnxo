package capitulo5.ejemplo81;

public class testConsola {

    public static void main(String[] args) {
        ListaPersonas alumnos = new ListaPersonas();

        alumnos.añadirPersona(new Persona("blan", "quito", "1234", "rua de peru"));
        alumnos.listar();
        alumnos.añadirPersona(new Persona("Chupa", "mela", "4321", "Cebem 30493"));
        alumnos.listar();
        alumnos.añadirPersona(new Persona("Kara", "moco", "5678", "Casa de alejandro nº19"));
        alumnos.listar();

        alumnos.eliminarPersona(4);
        alumnos.listar();
        alumnos.eliminarPersona(1);
        alumnos.listar();

        alumnos.borrarLista();
        System.out.println("lista borrada");

    }
    
}
