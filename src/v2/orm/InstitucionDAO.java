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

public class InstitucionDAO {
	public static Institucion loadInstitucionByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = v2.orm.LibroClasePersistentManager.instance().getSession();
			return loadInstitucionByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Institucion getInstitucionByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = v2.orm.LibroClasePersistentManager.instance().getSession();
			return getInstitucionByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Institucion loadInstitucionByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = v2.orm.LibroClasePersistentManager.instance().getSession();
			return loadInstitucionByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Institucion getInstitucionByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = v2.orm.LibroClasePersistentManager.instance().getSession();
			return getInstitucionByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Institucion loadInstitucionByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Institucion) session.load(v2.orm.Institucion.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Institucion getInstitucionByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Institucion) session.get(v2.orm.Institucion.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Institucion loadInstitucionByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Institucion) session.load(v2.orm.Institucion.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Institucion getInstitucionByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Institucion) session.get(v2.orm.Institucion.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryInstitucion(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = v2.orm.LibroClasePersistentManager.instance().getSession();
			return queryInstitucion(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryInstitucion(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = v2.orm.LibroClasePersistentManager.instance().getSession();
			return queryInstitucion(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Institucion[] listInstitucionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = v2.orm.LibroClasePersistentManager.instance().getSession();
			return listInstitucionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Institucion[] listInstitucionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = v2.orm.LibroClasePersistentManager.instance().getSession();
			return listInstitucionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryInstitucion(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Institucion as Institucion");
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
	
	public static List queryInstitucion(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Institucion as Institucion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Institucion", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Institucion[] listInstitucionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryInstitucion(session, condition, orderBy);
			return (Institucion[]) list.toArray(new Institucion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Institucion[] listInstitucionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryInstitucion(session, condition, orderBy, lockMode);
			return (Institucion[]) list.toArray(new Institucion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Institucion loadInstitucionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = v2.orm.LibroClasePersistentManager.instance().getSession();
			return loadInstitucionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Institucion loadInstitucionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = v2.orm.LibroClasePersistentManager.instance().getSession();
			return loadInstitucionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Institucion loadInstitucionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Institucion[] institucions = listInstitucionByQuery(session, condition, orderBy);
		if (institucions != null && institucions.length > 0)
			return institucions[0];
		else
			return null;
	}
	
	public static Institucion loadInstitucionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Institucion[] institucions = listInstitucionByQuery(session, condition, orderBy, lockMode);
		if (institucions != null && institucions.length > 0)
			return institucions[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateInstitucionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = v2.orm.LibroClasePersistentManager.instance().getSession();
			return iterateInstitucionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateInstitucionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = v2.orm.LibroClasePersistentManager.instance().getSession();
			return iterateInstitucionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateInstitucionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Institucion as Institucion");
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
	
	public static java.util.Iterator iterateInstitucionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Institucion as Institucion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Institucion", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Institucion createInstitucion() {
		return new v2.orm.Institucion();
	}
	
	public static boolean save(v2.orm.Institucion institucion) throws PersistentException {
		try {
			v2.orm.LibroClasePersistentManager.instance().saveObject(institucion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(v2.orm.Institucion institucion) throws PersistentException {
		try {
			v2.orm.LibroClasePersistentManager.instance().deleteObject(institucion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(v2.orm.Institucion institucion)throws PersistentException {
		try {
			v2.orm.Curso[] lCursos = institucion.curso.toArray();
			for(int i = 0; i < lCursos.length; i++) {
				lCursos[i].setInstitucion_id_fk(null);
			}
			v2.orm.Directivo[] lDirectivos = institucion.directivo.toArray();
			for(int i = 0; i < lDirectivos.length; i++) {
				lDirectivos[i].setInstitucion_id_fk(null);
			}
			return delete(institucion);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(v2.orm.Institucion institucion, org.orm.PersistentSession session)throws PersistentException {
		try {
			v2.orm.Curso[] lCursos = institucion.curso.toArray();
			for(int i = 0; i < lCursos.length; i++) {
				lCursos[i].setInstitucion_id_fk(null);
			}
			v2.orm.Directivo[] lDirectivos = institucion.directivo.toArray();
			for(int i = 0; i < lDirectivos.length; i++) {
				lDirectivos[i].setInstitucion_id_fk(null);
			}
			try {
				session.delete(institucion);
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
	
	public static boolean refresh(v2.orm.Institucion institucion) throws PersistentException {
		try {
			v2.orm.LibroClasePersistentManager.instance().getSession().refresh(institucion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(v2.orm.Institucion institucion) throws PersistentException {
		try {
			v2.orm.LibroClasePersistentManager.instance().getSession().evict(institucion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Institucion loadInstitucionByCriteria(InstitucionCriteria institucionCriteria) {
		Institucion[] institucions = listInstitucionByCriteria(institucionCriteria);
		if(institucions == null || institucions.length == 0) {
			return null;
		}
		return institucions[0];
	}
	
	public static Institucion[] listInstitucionByCriteria(InstitucionCriteria institucionCriteria) {
		return institucionCriteria.listInstitucion();
	}
}
