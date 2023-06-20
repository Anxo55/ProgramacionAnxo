public class Ford extends Car{
    
    public int año;
    public int DescuentoFabricante;
   

    public Ford(int velocidad, double precioNormal, String color, int año, int descuentoFabricante) {
        super(velocidad, precioNormal, color);
        this.año = año;
        DescuentoFabricante = descuentoFabricante;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getDescuentoFabricante() {
        return DescuentoFabricante;
    }

    public void setDescuentoFabricante(int descuentoFabricante) {
        DescuentoFabricante = descuentoFabricante;
    }

    public double getPrecioVenta() {
        return precioNormal - DescuentoFabricante;
    }

    @Override
    public String toString() {
        return super.toString() + "Ford [año=" + año + ", DescuentoFabricante=" + DescuentoFabricante + "]";
    }

    
    
}
