package co.edu.uniquindio.poo;

public abstract class Producto {
    private String IDPedido;
    private String nombre;
    private String descripcion;
    private int precio;
    private double cantidadStock;
    private String IDProveedor;

    public Producto(String IDPedido, String nombre, String descripcion, int precio, double cantidadStock, String IDProveedor) {
        this.IDPedido = IDPedido;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
        this.IDProveedor = IDProveedor;
    }

    // Getters y setters
    public String getIDPedido() {
        return IDPedido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public double getCantidadStock() {
        return cantidadStock;
    }

    public String getIDProveedor() {
        return IDProveedor;
    }
}
