package ArreglosUnidimencionales;

public class PlanEntrenamiento {
	private double [] plan;
	private double [] recorrido;
/*
*Se construya a partir de la cantidad de semanas que dura el plan.
*/
	
	PlanEntrenamiento (int semanas){
		this.recorrido = new double [semanas];
		this.plan= new double [semanas];
		
	}
/*Almacene la distancia a correr (Km) planificada para una semana.
 */
	public void almacenarDistanciaARecorrer (double km) {
		for(int i=0;i<this.plan.length;i++) {
			if (plan[i] == 0.0) {
				this.plan[i]= km;
			}
		}
		
		
	}
	
/*Almacene la distancia que efectivamente corrió (Km) una semana.
*/
	public void almacenarDistaciaRecorrida (double km) {
		for(int i=0;i<this.recorrido.length;i++) {
			if(recorrido[i]==0) {
				this.recorrido[i] = km;
			}
		}
	}
/*Devuelva la distancia (Km) que se corrió en una semana indicada como parámetro.
 */
public double obtenerDistancia (int semana) {
	return this.recorrido[semana-1];
}
/*Calcule la cantidad de semanas en las que la distancia recorrida
 *  superó lo planificado para esa semana.
 */
public int seSuperoElPlan () {
	int contador=0;
	for(int i =0;i<this.plan.length;i++) {
		if(this.plan[i]<this.recorrido[i]) {
			contador++;
		}
	}return contador;
}
/*Busque la máxima diferencia entre distancia planificada 
 * y corrida, solo considerando aquellas semanas en las que 
 * la distancia recorrida fue mayor a la estimada.
*/
public double obtenerDistanciaMaxima () {
	double mayor=0;
	for(int i=0;i<this.plan.length;i++) {
		if(this.plan[i]<this.recorrido[i] && this.recorrido[i]>mayor) {
			mayor =this.recorrido[i];
			}
		}return mayor;
}
	
	
}
