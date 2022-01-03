package ArreglosUnidimencionales;

public class Autocine {

	
	private int [] cantMayores, cantMenores;
	private boolean [] lugares;
	
	Autocine(int autosMaximos){
	lugares = new boolean [autosMaximos];
	cantMayores = new int [autosMaximos];
	cantMenores = new int [autosMaximos];
	
	}
	
	public void dejarEntrarAutoCon (int mayores, int menores) {
		for(int i=0;i<lugares.length;i++) {
			if(lugares[i] == false) {
				this.cantMayores[i]= mayores;
				this.cantMenores[i]= menores;
			}else { System.out.println("No hay mas lugar en el cine");}
		}
	}
	
	
	public int obtenerCantidadDePersonas() {
		int suma=0;
		for(int i=0;i<lugares.length;i++) {
			if(lugares[i] == true) {
				suma +=(cantMayores[i] + cantMenores[i]); 
			}
	} return suma;
		}
	
	
	public int contarAutosCon(int menores) {
		int contador =0;
		for(int i=0;i<cantMenores.length;i++) {
			if(cantMenores[i] == menores) {
				contador++;
			}
		}return contador;
	}
	
	
	public int [] obtenerCantidadDeAutosCon () {
		int [] iAutosConIpersonas = new int[8];
		for(int i=0;i<lugares.length;i++) {
			if((cantMayores[i]+ cantMenores[i]) == i ){
				iAutosConIpersonas[i] = (cantMayores[i] + cantMenores[i]); 
			}
		}return iAutosConIpersonas;
	}
	
}
