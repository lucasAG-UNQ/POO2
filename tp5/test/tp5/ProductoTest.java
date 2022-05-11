package tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;

public class ProductoTest {

	private Producto arroz;
	private Producto azucar;
	
	@Before
	public void setUp() {
		arroz= new Producto ("Arroz", 55d);
		azucar= new Producto ("Azucar", 50d);
	}
	
	@Test
	public void testGetPrecio() {
		assertEquals (55d, arroz.getPrecio());
		assertEquals (50d, azucar.getPrecio());
	}
}
