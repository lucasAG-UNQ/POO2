package tp5;

public class Caja {
	
	private double total;
	private Mercado mercado;

	public Caja(Mercado mercado) {
		this.mercado=mercado;
		this.total=0;
	}
	
	public void registrar(Producto p) {
		this.total= total + p.getPrecio();
		this.mercado.quitarUnoAStock(p);
	}
	
	public Double getTotal() {
		return this.total;
	}
	
}
