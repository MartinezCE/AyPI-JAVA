package Busqueda;

public class BinariaParaExamen {



	public int busqueda (int[] a, int buscado){
		int contador = 0;

		int ini = 0, fin = a.length - 1, medio; 

		while (ini <= fin) {
			contador++;
			medio = (ini+fin)/2;
			if (a[medio] <buscado) { 
				ini = medio+ 1;
				}
			else if (a[medio] >buscado) { 
				fin =medio- 1;
			}
			else {return medio;}
		}
		return -1;}


	public static void main (String []arg) {
		BinariaParaExamen test = new BinariaParaExamen();
		int array []= new int [15];
		array[0]= 5;
		array[1]= 8;
		array[2]= 11;
		array[3]= 12;
		array[4]= 34;
		array[5]= 45;
		array[6]= 56;
		array[7]= 57;
		array[8]= 58;
		array[9]= 60;
		array[10]=70;
		array[11]=78;
		array[12]=98;
		array[13]=103;
		array[14]=145;
		
		System.out.println( test.busqueda(array, 98));

	}

}
