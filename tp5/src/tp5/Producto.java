package tp5;

public class Producto {

	private double precio;
	private String nombre;

	public Producto(String nombre, double precio) {
		this.nombre=nombre;
		this.precio=precio;
	}
	
	public double getPrecio() {
		return this.precio;
	}

	public String getNombre() {
		return this.nombre;
	}
	
}
