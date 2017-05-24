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

public class ColegioDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression nombre;
	public final StringExpression direccion;
	public final CollectionExpression cursos;
	public final CollectionExpression profesores;
	
	public ColegioDetachedCriteria() {
		super(v1.com.mauro.librodeclases.Colegio.class, v1.com.mauro.librodeclases.ColegioCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		direccion = new StringExpression("direccion", this.getDetachedCriteria());
		cursos = new CollectionExpression("ORM_Cursos", this.getDetachedCriteria());
		profesores = new CollectionExpression("ORM_Profesores", this.getDetachedCriteria());
	}
	
	public ColegioDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, v1.com.mauro.librodeclases.ColegioCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		direccion = new StringExpression("direccion", this.getDetachedCriteria());
		cursos = new CollectionExpression("ORM_Cursos", this.getDetachedCriteria());
		profesores = new CollectionExpression("ORM_Profesores", this.getDetachedCriteria());
	}
	
	public CursoDetachedCriteria createCursosCriteria() {
		return new CursoDetachedCriteria(createCriteria("ORM_Cursos"));
	}
	
	public ProfesorDetachedCriteria createProfesoresCriteria() {
		return new ProfesorDetachedCriteria(createCriteria("ORM_Profesores"));
	}
	
	public Colegio uniqueColegio(PersistentSession session) {
		return (Colegio) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Colegio[] listColegio(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Colegio[]) list.toArray(new Colegio[list.size()]);
	}
}

