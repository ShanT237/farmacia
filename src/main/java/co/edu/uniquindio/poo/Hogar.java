package co.edu.uniquindio.poo;

public class Hogar extends Producto {
    private String indicaciones;

    public Hogar(String ID, String nombre, String descripcion, int precio, double cantidadStock, String IDProveedor, String indicaciones) {
        super(ID, nombre, descripcion, precio, cantidadStock, IDProveedor);
        this.indicaciones = indicaciones;
    }

    public String getIndicaciones() {
        return indicaciones;
    }
}