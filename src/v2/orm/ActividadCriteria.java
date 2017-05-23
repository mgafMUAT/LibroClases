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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ActividadCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression asignatura_id_fkId;
	public final AssociationExpression asignatura_id_fk;
	public final StringExpression nombre;
	public final StringExpression tipo;
	public final StringExpression descripcion;
	public final IntegerExpression notaId;
	public final AssociationExpression nota;
	
	public ActividadCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		asignatura_id_fkId = new IntegerExpression("asignatura_id_fk.id", this);
		asignatura_id_fk = new AssociationExpression("asignatura_id_fk", this);
		nombre = new StringExpression("nombre", this);
		tipo = new StringExpression("tipo", this);
		descripcion = new StringExpression("descripcion", this);
		notaId = new IntegerExpression("nota.id", this);
		nota = new AssociationExpression("nota", this);
	}
	
	public ActividadCriteria(PersistentSession session) {
		this(session.createCriteria(Actividad.class));
	}
	
	public ActividadCriteria() throws PersistentException {
		this(v2.orm.LibroClasePersistentManager.instance().getSession());
	}
	
	public AsignaturaCriteria createAsignatura_id_fkCriteria() {
		return new AsignaturaCriteria(createCriteria("asignatura_id_fk"));
	}
	
	public NotaCriteria createNotaCriteria() {
		return new NotaCriteria(createCriteria("nota"));
	}
	
	public Actividad uniqueActividad() {
		return (Actividad) super.uniqueResult();
	}
	
	public Actividad[] listActividad() {
		java.util.List list = super.list();
		return (Actividad[]) list.toArray(new Actividad[list.size()]);
	}
}

