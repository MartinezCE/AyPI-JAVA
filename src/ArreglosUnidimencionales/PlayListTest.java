package ArreglosUnidimencionales;
//import static org.junit.Assert.*;
import org.junit.*;

//import org.junit.Test;


public class PlayListTest {

	PlayList test;

	@Before
	public void creacion() {

		test = new PlayList (5);
		test.agregarCancion("Arjona", 1);
		test.agregarCancion("LedZeppeling", 2);
		test.agregarCancion("ACDC", 3);
		test.agregarCancion("LosAngelesAzules", 10);
		test.agregarCancion("Pappo", 100);

	}

	@Test
	public void getCancionTest () {

		Assert.assertEquals("ACDC", test.obtenerTitulo(3), "ACDC");
	}

}
