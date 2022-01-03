package ArreglosUnidimencionales;

import org.junit.Test;
import org.junit.Assert;

public class PronosticoTest {

	
	@Test
	public void temperaturaDa25DiaUno () {
		//condicion inicial
		PronosticoSemanal pronostico = new PronosticoSemanal();

		//operacion
		double es25 = pronostico.obtenerTemperatura(1);

		//comprobacion
		Assert.assertEquals(25, es25, 0.1);
	}

	@Test
	public void pronostica40TodaLaSemana () {
		//Condicion inicial
		PronosticoSemanal pronostico = new PronosticoSemanal();

		pronostico.pronosticarTemperatura(1, 40);

		//operacion
		double es40 = pronostico.obtenerTemperatura(1);

		//Comprobacion
		Assert.assertEquals(40, es40, 0.1);

	}

	@Test
	public void elPromedioEs40 () {
		//Condicion Inicial
		PronosticoSemanal test = new PronosticoSemanal();

		//Operacion
		for(int i = 0; i < 7; i++) {
			test.pronosticarTemperatura(i, 40);
		}
		double promedio = 40;

		//Comprobacion
		Assert.assertEquals(40, promedio, 0.1);
	}

	@Test
	public void elMaximoEs45 () {
		//Condicion Inicial
		PronosticoSemanal test = new PronosticoSemanal();

		//Operacion
		for(int i = 0; i < 7; i++) {
			test.pronosticarTemperatura(i, 40);
		}
		test.pronosticarTemperatura(5, 45);


		//Comprobacion
		Assert.assertEquals(45, test.obtenerTemperatura(5), 0.1);
	}
	@Test (expected= Error.class)
	public void elMaximoNoEs45 () {
		//Condicion Inicial
		PronosticoSemanal test = new PronosticoSemanal();

		//Operacion
		for(int i = 0; i < 7; i++) {
			test.pronosticarTemperatura(i, 40);
		}
		test.pronosticarTemperatura(5, 12);


		//Comprobacion
		Assert.assertEquals(45, test.obtenerTemperatura(5), 0.1);
	}
	@Test
	public void elMinEs0 () {
		//Condicion Inicial
		PronosticoSemanal test = new PronosticoSemanal();
		
		//Operacion
		for(int i = 0; i < 7; i++) {
			test.pronosticarTemperatura(i, 40);
		}
		test.pronosticarTemperatura(5, 0);


		//Comprobacion
		Assert.assertEquals(0, test.obtenerTemperatura(5), 0.1);
	}

}
