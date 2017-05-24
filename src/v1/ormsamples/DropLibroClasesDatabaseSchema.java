/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package v1.ormsamples;

import org.orm.*;
public class DropLibroClasesDatabaseSchema {
	public static void main(String[] args) {
		try {
			System.out.println("Are you sure to drop table(s)? (Y/N)");
			java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
			if (reader.readLine().trim().toUpperCase().equals("Y")) {
				ORMDatabaseInitiator.dropSchema(v1.com.mauro.librodeclases.LibroClasesPersistentManager.instance());
				v1.com.mauro.librodeclases.LibroClasesPersistentManager.instance().disposePersistentManager();
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}