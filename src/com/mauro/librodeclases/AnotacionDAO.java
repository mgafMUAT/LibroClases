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

public class AnotacionDAO {
	public static Anotacion loadAnotacionByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return loadAnotacionByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Anotacion getAnotacionByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return getAnotacionByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Anotacion loadAnotacionByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return loadAnotacionByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Anotacion getAnotacionByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return getAnotacionByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Anotacion loadAnotacionByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Anotacion) session.load(com.mauro.librodeclases.Anotacion.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Anotacion getAnotacionByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Anotacion) session.get(com.mauro.librodeclases.Anotacion.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Anotacion loadAnotacionByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Anotacion) session.load(com.mauro.librodeclases.Anotacion.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Anotacion getAnotacionByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Anotacion) session.get(com.mauro.librodeclases.Anotacion.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAnotacion(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return queryAnotacion(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAnotacion(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return queryAnotacion(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Anotacion[] listAnotacionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return listAnotacionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Anotacion[] listAnotacionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return listAnotacionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAnotacion(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mauro.librodeclases.Anotacion as Anotacion");
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
	
	public static List queryAnotacion(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mauro.librodeclases.Anotacion as Anotacion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Anotacion", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Anotacion[] listAnotacionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryAnotacion(session, condition, orderBy);
			return (Anotacion[]) list.toArray(new Anotacion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Anotacion[] listAnotacionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryAnotacion(session, condition, orderBy, lockMode);
			return (Anotacion[]) list.toArray(new Anotacion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Anotacion loadAnotacionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return loadAnotacionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Anotacion loadAnotacionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return loadAnotacionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Anotacion loadAnotacionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Anotacion[] anotacions = listAnotacionByQuery(session, condition, orderBy);
		if (anotacions != null && anotacions.length > 0)
			return anotacions[0];
		else
			return null;
	}
	
	public static Anotacion loadAnotacionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Anotacion[] anotacions = listAnotacionByQuery(session, condition, orderBy, lockMode);
		if (anotacions != null && anotacions.length > 0)
			return anotacions[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAnotacionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return iterateAnotacionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAnotacionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return iterateAnotacionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAnotacionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mauro.librodeclases.Anotacion as Anotacion");
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
	
	public static java.util.Iterator iterateAnotacionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mauro.librodeclases.Anotacion as Anotacion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Anotacion", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Anotacion createAnotacion() {
		return new com.mauro.librodeclases.Anotacion("", false);
	}
	
	public static boolean save(com.mauro.librodeclases.Anotacion anotacion) throws PersistentException {
		try {
			com.mauro.librodeclases.LibroClasesPersistentManager.instance().saveObject(anotacion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(com.mauro.librodeclases.Anotacion anotacion) throws PersistentException {
		try {
			com.mauro.librodeclases.LibroClasesPersistentManager.instance().deleteObject(anotacion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(com.mauro.librodeclases.Anotacion anotacion) throws PersistentException {
		try {
			com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession().refresh(anotacion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(com.mauro.librodeclases.Anotacion anotacion) throws PersistentException {
		try {
			com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession().evict(anotacion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Anotacion loadAnotacionByCriteria(AnotacionCriteria anotacionCriteria) {
		Anotacion[] anotacions = listAnotacionByCriteria(anotacionCriteria);
		if(anotacions == null || anotacions.length == 0) {
			return null;
		}
		return anotacions[0];
	}
	
	public static Anotacion[] listAnotacionByCriteria(AnotacionCriteria anotacionCriteria) {
		return anotacionCriteria.listAnotacion();
	}
}
