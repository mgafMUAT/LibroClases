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
package com.mauro.librodeclases;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class ColegioDAO {
	public static Colegio loadColegioByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return loadColegioByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Colegio getColegioByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return getColegioByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Colegio loadColegioByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return loadColegioByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Colegio getColegioByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return getColegioByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Colegio loadColegioByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Colegio) session.load(com.mauro.librodeclases.Colegio.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Colegio getColegioByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Colegio) session.get(com.mauro.librodeclases.Colegio.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Colegio loadColegioByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Colegio) session.load(com.mauro.librodeclases.Colegio.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Colegio getColegioByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Colegio) session.get(com.mauro.librodeclases.Colegio.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryColegio(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return queryColegio(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryColegio(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return queryColegio(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Colegio[] listColegioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return listColegioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Colegio[] listColegioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return listColegioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryColegio(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mauro.librodeclases.Colegio as Colegio");
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
	
	public static List queryColegio(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mauro.librodeclases.Colegio as Colegio");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Colegio", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Colegio[] listColegioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryColegio(session, condition, orderBy);
			return (Colegio[]) list.toArray(new Colegio[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Colegio[] listColegioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryColegio(session, condition, orderBy, lockMode);
			return (Colegio[]) list.toArray(new Colegio[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Colegio loadColegioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return loadColegioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Colegio loadColegioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return loadColegioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Colegio loadColegioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Colegio[] colegios = listColegioByQuery(session, condition, orderBy);
		if (colegios != null && colegios.length > 0)
			return colegios[0];
		else
			return null;
	}
	
	public static Colegio loadColegioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Colegio[] colegios = listColegioByQuery(session, condition, orderBy, lockMode);
		if (colegios != null && colegios.length > 0)
			return colegios[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateColegioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return iterateColegioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateColegioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return iterateColegioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateColegioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mauro.librodeclases.Colegio as Colegio");
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
	
	public static java.util.Iterator iterateColegioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mauro.librodeclases.Colegio as Colegio");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Colegio", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Colegio createColegio() {
		return new com.mauro.librodeclases.Colegio("", "");
	}
	
	public static boolean save(com.mauro.librodeclases.Colegio colegio) throws PersistentException {
		try {
			com.mauro.librodeclases.LibroClasesPersistentManager.instance().saveObject(colegio);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(com.mauro.librodeclases.Colegio colegio) throws PersistentException {
		try {
			com.mauro.librodeclases.LibroClasesPersistentManager.instance().deleteObject(colegio);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.mauro.librodeclases.Colegio colegio)throws PersistentException {
		try {
			com.mauro.librodeclases.Curso[] lCursoss = (com.mauro.librodeclases.Curso[]) colegio.cursos.toArray();
			for(int i = 0; i < lCursoss.length; i++) {
				lCursoss[i].colegio = null;
			}
			com.mauro.librodeclases.Profesor[] lProfesoress = (com.mauro.librodeclases.Profesor[]) colegio.profesores.toArray();
			for(int i = 0; i < lProfesoress.length; i++) {
				lProfesoress[i].colegio = null;
			}
			return delete(colegio);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.mauro.librodeclases.Colegio colegio, org.orm.PersistentSession session)throws PersistentException {
		try {
			com.mauro.librodeclases.Curso[] lCursoss = (com.mauro.librodeclases.Curso[]) colegio.cursos.toArray();
			for(int i = 0; i < lCursoss.length; i++) {
				lCursoss[i].colegio = null;
			}
			com.mauro.librodeclases.Profesor[] lProfesoress = (com.mauro.librodeclases.Profesor[]) colegio.profesores.toArray();
			for(int i = 0; i < lProfesoress.length; i++) {
				lProfesoress[i].colegio = null;
			}
			try {
				session.delete(colegio);
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
	
	public static boolean refresh(com.mauro.librodeclases.Colegio colegio) throws PersistentException {
		try {
			com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession().refresh(colegio);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(com.mauro.librodeclases.Colegio colegio) throws PersistentException {
		try {
			com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession().evict(colegio);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Colegio loadColegioByCriteria(ColegioCriteria colegioCriteria) {
		Colegio[] colegios = listColegioByCriteria(colegioCriteria);
		if(colegios == null || colegios.length == 0) {
			return null;
		}
		return colegios[0];
	}
	
	public static Colegio[] listColegioByCriteria(ColegioCriteria colegioCriteria) {
		return colegioCriteria.listColegio();
	}
}
