package Codificar;

public class WatchLater {
	
	private String [] peliculas;
	private double [] duracion;
	
	/*
	 * pre: la cantidad de peliculas minimi es 5 y maxima 20
	 * post: Construye la cartelera con la cantidad de peliculas recibidas por parametro
	 */
	WatchLater (int cantPeliculas){
		validarCantidad(cantPeliculas);
		this.peliculas = new String [cantPeliculas];
		this.duracion = new double [cantPeliculas];
		
	}
	
	/*
	 * pre: recibe titulo y duracion minimo 50min maximo 120 min
	 * post: Construye la cartelera con la cantidad de peliculas recibidas por parametro
	 */
	public void agregarPelicula (String titulo, double min) {
		validarMin(min);
		boolean bandera = false;
		for(int i=0;i<this.peliculas.length && !bandera;i++) {
			if(this.peliculas[i] == null) {
				this.peliculas[i] = titulo;
				this.duracion[i] = min;
				bandera = true;
			}
		}
	}
	
	/*
	 * pre: la cantidad de peliculas minimi es 0 y maxima peliculas.length
	 * post: Construye la cartelera con la cantidad de peliculas recibidas por parametro
	 */
	public String obtenerTitulo (int posicion) {
		validarPosicion(posicion);
		return this.peliculas[posicion-1];
	}
	
	/*
	 *  
	 * post: devuelve la cantidad de peliculas ingresadas hasta el momento
	 */
	public int obtenerCantPeliculas () {
		int contador=0;
		for(int i=0;i<this.peliculas.length;i++) {
			if(peliculas[i] != null) {
				contador++;
			}
		}return contador;
	}
	
	/*
	 * 
	 * post: devuelve la suma de todas las peliculas aniadidas
	 */
	public double obtenerDuracionTotal () {
		int sumar=0;
		for(int l=0;l<this.duracion.length;l++) {
			if(duracion[l]>0) {
				sumar += duracion[l];
			}
		}return sumar;
	}
	
	/*
	 * pre recibe la posicion a validar
	 * post: Lanza un msj si el parametro es erroneo
	 */
	private void validarPosicion (int pos) {
		if(pos > this.peliculas.length || pos<0 ) {
			throw new Error ("Parametro invalido");
		}
	}
	
	/*
	 * pre recibe la cantidad de peliculas a verificar
	 * post: Lanza un msj si el parametro es erroneo
	 */
	private void validarCantidad(int cantPeliculas) {
		if(cantPeliculas <5 || cantPeliculas>10) {
			throw new Error ("Parametro invalido");
		}
	}
	
	/*
	 * post lanza un msj si el parametro es erroneo.
	 */
	private void validarMin (double min) {
		if ( min >120 || min<50) {
			throw new Error ("La duracion debe ser mnayor a 50in y menor a 120min");
		}
	}

}
