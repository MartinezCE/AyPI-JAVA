package ArreglosUnidimencionales;

public class VerificadorDeORden {
	
	/*
	 * Pre:reciba como parámetro un arreglo de enteros 
	 * post: devuelva un valor booleano que indique si los elementos del arreglo están ordenados de menor a mayor o no.
	 */
	
	public boolean verificar(int [] enteros) {
		int valorMaximo = enteros[0];
		for(int i=0;i<enteros.length;i++) {
			if( valorMaximo<=enteros[i]) {
				valorMaximo=enteros[i];
			}else {
				return false;
			}
		}
		return true;
	}
	
	
	public void verificarAmbosSentidos (int [] enteros) {
		int valorMaximo = enteros[0];
		boolean mayorMenor = false, menorMayor=false;
		for(int i=0;i<enteros.length;i++) {
			if( valorMaximo<=enteros[i]) {
				valorMaximo=enteros[i];
				menorMayor =true;
			}
			else if(valorMaximo>= enteros[i]) {
				valorMaximo=enteros[i];
				mayorMenor = true;   
		}
			System.out.println( "El arreglo esta ordenado de mayor a menor"+mayorMenor+
					" o esta ordenado de menor a mayor" +menorMayor);
	}
	}

}
