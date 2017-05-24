package v1.com.mauro.librodeclases;

import java.util.ArrayList;

/**
 * Clase que representa un colegio al cual se le registran los datos del libro
 * de clases.
 *
 * @author Mauricio Acencio
 */
public class Colegio {

    private final String nombre;
    private final String direccion;
    public ArrayList<Curso> cursos;
    public ArrayList<Profesor> profesores = new ArrayList<>();
    private final int ID;
    private static int idCount = 0;

    /**
     * Genera un nuevo colegio a partir del nombre y direcci\u00f3n.
     *
     * @param nombre El nombre del Colegio
     * @param direccion La direcci\u00f3n del colegio
     * @see Curso
     */
    public Colegio(String nombre, String direccion) {
        this.cursos = new ArrayList<>();
        this.nombre = nombre;
        this.direccion = direccion;
        this.ID = ++idCount;
    }

    /**
     * C\u00f3digo de identificaci\u00f3n del objeto
     *
     * @return El ID del objeto
     */
    public int getID() {
        return ID;
    }

    /**
     * Genera autom\u00e1ticamente los correspondientes cursos a y b del 1 al 8.
     */
    public void generarCursos() {
        for (byte i = 1; i < 9; i++) {
            this.cursos.add(new Curso(i, 'A'));
            this.cursos.add(new Curso(i, 'B'));
        }
        cursos.forEach((curso) -> {
            curso.colegio = this;
        });
    }
    
    /**
     * Solicita el nombre del colegio.
     *
     * @return El nombre del colegio
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Solicita la direcci\u00f3n del colegio.
     *
     * @return La direcci\u00f3n del colegio
     */
    public String getDireccion() {
        return direccion;
    }
}
