package vehiculos;

import java.util.HashMap;
import java.util.Map;

public class Fabricante {
    private String nombre;
    private Pais pais;
    
    public Fabricante(String nombre, Pais pais) {
    	this.nombre = nombre;
    	this.pais = pais;
    }
    
    public String getNombre() {
    	return nombre;
    }
    public void setNombre(String nombre) {
    	this.nombre = nombre;
    }
    public Pais getPais() {
    	return pais;
    }
    public void setPais(Pais pais) {
    	this.pais = pais;
    }
    public static String fabricanteMayorVentas(Vehiculo[] vehiculos) {
        Map<String, Integer> ventasPorFabricante = new HashMap<>();

        for (Vehiculo vehiculo : vehiculos) {
            String nombreFabricante = vehiculo.getFabricante().getNombre();
            ventasPorFabricante.put(nombreFabricante, ventasPorFabricante.getOrDefault(nombreFabricante, 0) + 1);
        }

        int maxVentas = 0;
        String fabricanteMayorVentas = "";

        for (Map.Entry<String, Integer> entry : ventasPorFabricante.entrySet()) {
            if (entry.getValue() > maxVentas) {
                maxVentas = entry.getValue();
                fabricanteMayorVentas = entry.getKey();
            }
        }

        return fabricanteMayorVentas;
    }
}
