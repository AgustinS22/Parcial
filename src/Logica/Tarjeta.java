package Logica;

public class Tarjeta {
	private int nro_tarjeta;
	private boolean descuento;
	public Tarjeta(int nro_tarjeta, boolean descuento) {
		super();
		this.nro_tarjeta = nro_tarjeta;
		this.descuento = descuento;
	}
	public int getNro_tarjeta() {
		return nro_tarjeta;
	}
	public void setNro_tarjeta(int nro_tarjeta) {
		this.nro_tarjeta = nro_tarjeta;
	}
	public boolean isDescuento() {
		return descuento;
	}
	public void setDescuento(boolean descuento) {
		this.descuento = descuento;
	}
	@Override
	public String toString() {
		return "Tarjeta [nro_tarjeta=" + nro_tarjeta + ", descuento=" + descuento + "]";
	}
	
}
