package tp4;

public class ProductoPrimeraNecesidad extends Producto {

	public ProductoPrimeraNecesidad(String nombre, double precio, boolean pcuidado) {
		super (nombre, precio, pcuidado);
	}

	public Double getPrecio() {
		return super.getPrecio()*0.9;
	}

}
