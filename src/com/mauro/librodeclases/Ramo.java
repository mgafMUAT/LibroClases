package com.mauro.librodeclases;

import java.util.ArrayList;

/**
 * Clase que representa una asignatura de un curso.
 *
 * @author Mauricio Acencio
 * @see Curso
 */
public class Ramo {

    private final Profesor profesor;
    private final String nombre;
    public ArrayList<Actividad> planificacion;
    private final int ID;
    private static int idCount = 0;

    /**
     * Genera una nueva asignatura en conjunto a su debido profesor.
     *
     * @param nombre El nombre del ramo
     * @param profesor El {@code Profesor} que ha de impartir el ramo.
     */
    public Ramo(String nombre, Profesor profesor) {
        this.planificacion = new ArrayList<>();
        this.nombre = nombre;
        this.profesor = profesor;
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
     * Devuelve el objeto del {@code Profesor} que imparte el ramo.
     *
     * @return El profesor del ramo.
     */
    public Profesor getProfesor() {
        return profesor;
    }

    /**
     * Retorna el nombre correspondiente al ramo.
     *
     * @return El nombre del ramo
     */
    public String getNombre() {
        return nombre;
    }
    
}
