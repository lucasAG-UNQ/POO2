package tp4;

import java.util.ArrayList;

public class Supermercado {

	private String nombre;
	private String calle;
	private ArrayList<Producto> productos;

	public Supermercado(String nombre, String calle) {
		this.nombre=nombre;
		this.calle=calle;
		this.productos= new ArrayList<Producto>();
	}

	public Integer getCantidadDeProductos() {
		return this.productos.size();
	}

	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}

	public Double getPrecioTotal() {
		double total=0;
		total=this.productos.stream().mapToDouble(prod -> prod.getPrecio()).sum();
		
		return total;
	}

}
