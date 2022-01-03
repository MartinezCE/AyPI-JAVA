package Busqueda;

public class Secuencial {
	public int [] arreglo;

	public Secuencial () {
		arreglo  = new int [6];
		arreglo [0] = 10;
		arreglo [1] = 2;
		arreglo [2] = 7;
		arreglo [3] = 9;
		arreglo [4] = 1;
		arreglo [5]	= 0;
	}

	public void busquedaSecuencial(int buscado) {
		boolean bandera = false;
		
		
		int aux = 0;
		for(int iterador=0; iterador<arreglo.length && bandera == false; iterador ++) {

			if(buscado == arreglo[iterador]) {
				bandera = true;
				aux = iterador;
			}
			
		}
		if(bandera == false) {
			System.out.println("El elemento no se encuentra en el arreglo");
		}else {
			System.out.print("El elemento fue encontrado en la posicion: " + aux);
		}
	}

	public static void main (String [] args) {
		Secuencial test = new Secuencial();
		test.busquedaSecuencial(9);
	}
}
