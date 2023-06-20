 import java.util.ArrayList;

 import java.util.ArrayList;

 public class TestConcesionario2 {

     public static void main(String[] args) {
        
 SUV vehiculo1 = new SUV(200, 2400, "Negro", 210);
 SUV vehiculo2 = new SUV(180, 3000, "Naranja", 180);
 VAN vehiculo3 = new VAN(240, 2200, "Verde", 200, 3260);
 VAN vehiculo4 = new VAN(150, 1500, "Rosa", 500, 2800);

   ArrayList<Car> Car = new ArrayList<Car>();

   Car.add(vehiculo1);
   Car.add(vehiculo2);
   Car.add(vehiculo3);
   Car.add(vehiculo4);

   double total=0;


   for (Car c : Car) {
             total+=c.getPrecioVenta();
             System.out.println(c);
             System.out.println("Precio Venta: " + c.getPrecioVenta());
         }
         System.out.println("Total: "+total);
     
     
    // for (Multable m : multable) {
    //         System.out.println(m);
    //         System.out.println("DIsminuir multa: " + m.disminuirMulta(50));
    //         System.out.println("Aumentar multa: " + m.aumentarMulta(200));

    //     }

    
    }
 }    

