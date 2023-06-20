public class Truck extends Car{    

     public int peso;

    public Truck(int velocidad, double precioNormal, String color, int peso) {
        super(velocidad, precioNormal, color);
        this.peso = peso;
    }

    public double getPrecioVenta() {
        if(peso>2000) 
        return precioNormal * 0.10;
        else
        return precioNormal * 0.20;
        
        
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return super.toString() + "Truck [peso=" + peso + "]";
    }
    
}
