package tp5;

import java.util.HashMap;

public class Mercado {
	
	private HashMap<Producto,Integer> stock;
	
	public Mercado() {
		this.stock= new HashMap<Producto,Integer> ();
	}
	
	public Mercado(HashMap<Producto,Integer> stock) {
		this.stock=stock;
	}

	public void agregarProducto(Producto p, int cantidad) {
		this.stock.merge(p, cantidad, 						//clave a buscar o poner si esta ausente
							(key, value) -> value+cantidad);//funcion si esta presente
	}
	
	public void quitarUnoAStock(Producto p) {
		this.stock.compute(p, (key, val) -> val-1); //reduce en 1 el stock del producto p
	}
	
	public HashMap<Producto, Integer> getStock() {
		return this.stock;
	}
	
}
