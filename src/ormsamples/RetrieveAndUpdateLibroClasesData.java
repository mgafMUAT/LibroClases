/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateLibroClasesData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession().beginTransaction();
		try {
			com.mauro.librodeclases.Curso lcommaurolibrodeclasesCurso = com.mauro.librodeclases.CursoDAO.loadCursoByQuery(null, null);
			// Update the properties of the persistent object
			com.mauro.librodeclases.CursoDAO.save(lcommaurolibrodeclasesCurso);
			com.mauro.librodeclases.Alumno lcommaurolibrodeclasesAlumno = com.mauro.librodeclases.AlumnoDAO.loadAlumnoByQuery(null, null);
			// Update the properties of the persistent object
			com.mauro.librodeclases.AlumnoDAO.save(lcommaurolibrodeclasesAlumno);
			com.mauro.librodeclases.Apoderado lcommaurolibrodeclasesApoderado = com.mauro.librodeclases.ApoderadoDAO.loadApoderadoByQuery(null, null);
			// Update the properties of the persistent object
			com.mauro.librodeclases.ApoderadoDAO.save(lcommaurolibrodeclasesApoderado);
			com.mauro.librodeclases.Profesor lcommaurolibrodeclasesProfesor = com.mauro.librodeclases.ProfesorDAO.loadProfesorByQuery(null, null);
			// Update the properties of the persistent object
			com.mauro.librodeclases.ProfesorDAO.save(lcommaurolibrodeclasesProfesor);
			com.mauro.librodeclases.Ramo lcommaurolibrodeclasesRamo = com.mauro.librodeclases.RamoDAO.loadRamoByQuery(null, null);
			// Update the properties of the persistent object
			com.mauro.librodeclases.RamoDAO.save(lcommaurolibrodeclasesRamo);
			com.mauro.librodeclases.Anotacion lcommaurolibrodeclasesAnotacion = com.mauro.librodeclases.AnotacionDAO.loadAnotacionByQuery(null, null);
			// Update the properties of the persistent object
			com.mauro.librodeclases.AnotacionDAO.save(lcommaurolibrodeclasesAnotacion);
			com.mauro.librodeclases.Asistencia lcommaurolibrodeclasesAsistencia = com.mauro.librodeclases.AsistenciaDAO.loadAsistenciaByQuery(null, null);
			// Update the properties of the persistent object
			com.mauro.librodeclases.AsistenciaDAO.save(lcommaurolibrodeclasesAsistencia);
			com.mauro.librodeclases.Actividad lcommaurolibrodeclasesActividad = com.mauro.librodeclases.ActividadDAO.loadActividadByQuery(null, null);
			// Update the properties of the persistent object
			com.mauro.librodeclases.ActividadDAO.save(lcommaurolibrodeclasesActividad);
			com.mauro.librodeclases.Colegio lcommaurolibrodeclasesColegio = com.mauro.librodeclases.ColegioDAO.loadColegioByQuery(null, null);
			// Update the properties of the persistent object
			com.mauro.librodeclases.ColegioDAO.save(lcommaurolibrodeclasesColegio);
			com.mauro.librodeclases.Nota lcommaurolibrodeclasesNota = com.mauro.librodeclases.NotaDAO.loadNotaByQuery(null, null);
			// Update the properties of the persistent object
			com.mauro.librodeclases.NotaDAO.save(lcommaurolibrodeclasesNota);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Curso by CursoCriteria");
		com.mauro.librodeclases.CursoCriteria lcommaurolibrodeclasesCursoCriteria = new com.mauro.librodeclases.CursoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcommaurolibrodeclasesCursoCriteria.ID.eq();
		System.out.println(lcommaurolibrodeclasesCursoCriteria.uniqueCurso());
		
		System.out.println("Retrieving Alumno by AlumnoCriteria");
		com.mauro.librodeclases.AlumnoCriteria lcommaurolibrodeclasesAlumnoCriteria = new com.mauro.librodeclases.AlumnoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcommaurolibrodeclasesAlumnoCriteria.ID.eq();
		System.out.println(lcommaurolibrodeclasesAlumnoCriteria.uniqueAlumno());
		
		System.out.println("Retrieving Apoderado by ApoderadoCriteria");
		com.mauro.librodeclases.ApoderadoCriteria lcommaurolibrodeclasesApoderadoCriteria = new com.mauro.librodeclases.ApoderadoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcommaurolibrodeclasesApoderadoCriteria.ID.eq();
		System.out.println(lcommaurolibrodeclasesApoderadoCriteria.uniqueApoderado());
		
		System.out.println("Retrieving Profesor by ProfesorCriteria");
		com.mauro.librodeclases.ProfesorCriteria lcommaurolibrodeclasesProfesorCriteria = new com.mauro.librodeclases.ProfesorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcommaurolibrodeclasesProfesorCriteria.ID.eq();
		System.out.println(lcommaurolibrodeclasesProfesorCriteria.uniqueProfesor());
		
		System.out.println("Retrieving Ramo by RamoCriteria");
		com.mauro.librodeclases.RamoCriteria lcommaurolibrodeclasesRamoCriteria = new com.mauro.librodeclases.RamoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcommaurolibrodeclasesRamoCriteria.ID.eq();
		System.out.println(lcommaurolibrodeclasesRamoCriteria.uniqueRamo());
		
		System.out.println("Retrieving Anotacion by AnotacionCriteria");
		com.mauro.librodeclases.AnotacionCriteria lcommaurolibrodeclasesAnotacionCriteria = new com.mauro.librodeclases.AnotacionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcommaurolibrodeclasesAnotacionCriteria.ID.eq();
		System.out.println(lcommaurolibrodeclasesAnotacionCriteria.uniqueAnotacion());
		
		System.out.println("Retrieving Asistencia by AsistenciaCriteria");
		com.mauro.librodeclases.AsistenciaCriteria lcommaurolibrodeclasesAsistenciaCriteria = new com.mauro.librodeclases.AsistenciaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcommaurolibrodeclasesAsistenciaCriteria.ID.eq();
		System.out.println(lcommaurolibrodeclasesAsistenciaCriteria.uniqueAsistencia());
		
		System.out.println("Retrieving Actividad by ActividadCriteria");
		com.mauro.librodeclases.ActividadCriteria lcommaurolibrodeclasesActividadCriteria = new com.mauro.librodeclases.ActividadCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcommaurolibrodeclasesActividadCriteria.ID.eq();
		System.out.println(lcommaurolibrodeclasesActividadCriteria.uniqueActividad());
		
		System.out.println("Retrieving Colegio by ColegioCriteria");
		com.mauro.librodeclases.ColegioCriteria lcommaurolibrodeclasesColegioCriteria = new com.mauro.librodeclases.ColegioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcommaurolibrodeclasesColegioCriteria.ID.eq();
		System.out.println(lcommaurolibrodeclasesColegioCriteria.uniqueColegio());
		
		System.out.println("Retrieving Nota by NotaCriteria");
		com.mauro.librodeclases.NotaCriteria lcommaurolibrodeclasesNotaCriteria = new com.mauro.librodeclases.NotaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcommaurolibrodeclasesNotaCriteria.ID.eq();
		System.out.println(lcommaurolibrodeclasesNotaCriteria.uniqueNota());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateLibroClasesData retrieveAndUpdateLibroClasesData = new RetrieveAndUpdateLibroClasesData();
			try {
				retrieveAndUpdateLibroClasesData.retrieveAndUpdateTestData();
				//retrieveAndUpdateLibroClasesData.retrieveByCriteria();
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
