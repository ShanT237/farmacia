package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Farmacia {
    public static Object drogueria;
    private String nombre;
    private List<Empleado> empleados;
    private List<Cliente> clientes;
    private List<Producto> productos;
    private List<Pedido> pedidos;

    public Farmacia(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.productos = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }
    public String getNombre(){
        return nombre;
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }
}

abstract class Persona {
    private String ID;
    private String nombre;
    private String apellidos;
    private String DNI;
    private String direccion;
    private String telefono;

    public Persona(String ID, String nombre, String apellidos, String DNI, String direccion, String telefono) {
        this.ID = ID;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    // Getters y setters
    public String getID(){
        return ID;
    }
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }
}

class Empleado extends Persona {
    private int salario;

    public Empleado(String ID, String nombre, String apellidos, String DNI, String direccion, String telefono, int salario) {
        super(ID, nombre, apellidos, DNI, direccion, telefono);
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

}

class Cliente extends Persona {
    public Cliente(String ID, String nombre, String apellidos, String DNI, String direccion, String telefono) {
        super(ID, nombre, apellidos, DNI, direccion, telefono);
    }


}

class Gerente extends Empleado {
    public Gerente(String ID, String nombre, String apellidos, String DNI, String direccion, String telefono, int salario) {
        super(ID, nombre, apellidos, DNI, direccion, telefono, salario);
    }
}

abstract class Producto {
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

class Hogar extends Producto {
    private String indicaciones;

    public Hogar(String ID, String nombre, String descripcion, int precio, double cantidadStock, String IDProveedor, String indicaciones) {
        super(ID, nombre, descripcion, precio, cantidadStock, IDProveedor);
        this.indicaciones = indicaciones;
    }

    public String getIndicaciones() {
        return indicaciones;
    }
}

class Pedido {
    private String IDPedido;
    private double cantidadProducto;
    private String productoAsociado;
    private LocalDate fecha;
    private String clienteAsociado;

    public Pedido(String ID, double cantidadProducto, String productoAsociado, LocalDate fecha, String clienteAsociado) {
        this.IDPedido = IDPedido;
        this.cantidadProducto = cantidadProducto;
        this.productoAsociado = productoAsociado;
        this.fecha = fecha;
        this.clienteAsociado = clienteAsociado;
    }

    public String getIDPedido() {
        return IDPedido;
    }

    public double getCantidadProducto() {
        return cantidadProducto;
    }

    public String getProductoAsociado() {
        return productoAsociado;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getClienteAsociado() {
        return clienteAsociado;
    }
}


