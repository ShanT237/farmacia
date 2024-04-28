package co.edu.uniquindio.poo;

public class Empleado extends Persona {
    private int salario;

    public Empleado(String ID, String nombre, String apellidos, String DNI, String direccion, String telefono, int salario) {
        super(ID, nombre, apellidos, DNI, direccion, telefono);
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

}