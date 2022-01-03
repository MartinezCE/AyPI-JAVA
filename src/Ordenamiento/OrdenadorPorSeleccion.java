package Ordenamiento;

public class OrdenadorPorSeleccion {
	/**
     * post: reorganiza los elementos de vector
     *       de acuerdo al orden lineal <
     *   	 definido para los números enteros.
     */
    public void ordenar(int[] vector) {
    	for(int i=0;i<vector.length-1;i++) { // Este ciclo lo utilizamos para buscar el elemento mas pequeno con sus iteraciones
    		int menor = i; // declaramos la variable menor, es la primer posicion y nos va ayudar a comparar
    		//selecciono el menor
    		for(int l=i+1;l<vector.length;l++) { // con este for anidado comparamos ese elemento menor con los otros del vector
    			if(vector[menor]>vector[l]) { // para encontrar el elemento menor
    				//de ser asi actualizamos la variable minimo
    				menor=l;
    			}
    			
    			//intercambio en la posicion donde empezamos nuestro ciclo
    			 int aux = vector[i];   // almaceno el valor en la posicion menor
    			 vector[i] = vector[menor]; // al valor de la posicion menor, le asigno el menor encontrado
    			 vector[menor] = aux; // y que estaba en esa posicion se intercambia por el lugar deel menor encotrado
    		}
    	}for(int k=0; k<vector.length;k++) {
			System.out.print(vector[k] + " ");}
    }
    
    public static void main (String [] args) {
    	OrdenadorPorSeleccion test = new OrdenadorPorSeleccion();
    	int [] vector = new int[10];
    			vector[0]=54;
    			vector[1]=25;
    			vector[2]=86;
    			vector[3]=12;
    			vector[4]=65;
    			vector[5]=76;
    			vector[6]=1;
    			vector[7]=68;
    			vector[8]=76;
    			vector[9]=87;
    			
    		test.ordenar(vector);
    
    }
}
