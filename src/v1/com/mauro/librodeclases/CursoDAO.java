/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package v1.com.mauro.librodeclases;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class CursoDAO {
	public static Curso loadCursoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = v1.com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return loadCursoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso getCursoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = v1.com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return getCursoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso loadCursoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = v1.com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return loadCursoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso getCursoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = v1.com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return getCursoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso loadCursoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Curso) session.load(v1.com.mauro.librodeclases.Curso.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso getCursoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Curso) session.get(v1.com.mauro.librodeclases.Curso.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso loadCursoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Curso) session.load(v1.com.mauro.librodeclases.Curso.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso getCursoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Curso) session.get(v1.com.mauro.librodeclases.Curso.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCurso(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = v1.com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return queryCurso(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCurso(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = v1.com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return queryCurso(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso[] listCursoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = v1.com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return listCursoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso[] listCursoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = v1.com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return listCursoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCurso(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mauro.librodeclases.Curso as Curso");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCurso(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mauro.librodeclases.Curso as Curso");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Curso", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso[] listCursoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCurso(session, condition, orderBy);
			return (Curso[]) list.toArray(new Curso[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso[] listCursoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCurso(session, condition, orderBy, lockMode);
			return (Curso[]) list.toArray(new Curso[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso loadCursoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = v1.com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return loadCursoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso loadCursoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = v1.com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return loadCursoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso loadCursoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Curso[] cursos = listCursoByQuery(session, condition, orderBy);
		if (cursos != null && cursos.length > 0)
			return cursos[0];
		else
			return null;
	}
	
	public static Curso loadCursoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Curso[] cursos = listCursoByQuery(session, condition, orderBy, lockMode);
		if (cursos != null && cursos.length > 0)
			return cursos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCursoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = v1.com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return iterateCursoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCursoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = v1.com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return iterateCursoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCursoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mauro.librodeclases.Curso as Curso");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCursoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mauro.librodeclases.Curso as Curso");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Curso", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso createCurso() {
		return new v1.com.mauro.librodeclases.Curso((byte) 1, 'A');
	}
	
	public static boolean save(v1.com.mauro.librodeclases.Curso curso) throws PersistentException {
		try {
			v1.com.mauro.librodeclases.LibroClasesPersistentManager.instance().saveObject(curso);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(v1.com.mauro.librodeclases.Curso curso) throws PersistentException {
		try {
			v1.com.mauro.librodeclases.LibroClasesPersistentManager.instance().deleteObject(curso);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(v1.com.mauro.librodeclases.Curso curso)throws PersistentException {
		try {
			if (curso.colegio != null) {
				curso.colegio.cursos.remove(curso);
			}
			
			v1.com.mauro.librodeclases.Alumno[] lAlumnoss = (v1.com.mauro.librodeclases.Alumno[]) curso.alumnos.toArray();
			for(int i = 0; i < lAlumnoss.length; i++) {
				lAlumnoss[i].curso = null;
			}
			return delete(curso);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(v1.com.mauro.librodeclases.Curso curso, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (curso.colegio != null) {
				curso.colegio.cursos.remove(curso);
			}
			
			v1.com.mauro.librodeclases.Alumno[] lAlumnoss = (v1.com.mauro.librodeclases.Alumno[]) curso.alumnos.toArray();
			for(int i = 0; i < lAlumnoss.length; i++) {
				lAlumnoss[i].curso = null;
			}
			try {
				session.delete(curso);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(v1.com.mauro.librodeclases.Curso curso) throws PersistentException {
		try {
			v1.com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession().refresh(curso);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(v1.com.mauro.librodeclases.Curso curso) throws PersistentException {
		try {
			v1.com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession().evict(curso);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso loadCursoByCriteria(CursoCriteria cursoCriteria) {
		Curso[] cursos = listCursoByCriteria(cursoCriteria);
		if(cursos == null || cursos.length == 0) {
			return null;
		}
		return cursos[0];
	}
	
	public static Curso[] listCursoByCriteria(CursoCriteria cursoCriteria) {
		return cursoCriteria.listCurso();
	}
}
