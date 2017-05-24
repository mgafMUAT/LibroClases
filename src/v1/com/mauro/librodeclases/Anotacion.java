package v1.com.mauro.librodeclases;

/**
 * Clase que representa una anotación en la lista de anotaciones de un alumno.
 *
 * @author Mauricio Acencio
 * @see Alumno
 */
public class Anotacion {

    private final String observacion;
    private final boolean esPositiva;
    private final int ID;
    private static int idCount = 0;

    /**
     * Genera una nueva anotaci\u00f3n compuesta de una descripci\u00f3n
     * detallada junto a su valor (positiva o negativa).
     *
     * @param observacion Descripci\u00f3n de la observaci\u00f3n que se hace
     * del alumno
     * @param esPositiva Valor de la anotaci\u00f3n ({@code true} = positiva,
     * {@code false} = negativa)
     */
    public Anotacion(String observacion, boolean esPositiva) {
        this.observacion = observacion;
        this.esPositiva = esPositiva;
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
     * Devuelve el correspondeinte valor de la anotaci\u00f3n
     *
     * @return El valor de la anotaci\u00f3n ({@code true} = positiva,
     * {@code false} = negativa)
     */
    public boolean esPositiva() {
        return esPositiva;
    }

    /**
     * Devuelve la descripci\u00f3n de la observaci\u00f3n del alumno.
     *
     * @return La observaci\u00f3n en texto
     */
    public String getObservacion() {
        return observacion;
    }

    /**
     * Devuelve el valor en {@code String} de esta anotaci\u00f3n.
     *
     * @return Representaci\u00f3n en texto de la anotaci\u00f3n
     */
    @Override
    public String toString() {
        return (this.esPositiva ? "+" : "-") + ": " + this.observacion;
    }
}
