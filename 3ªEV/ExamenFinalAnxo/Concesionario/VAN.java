public class VAN extends Truck{

    public double cilindrada;

    public VAN(int velocidad, double precioNormal, String color, int peso, double cilindrada) {
        super(velocidad, precioNormal, color, peso);
        this.cilindrada = cilindrada;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return super.toString() + "VAN [cilindrada=" + cilindrada + "]";
    }

    public double getPrecioVenta() {
        if(cilindrada<3000)
        return cilindrada + 3;
        else
        return cilindrada + 4;
    }
    
}
