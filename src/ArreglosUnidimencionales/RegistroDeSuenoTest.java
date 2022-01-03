package ArreglosUnidimencionales;
import org.junit.*;
class RegistroDeSuenoTest {

	RegistroDeSueno test;
	
	@Before
	public void creacion () {
		test = new RegistroDeSueno(5);
		test.agregarCantHs(6, false);
		test.agregarCantHs(6, false);
		test.agregarCantHs(8, true);
		test.agregarCantHs(8, true);
		test.agregarCantHs(6, false);
	}
	@Test
	public void testPromedio() {
		Assert.assertEquals(6.8, test.calcularPromedioDiarioDeHsDormidas(), 0.01);
	}
	@Test
	public void testContarCantidadDeDiasQueSeDurmioMasHsQueElPromedio() {
		Assert.assertTrue(2==test.contarCantidadDeDiasQueSeDurmioMasHsQueElPromedio());
	}
	@Test	(expected = Error.class)
	public void testContarDiasSinInterrupcionDurante() {
		Assert.assertEquals(5, test.contarDiasSinInterrupcionDurante(0.0, 6.0));

	}
}
