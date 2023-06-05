package EJ3B;

public class ALibras extends Principal{
	
	private double dinero;

	public ALibras(double cantidad, int dolar, int libra) {
		super(cantidad, dolar, libra);
		// TODO Auto-generated constructor stub
	}

	public double calcularPrecio() {
		
		return dinero;
	}
	
	@Override
	public String toString() {
		return super.toString() + "ALibras [dinero=" + dinero + "]";
	}

	

}
