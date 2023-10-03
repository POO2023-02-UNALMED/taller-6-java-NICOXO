package vehiculos;

import java.util.HashMap;
import java.util.Map;

public class Pais {
    private String nombre;
    
    public Pais (String nombre) {
    	this.nombre = nombre;
    }
    public String getNombre() {
    	return nombre;
    }
    public void setNombre(String nombre) {
    	this.nombre = nombre;
    }
    public static Pais paisMasVendedor() {
        Map<Pais, Integer> ventasPorPais = new HashMap<>();

        for (Vehiculo vehiculo : Vehiculo.getCreados()) {
            Fabricante fabricante = vehiculo.getFabricante();
            Pais paisFabricante = fabricante.getPais();
            ventasPorPais.put(paisFabricante, ventasPorPais.getOrDefault(paisFabricante, 0) + 1);
        }

        int maxVentas = 0;
        Pais paisMasVendedor = null;

        for (Map.Entry<Pais, Integer> entry : ventasPorPais.entrySet()) {
            if (entry.getValue() > maxVentas) {
                maxVentas = entry.getValue();
                paisMasVendedor = entry.getKey();
            }
        }

        return paisMasVendedor;
    }
}
