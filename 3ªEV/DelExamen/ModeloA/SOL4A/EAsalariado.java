package SOL4A;

import java.time.Year;

public class EAsalariado extends Empleado{
	
	double salariofijobase;
	
	
	public EAsalariado(){
		super();
	}
	
	public EAsalariado(String dNI, String nombre, String apellidos, int a�oIngreso,double sal) {
		super(dNI, nombre, apellidos, a�oIngreso);
		this.salariofijobase = sal;
	}
	
	

	public double getSalariofijobase() {
		return salariofijobase;
	}

	public void setSalariofijobase(double salariofijobase) {
		this.salariofijobase = salariofijobase;
	}

	@Override
	public void imprimir() {
		System.out.println("DNI: " + dni);
		System.out.println("nombre: " + nombre);
		System.out.println("apellidos: " + apellidos);
		System.out.println("a�oIngreso: " + a�oIngreso);
		System.out.println("SalarioBase: " + salariofijobase);
		
	}

	@Override
	public double obtenerSalario() {
		double salariofinal = 0;
		int a�ostrabajados =  2022 - this.a�oIngreso ;
		
		if(a�ostrabajados <= 3) {
			salariofinal = this.salariofijobase*1.05;		
		}else if(a�ostrabajados > 3 && a�ostrabajados <= 7){
			salariofinal = this.salariofijobase*1.1;	
		}else if(a�ostrabajados > 7 && a�ostrabajados <= 15){
			salariofinal = this.salariofijobase*1.15;
		}else if (a�ostrabajados > 15) {
			salariofinal = this.salariofijobase*1.2;
		}
		return salariofinal;
	}

	

}
