package capitulo5.Vehiculos;

public class test {

    public static void main(String[] args) {

        Terrestre camioneta = new Terrestre(210, 300);
        System.out.println(camioneta.toString());
        
        camioneta.acelerar(50);
        System.out.println(camioneta.toString());
        
        Acuatico motoAcuatica = new Acuatico(50, 110);
        System.out.println(motoAcuatica.toString());
        System.out.println("Revoluciones del motor = "+
        motoAcuatica.calcularRevolucionesMotor(1200, 2));

        motoAcuatica.recomendarVelocidad(20);
        System.out.println(motoAcuatica.toString());        
    }
    
}
