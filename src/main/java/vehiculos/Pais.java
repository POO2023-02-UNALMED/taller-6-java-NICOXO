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
    public static String paisMasVendedor(Vehiculo[] vehiculos) {
        Map<String, Integer> ventasPorPais = new HashMap<>();

        for (Vehiculo vehiculo : vehiculos) {
            String nombrePaisFabricante = vehiculo.getFabricante().getPais().getNombre();
            ventasPorPais.put(nombrePaisFabricante, ventasPorPais.getOrDefault(nombrePaisFabricante, 0) + 1);
        }

        int maxVentas = 0;
        String paisMasVendedor = "";

        for (Map.Entry<String, Integer> entry : ventasPorPais.entrySet()) {
            if (entry.getValue() > maxVentas) {
                maxVentas = entry.getValue();
                paisMasVendedor = entry.getKey();
            }
        }

        return paisMasVendedor;
    }
}
