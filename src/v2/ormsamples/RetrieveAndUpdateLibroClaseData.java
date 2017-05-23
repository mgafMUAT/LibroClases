/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package v2.ormsamples;

import org.orm.*;
public class RetrieveAndUpdateLibroClaseData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = v2.orm.LibroClasePersistentManager.instance().getSession().beginTransaction();
		try {
			v2.orm.Estudiante lormEstudiante = v2.orm.EstudianteDAO.loadEstudianteByQuery(null, null);
			// Update the properties of the persistent object
			v2.orm.EstudianteDAO.save(lormEstudiante);
			v2.orm.Persona lormPersona = v2.orm.PersonaDAO.loadPersonaByQuery(null, null);
			// Update the properties of the persistent object
			v2.orm.PersonaDAO.save(lormPersona);
			v2.orm.Profesor lormProfesor = v2.orm.ProfesorDAO.loadProfesorByQuery(null, null);
			// Update the properties of the persistent object
			v2.orm.ProfesorDAO.save(lormProfesor);
			v2.orm.Apoderado lormApoderado = v2.orm.ApoderadoDAO.loadApoderadoByQuery(null, null);
			// Update the properties of the persistent object
			v2.orm.ApoderadoDAO.save(lormApoderado);
			v2.orm.Directivo lormDirectivo = v2.orm.DirectivoDAO.loadDirectivoByQuery(null, null);
			// Update the properties of the persistent object
			v2.orm.DirectivoDAO.save(lormDirectivo);
			v2.orm.Curso lormCurso = v2.orm.CursoDAO.loadCursoByQuery(null, null);
			// Update the properties of the persistent object
			v2.orm.CursoDAO.save(lormCurso);
			v2.orm.Asignatura lormAsignatura = v2.orm.AsignaturaDAO.loadAsignaturaByQuery(null, null);
			// Update the properties of the persistent object
			v2.orm.AsignaturaDAO.save(lormAsignatura);
			v2.orm.Actividad lormActividad = v2.orm.ActividadDAO.loadActividadByQuery(null, null);
			// Update the properties of the persistent object
			v2.orm.ActividadDAO.save(lormActividad);
			v2.orm.Nota lormNota = v2.orm.NotaDAO.loadNotaByQuery(null, null);
			// Update the properties of the persistent object
			v2.orm.NotaDAO.save(lormNota);
			v2.orm.Institucion lormInstitucion = v2.orm.InstitucionDAO.loadInstitucionByQuery(null, null);
			// Update the properties of the persistent object
			v2.orm.InstitucionDAO.save(lormInstitucion);
			v2.orm.Asistencia lormAsistencia = v2.orm.AsistenciaDAO.loadAsistenciaByQuery(null, null);
			// Update the properties of the persistent object
			v2.orm.AsistenciaDAO.save(lormAsistencia);
			v2.orm.Anotaciones lormAnotaciones = v2.orm.AnotacionesDAO.loadAnotacionesByQuery(null, null);
			// Update the properties of the persistent object
			v2.orm.AnotacionesDAO.save(lormAnotaciones);
			v2.orm.Curso_estudiante lormCurso_estudiante = v2.orm.Curso_estudianteDAO.loadCurso_estudianteByQuery(null, null);
			// Update the properties of the persistent object
			v2.orm.Curso_estudianteDAO.save(lormCurso_estudiante);
			v2.orm.Familia lormFamilia = v2.orm.FamiliaDAO.loadFamiliaByQuery(null, null);
			// Update the properties of the persistent object
			v2.orm.FamiliaDAO.save(lormFamilia);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Estudiante by EstudianteCriteria");
		v2.orm.EstudianteCriteria lormEstudianteCriteria = new v2.orm.EstudianteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormEstudianteCriteria.id.eq();
		System.out.println(lormEstudianteCriteria.uniqueEstudiante());
		
		System.out.println("Retrieving Persona by PersonaCriteria");
		v2.orm.PersonaCriteria lormPersonaCriteria = new v2.orm.PersonaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormPersonaCriteria.id.eq();
		System.out.println(lormPersonaCriteria.uniquePersona());
		
		System.out.println("Retrieving Profesor by ProfesorCriteria");
		v2.orm.ProfesorCriteria lormProfesorCriteria = new v2.orm.ProfesorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormProfesorCriteria.id.eq();
		System.out.println(lormProfesorCriteria.uniqueProfesor());
		
		System.out.println("Retrieving Apoderado by ApoderadoCriteria");
		v2.orm.ApoderadoCriteria lormApoderadoCriteria = new v2.orm.ApoderadoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormApoderadoCriteria.id.eq();
		System.out.println(lormApoderadoCriteria.uniqueApoderado());
		
		System.out.println("Retrieving Directivo by DirectivoCriteria");
		v2.orm.DirectivoCriteria lormDirectivoCriteria = new v2.orm.DirectivoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormDirectivoCriteria.id.eq();
		System.out.println(lormDirectivoCriteria.uniqueDirectivo());
		
		System.out.println("Retrieving Curso by CursoCriteria");
		v2.orm.CursoCriteria lormCursoCriteria = new v2.orm.CursoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormCursoCriteria.id.eq();
		System.out.println(lormCursoCriteria.uniqueCurso());
		
		System.out.println("Retrieving Asignatura by AsignaturaCriteria");
		v2.orm.AsignaturaCriteria lormAsignaturaCriteria = new v2.orm.AsignaturaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormAsignaturaCriteria.id.eq();
		System.out.println(lormAsignaturaCriteria.uniqueAsignatura());
		
		System.out.println("Retrieving Actividad by ActividadCriteria");
		v2.orm.ActividadCriteria lormActividadCriteria = new v2.orm.ActividadCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormActividadCriteria.id.eq();
		System.out.println(lormActividadCriteria.uniqueActividad());
		
		System.out.println("Retrieving Nota by NotaCriteria");
		v2.orm.NotaCriteria lormNotaCriteria = new v2.orm.NotaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormNotaCriteria.id.eq();
		System.out.println(lormNotaCriteria.uniqueNota());
		
		System.out.println("Retrieving Institucion by InstitucionCriteria");
		v2.orm.InstitucionCriteria lormInstitucionCriteria = new v2.orm.InstitucionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormInstitucionCriteria.id.eq();
		System.out.println(lormInstitucionCriteria.uniqueInstitucion());
		
		System.out.println("Retrieving Asistencia by AsistenciaCriteria");
		v2.orm.AsistenciaCriteria lormAsistenciaCriteria = new v2.orm.AsistenciaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormAsistenciaCriteria.id.eq();
		System.out.println(lormAsistenciaCriteria.uniqueAsistencia());
		
		System.out.println("Retrieving Anotaciones by AnotacionesCriteria");
		v2.orm.AnotacionesCriteria lormAnotacionesCriteria = new v2.orm.AnotacionesCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormAnotacionesCriteria.id.eq();
		System.out.println(lormAnotacionesCriteria.uniqueAnotaciones());
		
		System.out.println("Retrieving Curso_estudiante by Curso_estudianteCriteria");
		v2.orm.Curso_estudianteCriteria lormCurso_estudianteCriteria = new v2.orm.Curso_estudianteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormCurso_estudianteCriteria.id.eq();
		System.out.println(lormCurso_estudianteCriteria.uniqueCurso_estudiante());
		
		System.out.println("Retrieving Familia by FamiliaCriteria");
		v2.orm.FamiliaCriteria lormFamiliaCriteria = new v2.orm.FamiliaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormFamiliaCriteria.id_pk.eq();
		System.out.println(lormFamiliaCriteria.uniqueFamilia());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateLibroClaseData retrieveAndUpdateLibroClaseData = new RetrieveAndUpdateLibroClaseData();
			try {
				retrieveAndUpdateLibroClaseData.retrieveAndUpdateTestData();
				//retrieveAndUpdateLibroClaseData.retrieveByCriteria();
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
