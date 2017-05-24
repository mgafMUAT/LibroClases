package v1.com.mauro.librodeclases;

/**
 * Subclase que representa al profesor que hace clases en el colegio
 *
 * @author Mauricio Acencio
 * @see Alumno
 * @see Apoderado
 */
public class Profesor extends Persona {

    public Ramo ramo;
    public Colegio colegio;
    private final int ID;
    private static int idCount = 0;

    private void this_setOwner(Object owner, int key) {
        if (key == v1.com.mauro.librodeclases.ORMConstants.KEY_PROFESOR_RAMO) {
            this.ramo = (v1.com.mauro.librodeclases.Ramo) owner;
        } else if (key == v1.com.mauro.librodeclases.ORMConstants.KEY_PROFESOR_COLEGIO) {
            this.colegio = (v1.com.mauro.librodeclases.Colegio) owner;
        }
    }

    org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
        public void setOwner(Object owner, int key) {
            this_setOwner(owner, key);
        }

    };

    /**
     * Genera un nuevo profesor
     *
     * @param nombre El nombre del profesor
     * @param rut El rut del profesor
     */
    public Profesor(String nombre, String rut) {
        super(nombre, rut);
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
}
