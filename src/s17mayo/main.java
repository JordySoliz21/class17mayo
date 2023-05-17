package s17mayo;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		System.out.println("Ingrese aquí los datos del primer libro: ");
		System.out.print("Nombre: ");
		String nombre1 = tc.nextLine();
		System.out.print("Editorial: ");
		String editorial1 = tc.nextLine();
		System.out.print("Año: ");
		int año1 = tc.nextInt();
		tc.nextLine(); 
		System.out.print("Autor: ");
		String autor1 = tc.nextLine();
		
		libro libro1 = new libro(nombre1, editorial1, año1, autor1);
		
		System.out.println("Ingrese aquí los datos del segundo libro: ");
		System.out.print("Nombre: ");
		String nombre2 = tc.nextLine();
		System.out.print("Editorial: ");
		String editorial2 = tc.nextLine();
		System.out.print("Año: ");
		int año2 = tc.nextInt();
		tc.nextLine(); 
		System.out.print("Autor: ");
		String autor2 = tc.nextLine();
		
		libro libro2 = new libro(nombre2, editorial2, año2, autor2);
		System.out.println("Los libros que han sido registrados son: ");
		System.out.println("libro1: " + libro1.getNombre());
		System.out.println("libro2: " + libro2.getNombre());
		
	}

}
