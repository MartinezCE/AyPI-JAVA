package ArreglosMultidimensionales;

public class AnalizadorDeMatrices {
	/**
	 * post: devuelve la cantidad de elementos de ‘matriz’ que
	 *      tenga al menos un valor 0.
	 */
	public int contarCeros(double[][] matriz){ 
				int contador=0;
				for(int i=0;i<matriz.length;i++) {
					for(int l=0;l<matriz[i].length;l++) {
						if(matriz[i][l] == 0) {
							contador++;
						}
					}
				}
				return contador;
		}
	
	
	/**
	 * post: devuelve la cantidad de elementos de 
	 *       ‘matriz’ cuyo valor
	 *       esté en el rango [‘desde’, ‘hasta’].
	 */
	public int contarElementosEnElRango
	(double[][] matriz, double desde, double hasta) {
		int cant=0;
		for(int i=0;i<matriz.length;i++) {
			for(int l=0;l<matriz.length;l++) {
				if(matriz[i][l]>=desde && matriz[i][l]<= hasta) {
					cant++;
				}
			}
		}return cant++;
	}

		
  /**
   * pre: ‘matriz’ es regular. 	
   * post: devuelve la cantidad de columnas de ‘matriz’ que tenga 
   *       al menos un valor 0.
   */
	public int contarColumnasConCeros(double[][] matriz) {	
		int contador=0;
	for(int i=0;i<matriz.length;i++) {
		for(int l=0;l<matriz.length;l++) {
			if(matriz[l][i] == 0) {
				contador++;
				l++;
			}
		}
	}return contador;
	}

	/**
 	 * post: devuelve la cantidad de filas de ‘matriz’ que tenga 
       *       al menos un valor 0.
 	 */
	public int contarFilasConCeros(double[][] matriz) {
		int contador=0;
		for(int i=0;i<matriz.length;i++) {
			for(int l=0;l<matriz[i].length;l++) {
				if(matriz[i][l] == 0) {
					contador++;
					i++;
					
				}
			}
		}
		return contador;
	}
	
	/* post: indica si la matriz es cuadrada y tiene 
	 * 		 unos en la diagonal
 	 *       principal y ceros en el resto.
 	 */
	public boolean esMatrizIdentidad (double[][] matriz) {
		int contador=0;	
		if(matriz.length%2 ==0) {
		for(int i =0;i<matriz.length;i++) {
			for(int l=0;l<matriz[i].length;l++) {
			if(i==l && (i==1 && l==1) ) {
					contador++;
					
				}}
					}
						} if(contador == matriz.length) {
							return true;
						}
			return false;
	}
		/**
	 	 * post: devuelve un arreglo (con tantos elementos 
	 	 * 		 como filas tiene 
	 	 *       'matriz') que tiene en cada posición 
	 	 *       el promedio de una fila del
	 	 *       arreglo 'matriz'.
	 	 */
		public double[] promediarFilas(double[][] matriz){
			double [] matrizPromedio = new double [matriz.length];
			double suma =0;
			for(int i=0;i<matriz.length;i++) {
				for(int l=0;l<matriz[i].length;l++) {
					suma += matriz[i][l];
					matrizPromedio[i] = suma / matriz.length ;
				}
			}for(int i=0; i<matriz.length;i++) {
				System.out.println(matrizPromedio[i]);
			}
			
			return matrizPromedio;
	
	}



public static void main  (String []arg) {
	
	AnalizadorDeMatrices test = new AnalizadorDeMatrices ();
	double [][] matriz = new double[4][5];
	matriz[0][0]=1;
	matriz[0][1]=4;
	matriz[0][2]=4;
	matriz[0][3]=3;
	matriz[0][4]=3;
	matriz[1][0]=5;
	matriz[1][1]=1;
	matriz[1][2]=4;
	matriz[1][3]=6;
	matriz[1][4]=6;
	matriz[2][0]=7;
	matriz[2][1]=6;
	matriz[2][2]=1;
	matriz[2][3]=9;
	matriz[2][4]=9;
	matriz[3][0]=10;
	matriz[3][1]=2;
	matriz[3][2]=20;
	matriz[3][3]=1;
	matriz[3][4]=1;
/*	System.out.println(test.contarCeros(matriz));
 *	System.out.println(test.contarFilasConCeros(matriz));
 *	System.out.println(test.contarColumnasConCeros(matriz));
 * test.promediarFilas(matriz);
 */
	System.out.println(test.esMatrizIdentidad(matriz));
}
}
