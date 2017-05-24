package v1.com.mauro.librodeclases;

import java.util.ArrayList;

/**
 * Clase que representa un curso implementado en un colegio.
 *
 * @author Mauricio Acencio
 */
public class Curso {

    private final byte nivel;
    private final char letra;
    public ArrayList<Ramo> ramos = new ArrayList<>();
    public ArrayList<Alumno> alumnos = new ArrayList<>();
    public Colegio colegio;
    private java.util.Set ORM_alumnos;
    private final int ID;
    private static int idCount = 0;

    private java.util.Set this_getSet(int key) {
        if (key == v1.com.mauro.librodeclases.ORMConstants.KEY_CURSO_ALUMNOS) {
            return ORM_alumnos;
        }

        return null;
    }

    private void this_setOwner(Object owner, int key) {
        if (key == v1.com.mauro.librodeclases.ORMConstants.KEY_CURSO_RAMO) {
            this.ramos.add((v1.com.mauro.librodeclases.Ramo) owner);
        } else if (key == v1.com.mauro.librodeclases.ORMConstants.KEY_CURSO_COLEGIO) {
            this.colegio = (v1.com.mauro.librodeclases.Colegio) owner;
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
     * Crea un nuevo curso a partir del nivel y la letra proporcionadas.
     *
     * @param nivel El nivel del curso (de 1 a 8)
     * @param letra La letra correspondiente del curso ({@code 'A'} o
     * {@code 'B'})
     */
    public Curso(byte nivel, char letra) {
        this.nivel = nivel;
        this.letra = letra;
        this.ID = ++idCount;
    }

    /**
     * Devuelve el nº de nivel correspondiente al curso.
     *
     * @return El nivel del curso, del 1 al 8.
     */
    public byte getNivel() {
        return nivel;
    }

    /**
     * Devuelve la letra correspondiente al curso.
     *
     * @return La letra del curso, {@code 'A'} o {@code 'B'}
     */
    public char getLetra() {
        return letra;
    }

}
