package tp4;

public class ProductoPrimeraNecesidad extends Producto {

	private int descuento;


	public ProductoPrimeraNecesidad(String nombre, double precio, boolean pcuidado) {
		super (nombre, precio, pcuidado);
		this.descuento=10;
	}
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean pcuidado, int descuento) {
		super (nombre, precio, pcuidado);
		this.descuento=descuento;
	}
	

	public Double getPrecio() {
		return super.getPrecio()* this.descuentoAplicado();
	}

	private Double descuentoAplicado() {
		return 1d - this.descuento/100d ;
	}

}
