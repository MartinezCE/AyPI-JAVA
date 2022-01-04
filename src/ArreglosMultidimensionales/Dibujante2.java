package ArreglosMultidimensionales;

public class Dibujante2 {

	/**
	 * pre : papel es un arreglo regular.
	 * post: dibuja sobre el papel un tablero
	 * en el que se intercalen posiciones con Color 'claro' y 'oscuro'.
	 */
	public void dibujarTablero(Color[][] papel,
			Color marco, Color claro, Color oscuro) {
		for(int i=0; i<papel.length;i++) {
			for(int j=0;j<papel[i].length;j++) {
				if(i==0 || j==0 || j== papel[i].length-1 ||i==papel.length-1) {
					papel[i][j]= marco;
				}else if(i+j %2 == 0){
					papel[i][j]= claro;
				}else {
					papel[i][j] = oscuro;
				}
			}
		}
	}


	public void dibujarConNumeros(int [][]array, int marco, int claro, int oscuro) {
		for(int i=0;i<array.length;i++) {
			for(int l=0;l<array[i].length;l++) {
				if(i ==0 || l== 0 || i==array.length-1|| l== array[i].length-1) {
					array[i][l]= marco;
				}else if((i+l)%2 == 0) {
					array[i][l]= claro;
				}else {
					array[i][l]=oscuro;
				}
			}
		}for(int i=0;i<array.length;i++) {
			for(int l=0; l<array[i].length;l++){
				System.out.print(array[i][l]);
			}System.out.println();
		}
	}

	public static void main (String [] args) {

		Dibujante2 test = new Dibujante2 ();
		int array [][] = new int [11] [11];

		test.dibujarConNumeros(array, 2, 7, 5);

	}
}
