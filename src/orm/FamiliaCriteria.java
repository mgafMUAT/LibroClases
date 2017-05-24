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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class FamiliaCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_pk;
	public final IntegerExpression estudiante1_id_pkId;
	public final AssociationExpression estudiante1_id_pk;
	public final IntegerExpression estudiante2_id_pkId;
	public final AssociationExpression estudiante2_id_pk;
	
	public FamiliaCriteria(Criteria criteria) {
		super(criteria);
		id_pk = new IntegerExpression("id_pk", this);
		estudiante1_id_pkId = new IntegerExpression("estudiante1_id_pk.id", this);
		estudiante1_id_pk = new AssociationExpression("estudiante1_id_pk", this);
		estudiante2_id_pkId = new IntegerExpression("estudiante2_id_pk.id", this);
		estudiante2_id_pk = new AssociationExpression("estudiante2_id_pk", this);
	}
	
	public FamiliaCriteria(PersistentSession session) {
		this(session.createCriteria(Familia.class));
	}
	
	public FamiliaCriteria() throws PersistentException {
		this(orm.LibroClasePersistentManager.instance().getSession());
	}
	
	public EstudianteCriteria createEstudiante1_id_pkCriteria() {
		return new EstudianteCriteria(createCriteria("estudiante1_id_pk"));
	}
	
	public EstudianteCriteria createEstudiante2_id_pkCriteria() {
		return new EstudianteCriteria(createCriteria("estudiante2_id_pk"));
	}
	
	public Familia uniqueFamilia() {
		return (Familia) super.uniqueResult();
	}
	
	public Familia[] listFamilia() {
		java.util.List list = super.list();
		return (Familia[]) list.toArray(new Familia[list.size()]);
	}
}

