package tp4;

import java.util.function.BooleanSupplier;

public class Producto {
	
	private String nombre;
	private double precio;
	private boolean pcuidado;
	
	public Producto(String nombre, double precio, boolean pcuidado) {
		this.nombre=nombre;
		this.precio=precio;
		this.pcuidado=pcuidado;
	}
	
	public Producto(String nombre, double precio) {
		this.nombre=nombre;
		this.precio=precio;
		this.pcuidado=false;
	}

	public Double getPrecio() {
		return this.precio;
	}

	public Object getNombre() {
		return this.nombre;
	}

	public boolean esPrecioCuidado() {
		
		return this.pcuidado;
	}

	public void aumentarPrecio(double aumento) {
		this.precio=this.precio+aumento;
	}
}
