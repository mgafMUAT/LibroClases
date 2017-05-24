package v1.com.mauro.librodeclases;

import java.util.ArrayList;

/**
 * Subclase que representa al apoderado de uno o m\u00e1s alumnos. Sólo es de
 * interés si tiene al menos un pupilo inscrito en el colegio.
 *
 * @author Mauricio Acencio
 * @see Alumno
 * @see Profesor
 */
public class Apoderado extends Persona {

    /**
     * Lista de alumnos que el apoderado tiene inscrito en un colegio
     */
    public ArrayList<Alumno> pupilos;
    private final int ID;
    private static int idCount = 0;

    /**
     * Genera un nuevo apoderado para el especificado alumno, el cual es parte
     * de la "construcci\u00f3n" de \u00e9ste.
     *
     * @param nombre El nombre del apoderado
     * @param rut El rut del apoderado
     * @param pupilo El {@code Alumno} que corresponde al pupilo del apoderado
     */
    public Apoderado(String nombre, String rut, Alumno pupilo) {
        super(nombre, rut);
        this.pupilos = new ArrayList<>();
        pupilos.add(pupilo);
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
     * Agrega un alumno como pupilo al apoderado ya existente.
     *
     * @param pupilo El {@code Alumno} que corresponde al pupilo del apoderado
     */
    public void agregarPupilo(Alumno pupilo) {
        pupilos.add(pupilo);
    }

    /**
     * Remueve un alumno de la lista de pupilos del apoderado porque el alumno
     * ya no est\u00e1 inscrito en un curso o colegio.
     *
     * @param pupilo El {@code Alumno} que corresponde al pupilo del apoderado
     */
    public void quitarPupilo(Alumno pupilo) {
        pupilos.remove(pupilo);
    }

    /**
     * Revisa si el apoderado se queda sin alumnos inscritos en un curso de un
     * colegio.
     *
     * @return {@code true} si s\u00f3lo tiene un pupilo inscritos en alg\u00fan
     * curso, {@code false} si tiene m\u00e1
     */
    public boolean soloUnPupilo() {
        return pupilos.size() == 1;
    }
}
