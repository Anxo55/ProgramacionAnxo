import java.util.ArrayList;

public class TestConcesionario {

    public static void main(String[] args) {

    Sedan sedan = new Sedan(120, 1200, "Azul", 200);
    Ford ford = new Ford(240, 1500, "Rojo", 2000, 10);
    Ford ford2 = new Ford(200, 1800, "Amarillo", 2004, 20);
    Car car = new Car(150, 1400, "Morado");
    
    ArrayList<Car> Car = new ArrayList<Car>();
    Car.add(sedan);
    Car.add(ford);
    Car.add(ford2);
    Car.add(car);
    double total=0;


  for (Car c : Car) {
            total+=c.getPrecioVenta();
            System.out.println(c);
            System.out.println("Precio Venta: " + c.getPrecioVenta());
        }
        System.out.println("Total: "+total);
    }
}