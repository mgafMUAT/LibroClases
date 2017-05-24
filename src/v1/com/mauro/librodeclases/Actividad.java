package v1.com.mauro.librodeclases;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 * Clase que representa una actividad registrada en un ramo.
 *
 * @author Mauricio Acencio
 * @see Ramo
 */
public class Actividad {

    private final String nombre;
    private final String tipo;
    private final String descripcion;
    private final GregorianCalendar fecha;
    private final boolean evaluado;
    private int ID;
    private static int idCount = 0;

    /**
     * Crea un nuevo registro de una actividad realizada en un ramo.
     *
     * @param nombre Nombre principal de la actividad
     * @param tipo El tipo de actividad que se desarrolla.
     * @param descripcion Una descripci\u00f3n a mayor detalle de la actividad.
     * @param fecha Fecha en que se realiza la actividad, en formato {@code
     * "dd-MM-yyyy"}
     * @param evaluado {@code true} si esta actividad va con nota, sino {@code
     * false}
     * @throws ParseException Si el formato de la fecha indicada no es correcta
     */
    public Actividad(String nombre, String tipo, String descripcion, String fecha,
            boolean evaluado) throws ParseException {
        this.nombre = nombre;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.fecha = (GregorianCalendar) GregorianCalendar.getInstance();
        this.fecha.setTime(new SimpleDateFormat("dd-MM-yyyy").parse(fecha));
        this.evaluado = evaluado;
        this.ID = ++idCount;
    }

    private void setID(int value) {
        this.ID = value;
    }

    /**
     * Devuelve el identificador del objeto utilizado en la BD.
     *
     * @return ID c\u00f3digo identificador
     */
    public int getID() {
        return ID;
    }
    
    /**
     * Devuelve el identificador del objeto utilizado en la BD.
     *
     * @return ID c\u00f3digo identificador
     */
    public int getORMID() {
        return getID();
    }

    /**
     * Devuelve el nombre de esta actividad.
     *
     * @return Nombre de la actividad
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el tipo de esta actividad que es \u00e9sta.
     *
     * @return Tipo de actividad
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Devuelve la descripci\u00f3n en detalle de esta actividad.
     *
     * @return Descripci\u00f3n de la actividad
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Devuelve la fecha en que se realiza esta actividad, formateada en un
     * arreglo de texto con \u00edndices correspondientes: 1 - d\u00eda; 2 -
     * mes; 3 - a\u00f1o.
     *
     * @return El arreglo de la fecha de la actividad.
     */
    public String[] getFecha() {
        return new String[]{
            Integer.toString(fecha.get(GregorianCalendar.DAY_OF_MONTH)),
            Integer.toString(fecha.get(GregorianCalendar.MONTH) + 1),
            Integer.toString(fecha.get(GregorianCalendar.YEAR))
        };
    }

    /**
     * Determina si esta actividad es evaluada o no.
     *
     * @return {@code true} si esta actividad va con nota, sino {@code false}
     */
    public boolean isEvaluado() {
        return evaluado;
    }
}
