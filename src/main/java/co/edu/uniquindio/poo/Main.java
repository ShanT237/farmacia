package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Farmacia drogueria = new Farmacia("Droguería Buena Vida");
        System.out.println(drogueria.getNombre());
        System.out.println("\n");

        Empleado empleado1 = new Empleado("122", "Juan", "Pérez", "12345678", "Calle 123", "1234567890", 1500000);
        Empleado empleado2 = new Empleado("911", "María", "López", "87654321", "Carrera 456", "0987654321", 1800000);

        drogueria.agregarEmpleado(empleado1);
        drogueria.agregarEmpleado(empleado2);

        Cliente cliente1 = new Cliente("A001", "Carlos", "Gómez", "98765432", "Avenida 789", "6789012345");
        Cliente cliente2 = new Cliente("A002", "Laura", "García", "23456789", "Transversal 567", "7890123456");

        drogueria.agregarCliente(cliente1);
        drogueria.agregarCliente(cliente2);

        Medicamento medicamento1 = new Medicamento("M001", "Paracetamol", "Alivia el dolor", 5000, 100, "P001", 500);
        Medicamento medicamento2 = new Medicamento("M002", "Ibuprofeno", "Antiinflamatorio", 7000, 80, "P002", 400);
        CuidadoPersonal cuidadoPersonal1 = new CuidadoPersonal("C001", "Shampoo", "Para cabello normal", 10000, 50,
                "P003", "Aloe vera");
        Hogar hogar1 = new Hogar("H001", "Detergente", "Limpieza profunda", 8000, 60, "P004", "Uso en lavadora");

        drogueria.agregarProducto(medicamento1);
        drogueria.agregarProducto(medicamento2);
        drogueria.agregarProducto(cuidadoPersonal1);
        drogueria.agregarProducto(hogar1);

        Pedido pedido1 = new Pedido("P001", 2, "Paracetamol", LocalDate.now(), "A001");
        Pedido pedido2 = new Pedido("P002", 3, "Ibuprofeno", LocalDate.now(), "A002");

        drogueria.agregarPedido(pedido1);
        drogueria.agregarPedido(pedido2);

        System.out.println("Empleados:");
        for (Empleado empleado : drogueria.getEmpleados()) {
            System.out.println("ID: " + empleado.getID());
            System.out.println("Nombre: " + empleado.getNombre() + " " + empleado.getApellidos());
            System.out.println("DNI: " + empleado.getDNI());
            System.out.println("Salario: " + empleado.getSalario());
            System.out.println();
        }

        System.out.println("Clientes:");
        for (Cliente cliente : drogueria.getClientes()) {
            System.out.println("ID: " + cliente.getID());
            System.out.println("Nombre: " + cliente.getNombre() + " " + cliente.getApellidos());
            System.out.println("DNI: " + cliente.getDNI());
            System.out.println("Teléfono: " + cliente.getTelefono());
            System.out.println();
        }

        System.out.println("Productos:");
        for (Producto producto : drogueria.getProductos()) {
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("Cantidad en stock: " + producto.getCantidadStock());
            System.out.println();
        }

        System.out.println("Pedidos:");
        for (Pedido pedido : drogueria.getPedidos()) {
            System.out.println("ID: " + pedido.getIDPedido());
            System.out.println("Fecha: " + pedido.getFecha());
            System.out.println("Producto asociado: " + pedido.getProductoAsociado());
            System.out.println("Cantidad: " + pedido.getCantidadProducto());
            System.out.println("Cliente asociado: " + pedido.getClienteAsociado());
            System.out.println();
        }
    }
}
