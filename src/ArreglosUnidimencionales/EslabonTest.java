package ArreglosUnidimencionales;
import org.junit.*;
/**
 * 
 */

/**
 * @author cristianmartinez
 */
public class EslabonTest {

	Eslabon test;

	@Before
	public void crear() {
		test= new Eslabon (10,2.0);

	}

	@Test
	public void testContar() {
		Assert.assertTrue(10 == test.obtenerNumero());
	}
	@Test
	public void testLogitud() {
		Assert.assertEquals(2.0, test.obtenerLongitud(), 0.01);
	}
	@Test
	public void testCambiarLongitud() {
		Assert.assertEquals(4.0, test.cambiarLongitud(4.0), 0.01);
	}
}
