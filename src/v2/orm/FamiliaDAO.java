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

public class FamiliaDAO {
	public static Familia loadFamiliaByORMID(int id_pk) throws PersistentException {
		try {
			PersistentSession session = v2.orm.LibroClasePersistentManager.instance().getSession();
			return loadFamiliaByORMID(session, id_pk);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Familia getFamiliaByORMID(int id_pk) throws PersistentException {
		try {
			PersistentSession session = v2.orm.LibroClasePersistentManager.instance().getSession();
			return getFamiliaByORMID(session, id_pk);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Familia loadFamiliaByORMID(int id_pk, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = v2.orm.LibroClasePersistentManager.instance().getSession();
			return loadFamiliaByORMID(session, id_pk, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Familia getFamiliaByORMID(int id_pk, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = v2.orm.LibroClasePersistentManager.instance().getSession();
			return getFamiliaByORMID(session, id_pk, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Familia loadFamiliaByORMID(PersistentSession session, int id_pk) throws PersistentException {
		try {
			return (Familia) session.load(v2.orm.Familia.class, new Integer(id_pk));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Familia getFamiliaByORMID(PersistentSession session, int id_pk) throws PersistentException {
		try {
			return (Familia) session.get(v2.orm.Familia.class, new Integer(id_pk));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Familia loadFamiliaByORMID(PersistentSession session, int id_pk, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Familia) session.load(v2.orm.Familia.class, new Integer(id_pk), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Familia getFamiliaByORMID(PersistentSession session, int id_pk, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Familia) session.get(v2.orm.Familia.class, new Integer(id_pk), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFamilia(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = v2.orm.LibroClasePersistentManager.instance().getSession();
			return queryFamilia(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFamilia(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = v2.orm.LibroClasePersistentManager.instance().getSession();
			return queryFamilia(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Familia[] listFamiliaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = v2.orm.LibroClasePersistentManager.instance().getSession();
			return listFamiliaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Familia[] listFamiliaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = v2.orm.LibroClasePersistentManager.instance().getSession();
			return listFamiliaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFamilia(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Familia as Familia");
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
	
	public static List queryFamilia(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Familia as Familia");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Familia", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Familia[] listFamiliaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryFamilia(session, condition, orderBy);
			return (Familia[]) list.toArray(new Familia[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Familia[] listFamiliaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryFamilia(session, condition, orderBy, lockMode);
			return (Familia[]) list.toArray(new Familia[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Familia loadFamiliaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = v2.orm.LibroClasePersistentManager.instance().getSession();
			return loadFamiliaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Familia loadFamiliaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = v2.orm.LibroClasePersistentManager.instance().getSession();
			return loadFamiliaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Familia loadFamiliaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Familia[] familias = listFamiliaByQuery(session, condition, orderBy);
		if (familias != null && familias.length > 0)
			return familias[0];
		else
			return null;
	}
	
	public static Familia loadFamiliaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Familia[] familias = listFamiliaByQuery(session, condition, orderBy, lockMode);
		if (familias != null && familias.length > 0)
			return familias[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateFamiliaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = v2.orm.LibroClasePersistentManager.instance().getSession();
			return iterateFamiliaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateFamiliaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = v2.orm.LibroClasePersistentManager.instance().getSession();
			return iterateFamiliaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateFamiliaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Familia as Familia");
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
	
	public static java.util.Iterator iterateFamiliaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Familia as Familia");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Familia", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Familia createFamilia() {
		return new v2.orm.Familia();
	}
	
	public static boolean save(v2.orm.Familia familia) throws PersistentException {
		try {
			v2.orm.LibroClasePersistentManager.instance().saveObject(familia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(v2.orm.Familia familia) throws PersistentException {
		try {
			v2.orm.LibroClasePersistentManager.instance().deleteObject(familia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(v2.orm.Familia familia)throws PersistentException {
		try {
			if (familia.getEstudiante1_id_pk() != null) {
				familia.getEstudiante1_id_pk().familia.remove(familia);
			}
			
			if (familia.getEstudiante2_id_pk() != null) {
				familia.getEstudiante2_id_pk().familia1.remove(familia);
			}
			
			return delete(familia);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(v2.orm.Familia familia, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (familia.getEstudiante1_id_pk() != null) {
				familia.getEstudiante1_id_pk().familia.remove(familia);
			}
			
			if (familia.getEstudiante2_id_pk() != null) {
				familia.getEstudiante2_id_pk().familia1.remove(familia);
			}
			
			try {
				session.delete(familia);
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
	
	public static boolean refresh(v2.orm.Familia familia) throws PersistentException {
		try {
			v2.orm.LibroClasePersistentManager.instance().getSession().refresh(familia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(v2.orm.Familia familia) throws PersistentException {
		try {
			v2.orm.LibroClasePersistentManager.instance().getSession().evict(familia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Familia loadFamiliaByCriteria(FamiliaCriteria familiaCriteria) {
		Familia[] familias = listFamiliaByCriteria(familiaCriteria);
		if(familias == null || familias.length == 0) {
			return null;
		}
		return familias[0];
	}
	
	public static Familia[] listFamiliaByCriteria(FamiliaCriteria familiaCriteria) {
		return familiaCriteria.listFamilia();
	}
}
