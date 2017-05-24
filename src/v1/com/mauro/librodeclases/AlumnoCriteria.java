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

public class AlumnoCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression registroId;
	public final AssociationExpression registro;
	public final IntegerExpression apoderadoId;
	public final AssociationExpression apoderado;
	public final IntegerExpression cursoId;
	public final AssociationExpression curso;
	public final ByteExpression ingreso;
	public final StringExpression matricula;
	public final IntegerExpression notaId;
	public final AssociationExpression nota;
	public final CollectionExpression anotaciones;
	
	public AlumnoCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		registroId = new IntegerExpression("registro.ID", this);
		registro = new AssociationExpression("registro", this);
		apoderadoId = new IntegerExpression("apoderado.ID", this);
		apoderado = new AssociationExpression("apoderado", this);
		cursoId = new IntegerExpression("curso.ID", this);
		curso = new AssociationExpression("curso", this);
		ingreso = new ByteExpression("ingreso", this);
		matricula = new StringExpression("matricula", this);
		notaId = new IntegerExpression("nota.ID", this);
		nota = new AssociationExpression("nota", this);
		anotaciones = new CollectionExpression("ORM_Anotaciones", this);
	}
	
	public AlumnoCriteria(PersistentSession session) {
		this(session.createCriteria(Alumno.class));
	}
	
	public AlumnoCriteria() throws PersistentException {
		this(v1.com.mauro.librodeclases.LibroClasesPersistentManager.instance().getSession());
	}
	
	public AsistenciaCriteria createRegistroCriteria() {
		return new AsistenciaCriteria(createCriteria("registro"));
	}
	
	public ApoderadoCriteria createApoderadoCriteria() {
		return new ApoderadoCriteria(createCriteria("apoderado"));
	}
	
	public CursoCriteria createCursoCriteria() {
		return new CursoCriteria(createCriteria("curso"));
	}
	
	public NotaCriteria createNotaCriteria() {
		return new NotaCriteria(createCriteria("nota"));
	}
	
	public AnotacionCriteria createAnotacionesCriteria() {
		return new AnotacionCriteria(createCriteria("ORM_Anotaciones"));
	}
	
	public Alumno uniqueAlumno() {
		return (Alumno) super.uniqueResult();
	}
	
	public Alumno[] listAlumno() {
		java.util.List list = super.list();
		return (Alumno[]) list.toArray(new Alumno[list.size()]);
	}
}

