public class SUV extends Car{

    public double potencia;

    public SUV(int velocidad, double precioNormal, String color, double potencia) {
        super(velocidad, precioNormal, color);
        this.potencia = potencia;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getPrecioVenta() {
        if(potencia > 200)
        return potencia + 5;
        else 
        return potencia + 3;


    }

    @Override
    public String toString() {
        return super.toString() + "SUV [potencia=" + potencia + "]";
    }

    

    
    
}
