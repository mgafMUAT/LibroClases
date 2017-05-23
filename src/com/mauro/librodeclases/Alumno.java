package com.mauro.librodeclases;

import java.util.ArrayList;
import java.util.Set;

/**
 * Subclase que representa al alumno de un colegio, junto a su a\u00f1o de
 * ingreso, nº de matr\u00edcula, curso al que pertenece, registro de
 * asistencia, listado de anotaciones y su correspondiente apoderado.
 *
 * @author Mauricio Acencio
 * @see Profesor
 * @see Apoderado
 */
public class Alumno extends Persona {

    private final int ingreso;
    private final String matricula;
    private Set ORM_anotaciones;
    private final int ID;
    private static int idCount = 0;

    private java.util.Set this_getSet(int key) {
        if (key == com.mauro.librodeclases.ORMConstants.KEY_ALUMNO_ANOTACIONES) {
            return ORM_anotaciones;
        }

        return null;
    }

    private void this_setOwner(Object owner, int key) {
        if (key == com.mauro.librodeclases.ORMConstants.KEY_ALUMNO_CURSO) {
            this.curso = (com.mauro.librodeclases.Curso) owner;
        } else if (key == com.mauro.librodeclases.ORMConstants.KEY_ALUMNO_REGISTRO) {
            this.registro.add((com.mauro.librodeclases.Asistencia) owner);
        } else if (key == com.mauro.librodeclases.ORMConstants.KEY_ALUMNO_APODERADO) {
            this.apoderado = (com.mauro.librodeclases.Apoderado) owner;
        } else if (key == com.mauro.librodeclases.ORMConstants.KEY_ALUMNO_NOTA) {
            com.mauro.librodeclases.Nota nota = (com.mauro.librodeclases.Nota) owner;
            this.notas.add(nota.getNota());
        }
    }

    org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
        public java.util.Set getSet(int key) {
            return this_getSet(key);
        }

        public void setOwner(Object owner, int key) {
            this_setOwner(owner, key);
        }

    };

    /**
     * C\u00f3digo de identificaci\u00f3n del objeto
     *
     * @return El ID del objeto
     */
    public int getID() {
        return ID;
    }

    /**
     * Curso al que pertenece el alumno.
     */
    public Curso curso;

    /**
     * Registro de notas del alumno.
     */
    public ArrayList<Float> notas;

    /**
     * Registro de asistencia del alumno.
     */
    public ArrayList<Asistencia> registro;

    /**
     * Apoderado del alumno. No es de inter\u00e9s si el alumno se desinscribe.
     */
    public Apoderado apoderado;

    /**
     * Registro de anotaciones de este alumno.
     */
    public ArrayList<Anotacion> anotaciones = new ArrayList<>();

    /**
     * Genera un alumno nuevo, generando la matrícula a partir del rut y el año
     * de ingreso de dicho alumno. Se incluyen los datos del apoderado si
     * \u00e9ste no ha sido ingresado al libro antes (No tiene otros pupilos en
     * el mismo o en otro colegio).
     *
     * @param nombre El nombre del alumno
     * @param rut El rut del alumno
     * @param ingreso El año (completo, ej.: 2017) de ingreso al establecimiento
     * del alumno
     * @param nomApod El nombre del apoderado
     * @param rutApod El rut del apoderado
     */
    public Alumno(String nombre, String rut, int ingreso, String nomApod, String rutApod) {
        super(nombre, rut);
        this.notas = new ArrayList<>();
        this.registro = new ArrayList<>();
        this.ingreso = ingreso;
        this.matricula = rut + ingreso % 100;
        this.apoderado = new Apoderado(nomApod, rutApod, this);
        this.ID = ++idCount;
    }

    /**
     * Genera un alumno nuevo, generando la matrícula a partir del rut y el año
     * de ingreso de dicho alumno. Se incluye al apoderado si \u00e9ste ya ha
     * sido ingresado al libro antes (Ya tiene otros pupilos en el mismo o en
     * otro colegio).
     *
     * @param nombre El nombre del alumno
     * @param rut El rut del alumno
     * @param ingreso El año (completo, ej.: 2017) de ingreso al establecimiento
     * del alumno
     * @param apoderado El apoderado del alumno, que ya ha sido ingresado antes
     */
    public Alumno(String nombre, String rut, int ingreso, Apoderado apoderado) {
        super(nombre, rut);
        this.notas = new ArrayList<>();
        this.registro = new ArrayList<>();
        this.ingreso = ingreso;
        this.matricula = rut + ingreso % 100;
        this.apoderado = apoderado;
        this.apoderado.agregarPupilo(this);
        this.ID = ++idCount;
    }

    /**
     * Retorna el a\u00f1o de ingreso del alumno.
     *
     * @return El a\u00f1o de ingreso
     */
    public int getIngreso() {
        return ingreso;
    }

    /**
     * Retorna la serie de matr\u00edcula del alumno.
     *
     * @return La de matr\u00edcula del alumno.
     */
    public String getMatricula() {
        return matricula;
    }
}
