/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package v1.ormsamples;

import org.orm.*;
public class CreateLibroClasesData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = v1.com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession().beginTransaction();
		try {
			v1.com.mauro.librodeclases.Curso lcommaurolibrodeclasesCurso = v1.com.mauro.librodeclases.CursoDAO.createCurso();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : alumnos, ramo, letra, nivel, colegio
			v1.com.mauro.librodeclases.CursoDAO.save(lcommaurolibrodeclasesCurso);
			v1.com.mauro.librodeclases.Alumno lcommaurolibrodeclasesAlumno = v1.com.mauro.librodeclases.AlumnoDAO.createAlumno();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : anotaciones, nota, ingreso, curso, apoderado, registro
			v1.com.mauro.librodeclases.AlumnoDAO.save(lcommaurolibrodeclasesAlumno);
			v1.com.mauro.librodeclases.Apoderado lcommaurolibrodeclasesApoderado = v1.com.mauro.librodeclases.ApoderadoDAO.createApoderado();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : alumnos
			v1.com.mauro.librodeclases.ApoderadoDAO.save(lcommaurolibrodeclasesApoderado);
			v1.com.mauro.librodeclases.Profesor lcommaurolibrodeclasesProfesor = v1.com.mauro.librodeclases.ProfesorDAO.createProfesor();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : ramo, colegio
			v1.com.mauro.librodeclases.ProfesorDAO.save(lcommaurolibrodeclasesProfesor);
			v1.com.mauro.librodeclases.Ramo lcommaurolibrodeclasesRamo = v1.com.mauro.librodeclases.RamoDAO.createRamo();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : planificacion, profesor
			v1.com.mauro.librodeclases.RamoDAO.save(lcommaurolibrodeclasesRamo);
			v1.com.mauro.librodeclases.Anotacion lcommaurolibrodeclasesAnotacion = v1.com.mauro.librodeclases.AnotacionDAO.createAnotacion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : esPositiva
			v1.com.mauro.librodeclases.AnotacionDAO.save(lcommaurolibrodeclasesAnotacion);
			v1.com.mauro.librodeclases.Asistencia lcommaurolibrodeclasesAsistencia = v1.com.mauro.librodeclases.AsistenciaDAO.createAsistencia();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : presente
			v1.com.mauro.librodeclases.AsistenciaDAO.save(lcommaurolibrodeclasesAsistencia);
			v1.com.mauro.librodeclases.Actividad lcommaurolibrodeclasesActividad = v1.com.mauro.librodeclases.ActividadDAO.createActividad();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : evaluado
			v1.com.mauro.librodeclases.ActividadDAO.save(lcommaurolibrodeclasesActividad);
			v1.com.mauro.librodeclases.Colegio lcommaurolibrodeclasesColegio = v1.com.mauro.librodeclases.ColegioDAO.createColegio();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : profesores, cursos
			v1.com.mauro.librodeclases.ColegioDAO.save(lcommaurolibrodeclasesColegio);
			v1.com.mauro.librodeclases.Nota lcommaurolibrodeclasesNota = v1.com.mauro.librodeclases.NotaDAO.createNota();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : nota
			v1.com.mauro.librodeclases.NotaDAO.save(lcommaurolibrodeclasesNota);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateLibroClasesData createLibroClasesData = new CreateLibroClasesData();
			try {
				createLibroClasesData.createTestData();
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
