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

public class Asignatura {
	public Asignatura() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == v2.orm.ORMConstants.KEY_ASIGNATURA_ACTIVIDAD) {
			return ORM_actividad;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == v2.orm.ORMConstants.KEY_ASIGNATURA_CURSO_ID_FK) {
			this.curso_id_fk = (v2.orm.Curso) owner;
		}
		
		else if (key == v2.orm.ORMConstants.KEY_ASIGNATURA_PROFESORID_PK) {
			this.profesorid_pk = (v2.orm.Profesor) owner;
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
	
	private v2.orm.Curso curso_id_fk;
	
	private v2.orm.Profesor profesorid_pk;
	
	private String nombre;
	
	private java.util.Set ORM_actividad = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setCurso_id_fk(v2.orm.Curso value) {
		if (curso_id_fk != null) {
			curso_id_fk.asignatura.remove(this);
		}
		if (value != null) {
			value.asignatura.add(this);
		}
	}
	
	public v2.orm.Curso getCurso_id_fk() {
		return curso_id_fk;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Curso_id_fk(v2.orm.Curso value) {
		this.curso_id_fk = value;
	}
	
	private v2.orm.Curso getORM_Curso_id_fk() {
		return curso_id_fk;
	}
	
	public void setProfesorid_pk(v2.orm.Profesor value) {
		if (profesorid_pk != null) {
			profesorid_pk.asignatura.remove(this);
		}
		if (value != null) {
			value.asignatura.add(this);
		}
	}
	
	public v2.orm.Profesor getProfesorid_pk() {
		return profesorid_pk;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Profesorid_pk(v2.orm.Profesor value) {
		this.profesorid_pk = value;
	}
	
	private v2.orm.Profesor getORM_Profesorid_pk() {
		return profesorid_pk;
	}
	
	private void setORM_Actividad(java.util.Set value) {
		this.ORM_actividad = value;
	}
	
	private java.util.Set getORM_Actividad() {
		return ORM_actividad;
	}
	
	public final v2.orm.ActividadSetCollection actividad = new v2.orm.ActividadSetCollection(this, _ormAdapter, v2.orm.ORMConstants.KEY_ASIGNATURA_ACTIVIDAD, v2.orm.ORMConstants.KEY_ACTIVIDAD_ASIGNATURA_ID_FK, v2.orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
