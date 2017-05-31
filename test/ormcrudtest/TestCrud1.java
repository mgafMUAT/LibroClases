/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ormcrudtest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;
import orm.*;

/**
 *
 * @author MauricioGabriel
 */
public class TestCrud1 {
    
    private PersistentTransaction t;
    private Actividad actv;
    private Asignatura asig;
    private Curso curso;
    private Institucion instit;
    private Profesor prof;
    private Persona prsn;
    private final String fail = "parámetros difieren";
    
    public TestCrud1() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        actv = ActividadDAO.createActividad();
        actv.setDescripcion("Descripción");
        actv.setNombre("nombre de actividad");
        actv.setTipo("Teórico o práctico");
        asig = AsignaturaDAO.createAsignatura();
        actv.setAsignatura_id_fk(asig);
        asig.setNombre("nombre de asignatura");
        curso = CursoDAO.createCurso();
        curso.setNivel((byte) 9);
        curso.setLetra('C');
        instit = InstitucionDAO.createInstitucion();
        instit.setNombre("Nombre de instituto");
        curso.setInstitucion_id_fk(instit);
        asig.setCurso_id_fk(curso);
        prof = ProfesorDAO.createProfesor();
        prsn = PersonaDAO.createPersona();
        prsn.setNombre("Nombre de Profesor");
        prsn.setRut("Rut de Profesor");
        prof.setPersona_id_fk(prsn);
        asig.setProfesorid_pk(prof);
    }
    
    @After
    public void tearDown() {
    }
    
    @Ignore("Ya realizado")
    public void testAdd() throws PersistentException {
        t = orm.LibroClasePersistentManager.instance().getSession().beginTransaction();
        actv = ActividadDAO.createActividad();
        actv.setDescripcion("Descripción");
        actv.setNombre("nombre de actividad");
        actv.setTipo("Teórico o práctico");
        asig = AsignaturaDAO.createAsignatura();
        actv.setAsignatura_id_fk(asig);
        asig.setNombre("nombre de asignatura");
        curso = CursoDAO.createCurso();
        curso.setNivel((byte) 9);
        curso.setLetra('C');
        instit = InstitucionDAO.createInstitucion();
        instit.setNombre("Nombre de instituto");
        curso.setInstitucion_id_fk(instit);
        InstitucionDAO.save(instit);
        asig.setCurso_id_fk(curso);
        CursoDAO.save(curso);
        prof = ProfesorDAO.createProfesor();
        prsn = PersonaDAO.createPersona();
        prsn.setNombre("Nombre de Profesor");
        prsn.setRut("Rut de Profesor");
        prof.setPersona_id_fk(prsn);
        PersonaDAO.save(prsn);
        asig.setProfesorid_pk(prof);
        ProfesorDAO.save(prof);
        AsignaturaDAO.save(asig);
        ActividadDAO.save(actv);
        t.commit();
    }
    
    @Test
    public void testActividad() throws PersistentException {
        Actividad load = ActividadDAO.loadActividadByQuery("nombre = 'nombre de actividad'", null);
        assertEquals(fail, actv.getNombre() + actv.getDescripcion()
                + actv.getTipo(), load.getNombre() + load.getDescripcion() + load.getTipo());
    }
    
    @Test
    public void testAsignatura() throws PersistentException {
        Asignatura load = AsignaturaDAO.loadAsignaturaByQuery("nombre = 'nombre de asignatura'", null);
        assertEquals(fail, load.getProfesorid_pk().getPersona_id_fk().getNombre()
                , asig.getProfesorid_pk().getPersona_id_fk().getNombre());
        assertEquals(fail, load.getNombre(), asig.getNombre());
        assertEquals(fail, load.getCurso_id_fk().getNivel() + load.getCurso_id_fk()
                .getLetra(), asig.getCurso_id_fk().getNivel() + asig.getCurso_id_fk().getLetra());
    }
    
    @Test
    public void testCurso() throws PersistentException {
        Curso load = CursoDAO.loadCursoByQuery("nivel = 9", null);
        assertEquals(curso.getLetra(), load.getLetra());
        assertEquals(curso.getNivel(), load.getNivel());
    }
    
    @Test
    public void testInstituto() throws PersistentException {
        //Se supone que al momento se encuentran sólo los datos de un instituto
        Institucion load = InstitucionDAO.loadInstitucionByQuery(null, null);
        assertEquals(instit.getNombre(), load.getNombre());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
