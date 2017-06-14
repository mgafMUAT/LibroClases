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
 * Se presentan varias clases por clase de test debido a la existencia de varias
 * relaciones que no admiten null.
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

    @Ignore("Ya realizado (1º)")
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

    @Ignore("Ya realizado (2º)")
    public void testGetActividad() throws PersistentException {
        Actividad load = ActividadDAO.loadActividadByQuery("nombre = 'nombre de actividad'", null);
        assertEquals(fail, actv.getNombre() + actv.getDescripcion()
                + actv.getTipo(), load.getNombre() + load.getDescripcion() + load.getTipo());
    }

    @Ignore("Ya realizado (2º)")
    public void testGetAsignatura() throws PersistentException {
        Asignatura load = AsignaturaDAO.loadAsignaturaByQuery("nombre = 'nombre de asignatura'", null);
        assertEquals(fail, load.getProfesorid_pk().getPersona_id_fk().getNombre(),
                asig.getProfesorid_pk().getPersona_id_fk().getNombre());
        assertEquals(fail, load.getNombre(), asig.getNombre());
        assertEquals(fail, load.getCurso_id_fk().getNivel() + load.getCurso_id_fk()
                .getLetra(), asig.getCurso_id_fk().getNivel() + asig.getCurso_id_fk().getLetra());
    }

    @Ignore("Ya realizado (2º)")
    public void testGetCurso() throws PersistentException {
        Curso load = CursoDAO.loadCursoByQuery("nivel = 9", null);
        assertEquals(fail, curso.getLetra(), load.getLetra());
        assertEquals(fail, curso.getNivel(), load.getNivel());
    }

    @Ignore("Ya realizado (2º)")
    public void testGetInstituto() throws PersistentException {
        //Se supone que al momento se encuentran sólo los datos de un instituto
        Institucion load = InstitucionDAO.loadInstitucionByQuery(null, null);
        assertEquals(fail, instit.getNombre(), load.getNombre());
    }

    @Ignore("Ya realizado (2º)")
    public void testGetProfesor() throws PersistentException {
        Profesor load = ProfesorDAO.loadProfesorByQuery(null, null);
        Persona loadP = load.getPersona_id_fk();
        Persona saveP = prof.getPersona_id_fk();
        assertEquals(fail, loadP.getNombre(), saveP.getNombre());
        assertEquals(fail, loadP.getRut(), saveP.getRut());
    }

    @Ignore("Ya realizado (3º)")
    public void testUpdateActividad() throws PersistentException {
        String original = actv.getNombre();
        String nuevo = "Nuevo Nombre";
        Actividad load = ActividadDAO.loadActividadByQuery("nombre = '" + original + "'", null);
        load.setNombre(nuevo);
        load.setDescripcion("Una descripción más detallada");
        ActividadDAO.save(load);
        assertEquals(ActividadDAO.loadActividadByQuery("nombre = '" + nuevo + "'", null)
                .getDescripcion(), "Una descripción más detallada");
    }

    @Ignore("Ya realizado (3º)")
    public void testUpdateAsignatura() throws PersistentException {
        String original = asig.getNombre();
        String nuevo = "Nuevo Ramo";
        Asignatura load = AsignaturaDAO.loadAsignaturaByQuery("nombre = '" + original + "'", null);
        load.setNombre(nuevo);
        AsignaturaDAO.save(load);
        assertNotNull(AsignaturaDAO.loadAsignaturaByQuery("nombre = '" + nuevo + "'", null));
    }

    @Ignore("Ya realizado (3º)")
    public void testUpdateCurso() throws PersistentException {
        Curso load = CursoDAO.loadCursoByQuery("letra = 'C' and nivel = 9", null);
        load.setLetra('H');
        load.setNivel((byte) 16);
        CursoDAO.save(load);
        assertNotNull(CursoDAO.loadCursoByQuery("letra = 'C' and nivel = 9", null));
    }

    @Ignore("Ya realizado (3º)")
    public void testUpdateInstituto() throws PersistentException {
        String original = instit.getNombre();
        String nuevo = "ColegioDistinto";
        Institucion load = InstitucionDAO.loadInstitucionByQuery("nombre = '"
                + original + "'", null);
        load.setNombre(nuevo);
        InstitucionDAO.save(load);
        assertNotNull(InstitucionDAO.loadInstitucionByQuery("nombre = '" + nuevo + "'", null));
    }

    @Ignore("Ya realizado (3º)")
    public void testUpdateProfesor() throws PersistentException {
        String nombreN = "Otro Profe";
        String rutN = "qwertyuio";
        String nombOrig = prof.getPersona_id_fk().getNombre();
        int pid = PersonaDAO.loadPersonaByQuery("nombre = '" + nombOrig + "'", null).getId();
        Profesor load = ProfesorDAO.loadProfesorByQuery("persona_id_fk = " + pid, null);
        load.getPersona_id_fk().setNombre(nombreN);
        load.getPersona_id_fk().setRut(rutN);
        ProfesorDAO.save(load);
        assertEquals(ProfesorDAO.loadProfesorByQuery("persona_id_fk = " + pid, null)
                .getPersona_id_fk().getNombre(), nombreN);
    }

    @Ignore("Ya realizado (3º)")
    public void testDelete() throws PersistentException {
        Persona pers = PersonaDAO.loadPersonaByQuery("nombre = 'Otro Profe'", null);
        Profesor supr = ProfesorDAO.loadProfesorByQuery("persona_id_fk = " + pers.getId(), null);
        assertNotNull(supr);
        if (supr != null) {
            t = orm.LibroClasePersistentManager.instance().getSession().beginTransaction();
            Asignatura[] ramos = supr.asignatura.toArray();
            for (Asignatura ramo : ramos) {
                for (Actividad actvsupr : ramo.actividad.toArray()) {
                    ActividadDAO.deleteAndDissociate(actvsupr);
                }
                AsignaturaDAO.deleteAndDissociate(ramo);
            }
            ProfesorDAO.deleteAndDissociate(supr);
            PersonaDAO.deleteAndDissociate(pers);
            t.commit();
            assertNull(ProfesorDAO.loadProfesorByQuery("persona_id_fk = " + pers.getId(), null));
        }
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
