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

public class CursoCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression colegioId;
	public final AssociationExpression colegio;
	public final ByteExpression nivel;
	public final CharacterExpression letra;
	public final IntegerExpression ramoId;
	public final AssociationExpression ramo;
	public final CollectionExpression alumnos;
	
	public CursoCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		colegioId = new IntegerExpression("colegio.ID", this);
		colegio = new AssociationExpression("colegio", this);
		nivel = new ByteExpression("nivel", this);
		letra = new CharacterExpression("letra", this);
		ramoId = new IntegerExpression("ramo.ID", this);
		ramo = new AssociationExpression("ramo", this);
		alumnos = new CollectionExpression("ORM_Alumnos", this);
	}
	
	public CursoCriteria(PersistentSession session) {
		this(session.createCriteria(Curso.class));
	}
	
	public CursoCriteria() throws PersistentException {
		this(com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession());
	}
	
	public ColegioCriteria createColegioCriteria() {
		return new ColegioCriteria(createCriteria("colegio"));
	}
	
	public RamoCriteria createRamoCriteria() {
		return new RamoCriteria(createCriteria("ramo"));
	}
	
	public AlumnoCriteria createAlumnosCriteria() {
		return new AlumnoCriteria(createCriteria("ORM_Alumnos"));
	}
	
	public Curso uniqueCurso() {
		return (Curso) super.uniqueResult();
	}
	
	public Curso[] listCurso() {
		java.util.List list = super.list();
		return (Curso[]) list.toArray(new Curso[list.size()]);
	}
}

