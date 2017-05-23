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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class AnotacionCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression observacion;
	public final BooleanExpression esPositiva;
	
	public AnotacionCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		observacion = new StringExpression("observacion", this);
		esPositiva = new BooleanExpression("esPositiva", this);
	}
	
	public AnotacionCriteria(PersistentSession session) {
		this(session.createCriteria(Anotacion.class));
	}
	
	public AnotacionCriteria() throws PersistentException {
		this(com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession());
	}
	
	public Anotacion uniqueAnotacion() {
		return (Anotacion) super.uniqueResult();
	}
	
	public Anotacion[] listAnotacion() {
		java.util.List list = super.list();
		return (Anotacion[]) list.toArray(new Anotacion[list.size()]);
	}
}

