package ArreglosMultidimensionales;

public class Dibujante4 {

	public void dibujarCruz (int [][] array,
			int marco, int claro, int oscuro) {

		for(int i=0; i<array.length;i++) {
			for(int l=0;l<array[i].length;l++) {
				if(i==0 || l==0 || i==array.length-1 || l==array[i].length-1 ) {
					array[i][l]=marco;
				}else if(l==array[i].length/2 || i == array.length/2) {
					array[i][l]= oscuro;
				}else {
					array[i][l]= claro;
				}
			}
		}for(int j=0; j<array.length;j++) {
			for(int k=0;k<array[j].length;k++) {
				System.out.print(array[j][k]);
			}System.out.println();
		}
	}

	public static void main (String [] arg) {
		Dibujante4 test = new Dibujante4();
		int [][] array = new int [5][5];
		test.dibujarCruz(array, 2, 0, 7);
	}

}
