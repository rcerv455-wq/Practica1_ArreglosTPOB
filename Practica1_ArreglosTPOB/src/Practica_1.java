package src;

import java.util.Scanner;

public class Practica_1 {
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] numeros = new int[15];
		int negativos = 0;
		int sumaImpares = 0;
		int contadorImpares = 0;

		System.out.println("Ingresa 15 numeros enteros:");


		for (int i = 0; i < 15; i++) {
		    System.out.print("Numero " + (i + 1) + ": ");
		    numeros[i] = scanner.nextInt();


		    if (numeros[i] < 0) {
		        negativos++;
		    }


		    if (numeros[i] % 2 != 0) {
		        sumaImpares += numeros[i];
		        contadorImpares++;
		    }
		}


		System.out.println("\nRaices cuadradas de los pares positivos:");
		for (int num : numeros) {
		    if (num > 0 && num % 2 == 0) {
		        System.out.printf("√%d = %.2f%n", num, Math.sqrt(num));
		    }
		}


		System.out.println("\nCantidad de numeros negativos: " + negativos);


		if (contadorImpares > 0) {
		    double promedioImpares = (double) sumaImpares / contadorImpares;
		    System.out.printf("Promedio de los numeros impares: %.2f%n", promedioImpares);
		} else {
		    System.out.println("No se ingresaron numeros impares.");
		}
	}

  
}

