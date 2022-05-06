package tp4;

public class Ingreso {

	private String mes;
	private String concepto;
	private double monto;

	public Ingreso(String mes, String concepto, double monto) {
		this.mes=mes;
		this.concepto=concepto;
		this.monto=monto;
	}

	public double getMonto() {
		return this.monto;
	}

	public double montoImponible() {
		return this.monto;
	}

}
