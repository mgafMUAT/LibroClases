/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package v2.ormsamples;

import org.orm.*;
public class DropLibroClaseDatabaseSchema {
	public static void main(String[] args) {
		try {
			System.out.println("Are you sure to drop table(s)? (Y/N)");
			java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
			if (reader.readLine().trim().toUpperCase().equals("Y")) {
				ORMDatabaseInitiator.dropSchema(v2.orm.LibroClasePersistentManager.instance());
				v2.orm.LibroClasePersistentManager.instance().disposePersistentManager();
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
