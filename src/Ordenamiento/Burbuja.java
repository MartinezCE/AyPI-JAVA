package Ordenamiento;

import java.util.Scanner;


public class Burbuja {

	public static void main (String [] args) {

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner (System.in);

		int arreglo[];
		int elementos, aux;

		System.out.println("Digite el tamanio del array");
		


		elementos = entrada.nextInt();
		arreglo = new int [elementos];


		for(int i=0; i<elementos;i++) {
			System.out.println((i+1)+ " Digite un numero:" );
			arreglo[i] = entrada.nextInt();
		}

		
		//Metodo burbuja

		for(int i=0;i<(elementos-1);i++) { // este for sirve para saber
			//cuantas vueltas dar
			System.out.println("Vuelta numero: "+i);
			for(int j =0;j< elementos-1;j++) { // este sirve para ir cambiando
				System.out.println("Vuelta de cambio: "+j);
				if(arreglo[j]>arreglo[j+1])  {
					aux = arreglo[j];
					arreglo[j]=arreglo[j+1];
					arreglo[j+1] = aux;
				}
			}
		}

	

		System.out.print("\nArreglo Ordenado de forma creciente: \n");
		for(int k= 0; k<elementos;k++) {
			System.out.print(arreglo[k]+" - ");
		}
		
		
	}

}
