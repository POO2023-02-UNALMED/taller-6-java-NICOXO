package vehiculos;

import java.util.HashMap;
import java.util.Map;

public class Vehiculo {
    private String placa;
    private int puertas;
    private int velocidadMaxima;
    private String nombre;
    private double precio;
    private double peso;
    private String traccion;
    private Fabricante fabricante;
    private static int CantidadVehiculos = 0;
    
    public Vehiculo(String placa,int puertas,int velocidadMaxima,String nombre,double precio,double peso,String traccion,Fabricante fabricante) {
    	this.placa = placa;
    	this.puertas = puertas;
    	this.velocidadMaxima = velocidadMaxima;
    	this.nombre = nombre;
    	this.precio = precio;
    	this.peso = peso;
    	this.traccion = traccion;
    	this.fabricante = fabricante;
    	CantidadVehiculos++;
    }
    public String getPlaca() {
    	return placa;
    }
    public void setPlacta(String placa) {
    	this.placa = placa;
    }
    public int getPuertas() {
    	return puertas;
    }
    public void setPuetas(int puertas) {
    	this.puertas = puertas;
    }
    public int getVelocidadMaxima() {
    	return velocidadMaxima;
    }
    public void setVelocidadMaxima(int velocidadMaxima) {
    	this.velocidadMaxima = velocidadMaxima;
    }
    public String getNombre() {
    	return nombre;
    }
    public void setNombre(String nombre) {
    	this.nombre = nombre;
    }
    public double getPrecio() {
    	return precio;
    }
    public void setPrecio(double precio) {
    	this.precio = precio;
    }
    public double getPeso() {
    	return peso;
    }
    public void setPeso(double peso) {
    	this.peso = peso;
    }
    public String getTraccion() {
    	return traccion;
    }
    public void setTraccion(String traccion) {
    	this.traccion = traccion;
    }
    public Fabricante getFabricante() {
    	return fabricante;
    }
    public void setFabricante(Fabricante fabricante) {
    	this.fabricante = fabricante;
    }
    public static int getCantidadVehiculos() {
    	return CantidadVehiculos;
    }
    public static void setCantidadVehiculos(int cantidadVehiculos) {
    	CantidadVehiculos = cantidadVehiculos;
    }
    public static String vehiculosPorTipo() {
    	return String.format("Automoviles: %d\nCamionetas: %d\nCamiones: %d", Automovil.getCantidadAutomoviles(), Camioneta.getCantidadCamionetas(), Camion.getCantidadCamiones());
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

