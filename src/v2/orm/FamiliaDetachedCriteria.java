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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class FamiliaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_pk;
	public final IntegerExpression estudiante1_id_pkId;
	public final AssociationExpression estudiante1_id_pk;
	public final IntegerExpression estudiante2_id_pkId;
	public final AssociationExpression estudiante2_id_pk;
	
	public FamiliaDetachedCriteria() {
		super(v2.orm.Familia.class, v2.orm.FamiliaCriteria.class);
		id_pk = new IntegerExpression("id_pk", this.getDetachedCriteria());
		estudiante1_id_pkId = new IntegerExpression("estudiante1_id_pk.id", this.getDetachedCriteria());
		estudiante1_id_pk = new AssociationExpression("estudiante1_id_pk", this.getDetachedCriteria());
		estudiante2_id_pkId = new IntegerExpression("estudiante2_id_pk.id", this.getDetachedCriteria());
		estudiante2_id_pk = new AssociationExpression("estudiante2_id_pk", this.getDetachedCriteria());
	}
	
	public FamiliaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, v2.orm.FamiliaCriteria.class);
		id_pk = new IntegerExpression("id_pk", this.getDetachedCriteria());
		estudiante1_id_pkId = new IntegerExpression("estudiante1_id_pk.id", this.getDetachedCriteria());
		estudiante1_id_pk = new AssociationExpression("estudiante1_id_pk", this.getDetachedCriteria());
		estudiante2_id_pkId = new IntegerExpression("estudiante2_id_pk.id", this.getDetachedCriteria());
		estudiante2_id_pk = new AssociationExpression("estudiante2_id_pk", this.getDetachedCriteria());
	}
	
	public EstudianteDetachedCriteria createEstudiante1_id_pkCriteria() {
		return new EstudianteDetachedCriteria(createCriteria("estudiante1_id_pk"));
	}
	
	public EstudianteDetachedCriteria createEstudiante2_id_pkCriteria() {
		return new EstudianteDetachedCriteria(createCriteria("estudiante2_id_pk"));
	}
	
	public Familia uniqueFamilia(PersistentSession session) {
		return (Familia) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Familia[] listFamilia(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Familia[]) list.toArray(new Familia[list.size()]);
	}
}

