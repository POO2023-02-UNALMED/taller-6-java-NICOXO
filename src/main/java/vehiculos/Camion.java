package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Camion extends Vehiculo{
	private int ejes;
	
	private static int CantidadCamiones = 0;
	private static List<Camion> camiones = new ArrayList<>();
	
	public Camion(String placa, String nombre, double precio, double peso, Fabricante fabricante, int ejes) {
	    super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
	    this.ejes = ejes;
	    CantidadCamiones++;
	    camiones.add(this);
	}
	public int getEjes() {
		return ejes;
	}
	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	public static int getCantidadCamiones() {
		return CantidadCamiones;
	}
}
