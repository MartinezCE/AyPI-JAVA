package ArreglosUnidimencionales;
/**
 * 
 */

/**
 * @author cristianmartinez
 * 
 * 
 * Durante todo un día se toman muestras de humedad. Diseñar e implementar la clase
 *  HistorialDeHumedad tal que:
 *◦ Se construya a partir de la cantidad de mediciones de humedad a realizar.
 *◦ Almacene las muestras de humedad.
 *◦ Calcule la humedad promedio.
 *◦ Busque el mínimo y máximo valor de humedad.
 *
 */

public class HistoriaDeHumedad {


	private double []mediciones;
	private int contador;
	private int cantidadDeMediciones;
	private double minimo;
	private double maximo;

	public HistoriaDeHumedad(int cantidadDeMediciones) {
		if(cantidadDeMediciones>0) {
			this.mediciones=new double [cantidadDeMediciones];
			this.contador = cantidadDeMediciones;
			this.cantidadDeMediciones=cantidadDeMediciones;
			this.maximo=0;
			this.minimo=100;
		}
		else {
			throw new Error ("el parametro ingresado debe ser mayor a cero"); 
		}
	}

	public void almacenarMuestraDeHumedad(double humedad) {

		if(contador >= 0 ) {
			for(int i =0;i < this.mediciones.length;i++) {
				if(this.mediciones[i]==0.0) {
					this.mediciones[i]=humedad;
					contador--;
					break;
				}
			}
		}
		if (this.minimo> humedad) {
			this.minimo=humedad;
		}
		if(maximo< humedad) {
			this.maximo = humedad;
		}
	}

	public double calcularHumedadPromedio () {
		double promedio=0;
		for(int i=0; i <this.mediciones.length;i++) {
			promedio += mediciones[i];

		}
		return promedio / this.cantidadDeMediciones;
	}

	public double buscarMinimo () {
	
		for(int i=0;i<this.mediciones.length;i++) {
			if(this.minimo>this.mediciones[i]) {
				this.minimo=this.mediciones[i];
			}
		}
		return minimo;
	}

	public double buscarMaximo () {
		for(int i=0;i<this.mediciones.length;i++) {
			if(this.maximo<this.mediciones[i]) {
				this.maximo=this.mediciones[i];
			}
		}
		return maximo;
	}

}
