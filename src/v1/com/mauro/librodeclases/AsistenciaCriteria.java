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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class AsistenciaCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final BooleanExpression presente;
	
	public AsistenciaCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		presente = new BooleanExpression("presente", this);
	}
	
	public AsistenciaCriteria(PersistentSession session) {
		this(session.createCriteria(Asistencia.class));
	}
	
	public AsistenciaCriteria() throws PersistentException {
		this(v1.com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession());
	}
	
	public Asistencia uniqueAsistencia() {
		return (Asistencia) super.uniqueResult();
	}
	
	public Asistencia[] listAsistencia() {
		java.util.List list = super.list();
		return (Asistencia[]) list.toArray(new Asistencia[list.size()]);
	}
}

