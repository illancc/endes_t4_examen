package javadoc;

/**
 * Esta clase representa a un empleado.
 * <br/>
 * Contiene información como el nombre, ID y sueldo.
 * @author Illán Cristobo / Tunivers
 * @version 1.0, 2024/02/23
 */
public class Empleado {
    // Atributos de la clase

    /**
     *  Nombre del empleado
     */
    private String nombre;

    /**
     *ID del empleado
     */
    private String id;

    /**
     * Sueldo del empleado
     */
    private double sueldo;

    /**
     * Constructor de la clase Empleado
     * @param nombre Nombre del empleado
     * @param id ID del empleado
     * @param sueldo Sueldo del empleado
     */
    public Empleado(String nombre, String id, double sueldo) {
        this.nombre = nombre;
        this.id = id;
        this.sueldo = sueldo;
    }

    /**
     * Obtiene el nombre del empleado
     * @return el nombre del empleado
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del empleado
     * @param nombre el nuevo nombre del empleado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el ID del empleado
     * @return El ID del empleado
     */
    public String getId() {
        return id;
    }

    /**
     * Obtiene el sueldo del empleado
     * @return El sueldo del empleado
     */
    public double getSueldo() {
        return sueldo;
    }

    /**
     * Establece el sueldo del empleado
     * @param sueldo El nuevo sueldo del empleado
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * Incrementa el sueldo del empleado
     * @param incremento Cantidad en la que se incrementa el sueldo
     */
    public void incrementarSueldo(double incremento) {
        this.sueldo += incremento;
    }

    /**
     * Representación en cadena de la clase Empleado
     * @return Cadena que representa al empleado
     */
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}
