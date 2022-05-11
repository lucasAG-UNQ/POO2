package tp5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CajaTest {
	
	private Caja caja;
	private Mercado mercado;
	private Producto arroz;
	private Producto azucar;
	private ProductoCooperativa arrozCoop;
	private ProductoCooperativa azucarCoop;
	
	@Before
	public void setUp() {
		mercado= new Mercado();
		caja= new Caja(mercado);
		arroz= new Producto ("Arroz", 55d);
		azucar= new Producto ("Azucar", 50d);
		arrozCoop= new ProductoCooperativa ("Arroz Cooperativa", 55d);
		azucarCoop= new ProductoCooperativa ("Azucar Cooperativa", 50d);
		
		mercado.agregarProducto(arroz, 20);
		mercado.agregarProducto(azucar, 10);
		mercado.agregarProducto(azucarCoop, 100);
		mercado.agregarProducto(arrozCoop, 50);
	}
	
	@Test
	public void testRegistrarRegistraProductosAlTotal() {
		caja.registrar(arrozCoop);
		caja.registrar(azucar);
		
		assertEquals(99.5d,caja.getTotal());
		
	}
}
