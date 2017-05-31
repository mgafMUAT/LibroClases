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
package orm;

public class Actividad {
	public Actividad() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_ACTIVIDAD_NOTA) {
			return ORM_nota;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_ACTIVIDAD_ASIGNATURA_ID_FK) {
			this.asignatura_id_fk = (orm.Asignatura) owner;
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
	
	private orm.Asignatura asignatura_id_fk;
	
	private String nombre;
	
	private String tipo;
	
	private String descripcion;
	
	private java.util.Set ORM_nota = new java.util.HashSet();
	
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
	
	public void setTipo(String value) {
		this.tipo = value;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setDescripcion(String value) {
		this.descripcion = value;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setAsignatura_id_fk(orm.Asignatura value) {
		if (asignatura_id_fk != null) {
			asignatura_id_fk.actividad.remove(this);
		}
		if (value != null) {
			value.actividad.add(this);
		}
	}
	
	public orm.Asignatura getAsignatura_id_fk() {
		return asignatura_id_fk;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Asignatura_id_fk(orm.Asignatura value) {
		this.asignatura_id_fk = value;
	}
	
	private orm.Asignatura getORM_Asignatura_id_fk() {
		return asignatura_id_fk;
	}
	
	private void setORM_Nota(java.util.Set value) {
		this.ORM_nota = value;
	}
	
	private java.util.Set getORM_Nota() {
		return ORM_nota;
	}
	
	public final orm.NotaSetCollection nota = new orm.NotaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_ACTIVIDAD_NOTA, orm.ORMConstants.KEY_NOTA_ACTIVIDAD_ID_FK, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
