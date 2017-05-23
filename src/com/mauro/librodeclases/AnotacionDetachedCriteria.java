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

public class AnotacionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression observacion;
	public final BooleanExpression esPositiva;
	
	public AnotacionDetachedCriteria() {
		super(com.mauro.librodeclases.Anotacion.class, com.mauro.librodeclases.AnotacionCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		observacion = new StringExpression("observacion", this.getDetachedCriteria());
		esPositiva = new BooleanExpression("esPositiva", this.getDetachedCriteria());
	}
	
	public AnotacionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.mauro.librodeclases.AnotacionCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		observacion = new StringExpression("observacion", this.getDetachedCriteria());
		esPositiva = new BooleanExpression("esPositiva", this.getDetachedCriteria());
	}
	
	public Anotacion uniqueAnotacion(PersistentSession session) {
		return (Anotacion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Anotacion[] listAnotacion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Anotacion[]) list.toArray(new Anotacion[list.size()]);
	}
}

