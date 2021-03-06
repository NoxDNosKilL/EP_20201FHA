package BEAN;
public class Empleado {
    private int idEmpleado;
    private String apellido;
    private String nombre;
    private String dni;

    public Empleado() {
    }

    public Empleado(int idEmpleado, String apellido, String nombre, String dni) {
        this.idEmpleado = idEmpleado;
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Empleado{" + "idEmpleado=" + idEmpleado + ", apellido=" + apellido + ", nombre=" + nombre + ", dni=" + dni + '}';
    }
    
           
}
