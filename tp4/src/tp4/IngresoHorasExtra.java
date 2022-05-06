package tp4;

public class IngresoHorasExtra extends Ingreso{

	private int horasExtra;

	public IngresoHorasExtra(String mes, String concepto, int monto, int horasExtra) {
		super(mes,concepto,monto);
		this.horasExtra=horasExtra;
	}

	@Override
	public double montoImponible() {
		return 0;
	}
}
