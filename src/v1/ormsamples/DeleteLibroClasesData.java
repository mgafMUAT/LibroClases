/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package v1.ormsamples;

import org.orm.*;
public class DeleteLibroClasesData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = v1.com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession().beginTransaction();
		try {
			v1.com.mauro.librodeclases.Curso lcommaurolibrodeclasesCurso = v1.com.mauro.librodeclases.CursoDAO.loadCursoByQuery(null, null);
			// Delete the persistent object
			v1.com.mauro.librodeclases.CursoDAO.delete(lcommaurolibrodeclasesCurso);
			v1.com.mauro.librodeclases.Alumno lcommaurolibrodeclasesAlumno = v1.com.mauro.librodeclases.AlumnoDAO.loadAlumnoByQuery(null, null);
			// Delete the persistent object
			v1.com.mauro.librodeclases.AlumnoDAO.delete(lcommaurolibrodeclasesAlumno);
			v1.com.mauro.librodeclases.Apoderado lcommaurolibrodeclasesApoderado = v1.com.mauro.librodeclases.ApoderadoDAO.loadApoderadoByQuery(null, null);
			// Delete the persistent object
			v1.com.mauro.librodeclases.ApoderadoDAO.delete(lcommaurolibrodeclasesApoderado);
			v1.com.mauro.librodeclases.Profesor lcommaurolibrodeclasesProfesor = v1.com.mauro.librodeclases.ProfesorDAO.loadProfesorByQuery(null, null);
			// Delete the persistent object
			v1.com.mauro.librodeclases.ProfesorDAO.delete(lcommaurolibrodeclasesProfesor);
			v1.com.mauro.librodeclases.Ramo lcommaurolibrodeclasesRamo = v1.com.mauro.librodeclases.RamoDAO.loadRamoByQuery(null, null);
			// Delete the persistent object
			v1.com.mauro.librodeclases.RamoDAO.delete(lcommaurolibrodeclasesRamo);
			v1.com.mauro.librodeclases.Anotacion lcommaurolibrodeclasesAnotacion = v1.com.mauro.librodeclases.AnotacionDAO.loadAnotacionByQuery(null, null);
			// Delete the persistent object
			v1.com.mauro.librodeclases.AnotacionDAO.delete(lcommaurolibrodeclasesAnotacion);
			v1.com.mauro.librodeclases.Asistencia lcommaurolibrodeclasesAsistencia = v1.com.mauro.librodeclases.AsistenciaDAO.loadAsistenciaByQuery(null, null);
			// Delete the persistent object
			v1.com.mauro.librodeclases.AsistenciaDAO.delete(lcommaurolibrodeclasesAsistencia);
			v1.com.mauro.librodeclases.Actividad lcommaurolibrodeclasesActividad = v1.com.mauro.librodeclases.ActividadDAO.loadActividadByQuery(null, null);
			// Delete the persistent object
			v1.com.mauro.librodeclases.ActividadDAO.delete(lcommaurolibrodeclasesActividad);
			v1.com.mauro.librodeclases.Colegio lcommaurolibrodeclasesColegio = v1.com.mauro.librodeclases.ColegioDAO.loadColegioByQuery(null, null);
			// Delete the persistent object
			v1.com.mauro.librodeclases.ColegioDAO.delete(lcommaurolibrodeclasesColegio);
			v1.com.mauro.librodeclases.Nota lcommaurolibrodeclasesNota = v1.com.mauro.librodeclases.NotaDAO.loadNotaByQuery(null, null);
			// Delete the persistent object
			v1.com.mauro.librodeclases.NotaDAO.delete(lcommaurolibrodeclasesNota);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteLibroClasesData deleteLibroClasesData = new DeleteLibroClasesData();
			try {
				deleteLibroClasesData.deleteTestData();
			}
			finally {
				v1.com.mauro.librodeclases.LibroClasesPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
