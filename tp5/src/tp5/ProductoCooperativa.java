package tp5;

public class ProductoCooperativa extends Producto{

	public ProductoCooperativa(String nombre, double precio) {
		super(nombre, precio);
	}

	public double getPrecio() {
		return super.getPrecio() * 0.9;
	}
	
}
