package tema2_debug;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numAlumnos = leerNumAlumnos(sc);
		double suma = sumarNotas(sc, numAlumnos);
		double media = calcularMedia(suma, numAlumnos);
		mostrarMedia(media);
		
		sc.close();
	}

	public static int leerNumAlumnos(Scanner sc) {
        int numAlumnos;
        
	        do {
	        	System.out.print("Introduce el número de alumnos: ");
	     	    numAlumnos = sc.nextInt();
	     	    
	        	if (numAlumnos <= 0) {
					System.out.println("Error: El numero introducido es menor o igual que 0");
	        	}
				} while (numAlumnos <= 0);
				return numAlumnos;
	}

	public static double sumarNotas(Scanner sc, int numAlumnos) {
		
		int contador = 1;
		double suma = 0;

		
		while (contador <= numAlumnos); {
			System.out.print("Introduce la nota del alumno " + contador + ": ");
			double nota = sc.nextDouble();

			if (nota < 0 || nota > 10) {
				System.out.println("Error: la nota debe estar entre 0 y 10");
			} else {
				suma = suma + nota;
				contador++;
			}
		}
		return suma;
	}
	public static double calcularMedia (double suma, int numAlumnos) {
	
		return suma / numAlumnos;
	
	}
	public static void mostrarMedia (double media) {
	System.out.printf("La media del grupo es: %.1f",media);
	}
}