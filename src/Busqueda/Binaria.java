package Busqueda;

public class Binaria {

	int array [];

	public Binaria() {
		int array []= new int [17];
		array[0]= 12;
		array[1]= 14;
		array[2]= 23;
		array[3]= 25;
		array[4]= 26;
		array[5]= 34;
		array[6]=36;
		array[7]=37;
		array[8]=39;
		array[9]=44;
		array[10]=47;
		array[11]=54;
		array[12]=58;
		array[13]=60;
		array[14]=79;
		array[15]=95;
		array[16]=99;
	}

	public void busquedaBinaria(int buscado) {

		int inicio = 0; // extremo izquierdo
		int fin = array.length - 1; // extremo derecho
		int medio = (inicio + fin) / 2;
		boolean bandera = false;
		int aux=0;

		while (inicio <= fin) {

			medio = (inicio + fin) / 2;

			if (buscado == array[medio]) {
				aux=medio;
				bandera = true;

			}
			if (buscado < array[medio]) {
				fin = medio - 1;
			} else {
				inicio = medio + 1;
			}
		}
		if(bandera == true) {
			System.out.println("Numero encontrado en la posicion: "+ aux);
		}else {
			System.out.println("El numero no esta en el arreglo");}

	}

	public static void main (String [] arg) {
		Binaria test = new Binaria();
		test.busquedaBinaria(24);

	}

}
