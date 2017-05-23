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
package v2.orm;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class PersonaDAO {
	public static Persona loadPersonaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = v2.orm.LibroClasePersistentManager.instance().getSession();
			return loadPersonaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona getPersonaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = v2.orm.LibroClasePersistentManager.instance().getSession();
			return getPersonaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona loadPersonaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = v2.orm.LibroClasePersistentManager.instance().getSession();
			return loadPersonaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona getPersonaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = v2.orm.LibroClasePersistentManager.instance().getSession();
			return getPersonaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona loadPersonaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Persona) session.load(v2.orm.Persona.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona getPersonaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Persona) session.get(v2.orm.Persona.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona loadPersonaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Persona) session.load(v2.orm.Persona.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona getPersonaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Persona) session.get(v2.orm.Persona.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPersona(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = v2.orm.LibroClasePersistentManager.instance().getSession();
			return queryPersona(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPersona(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = v2.orm.LibroClasePersistentManager.instance().getSession();
			return queryPersona(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona[] listPersonaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = v2.orm.LibroClasePersistentManager.instance().getSession();
			return listPersonaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona[] listPersonaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = v2.orm.LibroClasePersistentManager.instance().getSession();
			return listPersonaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPersona(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Persona as Persona");
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
	
	public static List queryPersona(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Persona as Persona");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Persona", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona[] listPersonaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPersona(session, condition, orderBy);
			return (Persona[]) list.toArray(new Persona[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona[] listPersonaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPersona(session, condition, orderBy, lockMode);
			return (Persona[]) list.toArray(new Persona[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona loadPersonaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = v2.orm.LibroClasePersistentManager.instance().getSession();
			return loadPersonaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona loadPersonaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = v2.orm.LibroClasePersistentManager.instance().getSession();
			return loadPersonaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona loadPersonaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Persona[] personas = listPersonaByQuery(session, condition, orderBy);
		if (personas != null && personas.length > 0)
			return personas[0];
		else
			return null;
	}
	
	public static Persona loadPersonaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Persona[] personas = listPersonaByQuery(session, condition, orderBy, lockMode);
		if (personas != null && personas.length > 0)
			return personas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePersonaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = v2.orm.LibroClasePersistentManager.instance().getSession();
			return iteratePersonaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePersonaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = v2.orm.LibroClasePersistentManager.instance().getSession();
			return iteratePersonaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePersonaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Persona as Persona");
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
	
	public static java.util.Iterator iteratePersonaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Persona as Persona");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Persona", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona createPersona() {
		return new v2.orm.Persona();
	}
	
	public static boolean save(v2.orm.Persona persona) throws PersistentException {
		try {
			v2.orm.LibroClasePersistentManager.instance().saveObject(persona);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(v2.orm.Persona persona) throws PersistentException {
		try {
			v2.orm.LibroClasePersistentManager.instance().deleteObject(persona);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(v2.orm.Persona persona)throws PersistentException {
		try {
			if (persona.getEstudiante() != null) {
				persona.getEstudiante().setPersona_id_fk(null);
			}
			
			if (persona.getApoderado() != null) {
				persona.getApoderado().setPersona_id_fk(null);
			}
			
			if (persona.getDirectivo() != null) {
				persona.getDirectivo().setPersona_id_fk(null);
			}
			
			if (persona.getProfesor() != null) {
				persona.getProfesor().setPersona_id_fk(null);
			}
			
			return delete(persona);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(v2.orm.Persona persona, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (persona.getEstudiante() != null) {
				persona.getEstudiante().setPersona_id_fk(null);
			}
			
			if (persona.getApoderado() != null) {
				persona.getApoderado().setPersona_id_fk(null);
			}
			
			if (persona.getDirectivo() != null) {
				persona.getDirectivo().setPersona_id_fk(null);
			}
			
			if (persona.getProfesor() != null) {
				persona.getProfesor().setPersona_id_fk(null);
			}
			
			try {
				session.delete(persona);
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
	
	public static boolean refresh(v2.orm.Persona persona) throws PersistentException {
		try {
			v2.orm.LibroClasePersistentManager.instance().getSession().refresh(persona);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(v2.orm.Persona persona) throws PersistentException {
		try {
			v2.orm.LibroClasePersistentManager.instance().getSession().evict(persona);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona loadPersonaByCriteria(PersonaCriteria personaCriteria) {
		Persona[] personas = listPersonaByCriteria(personaCriteria);
		if(personas == null || personas.length == 0) {
			return null;
		}
		return personas[0];
	}
	
	public static Persona[] listPersonaByCriteria(PersonaCriteria personaCriteria) {
		return personaCriteria.listPersona();
	}
}
