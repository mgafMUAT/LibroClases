/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package v1.ormsamples;

import org.orm.*;
public class RetrieveAndUpdateLibroClasesData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = v1.com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession().beginTransaction();
		try {
			v1.com.mauro.librodeclases.Curso lcommaurolibrodeclasesCurso = v1.com.mauro.librodeclases.CursoDAO.loadCursoByQuery(null, null);
			// Update the properties of the persistent object
			v1.com.mauro.librodeclases.CursoDAO.save(lcommaurolibrodeclasesCurso);
			v1.com.mauro.librodeclases.Alumno lcommaurolibrodeclasesAlumno = v1.com.mauro.librodeclases.AlumnoDAO.loadAlumnoByQuery(null, null);
			// Update the properties of the persistent object
			v1.com.mauro.librodeclases.AlumnoDAO.save(lcommaurolibrodeclasesAlumno);
			v1.com.mauro.librodeclases.Apoderado lcommaurolibrodeclasesApoderado = v1.com.mauro.librodeclases.ApoderadoDAO.loadApoderadoByQuery(null, null);
			// Update the properties of the persistent object
			v1.com.mauro.librodeclases.ApoderadoDAO.save(lcommaurolibrodeclasesApoderado);
			v1.com.mauro.librodeclases.Profesor lcommaurolibrodeclasesProfesor = v1.com.mauro.librodeclases.ProfesorDAO.loadProfesorByQuery(null, null);
			// Update the properties of the persistent object
			v1.com.mauro.librodeclases.ProfesorDAO.save(lcommaurolibrodeclasesProfesor);
			v1.com.mauro.librodeclases.Ramo lcommaurolibrodeclasesRamo = v1.com.mauro.librodeclases.RamoDAO.loadRamoByQuery(null, null);
			// Update the properties of the persistent object
			v1.com.mauro.librodeclases.RamoDAO.save(lcommaurolibrodeclasesRamo);
			v1.com.mauro.librodeclases.Anotacion lcommaurolibrodeclasesAnotacion = v1.com.mauro.librodeclases.AnotacionDAO.loadAnotacionByQuery(null, null);
			// Update the properties of the persistent object
			v1.com.mauro.librodeclases.AnotacionDAO.save(lcommaurolibrodeclasesAnotacion);
			v1.com.mauro.librodeclases.Asistencia lcommaurolibrodeclasesAsistencia = v1.com.mauro.librodeclases.AsistenciaDAO.loadAsistenciaByQuery(null, null);
			// Update the properties of the persistent object
			v1.com.mauro.librodeclases.AsistenciaDAO.save(lcommaurolibrodeclasesAsistencia);
			v1.com.mauro.librodeclases.Actividad lcommaurolibrodeclasesActividad = v1.com.mauro.librodeclases.ActividadDAO.loadActividadByQuery(null, null);
			// Update the properties of the persistent object
			v1.com.mauro.librodeclases.ActividadDAO.save(lcommaurolibrodeclasesActividad);
			v1.com.mauro.librodeclases.Colegio lcommaurolibrodeclasesColegio = v1.com.mauro.librodeclases.ColegioDAO.loadColegioByQuery(null, null);
			// Update the properties of the persistent object
			v1.com.mauro.librodeclases.ColegioDAO.save(lcommaurolibrodeclasesColegio);
			v1.com.mauro.librodeclases.Nota lcommaurolibrodeclasesNota = v1.com.mauro.librodeclases.NotaDAO.loadNotaByQuery(null, null);
			// Update the properties of the persistent object
			v1.com.mauro.librodeclases.NotaDAO.save(lcommaurolibrodeclasesNota);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Curso by CursoCriteria");
		v1.com.mauro.librodeclases.CursoCriteria lcommaurolibrodeclasesCursoCriteria = new v1.com.mauro.librodeclases.CursoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcommaurolibrodeclasesCursoCriteria.ID.eq();
		System.out.println(lcommaurolibrodeclasesCursoCriteria.uniqueCurso());
		
		System.out.println("Retrieving Alumno by AlumnoCriteria");
		v1.com.mauro.librodeclases.AlumnoCriteria lcommaurolibrodeclasesAlumnoCriteria = new v1.com.mauro.librodeclases.AlumnoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcommaurolibrodeclasesAlumnoCriteria.ID.eq();
		System.out.println(lcommaurolibrodeclasesAlumnoCriteria.uniqueAlumno());
		
		System.out.println("Retrieving Apoderado by ApoderadoCriteria");
		v1.com.mauro.librodeclases.ApoderadoCriteria lcommaurolibrodeclasesApoderadoCriteria = new v1.com.mauro.librodeclases.ApoderadoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcommaurolibrodeclasesApoderadoCriteria.ID.eq();
		System.out.println(lcommaurolibrodeclasesApoderadoCriteria.uniqueApoderado());
		
		System.out.println("Retrieving Profesor by ProfesorCriteria");
		v1.com.mauro.librodeclases.ProfesorCriteria lcommaurolibrodeclasesProfesorCriteria = new v1.com.mauro.librodeclases.ProfesorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcommaurolibrodeclasesProfesorCriteria.ID.eq();
		System.out.println(lcommaurolibrodeclasesProfesorCriteria.uniqueProfesor());
		
		System.out.println("Retrieving Ramo by RamoCriteria");
		v1.com.mauro.librodeclases.RamoCriteria lcommaurolibrodeclasesRamoCriteria = new v1.com.mauro.librodeclases.RamoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcommaurolibrodeclasesRamoCriteria.ID.eq();
		System.out.println(lcommaurolibrodeclasesRamoCriteria.uniqueRamo());
		
		System.out.println("Retrieving Anotacion by AnotacionCriteria");
		v1.com.mauro.librodeclases.AnotacionCriteria lcommaurolibrodeclasesAnotacionCriteria = new v1.com.mauro.librodeclases.AnotacionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcommaurolibrodeclasesAnotacionCriteria.ID.eq();
		System.out.println(lcommaurolibrodeclasesAnotacionCriteria.uniqueAnotacion());
		
		System.out.println("Retrieving Asistencia by AsistenciaCriteria");
		v1.com.mauro.librodeclases.AsistenciaCriteria lcommaurolibrodeclasesAsistenciaCriteria = new v1.com.mauro.librodeclases.AsistenciaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcommaurolibrodeclasesAsistenciaCriteria.ID.eq();
		System.out.println(lcommaurolibrodeclasesAsistenciaCriteria.uniqueAsistencia());
		
		System.out.println("Retrieving Actividad by ActividadCriteria");
		v1.com.mauro.librodeclases.ActividadCriteria lcommaurolibrodeclasesActividadCriteria = new v1.com.mauro.librodeclases.ActividadCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcommaurolibrodeclasesActividadCriteria.ID.eq();
		System.out.println(lcommaurolibrodeclasesActividadCriteria.uniqueActividad());
		
		System.out.println("Retrieving Colegio by ColegioCriteria");
		v1.com.mauro.librodeclases.ColegioCriteria lcommaurolibrodeclasesColegioCriteria = new v1.com.mauro.librodeclases.ColegioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcommaurolibrodeclasesColegioCriteria.ID.eq();
		System.out.println(lcommaurolibrodeclasesColegioCriteria.uniqueColegio());
		
		System.out.println("Retrieving Nota by NotaCriteria");
		v1.com.mauro.librodeclases.NotaCriteria lcommaurolibrodeclasesNotaCriteria = new v1.com.mauro.librodeclases.NotaCriteria();
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
				v1.com.mauro.librodeclases.LibroClasesPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
