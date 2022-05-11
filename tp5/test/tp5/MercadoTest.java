package tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;

public class MercadoTest {
	
	private Mercado mercado;
	private Producto arroz;
	private Producto azucar;
	private ProductoCooperativa arrozCoop;
	private ProductoCooperativa azucarCoop;
	
	@Before
	public void setUp() {
		mercado= new Mercado();
		arroz= new Producto ("Arroz", 55d);
		azucar= new Producto ("Azucar", 50d);
		arrozCoop= new ProductoCooperativa ("Arroz Cooperativa", 55d);
		azucarCoop= new ProductoCooperativa ("Azucar Cooperativa", 50d);
		
		mercado.agregarProducto(arroz, 20);
		mercado.agregarProducto(azucar, 10);
		mercado.agregarProducto(azucarCoop, 100);
	}
	
	@Test
	public void testAgregarProducto() {
		mercado.agregarProducto(arrozCoop, 50);
		assertEquals(50, mercado.getStock().get(arrozCoop));

		mercado.agregarProducto(arrozCoop, 50);
		assertEquals(100, mercado.getStock().get(arrozCoop));
	}
	
	@Test
	public void testQuitarStock() {
		mercado.quitarUnoAStock(azucarCoop);
		assertEquals(99, mercado.getStock().get(azucarCoop));
	}
	
	
}
