package ArreglosUnidimencionales;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WatchLaterTest {
	WatchLater test;
	
	@Before
	public void creacion() {
		test = new WatchLater(5);
		test.agregarPelicula("back to the future I", 116);
		
	}
	@Test
	public void testObtenerTitulo() {
		Assert.assertEquals("back to the future I",test.obtenerTitulo(1));
		}
	
	@Test
	public void testObtenerDuracion() {
		Assert.assertEquals(116, test.obtenerDuracionTotal(), 0.1);
	}
	
	@Test (expected= Error.class)
	public void testObtenerDuracionError() {
		test.agregarPelicula("back to the future II", 108);
		Assert.assertNotEquals(224, test.obtenerDuracionTotal(), 0.1);
	}


}
