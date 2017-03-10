/**
 * Licensee: Faculty of informatics, Burapha University 01
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class CreatePointofsaleDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(dto.PointofsalePersistentManager.instance());
			dto.PointofsalePersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
