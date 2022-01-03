package ArreglosUnidimencionales;

public class VueloDeAvion {

	
	private EstadoAsiento [] capacidad;
	private int cantidadDeAsientos;
	
	public VueloDeAvion (int cantidadDeAsientos) {
		this.cantidadDeAsientos=cantidadDeAsientos;
	capacidad = new EstadoAsiento [cantidadDeAsientos];	
	for(int i=0;i<capacidad.length;i++) {
		this.capacidad[i]= EstadoAsiento.DISPONIBLE;
	}
	}
	
	public void vender (int numeroDeAsiento) {
		if(capacidad[numeroDeAsiento-1] == EstadoAsiento.DISPONIBLE) {
			capacidad[numeroDeAsiento-1] = EstadoAsiento.VENDIDO;
		} else {
			System.out.println("Asiento no disponible");
		}
	}
	
	public void reservar (int [] numerosDeAsientosReservados) {
		for(int i=0;i<numerosDeAsientosReservados.length;i++) {
			if(capacidad[numerosDeAsientosReservados[i]] == EstadoAsiento.DISPONIBLE) {
				capacidad[numerosDeAsientosReservados[i]] = EstadoAsiento.RESERVADO;
			}
		}
	}
	
	public EstadoAsiento consultarEstado (int numeroDeAsiento) {
		return capacidad[numeroDeAsiento-1];
	}
	
	public int contarAsientosDisponibles() {
		int contador =0;
		for(int i=0;i<capacidad.length;i++) {
			if(capacidad[i] == EstadoAsiento.DISPONIBLE) {
				contador++;
			}
		} return contador;
	}
	
	public int conarAsientosVendidosEntre (int desdeNumeroAsiento, int hastaNumeroAsiento) {
		int contador=0;
		for(int i=desdeNumeroAsiento-1;i<=hastaNumeroAsiento-1;i++) {
			if(capacidad[i] == EstadoAsiento.VENDIDO) {
				contador++;
			}
		}return contador;
	}
	
	public int [] obtenerNumerosDeAsientosDisponibles () {
		int [] asientosDisponibles = new int [this.cantidadDeAsientos];
		
		for (int i=0;i<capacidad.length;i++) {
			if(capacidad[i]==EstadoAsiento.DISPONIBLE) {
				asientosDisponibles[i]++;
			}
		}
		return asientosDisponibles;
	}
	
	public static void main (String [] args) {
		VueloDeAvion test = new VueloDeAvion(30);
		test.vender(5);
		
		
		int [] reservar = new int [5];
		reservar[0]=5;
		reservar[1]=1;
		reservar[2]=3;
		reservar[3]=5;
		reservar[4]=6;
		
		test.reservar(reservar);
		
		System.out.println(
		test.consultarEstado(1));
		
		System.out.println(test.conarAsientosVendidosEntre(7, 30));
	}
}
