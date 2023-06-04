package capitulo5.ejemplo1;

public class Periodico extends Publicacion{

    //atributos
    public String Nombre;
    public String Fecha;

    public Periodico() {

    }

    public Periodico(int ndp, float p, String nombre, String fecha) {
        super(ndp, p);
        Nombre=nombre;
        Fecha = fecha;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    @Override
    public String toString() {
        return super.toString() + "Periodico [Nombre=" + Nombre + ", Fecha=" + Fecha + "]";
    }

    
    
}
