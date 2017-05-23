package com.mauro.librodeclases;

import java.util.Objects;

/**
 * Clase abstracta para su uso en subclases {@code Alumno}, {@code Apoderado} y
 * {@code Profesor} implementando atributos de nombre y rut.
 *
 * @author Mauricio Acencio
 * @see Alumno
 * @see Apoderado
 * @see Profesor
 */
public abstract class Persona {

    private final String nombre;
    private final String rut;

    /**
     * Devuelve el nombre solicitado de la persona represantada en este objeto.
     *
     * @return El nombre de la persona
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Devuelve el nombre solicitado de la persona represantada en este objeto.
     *
     * @return El nombre de la persona
     */
    public String getRut() {
        return this.rut;
    }

    /**
     * Crea un objeto de supertipo {@code Persona} a trav\u00e9s de una de las
     * subclases.
     *
     * @param nombre El nombre de la persona
     * @param rut El rut de la persona
     */
    protected Persona(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
    }

    /**
     * Genera el código hash de este objeto {@code Persona} a partir del
     * nombre y el rut.
     * @return El hash correspondiente a esta persona
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.nombre);
        hash = 67 * hash + Objects.hashCode(this.rut);
        return hash;
    }

    /**
     * Determina si dos objetos {@code Persona} son iguales a partir del
     * nombre y el rut.
     * @param obj El objeto {@code Persona} a comparar con \u00e9ste
     * @return {@code true} si dichos atributos coinciden, {@code false} de otro
     * modo
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.rut, other.rut);
    }
}
