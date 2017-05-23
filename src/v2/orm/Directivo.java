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

public class Directivo {
	public Directivo() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == v2.orm.ORMConstants.KEY_DIRECTIVO_PERSONA_ID_FK) {
			this.persona_id_fk = (v2.orm.Persona) owner;
		}
		
		else if (key == v2.orm.ORMConstants.KEY_DIRECTIVO_INSTITUCION_ID_FK) {
			this.institucion_id_fk = (v2.orm.Institucion) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private v2.orm.Persona persona_id_fk;
	
	private v2.orm.Institucion institucion_id_fk;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setPersona_id_fk(v2.orm.Persona value) {
		if (this.persona_id_fk != value) {
			v2.orm.Persona lpersona_id_fk = this.persona_id_fk;
			this.persona_id_fk = value;
			if (value != null) {
				persona_id_fk.setDirectivo(this);
			}
			if (lpersona_id_fk != null && lpersona_id_fk.getDirectivo() == this) {
				lpersona_id_fk.setDirectivo(null);
			}
		}
	}
	
	public v2.orm.Persona getPersona_id_fk() {
		return persona_id_fk;
	}
	
	public void setInstitucion_id_fk(v2.orm.Institucion value) {
		if (institucion_id_fk != null) {
			institucion_id_fk.directivo.remove(this);
		}
		if (value != null) {
			value.directivo.add(this);
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
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
