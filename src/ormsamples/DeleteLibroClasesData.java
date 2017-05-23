/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteLibroClasesData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession().beginTransaction();
		try {
			com.mauro.librodeclases.Curso lcommaurolibrodeclasesCurso = com.mauro.librodeclases.CursoDAO.loadCursoByQuery(null, null);
			// Delete the persistent object
			com.mauro.librodeclases.CursoDAO.delete(lcommaurolibrodeclasesCurso);
			com.mauro.librodeclases.Alumno lcommaurolibrodeclasesAlumno = com.mauro.librodeclases.AlumnoDAO.loadAlumnoByQuery(null, null);
			// Delete the persistent object
			com.mauro.librodeclases.AlumnoDAO.delete(lcommaurolibrodeclasesAlumno);
			com.mauro.librodeclases.Apoderado lcommaurolibrodeclasesApoderado = com.mauro.librodeclases.ApoderadoDAO.loadApoderadoByQuery(null, null);
			// Delete the persistent object
			com.mauro.librodeclases.ApoderadoDAO.delete(lcommaurolibrodeclasesApoderado);
			com.mauro.librodeclases.Profesor lcommaurolibrodeclasesProfesor = com.mauro.librodeclases.ProfesorDAO.loadProfesorByQuery(null, null);
			// Delete the persistent object
			com.mauro.librodeclases.ProfesorDAO.delete(lcommaurolibrodeclasesProfesor);
			com.mauro.librodeclases.Ramo lcommaurolibrodeclasesRamo = com.mauro.librodeclases.RamoDAO.loadRamoByQuery(null, null);
			// Delete the persistent object
			com.mauro.librodeclases.RamoDAO.delete(lcommaurolibrodeclasesRamo);
			com.mauro.librodeclases.Anotacion lcommaurolibrodeclasesAnotacion = com.mauro.librodeclases.AnotacionDAO.loadAnotacionByQuery(null, null);
			// Delete the persistent object
			com.mauro.librodeclases.AnotacionDAO.delete(lcommaurolibrodeclasesAnotacion);
			com.mauro.librodeclases.Asistencia lcommaurolibrodeclasesAsistencia = com.mauro.librodeclases.AsistenciaDAO.loadAsistenciaByQuery(null, null);
			// Delete the persistent object
			com.mauro.librodeclases.AsistenciaDAO.delete(lcommaurolibrodeclasesAsistencia);
			com.mauro.librodeclases.Actividad lcommaurolibrodeclasesActividad = com.mauro.librodeclases.ActividadDAO.loadActividadByQuery(null, null);
			// Delete the persistent object
			com.mauro.librodeclases.ActividadDAO.delete(lcommaurolibrodeclasesActividad);
			com.mauro.librodeclases.Colegio lcommaurolibrodeclasesColegio = com.mauro.librodeclases.ColegioDAO.loadColegioByQuery(null, null);
			// Delete the persistent object
			com.mauro.librodeclases.ColegioDAO.delete(lcommaurolibrodeclasesColegio);
			com.mauro.librodeclases.Nota lcommaurolibrodeclasesNota = com.mauro.librodeclases.NotaDAO.loadNotaByQuery(null, null);
			// Delete the persistent object
			com.mauro.librodeclases.NotaDAO.delete(lcommaurolibrodeclasesNota);
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
				com.mauro.librodeclases.LibroClasesPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
