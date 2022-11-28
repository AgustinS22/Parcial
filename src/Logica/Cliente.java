package Logica;

public class Cliente {
	private String nombre;
	private Tarjeta tarjeta;
	private int DNI;
	public Cliente(String nombre, Tarjeta tarjeta, int dNI) {
		super();
		this.nombre = nombre;
		this.tarjeta = tarjeta;
		DNI = dNI;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Tarjeta getTarjeta() {
		return tarjeta;
	}
	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}
	public int getDNI() {
		return DNI;
	}
	public void setDNI(int dNI) {
		DNI = dNI;
	}
	@Override
	public String toString() {
		return "Socio [nombre=" + nombre + ", tarjeta=" + tarjeta + ", DNI=" + DNI + "]";
	}
	
}
