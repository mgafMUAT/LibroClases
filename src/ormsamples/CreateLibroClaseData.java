/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateLibroClaseData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = orm.LibroClasePersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Estudiante lormEstudiante = orm.EstudianteDAO.createEstudiante();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : familia1, familia, asistencia, curso_estudiante, agnoIngreso, persona_id_fk
			orm.EstudianteDAO.save(lormEstudiante);
			orm.Persona lormPersona = orm.PersonaDAO.createPersona();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : profesor, directivo, apoderado, estudiante
			orm.PersonaDAO.save(lormPersona);
			orm.Profesor lormProfesor = orm.ProfesorDAO.createProfesor();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : persona_id_fk
			orm.ProfesorDAO.save(lormProfesor);
			orm.Apoderado lormApoderado = orm.ApoderadoDAO.createApoderado();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : persona_id_fk
			orm.ApoderadoDAO.save(lormApoderado);
			orm.Directivo lormDirectivo = orm.DirectivoDAO.createDirectivo();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : institucion_id_fk, persona_id_fk
			orm.DirectivoDAO.save(lormDirectivo);
			orm.Curso lormCurso = orm.CursoDAO.createCurso();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : letra, nivel
			orm.CursoDAO.save(lormCurso);
			orm.Asignatura lormAsignatura = orm.AsignaturaDAO.createAsignatura();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : actividad
			orm.AsignaturaDAO.save(lormAsignatura);
			orm.Actividad lormActividad = orm.ActividadDAO.createActividad();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : nota, asignatura_id_fk
			orm.ActividadDAO.save(lormActividad);
			orm.Nota lormNota = orm.NotaDAO.createNota();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : nota, actividad_id_fk
			orm.NotaDAO.save(lormNota);
			orm.Institucion lormInstitucion = orm.InstitucionDAO.createInstitucion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : directivo
			orm.InstitucionDAO.save(lormInstitucion);
			orm.Asistencia lormAsistencia = orm.AsistenciaDAO.createAsistencia();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : presente, estudiante_id_fk
			orm.AsistenciaDAO.save(lormAsistencia);
			orm.Anotaciones lormAnotaciones = orm.AnotacionesDAO.createAnotaciones();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : esPositiva
			orm.AnotacionesDAO.save(lormAnotaciones);
			orm.Curso_estudiante lormCurso_estudiante = orm.Curso_estudianteDAO.createCurso_estudiante();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : estudiante_id_fk
			orm.Curso_estudianteDAO.save(lormCurso_estudiante);
			orm.Familia lormFamilia = orm.FamiliaDAO.createFamilia();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : estudiante2_id_pk, estudiante1_id_pk
			orm.FamiliaDAO.save(lormFamilia);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateLibroClaseData createLibroClaseData = new CreateLibroClaseData();
			try {
				createLibroClaseData.createTestData();
			}
			finally {
				orm.LibroClasePersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
