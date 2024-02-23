package javadoc;

import java.util.ArrayList;
import java.util.List;


/**
 * Esta clase gestiona el personal de una empresa.
 * <br/>
 * Permite contratar, despedir, cambiar sueldo y obtener información sobre los empleados.
 * @author Illán Cristobo / Tunivers
 * @version 1.0, 2024/02/23
 */
public class GestorPersonal {

    /**
     * Lista que almacena los empleados gestionados por el gestor
     */
    private List<Empleado> empleados;

    /**
     * Constructor de la clase GestorPersonal
     * Inicializa la lista de empleados
     */
    public GestorPersonal() {
        empleados = new ArrayList<>();
    }

    /**
     * Contrata a un nuevo empleado y lo añade a la lista de empleados
     * @param empleado El empleado a ser contratado
     */
    public void contratar(Empleado empleado) {
        empleados.add(empleado);
    }

    /**
     * Despide a un empleado basándose en su ID
     * @param id El ID del empleado a ser despedido
     * @return da true si el empleado fue despedido y da false si no se encontró al empleado
     */
    public boolean despedir(String id) {
        return empleados.removeIf(e -> e.getId().equals(id));
    }

    /**
     * Cambia el sueldo de un empleado basándose en su ID
     * @param id el ID del empleado cuyo sueldo se va a cambiar
     * @param nuevoSueldo el nuevo sueldo que se asignará al empleado
     * @return true si se cambió el sueldo, false si no se encontró al empleado
     */
    public boolean cambiarSueldo(String id, double nuevoSueldo) {
        for (Empleado empleado : empleados) {
            if (empleado.getId().equals(id)) {
                empleado.setSueldo(nuevoSueldo);
                return true;
            }
        }
        return false;
    }

    /**
     * Obtiene una copia de la lista de empleados.
     * @return Lista de empleados gestionados por el gestor.
     */
    public List<Empleado> getEmpleados() {
        return new ArrayList<>(empleados);
    }
}
