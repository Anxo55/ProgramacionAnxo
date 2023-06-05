package EJ3B;

public class AEuros extends Principal{
	
	private double dinero;

	public AEuros(double cantidad, int dolar, int libra) {
		super(cantidad, dolar, libra);
		// TODO Auto-generated constructor stub
	}
	
	public double calcularPrecio() {
		
		return dinero;
	}

	@Override
	public String toString() {
		return super.toString() + "AEuros [dinero=" + dinero + "]";
	}
	
	

}
