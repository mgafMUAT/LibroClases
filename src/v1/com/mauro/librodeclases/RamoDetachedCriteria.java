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

public class RamoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression profesorId;
	public final AssociationExpression profesor;
	public final StringExpression nombre;
	public final CollectionExpression planificacion;
	
	public RamoDetachedCriteria() {
		super(v1.com.mauro.librodeclases.Ramo.class, v1.com.mauro.librodeclases.RamoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		profesorId = new IntegerExpression("profesor.ID", this.getDetachedCriteria());
		profesor = new AssociationExpression("profesor", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		planificacion = new CollectionExpression("ORM_Planificacion", this.getDetachedCriteria());
	}
	
	public RamoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, v1.com.mauro.librodeclases.RamoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		profesorId = new IntegerExpression("profesor.ID", this.getDetachedCriteria());
		profesor = new AssociationExpression("profesor", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		planificacion = new CollectionExpression("ORM_Planificacion", this.getDetachedCriteria());
	}
	
	public ProfesorDetachedCriteria createProfesorCriteria() {
		return new ProfesorDetachedCriteria(createCriteria("profesor"));
	}
	
	public ActividadDetachedCriteria createPlanificacionCriteria() {
		return new ActividadDetachedCriteria(createCriteria("ORM_Planificacion"));
	}
	
	public Ramo uniqueRamo(PersistentSession session) {
		return (Ramo) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Ramo[] listRamo(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Ramo[]) list.toArray(new Ramo[list.size()]);
	}
}

