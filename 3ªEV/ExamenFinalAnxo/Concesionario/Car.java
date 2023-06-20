public class Car {

    public int velocidad;
    public double precioNormal;
    public String color;


    
    public Car(int velocidad, double precioNormal, String color) {
        this.velocidad = velocidad;
        this.precioNormal = precioNormal;
        this.color = color;
    }

    public int getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    public double getPrecioNormal() {
        return precioNormal;
    }
    public void setPrecioNormal(double precioNormal) {
        this.precioNormal = precioNormal;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecioVenta() {
        return precioNormal;
    }

    @Override
    public String toString() {
        return "Car [velocidad=" + velocidad + ", precioNormal=" + precioNormal + ", color=" + color + "]";
    }

    
    
}
