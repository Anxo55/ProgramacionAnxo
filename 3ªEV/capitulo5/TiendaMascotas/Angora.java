package capitulo5.TiendaMascotas;

public class Angora extends GatosPeloLargo{

    public Angora(String nombre, int edad, String color, String raza, String tipoPelo, double alturaSalto,
            double longitudSalto) {
        super(nombre, edad, color, raza, tipoPelo, alturaSalto, longitudSalto);
        
    }

    @Override
    public String toString() {
        return super.toString() +  "Angora []";
    }

    
    
}
