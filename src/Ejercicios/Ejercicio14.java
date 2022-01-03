package Ejercicios;

public class Ejercicio14 {


	/**
	 * post: devuelve la posición de vector en la que 
	 * se localizó la primera
	 * ocurrencia del elemento buscado. 
	 * Si no lo encuentra devuelve -1.
	 */
	
	public int buscar(int[] vector, int buscado) {

		for(int i =0; i<vector.length;i++) {
			if(vector[i] == buscado) {
				return i;
			}
		}return-1;
	}

}
