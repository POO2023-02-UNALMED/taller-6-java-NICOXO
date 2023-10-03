package vehiculos;

public class Camion extends Vehiculo{
	private int ejes;
	
	private static int CantidadCamiones = 0;
	
	public Camion(int ejes, String placa, double precio, double peso, Fabricante fabricante) {
		super(placa, 2, 80, "Camion", precio, peso, "4x2", fabricante);
		this.ejes = ejes;
		CantidadCamiones++;
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
