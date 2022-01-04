package ArreglosMultidimensionales;

public class Dibujante {


	//• post: pinta todas las líneas del arreglo
	//(regular o irregular) 'superficie con dos
	//Colores según sea la mitad izquierda (colorMitadIzquierda) o
	//derecha (colorMitadDerecha). .

	public void pintarLineasEnMitades (Color [][] superficie,
			Color colorMitadIzquierda, Color colorMitadDerecha){

		for(int i=0; i<superficie.length;i++) {
			for(int l=0;l<superficie[i].length;l++) {

				if(l<superficie[i].length/2) {
					superficie[i][l] = colorMitadIzquierda;
				}
				else {
					superficie[i][l]= colorMitadDerecha;
				}
			}
		}

	}



	public void pintarConNumeros(int [][] array,
			int mitadIzquierda,int mitadDerecha) {

		for(int i=0; i<array.length;i++) {
			for(int l=0; l<array[i].length;l++) {
				if(l<array[i].length/2) {
					array[i][l]= mitadIzquierda;
				}else {
					array[i][l]= mitadDerecha;
				}
			}
		} imprimirArray(array);
	}

	private void imprimirArray (int [][] array) {
		for(int i=0; i<array.length;i++) {
			for(int l=0;l<array[i].length;l++) {
				System.out.print(array[i][l]+ " ");
			}
			System.out.println("");
		}
	}

	public static void main (String [] args) {
		Dibujante test = new Dibujante ();
		int array1 [][] = new int [6][];
		array1[0]=new int [14];
		array1[1]= new int [10];
		array1[2]= new int [4];
		array1[3]= new int [10];
		array1[4]= new int [14];
		array1[5]= new int [13];
		test.pintarConNumeros(array1, 0, 4);
		int array2 [][] = new int [6][6];
		test.pintarConNumeros(array2, 3, 9);

	}
}
