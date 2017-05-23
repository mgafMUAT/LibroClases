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

public class Anotaciones {
	public Anotaciones() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == v2.orm.ORMConstants.KEY_ANOTACIONES_ESTUDIANTE_ID_FK) {
			this.estudiante_id_fk = (v2.orm.Estudiante) owner;
		}
		
		else if (key == v2.orm.ORMConstants.KEY_ANOTACIONES_PROFESOR_ID_FK) {
			this.profesor_id_fk = (v2.orm.Profesor) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private v2.orm.Estudiante estudiante_id_fk;
	
	private v2.orm.Profesor profesor_id_fk;
	
	private boolean esPositiva;
	
	private String observacion;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setEsPositiva(boolean value) {
		this.esPositiva = value;
	}
	
	public boolean getEsPositiva() {
		return esPositiva;
	}
	
	public void setObservacion(String value) {
		this.observacion = value;
	}
	
	public String getObservacion() {
		return observacion;
	}
	
	public void setEstudiante_id_fk(v2.orm.Estudiante value) {
		if (estudiante_id_fk != null) {
			estudiante_id_fk.anotaciones.remove(this);
		}
		if (value != null) {
			value.anotaciones.add(this);
		}
	}
	
	public v2.orm.Estudiante getEstudiante_id_fk() {
		return estudiante_id_fk;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Estudiante_id_fk(v2.orm.Estudiante value) {
		this.estudiante_id_fk = value;
	}
	
	private v2.orm.Estudiante getORM_Estudiante_id_fk() {
		return estudiante_id_fk;
	}
	
	public void setProfesor_id_fk(v2.orm.Profesor value) {
		if (profesor_id_fk != null) {
			profesor_id_fk.anotaciones.remove(this);
		}
		if (value != null) {
			value.anotaciones.add(this);
		}
	}
	
	public v2.orm.Profesor getProfesor_id_fk() {
		return profesor_id_fk;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Profesor_id_fk(v2.orm.Profesor value) {
		this.profesor_id_fk = value;
	}
	
	private v2.orm.Profesor getORM_Profesor_id_fk() {
		return profesor_id_fk;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
