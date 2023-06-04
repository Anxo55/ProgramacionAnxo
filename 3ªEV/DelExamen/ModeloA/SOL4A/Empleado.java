package SOL4A;

public abstract class Empleado {

	String dni;
	String nombre;
	String apellidos;
	int a�oIngreso;
	
	public Empleado() {
		
	}
	public Empleado(String dNI, String nombre, String apellidos, int a�oIngreso) {
		this.dni = dNI;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.a�oIngreso = a�oIngreso;
	}

	public abstract void imprimir();
	
	public abstract double obtenerSalario();
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getA�oIngreso() {
		return a�oIngreso;
	}
	public void setA�oIngreso(int a�oIngreso) {
		this.a�oIngreso = a�oIngreso;
	}
	
	
	


	
}
