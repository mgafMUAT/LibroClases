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

public class ApoderadoDAO {
	public static Apoderado loadApoderadoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return loadApoderadoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Apoderado getApoderadoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return getApoderadoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Apoderado loadApoderadoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return loadApoderadoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Apoderado getApoderadoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return getApoderadoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Apoderado loadApoderadoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Apoderado) session.load(com.mauro.librodeclases.Apoderado.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Apoderado getApoderadoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Apoderado) session.get(com.mauro.librodeclases.Apoderado.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Apoderado loadApoderadoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Apoderado) session.load(com.mauro.librodeclases.Apoderado.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Apoderado getApoderadoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Apoderado) session.get(com.mauro.librodeclases.Apoderado.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryApoderado(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return queryApoderado(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryApoderado(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return queryApoderado(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Apoderado[] listApoderadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return listApoderadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Apoderado[] listApoderadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return listApoderadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryApoderado(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mauro.librodeclases.Apoderado as Apoderado");
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
	
	public static List queryApoderado(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mauro.librodeclases.Apoderado as Apoderado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Apoderado", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Apoderado[] listApoderadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryApoderado(session, condition, orderBy);
			return (Apoderado[]) list.toArray(new Apoderado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Apoderado[] listApoderadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryApoderado(session, condition, orderBy, lockMode);
			return (Apoderado[]) list.toArray(new Apoderado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Apoderado loadApoderadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return loadApoderadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Apoderado loadApoderadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return loadApoderadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Apoderado loadApoderadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Apoderado[] apoderados = listApoderadoByQuery(session, condition, orderBy);
		if (apoderados != null && apoderados.length > 0)
			return apoderados[0];
		else
			return null;
	}
	
	public static Apoderado loadApoderadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Apoderado[] apoderados = listApoderadoByQuery(session, condition, orderBy, lockMode);
		if (apoderados != null && apoderados.length > 0)
			return apoderados[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateApoderadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return iterateApoderadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateApoderadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return iterateApoderadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateApoderadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mauro.librodeclases.Apoderado as Apoderado");
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
	
	public static java.util.Iterator iterateApoderadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mauro.librodeclases.Apoderado as Apoderado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Apoderado", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Apoderado createApoderado() {
		return new com.mauro.librodeclases.Apoderado("", "", null);
	}
	
	public static boolean save(com.mauro.librodeclases.Apoderado apoderado) throws PersistentException {
		try {
			com.mauro.librodeclases.LibroClasesPersistentManager.instance().saveObject(apoderado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(com.mauro.librodeclases.Apoderado apoderado) throws PersistentException {
		try {
			com.mauro.librodeclases.LibroClasesPersistentManager.instance().deleteObject(apoderado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.mauro.librodeclases.Apoderado apoderado)throws PersistentException {
		try {
			com.mauro.librodeclases.Alumno[] lAlumnoss = (com.mauro.librodeclases.Alumno[]) apoderado.pupilos.toArray();
			for(int i = 0; i < lAlumnoss.length; i++) {
				lAlumnoss[i].apoderado = null;
			}
			return delete(apoderado);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.mauro.librodeclases.Apoderado apoderado, org.orm.PersistentSession session)throws PersistentException {
		try {
			com.mauro.librodeclases.Alumno[] lAlumnoss = (com.mauro.librodeclases.Alumno[]) apoderado.pupilos.toArray();
			for(int i = 0; i < lAlumnoss.length; i++) {
				lAlumnoss[i].apoderado = null;
			}
			try {
				session.delete(apoderado);
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
	
	public static boolean refresh(com.mauro.librodeclases.Apoderado apoderado) throws PersistentException {
		try {
			com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession().refresh(apoderado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(com.mauro.librodeclases.Apoderado apoderado) throws PersistentException {
		try {
			com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession().evict(apoderado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Apoderado loadApoderadoByCriteria(ApoderadoCriteria apoderadoCriteria) {
		Apoderado[] apoderados = listApoderadoByCriteria(apoderadoCriteria);
		if(apoderados == null || apoderados.length == 0) {
			return null;
		}
		return apoderados[0];
	}
	
	public static Apoderado[] listApoderadoByCriteria(ApoderadoCriteria apoderadoCriteria) {
		return apoderadoCriteria.listApoderado();
	}
}
