public class Sedan extends Car{

    public int longitud;

    public Sedan(int velocidad, double precioNormal, String color, int longitud) {
        super(velocidad, precioNormal, color);
        this.longitud = longitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public double getPrecioVenta() {
        if(longitud >5)
        return precioNormal * 0.05;
        else
        return precioNormal * 0.10;

    }

    @Override
    public String toString() {
        return super.toString() + "Sedan [longitud=" + longitud + "]";
    }

    
    
}
