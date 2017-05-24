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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class NotaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final FloatExpression nota;
	
	public NotaDetachedCriteria() {
		super(v1.com.mauro.librodeclases.Nota.class, v1.com.mauro.librodeclases.NotaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nota = new FloatExpression("nota", this.getDetachedCriteria());
	}
	
	public NotaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, v1.com.mauro.librodeclases.NotaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nota = new FloatExpression("nota", this.getDetachedCriteria());
	}
	
	public Nota uniqueNota(PersistentSession session) {
		return (Nota) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Nota[] listNota(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Nota[]) list.toArray(new Nota[list.size()]);
	}
}

