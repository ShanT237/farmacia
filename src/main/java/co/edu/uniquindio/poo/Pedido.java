package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Pedido {
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

