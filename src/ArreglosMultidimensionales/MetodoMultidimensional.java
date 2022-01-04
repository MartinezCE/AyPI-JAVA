package ArreglosMultidimensionales;

public class MetodoMultidimensional {
	public MetodoMultidimensional() {}

	/**
	 * pre: el array debe tener numeros > 0 en la primer y ultima columna
	 * post: reemplaza los elementos con valor 0.0 por el promedio de
	 * de los elementos contiguos: anterior y/o siguiente en la misma fila.
	 */
	public void reemplazarCeros(double[][] valores) {

		for(int i=0; i<valores.length;i++) {
			for(int l=0;l<valores.length-1;l++) {
				if(valores[i][l]==0.0 && i!=0 && i!=valores.length && l!=0 && l<valores.length) {
					valores[i][l] = (valores[i-1][l-1] + valores[i+1][l+1])/2;
				}
			}

		} imprimirArray(valores);
	}

	private void imprimirArray(double[][] valores) {
		for(int i=0; i<valores.length;i++) {
			for(int l=0;l<valores.length;l++) {
				System.out.print(valores[i][l]);
			}
			System.out.println("");
		}
	}

	
}
