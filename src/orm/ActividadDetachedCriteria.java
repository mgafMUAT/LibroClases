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
package orm;

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ActividadDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression asignatura_id_fkId;
	public final AssociationExpression asignatura_id_fk;
	public final StringExpression nombre;
	public final StringExpression tipo;
	public final StringExpression descripcion;
	public final CollectionExpression nota;
	
	public ActividadDetachedCriteria() {
		super(orm.Actividad.class, orm.ActividadCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		asignatura_id_fkId = new IntegerExpression("asignatura_id_fk.id", this.getDetachedCriteria());
		asignatura_id_fk = new AssociationExpression("asignatura_id_fk", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		tipo = new StringExpression("tipo", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		nota = new CollectionExpression("ORM_Nota", this.getDetachedCriteria());
	}
	
	public ActividadDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.ActividadCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		asignatura_id_fkId = new IntegerExpression("asignatura_id_fk.id", this.getDetachedCriteria());
		asignatura_id_fk = new AssociationExpression("asignatura_id_fk", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		tipo = new StringExpression("tipo", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		nota = new CollectionExpression("ORM_Nota", this.getDetachedCriteria());
	}
	
	public AsignaturaDetachedCriteria createAsignatura_id_fkCriteria() {
		return new AsignaturaDetachedCriteria(createCriteria("asignatura_id_fk"));
	}
	
	public NotaDetachedCriteria createNotaCriteria() {
		return new NotaDetachedCriteria(createCriteria("ORM_Nota"));
	}
	
	public Actividad uniqueActividad(PersistentSession session) {
		return (Actividad) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Actividad[] listActividad(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Actividad[]) list.toArray(new Actividad[list.size()]);
	}
}

