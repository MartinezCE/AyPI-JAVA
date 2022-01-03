package ArreglosMultidimensionales;

public class ReemplazarCeros {
	
	public void reemplazarConCeros(int[][] matriz) {
		for(int i=0;i<matriz.length;i++) {
			for(int l=0;l<matriz[i].length;l++) {
				if(matriz[i][l]== 0 && (l>0 && l<matriz.length-1) ) {
				int	sumar = matriz[i][l-1] + matriz[i][l+1];
				matriz[i][l] = sumar/2;
				}
			}
		} for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz.length;j++) {
				System.out.print(matriz[i][j]);
			}System.out.println();
		}
	}
	
	public static void main (String [] args) {
		ReemplazarCeros test = new ReemplazarCeros();
		int array2 [][] = new int [4][4];
		array2[0][0]=1;
		array2[0][1]=0;
		array2[0][2]=1;
		array2[0][3]=2;
		array2[1][0]=2;
		array2[1][1]=0;
		array2[1][2]=2;
		array2[1][3]=2;
		array2[2][0]=1;
		array2[2][1]=0;
		array2[2][2]=1;
		array2[2][3]=2;
		array2[3][0]=2;
		array2[3][1]=0;
		array2[3][2]=2;
		array2[3][3]=0;
		test.reemplazarConCeros(array2);
		
	}

}
