package co.edu.uniquindio.poo;

public abstract class Persona {
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