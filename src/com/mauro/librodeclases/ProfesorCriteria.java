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

public class ProfesorCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression colegioId;
	public final AssociationExpression colegio;
	public final StringExpression nombre;
	public final StringExpression rut;
	public final IntegerExpression ramoId;
	public final AssociationExpression ramo;
	
	public ProfesorCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		colegioId = new IntegerExpression("colegio.ID", this);
		colegio = new AssociationExpression("colegio", this);
		nombre = new StringExpression("nombre", this);
		rut = new StringExpression("rut", this);
		ramoId = new IntegerExpression("ramo.ID", this);
		ramo = new AssociationExpression("ramo", this);
	}
	
	public ProfesorCriteria(PersistentSession session) {
		this(session.createCriteria(Profesor.class));
	}
	
	public ProfesorCriteria() throws PersistentException {
		this(com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession());
	}
	
	public ColegioCriteria createColegioCriteria() {
		return new ColegioCriteria(createCriteria("colegio"));
	}
	
	public RamoCriteria createRamoCriteria() {
		return new RamoCriteria(createCriteria("ramo"));
	}
	
	public Profesor uniqueProfesor() {
		return (Profesor) super.uniqueResult();
	}
	
	public Profesor[] listProfesor() {
		java.util.List list = super.list();
		return (Profesor[]) list.toArray(new Profesor[list.size()]);
	}
}

