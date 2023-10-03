package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Camioneta extends Vehiculo {
	private boolean volco;
	
	private static int CantidadCamionetas = 0; 
	private static List<Camioneta> camionetas = new ArrayList<>();
	
	public Camioneta(String placa, int puertas, String nombre, double precio, double peso, Fabricante fabricante, boolean volco) {
	    super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
	    this.volco = volco;
	    CantidadCamionetas++;
	    camionetas.add(this);
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
