package tp4;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	private ProductoPrimeraNecesidad arrozDescuento;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false);
		arrozDescuento= new ProductoPrimeraNecesidad("Arroz", 10d, false, 20);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(new Double(7.2), leche.getPrecio());
	}
	
	@Test
	public void testProductoDescuentoPersonalizado(){
		assertEquals(8d, arrozDescuento.getPrecio());
	}
	
}
