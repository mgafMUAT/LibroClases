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

public class Institucion {
	public Institucion() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == v2.orm.ORMConstants.KEY_INSTITUCION_CURSO) {
			return ORM_curso;
		}
		else if (key == v2.orm.ORMConstants.KEY_INSTITUCION_DIRECTIVO) {
			return ORM_directivo;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int id;
	
	private String nombre;
	
	private java.util.Set ORM_curso = new java.util.HashSet();
	
	private java.util.Set ORM_directivo = new java.util.HashSet();
	
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
	
	private void setORM_Curso(java.util.Set value) {
		this.ORM_curso = value;
	}
	
	private java.util.Set getORM_Curso() {
		return ORM_curso;
	}
	
	public final v2.orm.CursoSetCollection curso = new v2.orm.CursoSetCollection(this, _ormAdapter, v2.orm.ORMConstants.KEY_INSTITUCION_CURSO, v2.orm.ORMConstants.KEY_CURSO_INSTITUCION_ID_FK, v2.orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Directivo(java.util.Set value) {
		this.ORM_directivo = value;
	}
	
	private java.util.Set getORM_Directivo() {
		return ORM_directivo;
	}
	
	public final v2.orm.DirectivoSetCollection directivo = new v2.orm.DirectivoSetCollection(this, _ormAdapter, v2.orm.ORMConstants.KEY_INSTITUCION_DIRECTIVO, v2.orm.ORMConstants.KEY_DIRECTIVO_INSTITUCION_ID_FK, v2.orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
