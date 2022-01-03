package ArreglosUnidimencionales;

public class Stock {
	
	/*
	 * Pre 
	 * post devuelve un arreglo con 8 posiciones en el que la posicion
	 * iesima tiene la cantidad de remeras que son del talle i
	 * cuyo precio este entre preciodeesde y precioHAsta
	 */
	
	public int [] contarRemerasPorTalle (Remera[] remeras,
			double precioDesde, double precioHasta) {
		int [] remerasDelTalle =new int [8];
		
		for(int i=0; i<remeras.length;i++) {
			if(remeras[i].obtenerPrecio() >= precioDesde && remeras[i].obtenerPrecio() <= precioHasta) {
				remerasDelTalle[remeras[i].otenerTalle()]++;
			}
		}return remerasDelTalle;
	}
}
