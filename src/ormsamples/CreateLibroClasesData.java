/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateLibroClasesData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession().beginTransaction();
		try {
			com.mauro.librodeclases.Curso lcommaurolibrodeclasesCurso = com.mauro.librodeclases.CursoDAO.createCurso();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : alumnos, ramo, letra, nivel, colegio
			com.mauro.librodeclases.CursoDAO.save(lcommaurolibrodeclasesCurso);
			com.mauro.librodeclases.Alumno lcommaurolibrodeclasesAlumno = com.mauro.librodeclases.AlumnoDAO.createAlumno();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : anotaciones, nota, ingreso, curso, apoderado, registro
			com.mauro.librodeclases.AlumnoDAO.save(lcommaurolibrodeclasesAlumno);
			com.mauro.librodeclases.Apoderado lcommaurolibrodeclasesApoderado = com.mauro.librodeclases.ApoderadoDAO.createApoderado();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : alumnos
			com.mauro.librodeclases.ApoderadoDAO.save(lcommaurolibrodeclasesApoderado);
			com.mauro.librodeclases.Profesor lcommaurolibrodeclasesProfesor = com.mauro.librodeclases.ProfesorDAO.createProfesor();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : ramo, colegio
			com.mauro.librodeclases.ProfesorDAO.save(lcommaurolibrodeclasesProfesor);
			com.mauro.librodeclases.Ramo lcommaurolibrodeclasesRamo = com.mauro.librodeclases.RamoDAO.createRamo();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : planificacion, profesor
			com.mauro.librodeclases.RamoDAO.save(lcommaurolibrodeclasesRamo);
			com.mauro.librodeclases.Anotacion lcommaurolibrodeclasesAnotacion = com.mauro.librodeclases.AnotacionDAO.createAnotacion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : esPositiva
			com.mauro.librodeclases.AnotacionDAO.save(lcommaurolibrodeclasesAnotacion);
			com.mauro.librodeclases.Asistencia lcommaurolibrodeclasesAsistencia = com.mauro.librodeclases.AsistenciaDAO.createAsistencia();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : presente
			com.mauro.librodeclases.AsistenciaDAO.save(lcommaurolibrodeclasesAsistencia);
			com.mauro.librodeclases.Actividad lcommaurolibrodeclasesActividad = com.mauro.librodeclases.ActividadDAO.createActividad();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : evaluado
			com.mauro.librodeclases.ActividadDAO.save(lcommaurolibrodeclasesActividad);
			com.mauro.librodeclases.Colegio lcommaurolibrodeclasesColegio = com.mauro.librodeclases.ColegioDAO.createColegio();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : profesores, cursos
			com.mauro.librodeclases.ColegioDAO.save(lcommaurolibrodeclasesColegio);
			com.mauro.librodeclases.Nota lcommaurolibrodeclasesNota = com.mauro.librodeclases.NotaDAO.createNota();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : nota
			com.mauro.librodeclases.NotaDAO.save(lcommaurolibrodeclasesNota);
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
				com.mauro.librodeclases.LibroClasesPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
