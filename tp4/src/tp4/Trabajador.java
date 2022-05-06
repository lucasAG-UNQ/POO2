package tp4;

import java.util.ArrayList;

public class Trabajador {
	
	private ArrayList<Ingreso> ingresos;
	
	public Trabajador() {
		ingresos=new ArrayList<Ingreso>();
	}

	public void añadirIngreso(Ingreso sueldo) {
		this.ingresos.add(sueldo);
	}

	public ArrayList<Ingreso> getIngresos() {
		return this.ingresos;
	}

	public Double getTotalPercibido() {
		double total=0;
		total= this.ingresos.stream().mapToDouble(ingreso -> ingreso.getMonto()).sum();
		return total;
	}

	public Double getMontoImponible() {
		double total=0;
		total= this.ingresos.stream().mapToDouble(ingreso -> ingreso.montoImponible()).sum();
		return total;
	}

	public Double getImpuestoAPagar() {
		return this.getMontoImponible()*0.02;
	}

}
