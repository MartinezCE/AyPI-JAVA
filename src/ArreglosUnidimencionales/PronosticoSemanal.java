package ArreglosUnidimencionales;

/*
 * 1. Implementar la clase PronosticoSemanal, 
 * con sus respectivas pruebas unitarias, 
 * a partir de la
 * siguiente implementación parcial:
 */
/**
 * Clase representa el pronósticos de temperaturas
 * para la próxima semana.
 */

public class PronosticoSemanal {

	private double[] temperaturas;
	/**
	 * post deja inicializo las temperaturas del pronóstico
	 * en 25 ºC.
	 */
	public PronosticoSemanal() {
		temperaturas = new double[7];
		for (int i = 0; i < temperaturas.length; i++) {
			temperaturas[i] = 25.0;
		}
	}

	/**
	 * pre recibe el número de día de la semana comprendido
	 * entre 1 y 7, siendo 1 lunes y 7 domingo.
	 * post devuelve la temperatura pronosticada
	 * para el día indicado.
	 */
	public double obtenerTemperatura(int dia) {
		double temp = 0;
		if(dia>=1 && dia<=7) {
			temp = this.temperaturas[dia-1];
		}
		return temp ;
	}

	/**
	 * pre recibe el número de día de la semana comprendido
	 * entre 1 y 7, siendo 1 lunes y 7 domingo.
	 * post cambia la temperatura pronosticada para el día
	 * indicado.
	 */
	public void pronosticarTemperatura(int dia, double temperatura) {
		if(dia>=1 && dia<=7 && temperatura>=-10.0 && temperatura <=45.0) {
			this.temperaturas[dia-1]= temperatura;
		}
	}

	/**
	 * post devuelve la temperatura promedio pronosticada para
	 * la próxima semana.
	 */
	public double calcularTemperaturaPromedio() {
		double promedio = 0;
		for(int i = 0; i< temperaturas.length;i++){
			promedio += this.temperaturas[i];
		}return promedio/temperaturas.length;
	}

	/**
	 * post devuelve la temperatura máxima pronosticada.
	 */
	public double buscarTemperaturaMáxima() {
		double tempMax =0;
		for(int i = 0; i < temperaturas.length; i++) {
			if(this.temperaturas[i] < this.temperaturas[i+1]) {
				tempMax = this.temperaturas[i+1];
			}
		}return tempMax;
	}

	/**
	 * post devuelve la temperatura mínima pronosticada.
	 */
	public double buscarTemperaturaMínima() {
		double tempMin =0;
		for(int i = 0; i < temperaturas.length; i++) {
			if(this.temperaturas[i] > this.temperaturas[i+1]) {
				tempMin = this.temperaturas[i+1];
			}
		}return tempMin;

	}
}
