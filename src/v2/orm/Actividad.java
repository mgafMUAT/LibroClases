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

public class Actividad {
	public Actividad() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == v2.orm.ORMConstants.KEY_ACTIVIDAD_ASIGNATURA_ID_FK) {
			this.asignatura_id_fk = (v2.orm.Asignatura) owner;
		}
		
		else if (key == v2.orm.ORMConstants.KEY_ACTIVIDAD_NOTA) {
			this.nota = (v2.orm.Nota) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private v2.orm.Asignatura asignatura_id_fk;
	
	private String nombre;
	
	private String tipo;
	
	private String descripcion;
	
	private v2.orm.Nota nota;
	
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
	
	public void setAsignatura_id_fk(v2.orm.Asignatura value) {
		if (asignatura_id_fk != null) {
			asignatura_id_fk.actividad.remove(this);
		}
		if (value != null) {
			value.actividad.add(this);
		}
	}
	
	public v2.orm.Asignatura getAsignatura_id_fk() {
		return asignatura_id_fk;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Asignatura_id_fk(v2.orm.Asignatura value) {
		this.asignatura_id_fk = value;
	}
	
	private v2.orm.Asignatura getORM_Asignatura_id_fk() {
		return asignatura_id_fk;
	}
	
	public void setNota(v2.orm.Nota value) {
		if (this.nota != value) {
			v2.orm.Nota lnota = this.nota;
			this.nota = value;
			if (value != null) {
				nota.setActividad_id_fk(this);
			}
			if (lnota != null && lnota.getActividad_id_fk() == this) {
				lnota.setActividad_id_fk(null);
			}
		}
	}
	
	public v2.orm.Nota getNota() {
		return nota;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
