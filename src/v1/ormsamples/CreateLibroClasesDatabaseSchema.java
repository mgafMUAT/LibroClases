/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package v1.ormsamples;

import org.orm.*;
public class CreateLibroClasesDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(v1.com.mauro.librodeclases.LibroClasesPersistentManager.instance());
			v1.com.mauro.librodeclases.LibroClasesPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
