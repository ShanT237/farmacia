package co.edu.uniquindio.poo;

class Medicamento extends Producto {
    private double dosis;

    public Medicamento(String ID, String nombre, String descripcion, int precio, double cantidadStock, String IDProveedor, double dosis) {
        super(ID, nombre, descripcion, precio, cantidadStock, IDProveedor);
        this.dosis = dosis;
    }

    public double getDosis() {
        return dosis;
    }
}