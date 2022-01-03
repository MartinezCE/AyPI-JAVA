package ArreglosUnidimencionales;

public class RegistroDeSueno {
	private double []registro;
	private boolean []interrupcion;
	private double promedio;

	public RegistroDeSueno(int cantDias){
		if(cantDias>0) {
			this.registro= new double[cantDias];
			this.interrupcion = new boolean [cantDias];
			this.promedio =0;
		}
		else {
			throw new Error ();
		}
	}
	public void agregarCantHs(double hs, boolean interrup) {
		if(hs>0) {
			for(int i=0;i<this.registro.length;i++) {
				if(this.registro[i]==0){
					this.registro[i]=hs;
					this.interrupcion[i]=interrup;
					break;
				}
			}
		}
	}
	public double calcularPromedioDiarioDeHsDormidas(){

		for(int i= 0; i<registro.length;i++) {
			this.promedio += this.registro[i];
		}
		return this.promedio/this.registro.length;
	}
	public int contarCantidadDeDiasQueSeDurmioMasHsQueElPromedio(){
		int contador = 0;
		for(int i=0; i<this.registro.length;i++) {
			if(this.promedio > this.registro[i]) {
				contador++;
			}
		}return contador;
	}
	
	public int contarDiasSinInterrupcionDurante (double valorUno, double valorDos){
		int contadorBooleano =0;
		if(valorUno>=0 && valorDos<valorUno) {
			for(int i =0; i<this.interrupcion.length;i++){
				if(this.registro[i]>=valorUno && this.registro[i]<=valorDos && this.interrupcion[i]!=false) {
					contadorBooleano++;
				}
			} 
		}return  contadorBooleano;
	}
}
