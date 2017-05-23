/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package v2.ormsamples;

import org.orm.*;
public class CreateLibroClaseData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = v2.orm.LibroClasePersistentManager.instance().getSession().beginTransaction();
		try {
			v2.orm.Estudiante lormEstudiante = v2.orm.EstudianteDAO.createEstudiante();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : familia1, familia, asistencia, anotaciones, curso_estudiante, nota, agnoIngreso, apoderado_id_fk, persona_id_fk
			v2.orm.EstudianteDAO.save(lormEstudiante);
			v2.orm.Persona lormPersona = v2.orm.PersonaDAO.createPersona();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : profesor, directivo, apoderado, estudiante
			v2.orm.PersonaDAO.save(lormPersona);
			v2.orm.Profesor lormProfesor = v2.orm.ProfesorDAO.createProfesor();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : asignatura, anotaciones, persona_id_fk
			v2.orm.ProfesorDAO.save(lormProfesor);
			v2.orm.Apoderado lormApoderado = v2.orm.ApoderadoDAO.createApoderado();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : estudiante, persona_id_fk
			v2.orm.ApoderadoDAO.save(lormApoderado);
			v2.orm.Directivo lormDirectivo = v2.orm.DirectivoDAO.createDirectivo();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : institucion_id_fk, persona_id_fk
			v2.orm.DirectivoDAO.save(lormDirectivo);
			v2.orm.Curso lormCurso = v2.orm.CursoDAO.createCurso();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : curso_estudiante, asignatura, letra, nivel, institucion_id_fk
			v2.orm.CursoDAO.save(lormCurso);
			v2.orm.Asignatura lormAsignatura = v2.orm.AsignaturaDAO.createAsignatura();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : actividad, profesorid_pk, curso_id_fk
			v2.orm.AsignaturaDAO.save(lormAsignatura);
			v2.orm.Actividad lormActividad = v2.orm.ActividadDAO.createActividad();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : nota, asignatura_id_fk
			v2.orm.ActividadDAO.save(lormActividad);
			v2.orm.Nota lormNota = v2.orm.NotaDAO.createNota();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : nota, estudiante_id_fk, actividad_id_fk
			v2.orm.NotaDAO.save(lormNota);
			v2.orm.Institucion lormInstitucion = v2.orm.InstitucionDAO.createInstitucion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : directivo, curso
			v2.orm.InstitucionDAO.save(lormInstitucion);
			v2.orm.Asistencia lormAsistencia = v2.orm.AsistenciaDAO.createAsistencia();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : presente, estudiante_id_fk
			v2.orm.AsistenciaDAO.save(lormAsistencia);
			v2.orm.Anotaciones lormAnotaciones = v2.orm.AnotacionesDAO.createAnotaciones();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : esPositiva, profesor_id_fk, estudiante_id_fk
			v2.orm.AnotacionesDAO.save(lormAnotaciones);
			v2.orm.Curso_estudiante lormCurso_estudiante = v2.orm.Curso_estudianteDAO.createCurso_estudiante();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : estudiante_id_fk, curso_id_fk
			v2.orm.Curso_estudianteDAO.save(lormCurso_estudiante);
			v2.orm.Familia lormFamilia = v2.orm.FamiliaDAO.createFamilia();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : estudiante2_id_pk, estudiante1_id_pk
			v2.orm.FamiliaDAO.save(lormFamilia);
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
				v2.orm.LibroClasePersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
