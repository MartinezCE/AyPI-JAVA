/**
 * 
 */
package ArreglosUnidimencionales;

/**
 * @author cristianmartinez
 */
public class DiasLluviosos {
	

	private boolean[] diasDeLluvia;
	
	/*
	 *  pre los dias del anio solo puede ser 365 0 366 para anios bisiestos
	 *  post 
	 */
	public DiasLluviosos(int dias){
		
		 validarDias(dias);
		this.diasDeLluvia = new boolean [dias];
		
		
	}
	
	public void registrarQueLlovioElDia(int diaDeAnio, boolean llovio) {
		
		this.diasDeLluvia[diaDeAnio-1]= llovio;
		
	}
	
	public int contarDiasLluviosos() {
		int contador=0;
		for(int i=0; i<this.diasDeLluvia.length;i++) {
			if(diasDeLluvia[i] == true) {
				contador++;
			}
		}return contador;
		
	}
	
	public int consultarCuatrimestreMarLluvioso() {
		int contPrimerCuatrimestre = 0;
		int contSegundoCuatrimestre = 0;
		int contTercerCuatrimestre = 0;
		
		for(int i=0;i<this.diasDeLluvia.length;i++) {
			if(this.diasDeLluvia[i] == true || i <= 121) {
				contPrimerCuatrimestre++;
			}
			else if( this.diasDeLluvia[i] == true && (i>=122 && i<242)) {
				contSegundoCuatrimestre++;
			}
			else if(this.diasDeLluvia[i] ==true && (i>=243 && i<=365)) {
				contTercerCuatrimestre++;
			}
		}

		if( contPrimerCuatrimestre > contSegundoCuatrimestre && contPrimerCuatrimestre > contTercerCuatrimestre) {
			return contPrimerCuatrimestre;
		} else if(contSegundoCuatrimestre>contPrimerCuatrimestre && contSegundoCuatrimestre> contTercerCuatrimestre) {
			return contSegundoCuatrimestre;
		}else {
			return contTercerCuatrimestre;
		}
		}
	
	
	public int consultarPrimerDiaConLluvia() {
		boolean bandera = true;
		int dia=0;
		for(int i=0;i<this.diasDeLluvia.length && bandera;i++) {
			if(diasDeLluvia[i] == true) {
				dia = i;
				bandera = false;
			}
		}
		return dia;
		
	}
	
	private void validarDias(int dias) {
		if(dias!=365 || dias!=364) {
			throw new Error("parametro invalido");
		}
	}

}
