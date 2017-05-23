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

public class ApoderadoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression nombre;
	public final StringExpression rut;
	public final CollectionExpression alumnos;
	
	public ApoderadoDetachedCriteria() {
		super(com.mauro.librodeclases.Apoderado.class, com.mauro.librodeclases.ApoderadoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		rut = new StringExpression("rut", this.getDetachedCriteria());
		alumnos = new CollectionExpression("ORM_Alumnos", this.getDetachedCriteria());
	}
	
	public ApoderadoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.mauro.librodeclases.ApoderadoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		rut = new StringExpression("rut", this.getDetachedCriteria());
		alumnos = new CollectionExpression("ORM_Alumnos", this.getDetachedCriteria());
	}
	
	public AlumnoDetachedCriteria createAlumnosCriteria() {
		return new AlumnoDetachedCriteria(createCriteria("ORM_Alumnos"));
	}
	
	public Apoderado uniqueApoderado(PersistentSession session) {
		return (Apoderado) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Apoderado[] listApoderado(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Apoderado[]) list.toArray(new Apoderado[list.size()]);
	}
}

