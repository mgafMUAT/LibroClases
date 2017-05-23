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

public class Estudiante {
	public Estudiante() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == v2.orm.ORMConstants.KEY_ESTUDIANTE_NOTA) {
			return ORM_nota;
		}
		else if (key == v2.orm.ORMConstants.KEY_ESTUDIANTE_CURSO_ESTUDIANTE) {
			return ORM_curso_estudiante;
		}
		else if (key == v2.orm.ORMConstants.KEY_ESTUDIANTE_ANOTACIONES) {
			return ORM_anotaciones;
		}
		else if (key == v2.orm.ORMConstants.KEY_ESTUDIANTE_ASISTENCIA) {
			return ORM_asistencia;
		}
		else if (key == v2.orm.ORMConstants.KEY_ESTUDIANTE_FAMILIA) {
			return ORM_familia;
		}
		else if (key == v2.orm.ORMConstants.KEY_ESTUDIANTE_FAMILIA1) {
			return ORM_familia1;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == v2.orm.ORMConstants.KEY_ESTUDIANTE_PERSONA_ID_FK) {
			this.persona_id_fk = (v2.orm.Persona) owner;
		}
		
		else if (key == v2.orm.ORMConstants.KEY_ESTUDIANTE_APODERADO_ID_FK) {
			this.apoderado_id_fk = (v2.orm.Apoderado) owner;
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
	
	private v2.orm.Persona persona_id_fk;
	
	private v2.orm.Apoderado apoderado_id_fk;
	
	private int agnoIngreso;
	
	private String matricula;
	
	private java.util.Set ORM_nota = new java.util.HashSet();
	
	private java.util.Set ORM_curso_estudiante = new java.util.HashSet();
	
	private java.util.Set ORM_anotaciones = new java.util.HashSet();
	
	private java.util.Set ORM_asistencia = new java.util.HashSet();
	
	private java.util.Set ORM_familia = new java.util.HashSet();
	
	private java.util.Set ORM_familia1 = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setAgnoIngreso(int value) {
		this.agnoIngreso = value;
	}
	
	public int getAgnoIngreso() {
		return agnoIngreso;
	}
	
	public void setMatricula(String value) {
		this.matricula = value;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setPersona_id_fk(v2.orm.Persona value) {
		if (this.persona_id_fk != value) {
			v2.orm.Persona lpersona_id_fk = this.persona_id_fk;
			this.persona_id_fk = value;
			if (value != null) {
				persona_id_fk.setEstudiante(this);
			}
			if (lpersona_id_fk != null && lpersona_id_fk.getEstudiante() == this) {
				lpersona_id_fk.setEstudiante(null);
			}
		}
	}
	
	public v2.orm.Persona getPersona_id_fk() {
		return persona_id_fk;
	}
	
	public void setApoderado_id_fk(v2.orm.Apoderado value) {
		if (apoderado_id_fk != null) {
			apoderado_id_fk.estudiante.remove(this);
		}
		if (value != null) {
			value.estudiante.add(this);
		}
	}
	
	public v2.orm.Apoderado getApoderado_id_fk() {
		return apoderado_id_fk;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Apoderado_id_fk(v2.orm.Apoderado value) {
		this.apoderado_id_fk = value;
	}
	
	private v2.orm.Apoderado getORM_Apoderado_id_fk() {
		return apoderado_id_fk;
	}
	
	private void setORM_Nota(java.util.Set value) {
		this.ORM_nota = value;
	}
	
	private java.util.Set getORM_Nota() {
		return ORM_nota;
	}
	
	public final v2.orm.NotaSetCollection nota = new v2.orm.NotaSetCollection(this, _ormAdapter, v2.orm.ORMConstants.KEY_ESTUDIANTE_NOTA, v2.orm.ORMConstants.KEY_NOTA_ESTUDIANTE_ID_FK, v2.orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Curso_estudiante(java.util.Set value) {
		this.ORM_curso_estudiante = value;
	}
	
	private java.util.Set getORM_Curso_estudiante() {
		return ORM_curso_estudiante;
	}
	
	public final v2.orm.Curso_estudianteSetCollection curso_estudiante = new v2.orm.Curso_estudianteSetCollection(this, _ormAdapter, v2.orm.ORMConstants.KEY_ESTUDIANTE_CURSO_ESTUDIANTE, v2.orm.ORMConstants.KEY_CURSO_ESTUDIANTE_ESTUDIANTE_ID_FK, v2.orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Anotaciones(java.util.Set value) {
		this.ORM_anotaciones = value;
	}
	
	private java.util.Set getORM_Anotaciones() {
		return ORM_anotaciones;
	}
	
	public final v2.orm.AnotacionesSetCollection anotaciones = new v2.orm.AnotacionesSetCollection(this, _ormAdapter, v2.orm.ORMConstants.KEY_ESTUDIANTE_ANOTACIONES, v2.orm.ORMConstants.KEY_ANOTACIONES_ESTUDIANTE_ID_FK, v2.orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Asistencia(java.util.Set value) {
		this.ORM_asistencia = value;
	}
	
	private java.util.Set getORM_Asistencia() {
		return ORM_asistencia;
	}
	
	public final v2.orm.AsistenciaSetCollection asistencia = new v2.orm.AsistenciaSetCollection(this, _ormAdapter, v2.orm.ORMConstants.KEY_ESTUDIANTE_ASISTENCIA, v2.orm.ORMConstants.KEY_ASISTENCIA_ESTUDIANTE_ID_FK, v2.orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Familia(java.util.Set value) {
		this.ORM_familia = value;
	}
	
	private java.util.Set getORM_Familia() {
		return ORM_familia;
	}
	
	public final v2.orm.FamiliaSetCollection familia = new v2.orm.FamiliaSetCollection(this, _ormAdapter, v2.orm.ORMConstants.KEY_ESTUDIANTE_FAMILIA, v2.orm.ORMConstants.KEY_FAMILIA_ESTUDIANTE1_ID_PK, v2.orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Familia1(java.util.Set value) {
		this.ORM_familia1 = value;
	}
	
	private java.util.Set getORM_Familia1() {
		return ORM_familia1;
	}
	
	public final v2.orm.FamiliaSetCollection familia1 = new v2.orm.FamiliaSetCollection(this, _ormAdapter, v2.orm.ORMConstants.KEY_ESTUDIANTE_FAMILIA1, v2.orm.ORMConstants.KEY_FAMILIA_ESTUDIANTE2_ID_PK, v2.orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
