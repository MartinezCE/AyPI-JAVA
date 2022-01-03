package ArreglosUnidimencionales;

public class VerificarDoble {
	
	public int verificarDoble(int [] enteros) {
		for(int i=0;i<enteros.length;i++) {
			for(int j=i+1;j<enteros.length;j++) {
				if(enteros[i] != (enteros[j]/2)) {
					return i+1;
					
				} i=j;
			}
		}return -1;
		
	}  
	
	public static void main (String [] arg) {
		VerificarDoble test = new VerificarDoble();
		
		int [] enteros = new int [4];
		enteros[0]=1;
		enteros[1]=2;
		enteros[2]=6;
		enteros[3]=8;
		System.out.println(
		test.verificarDoble(enteros)
				);
	}
}
