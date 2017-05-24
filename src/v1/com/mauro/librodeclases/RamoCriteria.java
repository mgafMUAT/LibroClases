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

public class RamoCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression profesorId;
	public final AssociationExpression profesor;
	public final StringExpression nombre;
	public final CollectionExpression planificacion;
	
	public RamoCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		profesorId = new IntegerExpression("profesor.ID", this);
		profesor = new AssociationExpression("profesor", this);
		nombre = new StringExpression("nombre", this);
		planificacion = new CollectionExpression("ORM_Planificacion", this);
	}
	
	public RamoCriteria(PersistentSession session) {
		this(session.createCriteria(Ramo.class));
	}
	
	public RamoCriteria() throws PersistentException {
		this(v1.com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession());
	}
	
	public ProfesorCriteria createProfesorCriteria() {
		return new ProfesorCriteria(createCriteria("profesor"));
	}
	
	public ActividadCriteria createPlanificacionCriteria() {
		return new ActividadCriteria(createCriteria("ORM_Planificacion"));
	}
	
	public Ramo uniqueRamo() {
		return (Ramo) super.uniqueResult();
	}
	
	public Ramo[] listRamo() {
		java.util.List list = super.list();
		return (Ramo[]) list.toArray(new Ramo[list.size()]);
	}
}

