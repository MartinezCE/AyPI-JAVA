package ArreglosUnidimencionales;

public class Entrenamiento {
	
	private double [] training;
	private int diasQueMasCorrio;

	public Entrenamiento (int diasDeDuracion) {
		if(diasDeDuracion<0) {
			this.training=new double [diasDeDuracion];
			this.diasQueMasCorrio = 0;
		}
		else {
			throw new Error ("Los dias de duracion deben ser mayor a cero");
		}
	}


	public void almacenarKilometrosPorDia (int dia, double km) {
		if(km >0 && dia-1 <this.training.length) {
			this.training[dia-1]= km;
		}
	}

	public double promedioDiario() {
		double suma=0;
		for(int i=0; i< this.training.length; i++) {
			suma += this.training[i];	
		}
		return suma/(training.length);
	}


	//el km ingresado por parametro debe ser superior a cero

	public int calcularDiasQueSuperan (double km) {
		for (int j=0; j<training.length; j++) {
			if(km < this.training[j]){
				this.diasQueMasCorrio++;
			} 
		}
		return this.diasQueMasCorrio;
	}

}