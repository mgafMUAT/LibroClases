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

public class NotaDAO {
	public static Nota loadNotaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = v1.com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return loadNotaByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Nota getNotaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = v1.com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return getNotaByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Nota loadNotaByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = v1.com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return loadNotaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Nota getNotaByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = v1.com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return getNotaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Nota loadNotaByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Nota) session.load(v1.com.mauro.librodeclases.Nota.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Nota getNotaByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Nota) session.get(v1.com.mauro.librodeclases.Nota.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Nota loadNotaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Nota) session.load(v1.com.mauro.librodeclases.Nota.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Nota getNotaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Nota) session.get(v1.com.mauro.librodeclases.Nota.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNota(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = v1.com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return queryNota(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNota(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = v1.com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return queryNota(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Nota[] listNotaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = v1.com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return listNotaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Nota[] listNotaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = v1.com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return listNotaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNota(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mauro.librodeclases.Nota as Nota");
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
	
	public static List queryNota(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mauro.librodeclases.Nota as Nota");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Nota", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Nota[] listNotaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryNota(session, condition, orderBy);
			return (Nota[]) list.toArray(new Nota[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Nota[] listNotaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryNota(session, condition, orderBy, lockMode);
			return (Nota[]) list.toArray(new Nota[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Nota loadNotaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = v1.com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return loadNotaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Nota loadNotaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = v1.com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return loadNotaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Nota loadNotaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Nota[] notas = listNotaByQuery(session, condition, orderBy);
		if (notas != null && notas.length > 0)
			return notas[0];
		else
			return null;
	}
	
	public static Nota loadNotaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Nota[] notas = listNotaByQuery(session, condition, orderBy, lockMode);
		if (notas != null && notas.length > 0)
			return notas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateNotaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = v1.com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return iterateNotaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateNotaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = v1.com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession();
			return iterateNotaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateNotaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mauro.librodeclases.Nota as Nota");
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
	
	public static java.util.Iterator iterateNotaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mauro.librodeclases.Nota as Nota");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Nota", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Nota createNota() {
		return new v1.com.mauro.librodeclases.Nota();
	}
	
	public static boolean save(v1.com.mauro.librodeclases.Nota nota) throws PersistentException {
		try {
			v1.com.mauro.librodeclases.LibroClasesPersistentManager.instance().saveObject(nota);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(v1.com.mauro.librodeclases.Nota nota) throws PersistentException {
		try {
			v1.com.mauro.librodeclases.LibroClasesPersistentManager.instance().deleteObject(nota);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(v1.com.mauro.librodeclases.Nota nota) throws PersistentException {
		try {
			v1.com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession().refresh(nota);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(v1.com.mauro.librodeclases.Nota nota) throws PersistentException {
		try {
			v1.com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession().evict(nota);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Nota loadNotaByCriteria(NotaCriteria notaCriteria) {
		Nota[] notas = listNotaByCriteria(notaCriteria);
		if(notas == null || notas.length == 0) {
			return null;
		}
		return notas[0];
	}
	
	public static Nota[] listNotaByCriteria(NotaCriteria notaCriteria) {
		return notaCriteria.listNota();
	}
}
