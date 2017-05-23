/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package v2.ormsamples;

import org.orm.*;
public class ListLibroClaseData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Estudiante...");
		v2.orm.Estudiante[] ormEstudiantes = v2.orm.EstudianteDAO.listEstudianteByQuery(null, null);
		int length = Math.min(ormEstudiantes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormEstudiantes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Persona...");
		v2.orm.Persona[] ormPersonas = v2.orm.PersonaDAO.listPersonaByQuery(null, null);
		length = Math.min(ormPersonas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormPersonas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Profesor...");
		v2.orm.Profesor[] ormProfesors = v2.orm.ProfesorDAO.listProfesorByQuery(null, null);
		length = Math.min(ormProfesors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormProfesors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Apoderado...");
		v2.orm.Apoderado[] ormApoderados = v2.orm.ApoderadoDAO.listApoderadoByQuery(null, null);
		length = Math.min(ormApoderados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormApoderados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Directivo...");
		v2.orm.Directivo[] ormDirectivos = v2.orm.DirectivoDAO.listDirectivoByQuery(null, null);
		length = Math.min(ormDirectivos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormDirectivos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Curso...");
		v2.orm.Curso[] ormCursos = v2.orm.CursoDAO.listCursoByQuery(null, null);
		length = Math.min(ormCursos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormCursos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Asignatura...");
		v2.orm.Asignatura[] ormAsignaturas = v2.orm.AsignaturaDAO.listAsignaturaByQuery(null, null);
		length = Math.min(ormAsignaturas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormAsignaturas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Actividad...");
		v2.orm.Actividad[] ormActividads = v2.orm.ActividadDAO.listActividadByQuery(null, null);
		length = Math.min(ormActividads.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormActividads[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Nota...");
		v2.orm.Nota[] ormNotas = v2.orm.NotaDAO.listNotaByQuery(null, null);
		length = Math.min(ormNotas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormNotas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Institucion...");
		v2.orm.Institucion[] ormInstitucions = v2.orm.InstitucionDAO.listInstitucionByQuery(null, null);
		length = Math.min(ormInstitucions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormInstitucions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Asistencia...");
		v2.orm.Asistencia[] ormAsistencias = v2.orm.AsistenciaDAO.listAsistenciaByQuery(null, null);
		length = Math.min(ormAsistencias.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormAsistencias[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Anotaciones...");
		v2.orm.Anotaciones[] ormAnotacioneses = v2.orm.AnotacionesDAO.listAnotacionesByQuery(null, null);
		length = Math.min(ormAnotacioneses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormAnotacioneses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Curso_estudiante...");
		v2.orm.Curso_estudiante[] ormCurso_estudiantes = v2.orm.Curso_estudianteDAO.listCurso_estudianteByQuery(null, null);
		length = Math.min(ormCurso_estudiantes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormCurso_estudiantes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Familia...");
		v2.orm.Familia[] ormFamilias = v2.orm.FamiliaDAO.listFamiliaByQuery(null, null);
		length = Math.min(ormFamilias.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormFamilias[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Estudiante by Criteria...");
		v2.orm.EstudianteCriteria lormEstudianteCriteria = new v2.orm.EstudianteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormEstudianteCriteria.id.eq();
		lormEstudianteCriteria.setMaxResults(ROW_COUNT);
		v2.orm.Estudiante[] ormEstudiantes = lormEstudianteCriteria.listEstudiante();
		int length =ormEstudiantes== null ? 0 : Math.min(ormEstudiantes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormEstudiantes[i]);
		}
		System.out.println(length + " Estudiante record(s) retrieved."); 
		
		System.out.println("Listing Persona by Criteria...");
		v2.orm.PersonaCriteria lormPersonaCriteria = new v2.orm.PersonaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormPersonaCriteria.id.eq();
		lormPersonaCriteria.setMaxResults(ROW_COUNT);
		v2.orm.Persona[] ormPersonas = lormPersonaCriteria.listPersona();
		length =ormPersonas== null ? 0 : Math.min(ormPersonas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormPersonas[i]);
		}
		System.out.println(length + " Persona record(s) retrieved."); 
		
		System.out.println("Listing Profesor by Criteria...");
		v2.orm.ProfesorCriteria lormProfesorCriteria = new v2.orm.ProfesorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormProfesorCriteria.id.eq();
		lormProfesorCriteria.setMaxResults(ROW_COUNT);
		v2.orm.Profesor[] ormProfesors = lormProfesorCriteria.listProfesor();
		length =ormProfesors== null ? 0 : Math.min(ormProfesors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormProfesors[i]);
		}
		System.out.println(length + " Profesor record(s) retrieved."); 
		
		System.out.println("Listing Apoderado by Criteria...");
		v2.orm.ApoderadoCriteria lormApoderadoCriteria = new v2.orm.ApoderadoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormApoderadoCriteria.id.eq();
		lormApoderadoCriteria.setMaxResults(ROW_COUNT);
		v2.orm.Apoderado[] ormApoderados = lormApoderadoCriteria.listApoderado();
		length =ormApoderados== null ? 0 : Math.min(ormApoderados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormApoderados[i]);
		}
		System.out.println(length + " Apoderado record(s) retrieved."); 
		
		System.out.println("Listing Directivo by Criteria...");
		v2.orm.DirectivoCriteria lormDirectivoCriteria = new v2.orm.DirectivoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormDirectivoCriteria.id.eq();
		lormDirectivoCriteria.setMaxResults(ROW_COUNT);
		v2.orm.Directivo[] ormDirectivos = lormDirectivoCriteria.listDirectivo();
		length =ormDirectivos== null ? 0 : Math.min(ormDirectivos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormDirectivos[i]);
		}
		System.out.println(length + " Directivo record(s) retrieved."); 
		
		System.out.println("Listing Curso by Criteria...");
		v2.orm.CursoCriteria lormCursoCriteria = new v2.orm.CursoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormCursoCriteria.id.eq();
		lormCursoCriteria.setMaxResults(ROW_COUNT);
		v2.orm.Curso[] ormCursos = lormCursoCriteria.listCurso();
		length =ormCursos== null ? 0 : Math.min(ormCursos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormCursos[i]);
		}
		System.out.println(length + " Curso record(s) retrieved."); 
		
		System.out.println("Listing Asignatura by Criteria...");
		v2.orm.AsignaturaCriteria lormAsignaturaCriteria = new v2.orm.AsignaturaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormAsignaturaCriteria.id.eq();
		lormAsignaturaCriteria.setMaxResults(ROW_COUNT);
		v2.orm.Asignatura[] ormAsignaturas = lormAsignaturaCriteria.listAsignatura();
		length =ormAsignaturas== null ? 0 : Math.min(ormAsignaturas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormAsignaturas[i]);
		}
		System.out.println(length + " Asignatura record(s) retrieved."); 
		
		System.out.println("Listing Actividad by Criteria...");
		v2.orm.ActividadCriteria lormActividadCriteria = new v2.orm.ActividadCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormActividadCriteria.id.eq();
		lormActividadCriteria.setMaxResults(ROW_COUNT);
		v2.orm.Actividad[] ormActividads = lormActividadCriteria.listActividad();
		length =ormActividads== null ? 0 : Math.min(ormActividads.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormActividads[i]);
		}
		System.out.println(length + " Actividad record(s) retrieved."); 
		
		System.out.println("Listing Nota by Criteria...");
		v2.orm.NotaCriteria lormNotaCriteria = new v2.orm.NotaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormNotaCriteria.id.eq();
		lormNotaCriteria.setMaxResults(ROW_COUNT);
		v2.orm.Nota[] ormNotas = lormNotaCriteria.listNota();
		length =ormNotas== null ? 0 : Math.min(ormNotas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormNotas[i]);
		}
		System.out.println(length + " Nota record(s) retrieved."); 
		
		System.out.println("Listing Institucion by Criteria...");
		v2.orm.InstitucionCriteria lormInstitucionCriteria = new v2.orm.InstitucionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormInstitucionCriteria.id.eq();
		lormInstitucionCriteria.setMaxResults(ROW_COUNT);
		v2.orm.Institucion[] ormInstitucions = lormInstitucionCriteria.listInstitucion();
		length =ormInstitucions== null ? 0 : Math.min(ormInstitucions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormInstitucions[i]);
		}
		System.out.println(length + " Institucion record(s) retrieved."); 
		
		System.out.println("Listing Asistencia by Criteria...");
		v2.orm.AsistenciaCriteria lormAsistenciaCriteria = new v2.orm.AsistenciaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormAsistenciaCriteria.id.eq();
		lormAsistenciaCriteria.setMaxResults(ROW_COUNT);
		v2.orm.Asistencia[] ormAsistencias = lormAsistenciaCriteria.listAsistencia();
		length =ormAsistencias== null ? 0 : Math.min(ormAsistencias.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormAsistencias[i]);
		}
		System.out.println(length + " Asistencia record(s) retrieved."); 
		
		System.out.println("Listing Anotaciones by Criteria...");
		v2.orm.AnotacionesCriteria lormAnotacionesCriteria = new v2.orm.AnotacionesCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormAnotacionesCriteria.id.eq();
		lormAnotacionesCriteria.setMaxResults(ROW_COUNT);
		v2.orm.Anotaciones[] ormAnotacioneses = lormAnotacionesCriteria.listAnotaciones();
		length =ormAnotacioneses== null ? 0 : Math.min(ormAnotacioneses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormAnotacioneses[i]);
		}
		System.out.println(length + " Anotaciones record(s) retrieved."); 
		
		System.out.println("Listing Curso_estudiante by Criteria...");
		v2.orm.Curso_estudianteCriteria lormCurso_estudianteCriteria = new v2.orm.Curso_estudianteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormCurso_estudianteCriteria.id.eq();
		lormCurso_estudianteCriteria.setMaxResults(ROW_COUNT);
		v2.orm.Curso_estudiante[] ormCurso_estudiantes = lormCurso_estudianteCriteria.listCurso_estudiante();
		length =ormCurso_estudiantes== null ? 0 : Math.min(ormCurso_estudiantes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormCurso_estudiantes[i]);
		}
		System.out.println(length + " Curso_estudiante record(s) retrieved."); 
		
		System.out.println("Listing Familia by Criteria...");
		v2.orm.FamiliaCriteria lormFamiliaCriteria = new v2.orm.FamiliaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormFamiliaCriteria.id_pk.eq();
		lormFamiliaCriteria.setMaxResults(ROW_COUNT);
		v2.orm.Familia[] ormFamilias = lormFamiliaCriteria.listFamilia();
		length =ormFamilias== null ? 0 : Math.min(ormFamilias.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormFamilias[i]);
		}
		System.out.println(length + " Familia record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListLibroClaseData listLibroClaseData = new ListLibroClaseData();
			try {
				listLibroClaseData.listTestData();
				//listLibroClaseData.listByCriteria();
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
