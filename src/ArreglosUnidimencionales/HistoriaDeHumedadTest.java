package ArreglosUnidimencionales;
import org.junit.*;

import org.junit.Test;

/**
 * 
 */

/**
 * @author cristianmartinez
 *
 */

public class HistoriaDeHumedadTest {
	HistoriaDeHumedad test;

	@Before
	public void creacion() {
		test = new HistoriaDeHumedad(5);
		test.almacenarMuestraDeHumedad(10.0);
		test.almacenarMuestraDeHumedad(10.0);
		test.almacenarMuestraDeHumedad(20.0);
		test.almacenarMuestraDeHumedad(10.0);
		test.almacenarMuestraDeHumedad(5.0);
	}

	@Test
	public void testPromedio() {
		Assert.assertEquals(11.0, test.calcularHumedadPromedio(), 0.01);
	}
	@Test
	public void testMinimo() {
		Assert.assertTrue(5.0==test.buscarMinimo());
	}
	@Test
	public void testMaximo() {
		Assert.assertTrue(20.0==test.buscarMaximo());
	}

}
