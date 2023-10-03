package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Automovil extends Vehiculo {
	private int puestos;
	
	private static int CantidadAutomoviles = 0;
	private static List<Automovil> automoviles = new ArrayList<>();
	
	public Automovil(String placa, String nombre, double precio, double peso, Fabricante fabricante, int puestos) {
	    super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
	    this.puestos = puestos;
	    CantidadAutomoviles++;
	    automoviles.add(this);
	}
	
	public int getPuestos() {
		return puestos;
	}
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	public static int getCantidadAutomoviles() {
		return CantidadAutomoviles;
	}
}
