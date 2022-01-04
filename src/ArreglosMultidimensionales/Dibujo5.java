package ArreglosMultidimensionales;

public class Dibujo5 {

	public void dibujarDiagonales (int [][] array, 
			int marco,int diagonales, int relleno) {

		for(int i=0;i<array.length;i++) {

			for(int l=0;l<array[i].length;l++) {

				if(i==0 || l==0 || i == array.length-1 || l==array[i].length-1) {
					array[i][l]=marco;
				} else if(i==l || i+l == array.length-1) {
					array[i][l]= diagonales;
				}
				else {
					array[i][l]= relleno;
				}

			}
		}for(int j=0;j<array.length;j++) {
			for(int k=0; k<array[j].length;k++){
				System.out.print(array[j][k]);
			}System.out.println();

		}

	}
	public static void main (String [] arg) {


		Dibujo5 test = new Dibujo5();
		int array [][] = new int [10] [10];
		test.dibujarDiagonales(array, 2, 1, 0);

	}

}
