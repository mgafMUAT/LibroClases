/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package v2.ormsamples;

import org.orm.*;
public class DeleteLibroClaseData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = v2.orm.LibroClasePersistentManager.instance().getSession().beginTransaction();
		try {
			v2.orm.Estudiante lormEstudiante = v2.orm.EstudianteDAO.loadEstudianteByQuery(null, null);
			// Delete the persistent object
			v2.orm.EstudianteDAO.delete(lormEstudiante);
			v2.orm.Persona lormPersona = v2.orm.PersonaDAO.loadPersonaByQuery(null, null);
			// Delete the persistent object
			v2.orm.PersonaDAO.delete(lormPersona);
			v2.orm.Profesor lormProfesor = v2.orm.ProfesorDAO.loadProfesorByQuery(null, null);
			// Delete the persistent object
			v2.orm.ProfesorDAO.delete(lormProfesor);
			v2.orm.Apoderado lormApoderado = v2.orm.ApoderadoDAO.loadApoderadoByQuery(null, null);
			// Delete the persistent object
			v2.orm.ApoderadoDAO.delete(lormApoderado);
			v2.orm.Directivo lormDirectivo = v2.orm.DirectivoDAO.loadDirectivoByQuery(null, null);
			// Delete the persistent object
			v2.orm.DirectivoDAO.delete(lormDirectivo);
			v2.orm.Curso lormCurso = v2.orm.CursoDAO.loadCursoByQuery(null, null);
			// Delete the persistent object
			v2.orm.CursoDAO.delete(lormCurso);
			v2.orm.Asignatura lormAsignatura = v2.orm.AsignaturaDAO.loadAsignaturaByQuery(null, null);
			// Delete the persistent object
			v2.orm.AsignaturaDAO.delete(lormAsignatura);
			v2.orm.Actividad lormActividad = v2.orm.ActividadDAO.loadActividadByQuery(null, null);
			// Delete the persistent object
			v2.orm.ActividadDAO.delete(lormActividad);
			v2.orm.Nota lormNota = v2.orm.NotaDAO.loadNotaByQuery(null, null);
			// Delete the persistent object
			v2.orm.NotaDAO.delete(lormNota);
			v2.orm.Institucion lormInstitucion = v2.orm.InstitucionDAO.loadInstitucionByQuery(null, null);
			// Delete the persistent object
			v2.orm.InstitucionDAO.delete(lormInstitucion);
			v2.orm.Asistencia lormAsistencia = v2.orm.AsistenciaDAO.loadAsistenciaByQuery(null, null);
			// Delete the persistent object
			v2.orm.AsistenciaDAO.delete(lormAsistencia);
			v2.orm.Anotaciones lormAnotaciones = v2.orm.AnotacionesDAO.loadAnotacionesByQuery(null, null);
			// Delete the persistent object
			v2.orm.AnotacionesDAO.delete(lormAnotaciones);
			v2.orm.Curso_estudiante lormCurso_estudiante = v2.orm.Curso_estudianteDAO.loadCurso_estudianteByQuery(null, null);
			// Delete the persistent object
			v2.orm.Curso_estudianteDAO.delete(lormCurso_estudiante);
			v2.orm.Familia lormFamilia = v2.orm.FamiliaDAO.loadFamiliaByQuery(null, null);
			// Delete the persistent object
			v2.orm.FamiliaDAO.delete(lormFamilia);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteLibroClaseData deleteLibroClaseData = new DeleteLibroClaseData();
			try {
				deleteLibroClaseData.deleteTestData();
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
