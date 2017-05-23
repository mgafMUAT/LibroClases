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

public class CursoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression colegioId;
	public final AssociationExpression colegio;
	public final ByteExpression nivel;
	public final CharacterExpression letra;
	public final IntegerExpression ramoId;
	public final AssociationExpression ramo;
	public final CollectionExpression alumnos;
	
	public CursoDetachedCriteria() {
		super(com.mauro.librodeclases.Curso.class, com.mauro.librodeclases.CursoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		colegioId = new IntegerExpression("colegio.ID", this.getDetachedCriteria());
		colegio = new AssociationExpression("colegio", this.getDetachedCriteria());
		nivel = new ByteExpression("nivel", this.getDetachedCriteria());
		letra = new CharacterExpression("letra", this.getDetachedCriteria());
		ramoId = new IntegerExpression("ramo.ID", this.getDetachedCriteria());
		ramo = new AssociationExpression("ramo", this.getDetachedCriteria());
		alumnos = new CollectionExpression("ORM_Alumnos", this.getDetachedCriteria());
	}
	
	public CursoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.mauro.librodeclases.CursoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		colegioId = new IntegerExpression("colegio.ID", this.getDetachedCriteria());
		colegio = new AssociationExpression("colegio", this.getDetachedCriteria());
		nivel = new ByteExpression("nivel", this.getDetachedCriteria());
		letra = new CharacterExpression("letra", this.getDetachedCriteria());
		ramoId = new IntegerExpression("ramo.ID", this.getDetachedCriteria());
		ramo = new AssociationExpression("ramo", this.getDetachedCriteria());
		alumnos = new CollectionExpression("ORM_Alumnos", this.getDetachedCriteria());
	}
	
	public ColegioDetachedCriteria createColegioCriteria() {
		return new ColegioDetachedCriteria(createCriteria("colegio"));
	}
	
	public RamoDetachedCriteria createRamoCriteria() {
		return new RamoDetachedCriteria(createCriteria("ramo"));
	}
	
	public AlumnoDetachedCriteria createAlumnosCriteria() {
		return new AlumnoDetachedCriteria(createCriteria("ORM_Alumnos"));
	}
	
	public Curso uniqueCurso(PersistentSession session) {
		return (Curso) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Curso[] listCurso(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Curso[]) list.toArray(new Curso[list.size()]);
	}
}

