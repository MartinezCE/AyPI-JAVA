package ArreglosMultidimensionales;

public class ImprimirMatriz {
	
	
	public static void main (String [] args) {
		
		
		int [][] matriz= new int[5][5] ;
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz.length;j++) {
				
				
				if(j==0 || i==0 || i == matriz.length-1 || j== matriz.length-1) {
					matriz[i][j] = 1;
				}
			}
		}
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz.length;j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println("");
		}
		
	}
}
