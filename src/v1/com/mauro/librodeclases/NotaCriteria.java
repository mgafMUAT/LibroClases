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

public class NotaCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final FloatExpression nota;
	
	public NotaCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		nota = new FloatExpression("nota", this);
	}
	
	public NotaCriteria(PersistentSession session) {
		this(session.createCriteria(Nota.class));
	}
	
	public NotaCriteria() throws PersistentException {
		this(v1.com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession());
	}
	
	public Nota uniqueNota() {
		return (Nota) super.uniqueResult();
	}
	
	public Nota[] listNota() {
		java.util.List list = super.list();
		return (Nota[]) list.toArray(new Nota[list.size()]);
	}
}

