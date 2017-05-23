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
package com.mauro.librodeclases;

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class AsistenciaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final BooleanExpression presente;
	
	public AsistenciaDetachedCriteria() {
		super(com.mauro.librodeclases.Asistencia.class, com.mauro.librodeclases.AsistenciaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		presente = new BooleanExpression("presente", this.getDetachedCriteria());
	}
	
	public AsistenciaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.mauro.librodeclases.AsistenciaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		presente = new BooleanExpression("presente", this.getDetachedCriteria());
	}
	
	public Asistencia uniqueAsistencia(PersistentSession session) {
		return (Asistencia) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Asistencia[] listAsistencia(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Asistencia[]) list.toArray(new Asistencia[list.size()]);
	}
}

