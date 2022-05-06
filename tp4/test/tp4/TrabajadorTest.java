package tp4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class TrabajadorTest {

	private Trabajador trabajador;
	private Ingreso sueldo1;
	private IngresoHorasExtra sueldo2;
	private Ingreso sueldo3;
	
	
	@Before
	public void setUp() {
		sueldo1= new Ingreso("Marzo", "sueldo",30000);
		sueldo2= new IngresoHorasExtra("Abril", "bono", 35000, 5);
		sueldo3= new Ingreso("Mayo", "sueldo",30000);
		trabajador= new Trabajador();
		trabajador.añadirIngreso(sueldo1);
		trabajador.añadirIngreso(sueldo2);
	}
	
	@Test
	public void testGetTotalPercibido() {
		assertEquals(trabajador.getTotalPercibido(), 65000d);
	}
	
	@Test
	public void testAñadirIngreso() {
		trabajador.añadirIngreso(sueldo3);
		assertTrue(trabajador.getIngresos().contains(sueldo3));
	}
	
	@Test
	public void testGetMontoImponible() {
		assertEquals(30000d,trabajador.getMontoImponible());
	}
	
	@Test
	public void testGetImpuestoAPagar() {
		assertEquals(600d, trabajador.getImpuestoAPagar());
	}
	
}
