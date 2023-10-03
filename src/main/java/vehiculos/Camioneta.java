package vehiculos;

public class Camioneta extends Vehiculo {
	private boolean volco;
	
	private static int CantidadCamionetas = 0; 
	
	public Camioneta(boolean volco, String placa, int puertas,double precio, double peso, Fabricante fabricante) {
		super(placa, puertas, 90, "Camioneta", precio, peso, "4x4", fabricante);
		this.volco = volco;
		CantidadCamionetas++;
	}
	public boolean isVolco() {
		return volco;
	}
	public void setVolco(boolean volco) {
		this.volco = volco;
	}
	public static int getCantidadCamionetas() {
		return CantidadCamionetas;
	}
}
