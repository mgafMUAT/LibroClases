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

public class ColegioCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression nombre;
	public final StringExpression direccion;
	public final CollectionExpression cursos;
	public final CollectionExpression profesores;
	
	public ColegioCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		nombre = new StringExpression("nombre", this);
		direccion = new StringExpression("direccion", this);
		cursos = new CollectionExpression("ORM_Cursos", this);
		profesores = new CollectionExpression("ORM_Profesores", this);
	}
	
	public ColegioCriteria(PersistentSession session) {
		this(session.createCriteria(Colegio.class));
	}
	
	public ColegioCriteria() throws PersistentException {
		this(v1.com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession());
	}
	
	public CursoCriteria createCursosCriteria() {
		return new CursoCriteria(createCriteria("ORM_Cursos"));
	}
	
	public ProfesorCriteria createProfesoresCriteria() {
		return new ProfesorCriteria(createCriteria("ORM_Profesores"));
	}
	
	public Colegio uniqueColegio() {
		return (Colegio) super.uniqueResult();
	}
	
	public Colegio[] listColegio() {
		java.util.List list = super.list();
		return (Colegio[]) list.toArray(new Colegio[list.size()]);
	}
}

