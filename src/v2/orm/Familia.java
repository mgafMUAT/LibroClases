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

public class Familia {
	public Familia() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == v2.orm.ORMConstants.KEY_FAMILIA_ESTUDIANTE1_ID_PK) {
			this.estudiante1_id_pk = (v2.orm.Estudiante) owner;
		}
		
		else if (key == v2.orm.ORMConstants.KEY_FAMILIA_ESTUDIANTE2_ID_PK) {
			this.estudiante2_id_pk = (v2.orm.Estudiante) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id_pk;
	
	private v2.orm.Estudiante estudiante1_id_pk;
	
	private v2.orm.Estudiante estudiante2_id_pk;
	
	private void setId_pk(int value) {
		this.id_pk = value;
	}
	
	public int getId_pk() {
		return id_pk;
	}
	
	public int getORMID() {
		return getId_pk();
	}
	
	public void setEstudiante1_id_pk(v2.orm.Estudiante value) {
		if (estudiante1_id_pk != null) {
			estudiante1_id_pk.familia.remove(this);
		}
		if (value != null) {
			value.familia.add(this);
		}
	}
	
	public v2.orm.Estudiante getEstudiante1_id_pk() {
		return estudiante1_id_pk;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Estudiante1_id_pk(v2.orm.Estudiante value) {
		this.estudiante1_id_pk = value;
	}
	
	private v2.orm.Estudiante getORM_Estudiante1_id_pk() {
		return estudiante1_id_pk;
	}
	
	public void setEstudiante2_id_pk(v2.orm.Estudiante value) {
		if (estudiante2_id_pk != null) {
			estudiante2_id_pk.familia1.remove(this);
		}
		if (value != null) {
			value.familia1.add(this);
		}
	}
	
	public v2.orm.Estudiante getEstudiante2_id_pk() {
		return estudiante2_id_pk;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Estudiante2_id_pk(v2.orm.Estudiante value) {
		this.estudiante2_id_pk = value;
	}
	
	private v2.orm.Estudiante getORM_Estudiante2_id_pk() {
		return estudiante2_id_pk;
	}
	
	public String toString() {
		return String.valueOf(getId_pk());
	}
	
}
