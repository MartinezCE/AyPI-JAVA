package ArreglosUnidimencionales;
/**
 * 
 */

/**
 * @author cristianmartinez
 */
public class Eslabon {
	private double [] eslabones;
	private int numeros;
	private double longitud;

	/**
	 * post inicializa el Eslabón con el número y la longitud indicados.
	 */
	public Eslabon (int numeros , double longitud) {
		this.numeros = numeros;
		eslabones = new double [numeros];
		for(int i=0; i<eslabones.length;i++){
			eslabones[i] = longitud;
		}


	}
	/**
	 * post devuelve el número de Eslabón.
	 */

	public int obtenerNumero () {
		return this.numeros;
	}
	/**
	 * post devuelve la longitud del Eslabón.
	 */
	public double obtenerLongitud () {
		return this.longitud;
	}
	/**
	 * post cambia la longitud del Eslabón.
	 */
	public double cambiarLongitud(double longitud) {
		for(int i=0; i<this.eslabones.length;i++){
			this.eslabones[i]= longitud;
		}
		return longitud;
	}

}
