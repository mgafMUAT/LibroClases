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
package com.mauro.librodeclases;

public class Nota {
	public Nota() {
            setID(++idCount);
	}
	
	private int ID;
        private static int idCount = 0;
	
	private float nota;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setNota(float value) {
		this.nota = value;
	}
	
	public float getNota() {
		return nota;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
