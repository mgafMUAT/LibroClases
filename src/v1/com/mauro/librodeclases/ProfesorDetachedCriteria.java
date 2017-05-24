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

public class ProfesorDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression colegioId;
	public final AssociationExpression colegio;
	public final StringExpression nombre;
	public final StringExpression rut;
	public final IntegerExpression ramoId;
	public final AssociationExpression ramo;
	
	public ProfesorDetachedCriteria() {
		super(v1.com.mauro.librodeclases.Profesor.class, v1.com.mauro.librodeclases.ProfesorCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		colegioId = new IntegerExpression("colegio.ID", this.getDetachedCriteria());
		colegio = new AssociationExpression("colegio", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		rut = new StringExpression("rut", this.getDetachedCriteria());
		ramoId = new IntegerExpression("ramo.ID", this.getDetachedCriteria());
		ramo = new AssociationExpression("ramo", this.getDetachedCriteria());
	}
	
	public ProfesorDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, v1.com.mauro.librodeclases.ProfesorCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		colegioId = new IntegerExpression("colegio.ID", this.getDetachedCriteria());
		colegio = new AssociationExpression("colegio", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		rut = new StringExpression("rut", this.getDetachedCriteria());
		ramoId = new IntegerExpression("ramo.ID", this.getDetachedCriteria());
		ramo = new AssociationExpression("ramo", this.getDetachedCriteria());
	}
	
	public ColegioDetachedCriteria createColegioCriteria() {
		return new ColegioDetachedCriteria(createCriteria("colegio"));
	}
	
	public RamoDetachedCriteria createRamoCriteria() {
		return new RamoDetachedCriteria(createCriteria("ramo"));
	}
	
	public Profesor uniqueProfesor(PersistentSession session) {
		return (Profesor) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Profesor[] listProfesor(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Profesor[]) list.toArray(new Profesor[list.size()]);
	}
}

