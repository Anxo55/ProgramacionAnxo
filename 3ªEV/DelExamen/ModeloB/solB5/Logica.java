package solB5;

import java.util.Scanner;

public class Logica {
	
	public static Hotel peque�o, normal, grande;
	static boolean edge = true;

	public static void control() {
		int option = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido al sistema de gestion de hoteles");
		System.out.println("Selecciona 1 para reservar");
		System.out.println("Selecciona 2 para abandonar la habitacion");
		System.out.println("Selecciona 3 para salir");
		System.out.println("Que operacion deseas realizar?");
		option = sc.nextInt();

		switch (option) {
		case 1:
			if (peque�o.getNumPersonas() < peque�o.getCapacidad()) {
				peque�o.meter();
			} else if (normal.getNumPersonas() < normal.getCapacidad()) {
				normal.meter();
			} else {
				grande.meter();
			}
			break;
		case 2:
			if (peque�o.getNumPersonas() > 0) {
				peque�o.sacar();
			} else if (normal.getNumPersonas() > 0) {
				normal.sacar();
			} else {
				grande.sacar();
			}
			break;
		case 3:
			edge=false;
			System.out.println("Chao Pescao");
		default:
			System.out.println("Opcion no valida");
			break;
		}
	}
	
	public static void menu() {
		//create three warehouses
		peque�o = new Hotel(4);
		normal = new Hotel(6);
		grande = new Hotel(8);
		
		while(edge)
		control();
	}
}