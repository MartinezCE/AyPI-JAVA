package ArreglosUnidimencionales;


/**
 * 
 * 
 * @author cristianmartinez
 *
 */


public class PlayList {

	private String[] nombres;
	private double [] lista;

	private int cantCanciones;


	public PlayList (int cantCanciones) {


		if(cantCanciones>0) {
			this.cantCanciones=cantCanciones;
			lista = new double [cantCanciones];
			nombres = new String [cantCanciones];
		}
		else {
			throw new Error ("El valor ingresado debe ser mayor a cero");
		}	
	}


	public void agregarCancion (String titulo, double duracion) {
		for(int i= cantCanciones-1; i>0 ;i--){
			if(this.nombres[i] == null) {
				this.nombres[i]= titulo;
				this.lista[i]= duracion;
				break;
			}
		}


	}



	// pre: la posicion debe ser mayor a 0
	// post: devuelve el nombre de la cancion solicitada;
	public String obtenerTitulo (int posicion) {

		return this.nombres[posicion-1];
	}

	public int obtenerCantidadDeCanciones () {
		int contador=0;
		for(int i = 0; i<this.nombres.length; i++) {
			if(this.nombres[i] != null) {
				contador++;
			}
		}return contador;
	}

	public double obtenerDuracionTotal () {
		double duracion =0;
		for(int j=0; j<this.lista.length;j++) {
			duracion += this.lista[j];

		} return duracion;
	}


}
