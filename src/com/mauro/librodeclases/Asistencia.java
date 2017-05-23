package com.mauro.librodeclases;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 * Clase para representar el registro de asistencia de un Alumno. No es de
 * inter\u00e9s si el alumno abandona el curso o colegio
 *
 * @author Mauricio Acencio
 * @see Alumno
 */
public class Asistencia {
    
    private final GregorianCalendar fecha;
    private final boolean presente;
    private final int ID;
    private static int idCount = 0;

    /**
     * Genera un nuevo registro de asistencia.
     *
     * @param fecha Texto que representa la fecha en el formato
     * {@code "dd-MM-yyyy"}
     * @param presente Valor de asistencia ({@code true} = presente,
     * {@code false} = ausente)
     * @throws ParseException Si la fecha ingresada no es del formato correcto
     */
    public Asistencia(String fecha, boolean presente) throws ParseException  {
        GregorianCalendar cal = (GregorianCalendar) GregorianCalendar.getInstance();
        cal.setTime(new SimpleDateFormat("dd-MM-yyyy").parse(fecha));
        this.fecha = cal;
        this.presente = presente;
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
     * Devuelve la fecha de este registro, formateada en un arreglo de texto con
     * \u00edndices correspondientes: 1 - d\u00eda; 2 - mes; 3 - a\u00f1o.
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
     * Valor que consta si el alumno se ha presentado o no.
     *
     * @return Valor de asistencia ({@code true} = presente,
     * {@code false} = ausente)
     */
    public Boolean getPresente() {
        return presente;
    }
}
