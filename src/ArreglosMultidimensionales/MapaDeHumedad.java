package ArreglosMultidimensionales;

public class MapaDeHumedad {

	// declaracion de variable
	public double [][] matriz;
	public int fila, columna;
	public double maximo,minimo;

	public MapaDeHumedad(int columna, int fila) {
		validarDimenciones(columna,fila);
		//asignacion 
		this.fila=fila;
		this.columna=columna;
		this.matriz = new double [fila][columna];
		this.maximo=0;
		this.minimo=100;

	}
	
	/**
	 * 
	 * Pre: Recibe las filas y columnas 
	 * Post: Devuelve un error si los valores no son superiores a 1
	 */
	private void validarDimenciones(int fila, int columna) {
		if(fila<1 || columna <1) {
			throw new Error ("El terreno no cumple con las medidas solicitadas");
		}
	}

	/*
	 * pre: recibe humedad a registrar
	 * post: devuevle un error si el valor es menor a 0 y superor a 100
	 */
	private void validarHumedad(double humedad) {
		if(humedad < 0.0 || humedad >100.0) {
			throw new Error ("La humedad ingresada es invalida");	
		}
	}

	/*
	 * post: almacena la muestra de humedad en la posicion solicitada, guarda los valores maximos y minimos de humedad
	 */

	public void almacenarMuestras(int columna, int fila, double humedad) {
		validarDimenciones(columna,fila);
		validarHumedad(humedad);
		this.matriz[fila-1][columna-1] = humedad;	
		if(this.maximo<humedad) {
			maximo= humedad;
		}
		if(minimo>humedad) {
			minimo=humedad;
		}
	}



	public double getPromedioContorno () {
		double sumar =0;
		double contador =0;
		for(int i=0;i<this.matriz.length;i++) {
			for(int j=0;j<this.matriz.length;j++) {


				if(j==0 || i==0 || i == this.matriz.length-1 || j== this.matriz.length-1) {

					contador++;
					sumar =	this.matriz[i][j];

				}
			}
		} 
		return sumar/contador;
	}


	public double obtenerPromedio() {
		double sumaDeHumedad = 0;
		for(int i = 0; i<this.fila;i++) {
			for(int j=0; j<this.columna;j++) {
				sumaDeHumedad = this.matriz[i][j];
			}
		}
		return sumaDeHumedad/(this.fila*this.columna);
	}

	//Contar la cantidad de muestras que se encuentran en un rango de valores indicados.

	public int contarEntreValores (int inicial, int fin) {
		int contador=0;
		for(int i=0;i<fila;i++) {
			for(int j=0;j<columna;j++) {
				if(this.matriz[i][j] >= inicial && this.matriz[i][j] <= fin) {
					contador++;
				}
			}
		} return contador;
	}

	//Reemplazar el valor de una muestra por el promedio de valores contiguos.

	public void reemplazarMuestra(int fila, int columna) {
		this.matriz[fila-1][columna-1] = (this.matriz[fila-1][columna] + this.matriz[fila-1][columna-2] /2);
	}

	public double obtenerMinimo() {
		return minimo;
	}
	public double obtenerMaximo() {
		return maximo;
	}
}
