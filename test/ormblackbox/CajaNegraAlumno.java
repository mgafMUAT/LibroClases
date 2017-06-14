/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ormblackbox;

import orm.Apoderado;
import orm.ApoderadoDAO;
import orm.Estudiante;
import orm.EstudianteDAO;
import orm.Persona;
import orm.PersonaDAO;

/**
 * Diseño teórico de caja negra del ingreso de un alumno al sistema, en conjunto
 * a su correspondiente apoderado, considerando que éste último no ha sido
 * ingresado antes.
 *
 * @author Mauricio Acencio
 */
public class CajaNegraAlumno {

    /**
     * Método que constituye una representación "alegórica" del proceso de
     * ingresar a un alumno y apoderado nuevos al sistema.<p>
     * Corresponde a la ventana NuevoAlumno del proyecto Swing, con la opción de
     * nuevo apoderado seleccionada, siendo los valores ingresados en cada campo
     * de texto representados en los parámetros de entrada representativos.<p>
     * Aquí aparece el código correspondiente a la creación de las entidades de
     * tablas, sin incluir el ingreso a la base de datos asociada.
     *
     * <table>
     * <tr>
     * <th>Variable</th>
     * <th>Permitido</th>
     * <th>No permitido</th>
     * </tr>
     * <tr>
     * <td>String<br>nombreAlumno</td>
     * <td>1) Sólo letra y espacio</td>
     * <td>2) Cualquier carácter distinto a letra y espacio</td>
     * </tr>
     * <tr>
     * <td>String<br>rutAlumno</td>
     * <td>3) Sólo dígito y k - K<br>4) Si se utiliza k - K es en la última
     * posición<br>5) strlen = 12</td>
     * <td>6) Cualquier carácter distinto a dígito y k - K<br>7) Se utiliza k -
     * K antes del final<br>8) strlen != 12</td>
     * </tr>
     * <tr>
     * <td>int<br>agnoIngreso</td>
     * <td>9) 2000 &lt;= valor &lt;= 2017</td>
     * <td>10)valor &lt; 2000<br>11)valor &gt; 2017</td>
     * </tr>
     * <tr>
     * <td>String<br>nombreApoderado</td>
     * <td>13) Sólo letra y espacio</td>
     * <td>14) Cualquier carácter distinto a letra y espacio</td>
     * </tr>
     * <tr>
     * <td>String<br>rutApoderado</td>
     * <td>15) Sólo dígito y k - K<br>16) Si se utiliza k - K es en la última
     * posición<br>17) strlen = 12</td>
     * <td>18) Cualquier carácter distinto a dígito y k - K<br>19) Se utiliza k
     * - K antes del final<br>20) strlen != 12</td>
     * </tr>
     * </table><p>
     * Nota: no se incluye el atributo de matrícula debido a que se genera
     * automáticamente a partir del rut y año de ingreso del alumno.
     *
     * @param nombreAlumno Nombre del alumno
     * @param rutAlumno Rut del alumno
     * @param agnoIngreso Año de ingreso del alumno
     * @param nombreApoderado Nombre del apoderado
     * @param rutApoderado Rut del apoderado
     */
    public void nuevoAlumno(String nombreAlumno, String rutAlumno, int agnoIngreso,
            String nombreApoderado, String rutApoderado) {
        Persona alumPer = PersonaDAO.createPersona();
        alumPer.setNombre(nombreAlumno);
        alumPer.setRut(rutAlumno);
        Estudiante alum = EstudianteDAO.createEstudiante();
        alum.setPersona_id_fk(alumPer);
        alum.setAgnoIngreso(agnoIngreso);
        String agno = Integer.toString(agnoIngreso).substring(2);
        alum.setMatricula(rutAlumno.concat(agno));
        Persona apodPer = PersonaDAO.createPersona();
        apodPer.setNombre(nombreApoderado);
        apodPer.setRut(rutApoderado);
        Apoderado apod = ApoderadoDAO.createApoderado();
        apod.setPersona_id_fk(apodPer);
        apod.estudiante.add(alum);
        alum.setApoderado_id_fk(apod);
    }
}
