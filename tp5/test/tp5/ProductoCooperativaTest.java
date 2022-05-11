package tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;


public class ProductoCooperativaTest {

	private ProductoCooperativa arrozCoop;
	private ProductoCooperativa azucarCoop;
	
	@Before
	public void setUp() {
		arrozCoop= new ProductoCooperativa ("Arroz Cooperativa", 55d);
		azucarCoop= new ProductoCooperativa ("Azucar Cooperativa", 50d);
	}
	
	@Test
	public void testGetPrecio() {
		assertEquals (49.5d, arrozCoop.getPrecio());
		assertEquals (45d, azucarCoop.getPrecio());
	}
}
