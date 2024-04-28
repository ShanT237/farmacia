package co.edu.uniquindio.poo;

class CuidadoPersonal extends Producto {
    private String ingredientes;

    public CuidadoPersonal(String ID, String nombre, String descripcion, int precio, double cantidadStock, String IDProveedor, String ingredientes) {
        super(ID, nombre, descripcion, precio, cantidadStock, IDProveedor);
        this.ingredientes = ingredientes;
    }

    public String getIngredientes() {
        return ingredientes;
    }
}