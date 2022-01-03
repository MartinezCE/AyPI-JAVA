package Ordenamiento;

import java.util.Scanner;

public class Inserccion {

	public static void main(String [] arg) {
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


		
		//Metodo inserccion

		for(int i=0;i<elementos;i++) {

			int pos = i;
			aux = arreglo[i];
			
			while ((pos > 0) && (arreglo[pos-1] > aux)){
				arreglo[pos] = arreglo[pos-1];
				pos--;
			}
			arreglo[pos] = aux;
		}


		for (int i : arreglo){
			System.out.print(i + " - ");
		}


	}


}
