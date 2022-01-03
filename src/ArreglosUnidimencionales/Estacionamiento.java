package ArreglosUnidimencionales;

public class Estacionamiento {
	private boolean [] capacidad;
	private int [] contador;
	
	
	/*
	 * Se construya a partir de la cantidad de lugares disponibles.
	 */
	
	Estacionamiento(int capacidad){
		this.capacidad = new boolean [capacidad];
		this.contador= new int [capacidad];
		for(int i=0; i<this.contador.length;i++) {
			this.contador[i]=0;
		}
		
	}
	/*Ocupar el lugar indicado por su número.
	 */
	public void ocupar(int lugar) {
		this.capacidad [lugar-1] = true;
		this.contador[lugar-1]= this.contador[lugar-1]++;
	}
	/*Desocupar el lugar indicado por su número.
	 */
	public void desocupar(int lugar) {
		this.capacidad[lugar-1] = false;
	}
	/*Calcular el porcentaje de lugares que están ocupados.
	 */
	public double porcentajeDeLugaresOcupados() {
		int contador=0;
		for(int i=0; i<this.capacidad.length;i++) {
			if(this.capacidad[i] == true) {
				contador++;
			}
		}return contador/this.capacidad.length;
	}
	 /*Contar la cantidad de veces que fue usado
	  *  (ocupado y desocupado) un lugar.
	  */
	public int cantDeVecesUsado(int lugar) {
		return this.contador[lugar-1];
		
	}
	 /*Devolver la cantidad de lugares que han sido usados más que la cantidad 
	 *indicada por parámetro.
	 */
public int lugarMasUsado (int cantidad) {
	int cant=0;
	for(int i=0;i<this.contador.length;i++) {
		if(this.contador[i] > cantidad) {
			cant++;
		}
	}return cant;

}
	
}
