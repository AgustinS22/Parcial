package Logica;

public class Venta {
	private int ID;
	private Cafe cafe;
	private int cantidad;
	private Tarjeta tarjeta;
	private double precio_total;
	public Venta(int iD, Cafe cafe, int cantidad, Tarjeta tarjeta) {
		super();
		ID = iD;
		this.cafe = cafe;
		this.cantidad = cantidad;
		this.tarjeta = tarjeta;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public Cafe getCafe() {
		return cafe;
	}
	public void setCafe(Cafe cafe) {
		this.cafe = cafe;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Tarjeta getTarjeta() {
		return tarjeta;
	}
	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}
	@Override
	public String toString() {
		return "Venta [ID=" + ID + ", cafe=" + cafe + ", cantidad=" + cantidad + ", tarjeta=" + tarjeta + "]";
	}
	
}
