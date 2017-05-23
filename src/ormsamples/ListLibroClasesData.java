/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListLibroClasesData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Curso...");
		com.mauro.librodeclases.Curso[] commaurolibrodeclasesCursos = com.mauro.librodeclases.CursoDAO.listCursoByQuery(null, null);
		int length = Math.min(commaurolibrodeclasesCursos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(commaurolibrodeclasesCursos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Alumno...");
		com.mauro.librodeclases.Alumno[] commaurolibrodeclasesAlumnos = com.mauro.librodeclases.AlumnoDAO.listAlumnoByQuery(null, null);
		length = Math.min(commaurolibrodeclasesAlumnos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(commaurolibrodeclasesAlumnos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Apoderado...");
		com.mauro.librodeclases.Apoderado[] commaurolibrodeclasesApoderados = com.mauro.librodeclases.ApoderadoDAO.listApoderadoByQuery(null, null);
		length = Math.min(commaurolibrodeclasesApoderados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(commaurolibrodeclasesApoderados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Profesor...");
		com.mauro.librodeclases.Profesor[] commaurolibrodeclasesProfesors = com.mauro.librodeclases.ProfesorDAO.listProfesorByQuery(null, null);
		length = Math.min(commaurolibrodeclasesProfesors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(commaurolibrodeclasesProfesors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Ramo...");
		com.mauro.librodeclases.Ramo[] commaurolibrodeclasesRamos = com.mauro.librodeclases.RamoDAO.listRamoByQuery(null, null);
		length = Math.min(commaurolibrodeclasesRamos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(commaurolibrodeclasesRamos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Anotacion...");
		com.mauro.librodeclases.Anotacion[] commaurolibrodeclasesAnotacions = com.mauro.librodeclases.AnotacionDAO.listAnotacionByQuery(null, null);
		length = Math.min(commaurolibrodeclasesAnotacions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(commaurolibrodeclasesAnotacions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Asistencia...");
		com.mauro.librodeclases.Asistencia[] commaurolibrodeclasesAsistencias = com.mauro.librodeclases.AsistenciaDAO.listAsistenciaByQuery(null, null);
		length = Math.min(commaurolibrodeclasesAsistencias.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(commaurolibrodeclasesAsistencias[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Actividad...");
		com.mauro.librodeclases.Actividad[] commaurolibrodeclasesActividads = com.mauro.librodeclases.ActividadDAO.listActividadByQuery(null, null);
		length = Math.min(commaurolibrodeclasesActividads.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(commaurolibrodeclasesActividads[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Colegio...");
		com.mauro.librodeclases.Colegio[] commaurolibrodeclasesColegios = com.mauro.librodeclases.ColegioDAO.listColegioByQuery(null, null);
		length = Math.min(commaurolibrodeclasesColegios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(commaurolibrodeclasesColegios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Nota...");
		com.mauro.librodeclases.Nota[] commaurolibrodeclasesNotas = com.mauro.librodeclases.NotaDAO.listNotaByQuery(null, null);
		length = Math.min(commaurolibrodeclasesNotas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(commaurolibrodeclasesNotas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Curso by Criteria...");
		com.mauro.librodeclases.CursoCriteria lcommaurolibrodeclasesCursoCriteria = new com.mauro.librodeclases.CursoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcommaurolibrodeclasesCursoCriteria.ID.eq();
		lcommaurolibrodeclasesCursoCriteria.setMaxResults(ROW_COUNT);
		com.mauro.librodeclases.Curso[] commaurolibrodeclasesCursos = lcommaurolibrodeclasesCursoCriteria.listCurso();
		int length =commaurolibrodeclasesCursos== null ? 0 : Math.min(commaurolibrodeclasesCursos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(commaurolibrodeclasesCursos[i]);
		}
		System.out.println(length + " Curso record(s) retrieved."); 
		
		System.out.println("Listing Alumno by Criteria...");
		com.mauro.librodeclases.AlumnoCriteria lcommaurolibrodeclasesAlumnoCriteria = new com.mauro.librodeclases.AlumnoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcommaurolibrodeclasesAlumnoCriteria.ID.eq();
		lcommaurolibrodeclasesAlumnoCriteria.setMaxResults(ROW_COUNT);
		com.mauro.librodeclases.Alumno[] commaurolibrodeclasesAlumnos = lcommaurolibrodeclasesAlumnoCriteria.listAlumno();
		length =commaurolibrodeclasesAlumnos== null ? 0 : Math.min(commaurolibrodeclasesAlumnos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(commaurolibrodeclasesAlumnos[i]);
		}
		System.out.println(length + " Alumno record(s) retrieved."); 
		
		System.out.println("Listing Apoderado by Criteria...");
		com.mauro.librodeclases.ApoderadoCriteria lcommaurolibrodeclasesApoderadoCriteria = new com.mauro.librodeclases.ApoderadoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcommaurolibrodeclasesApoderadoCriteria.ID.eq();
		lcommaurolibrodeclasesApoderadoCriteria.setMaxResults(ROW_COUNT);
		com.mauro.librodeclases.Apoderado[] commaurolibrodeclasesApoderados = lcommaurolibrodeclasesApoderadoCriteria.listApoderado();
		length =commaurolibrodeclasesApoderados== null ? 0 : Math.min(commaurolibrodeclasesApoderados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(commaurolibrodeclasesApoderados[i]);
		}
		System.out.println(length + " Apoderado record(s) retrieved."); 
		
		System.out.println("Listing Profesor by Criteria...");
		com.mauro.librodeclases.ProfesorCriteria lcommaurolibrodeclasesProfesorCriteria = new com.mauro.librodeclases.ProfesorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcommaurolibrodeclasesProfesorCriteria.ID.eq();
		lcommaurolibrodeclasesProfesorCriteria.setMaxResults(ROW_COUNT);
		com.mauro.librodeclases.Profesor[] commaurolibrodeclasesProfesors = lcommaurolibrodeclasesProfesorCriteria.listProfesor();
		length =commaurolibrodeclasesProfesors== null ? 0 : Math.min(commaurolibrodeclasesProfesors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(commaurolibrodeclasesProfesors[i]);
		}
		System.out.println(length + " Profesor record(s) retrieved."); 
		
		System.out.println("Listing Ramo by Criteria...");
		com.mauro.librodeclases.RamoCriteria lcommaurolibrodeclasesRamoCriteria = new com.mauro.librodeclases.RamoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcommaurolibrodeclasesRamoCriteria.ID.eq();
		lcommaurolibrodeclasesRamoCriteria.setMaxResults(ROW_COUNT);
		com.mauro.librodeclases.Ramo[] commaurolibrodeclasesRamos = lcommaurolibrodeclasesRamoCriteria.listRamo();
		length =commaurolibrodeclasesRamos== null ? 0 : Math.min(commaurolibrodeclasesRamos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(commaurolibrodeclasesRamos[i]);
		}
		System.out.println(length + " Ramo record(s) retrieved."); 
		
		System.out.println("Listing Anotacion by Criteria...");
		com.mauro.librodeclases.AnotacionCriteria lcommaurolibrodeclasesAnotacionCriteria = new com.mauro.librodeclases.AnotacionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcommaurolibrodeclasesAnotacionCriteria.ID.eq();
		lcommaurolibrodeclasesAnotacionCriteria.setMaxResults(ROW_COUNT);
		com.mauro.librodeclases.Anotacion[] commaurolibrodeclasesAnotacions = lcommaurolibrodeclasesAnotacionCriteria.listAnotacion();
		length =commaurolibrodeclasesAnotacions== null ? 0 : Math.min(commaurolibrodeclasesAnotacions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(commaurolibrodeclasesAnotacions[i]);
		}
		System.out.println(length + " Anotacion record(s) retrieved."); 
		
		System.out.println("Listing Asistencia by Criteria...");
		com.mauro.librodeclases.AsistenciaCriteria lcommaurolibrodeclasesAsistenciaCriteria = new com.mauro.librodeclases.AsistenciaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcommaurolibrodeclasesAsistenciaCriteria.ID.eq();
		lcommaurolibrodeclasesAsistenciaCriteria.setMaxResults(ROW_COUNT);
		com.mauro.librodeclases.Asistencia[] commaurolibrodeclasesAsistencias = lcommaurolibrodeclasesAsistenciaCriteria.listAsistencia();
		length =commaurolibrodeclasesAsistencias== null ? 0 : Math.min(commaurolibrodeclasesAsistencias.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(commaurolibrodeclasesAsistencias[i]);
		}
		System.out.println(length + " Asistencia record(s) retrieved."); 
		
		System.out.println("Listing Actividad by Criteria...");
		com.mauro.librodeclases.ActividadCriteria lcommaurolibrodeclasesActividadCriteria = new com.mauro.librodeclases.ActividadCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcommaurolibrodeclasesActividadCriteria.ID.eq();
		lcommaurolibrodeclasesActividadCriteria.setMaxResults(ROW_COUNT);
		com.mauro.librodeclases.Actividad[] commaurolibrodeclasesActividads = lcommaurolibrodeclasesActividadCriteria.listActividad();
		length =commaurolibrodeclasesActividads== null ? 0 : Math.min(commaurolibrodeclasesActividads.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(commaurolibrodeclasesActividads[i]);
		}
		System.out.println(length + " Actividad record(s) retrieved."); 
		
		System.out.println("Listing Colegio by Criteria...");
		com.mauro.librodeclases.ColegioCriteria lcommaurolibrodeclasesColegioCriteria = new com.mauro.librodeclases.ColegioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcommaurolibrodeclasesColegioCriteria.ID.eq();
		lcommaurolibrodeclasesColegioCriteria.setMaxResults(ROW_COUNT);
		com.mauro.librodeclases.Colegio[] commaurolibrodeclasesColegios = lcommaurolibrodeclasesColegioCriteria.listColegio();
		length =commaurolibrodeclasesColegios== null ? 0 : Math.min(commaurolibrodeclasesColegios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(commaurolibrodeclasesColegios[i]);
		}
		System.out.println(length + " Colegio record(s) retrieved."); 
		
		System.out.println("Listing Nota by Criteria...");
		com.mauro.librodeclases.NotaCriteria lcommaurolibrodeclasesNotaCriteria = new com.mauro.librodeclases.NotaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcommaurolibrodeclasesNotaCriteria.ID.eq();
		lcommaurolibrodeclasesNotaCriteria.setMaxResults(ROW_COUNT);
		com.mauro.librodeclases.Nota[] commaurolibrodeclasesNotas = lcommaurolibrodeclasesNotaCriteria.listNota();
		length =commaurolibrodeclasesNotas== null ? 0 : Math.min(commaurolibrodeclasesNotas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(commaurolibrodeclasesNotas[i]);
		}
		System.out.println(length + " Nota record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListLibroClasesData listLibroClasesData = new ListLibroClasesData();
			try {
				listLibroClasesData.listTestData();
				//listLibroClasesData.listByCriteria();
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
