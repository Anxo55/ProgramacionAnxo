package capitulo5.Vehiculos;

public class Acuatico extends Vehiculo implements Motor, Vela{

    public Acuatico(int velocidadActual, int velocidadMaxima) {
        super(velocidadActual, velocidadMaxima);        
    }

    @Override
    public void acelerar(int incremento) {
        int vel = velocidadActual + incremento;
        if( vel > velocidadMaxima) {
            System.out.println("Super la velocidad maxima permitida");
        }else{
            velocidadActual=vel;
        }
    }

    @Override
    public void frenar(int incremento) {
        int vel = velocidadActual - incremento;
        if( vel < 0) {
            System.out.println("La velocidad no puede ser negativa");
        }else{
            velocidadActual=vel;
        }
    }

    public int calcularRevolucionesMotor(int fuerza, int radio) {
        return (fuerza * radio);
    }
    
    public void recomendarVelocidad(int velocidadViento) {
        if(velocidadViento > 80 || velocidadViento < 10) {
            velocidadActual = 0;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }

    
}
