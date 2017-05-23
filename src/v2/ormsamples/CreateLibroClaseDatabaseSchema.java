/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package v2.ormsamples;

import org.orm.*;
public class CreateLibroClaseDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(v2.orm.LibroClasePersistentManager.instance());
			v2.orm.LibroClasePersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
