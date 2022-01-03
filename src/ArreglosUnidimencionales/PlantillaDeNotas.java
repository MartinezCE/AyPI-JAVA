package ArreglosUnidimencionales;

public class PlantillaDeNotas {
	private double [] nomina;
	
	/*
	 * pre: la canidad de alumnos menor es 10 y maxima 30
	 * post: Crear con la cantidad de alumnos
	 */
	
	PlantillaDeNotas (int alumnos) {
		nomina = new double [alumnos];
		
	}
	/*
	 * pre: El numero de orden corresponde al numero de alumnos
	 * post: Cargar nota por numero de orden
	 */
	public void cargarNota(int numeroDeOrden, double nota) {
		nomina[numeroDeOrden-1]= nota;
	}
	/*
	 * recuperar la nota de un alumno por su número de orden
	 */
	public double obtenerNota(int numeroDeOrden) {
		return nomina[numeroDeOrden-1];
		
	}
	/*
	 * pre: nota comprendida entre 0 y 10
	 * Buscar la nota máxima
	 */
	public double obtenerNotaMaxima() {
		double notaMaxima = 0;
		for(int i=0;i<nomina.length;i++) {
			if(notaMaxima<nomina[i]) {
				notaMaxima=nomina[i];
			}
		}return notaMaxima;
		
	}
	
	/*
	 * pre: nota comprendida enrte 0 y 10
	 * pos: Buscar la nota mínima
	 */
	public double obtenerNotaMinima() {
		double notaMinima=10;
		for(int i=0;i<this.nomina.length;i++) {
			if(notaMinima> this.nomina[i]) {
				notaMinima=this.nomina[i];
			}
		}return notaMinima;
	}
	/*
	 * Calcular la nota promedio
	 */
	public double obtenerNotaPromedio() {
		double sumarNotas =0;
		for(int i=0; i<this.nomina.length;i++) {
			sumarNotas += this.nomina[i];
		}return sumarNotas/this.nomina.length;
		
	}
	/*
	 * Contar los alumnos aprobados
	 */
	
	public int obtenerCantAlumnosAprobado() {
		int aprobados =0;
		for(int i=0;i<this.nomina.length;i++) {
			if( this.nomina[i]>=4 ) {
				aprobados++;
			}
		}return aprobados;
		
	}


}
