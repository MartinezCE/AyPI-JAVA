package ArreglosMultidimensionales;

public class Dibujante3 {

	/**
	 * pre : papel es un arreglo regular de dimensiones mayor a 5x5.
	 * post: dibuja sobre el papel una vía
	 * utilizando los colores indicados para los rieles y los durmientes.
	 */
	public void dibujarVia(Color[][] papel,
			Color colorRieles, Color colorDurmientes) {

	}

	public void dibujarConNumeros (int [][] array, int colorRiel, int colorDurmiente) {

		for(int i=0; i<array.length;i++) {
			for(int j=0; j<array[i].length;j++) {
				if(   (j==1 && i!=0 && i != array.length-1) || (j == array[i].length-2 && i !=0 && i!= array.length-1)){
					array[i][j]= colorDurmiente;
				} else if(i>0 && j>1 && j<array[i].length-1 && i<array.length-1 && i%2==0){
					array[i][j]= colorRiel;
				}
			}
		}imprimirArray(array);
	}
	private void imprimirArray(int [][] array) {
		for(int i=0; i<array.length;i++) {
			for(int j=0; j<array[i].length;j++) {
				System.out.print(array[i][j]+" ");
			}System.out.println(" ");
		}
	}

	public static void main (String [] args) {
		Dibujante3 test = new Dibujante3();
		int [][] array = new int [13][6];
		test.dibujarConNumeros(array, 2, 8);
	}
}
