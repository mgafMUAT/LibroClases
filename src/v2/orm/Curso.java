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
package v2.orm;

public class Curso {
	public Curso() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == v2.orm.ORMConstants.KEY_CURSO_ASIGNATURA) {
			return ORM_asignatura;
		}
		else if (key == v2.orm.ORMConstants.KEY_CURSO_CURSO_ESTUDIANTE) {
			return ORM_curso_estudiante;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == v2.orm.ORMConstants.KEY_CURSO_INSTITUCION_ID_FK) {
			this.institucion_id_fk = (v2.orm.Institucion) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private v2.orm.Institucion institucion_id_fk;
	
	private byte nivel;
	
	private char letra;
	
	private java.util.Set ORM_asignatura = new java.util.HashSet();
	
	private java.util.Set ORM_curso_estudiante = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setNivel(byte value) {
		this.nivel = value;
	}
	
	public byte getNivel() {
		return nivel;
	}
	
	public void setLetra(char value) {
		this.letra = value;
	}
	
	public char getLetra() {
		return letra;
	}
	
	public void setInstitucion_id_fk(v2.orm.Institucion value) {
		if (institucion_id_fk != null) {
			institucion_id_fk.curso.remove(this);
		}
		if (value != null) {
			value.curso.add(this);
		}
	}
	
	public v2.orm.Institucion getInstitucion_id_fk() {
		return institucion_id_fk;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Institucion_id_fk(v2.orm.Institucion value) {
		this.institucion_id_fk = value;
	}
	
	private v2.orm.Institucion getORM_Institucion_id_fk() {
		return institucion_id_fk;
	}
	
	private void setORM_Asignatura(java.util.Set value) {
		this.ORM_asignatura = value;
	}
	
	private java.util.Set getORM_Asignatura() {
		return ORM_asignatura;
	}
	
	public final v2.orm.AsignaturaSetCollection asignatura = new v2.orm.AsignaturaSetCollection(this, _ormAdapter, v2.orm.ORMConstants.KEY_CURSO_ASIGNATURA, v2.orm.ORMConstants.KEY_ASIGNATURA_CURSO_ID_FK, v2.orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Curso_estudiante(java.util.Set value) {
		this.ORM_curso_estudiante = value;
	}
	
	private java.util.Set getORM_Curso_estudiante() {
		return ORM_curso_estudiante;
	}
	
	public final v2.orm.Curso_estudianteSetCollection curso_estudiante = new v2.orm.Curso_estudianteSetCollection(this, _ormAdapter, v2.orm.ORMConstants.KEY_CURSO_CURSO_ESTUDIANTE, v2.orm.ORMConstants.KEY_CURSO_ESTUDIANTE_CURSO_ID_FK, v2.orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
