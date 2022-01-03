package Ordenamiento;

public class VerificadorDeOrden {
	
	 /**
     * post: indica si los elemento del vector están o no ordenados
     *   	de manera ascendente.
     */
	
    public boolean estaOrdenadoAscendentemente(int[] vector) {
    	boolean bandera = true;
    	for (int i=0; i<vector.length-1 && bandera;i++) {
    		for(int l=i+1;l<vector.length && bandera;l++) {
    			if(vector[i]<vector[l]) {
    				bandera =true;
    				i++;
    			}else {
    				bandera =false;
    			}
    		}
    		
    	}return bandera;
    }

    /**
     * post: indica si los elemento del vector están o no ordenados
     *   	de manera descendente.
    */
    public boolean estaOrdenadoDescendentemente(int[] vector) {
    	boolean bandera = true;
    	for (int i=0; i<vector.length-1 && bandera;i++) {
    		for(int l=i+1;l<vector.length && bandera;l++) {
    			
    			if(vector[i]>vector[l]) {
    				bandera =true;
    				i++;
    			}else {
    				bandera =false;
    			}
    		}
    		
    	}return bandera;
    }

    public static void main(String [] args) {
    	VerificadorDeOrden test = new VerificadorDeOrden();
    	int [] vector = new int [5];
    	/*
    	 * vector[0]=1;
    	 * vector[1]=1; 
    	 * vector[2]=1;
    	 * vector[3]=1;
    	 * vector[4]=1;
    	 * 
    	 */
    	
    	System.out.println(
    	test.estaOrdenadoDescendentemente(vector));
    }

}
