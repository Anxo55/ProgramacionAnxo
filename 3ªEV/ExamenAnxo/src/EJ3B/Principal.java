package EJ3B;

public class Principal {

	private double cantidad;
	private int dolar;
	private int libra;
	
	public Principal(double cantidad, int dolar, int libra) {
		super();
		this.cantidad = cantidad;
		this.dolar = dolar;
		this.libra = libra;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public int getDolar() {
		return dolar;
	}

	public void setDolar(int dolar) {
		this.dolar = dolar;
	}

	public int getLibra() {
		return libra;
	}

	public void setLibra(int libra) {
		this.libra = libra;
	}

	@Override
	public String toString() {
		return "Principal [cantidad=" + cantidad + ", dolar=" + dolar + ", libra=" + libra + "]";
	}
	
	
	
	
	
}
