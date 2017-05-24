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

public class AlumnoDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public AlumnoDetachedCriteria() {
		super(v1.com.mauro.librodeclases.Alumno.class, v1.com.mauro.librodeclases.AlumnoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		registroId = new IntegerExpression("registro.ID", this.getDetachedCriteria());
		registro = new AssociationExpression("registro", this.getDetachedCriteria());
		apoderadoId = new IntegerExpression("apoderado.ID", this.getDetachedCriteria());
		apoderado = new AssociationExpression("apoderado", this.getDetachedCriteria());
		cursoId = new IntegerExpression("curso.ID", this.getDetachedCriteria());
		curso = new AssociationExpression("curso", this.getDetachedCriteria());
		ingreso = new ByteExpression("ingreso", this.getDetachedCriteria());
		matricula = new StringExpression("matricula", this.getDetachedCriteria());
		notaId = new IntegerExpression("nota.ID", this.getDetachedCriteria());
		nota = new AssociationExpression("nota", this.getDetachedCriteria());
		anotaciones = new CollectionExpression("ORM_Anotaciones", this.getDetachedCriteria());
	}
	
	public AlumnoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, v1.com.mauro.librodeclases.AlumnoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		registroId = new IntegerExpression("registro.ID", this.getDetachedCriteria());
		registro = new AssociationExpression("registro", this.getDetachedCriteria());
		apoderadoId = new IntegerExpression("apoderado.ID", this.getDetachedCriteria());
		apoderado = new AssociationExpression("apoderado", this.getDetachedCriteria());
		cursoId = new IntegerExpression("curso.ID", this.getDetachedCriteria());
		curso = new AssociationExpression("curso", this.getDetachedCriteria());
		ingreso = new ByteExpression("ingreso", this.getDetachedCriteria());
		matricula = new StringExpression("matricula", this.getDetachedCriteria());
		notaId = new IntegerExpression("nota.ID", this.getDetachedCriteria());
		nota = new AssociationExpression("nota", this.getDetachedCriteria());
		anotaciones = new CollectionExpression("ORM_Anotaciones", this.getDetachedCriteria());
	}
	
	public AsistenciaDetachedCriteria createRegistroCriteria() {
		return new AsistenciaDetachedCriteria(createCriteria("registro"));
	}
	
	public ApoderadoDetachedCriteria createApoderadoCriteria() {
		return new ApoderadoDetachedCriteria(createCriteria("apoderado"));
	}
	
	public CursoDetachedCriteria createCursoCriteria() {
		return new CursoDetachedCriteria(createCriteria("curso"));
	}
	
	public NotaDetachedCriteria createNotaCriteria() {
		return new NotaDetachedCriteria(createCriteria("nota"));
	}
	
	public AnotacionDetachedCriteria createAnotacionesCriteria() {
		return new AnotacionDetachedCriteria(createCriteria("ORM_Anotaciones"));
	}
	
	public Alumno uniqueAlumno(PersistentSession session) {
		return (Alumno) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Alumno[] listAlumno(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Alumno[]) list.toArray(new Alumno[list.size()]);
	}
}

