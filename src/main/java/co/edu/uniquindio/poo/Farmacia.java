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

