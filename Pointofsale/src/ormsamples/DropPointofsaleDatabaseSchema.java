/**
 * Licensee: Faculty of informatics, Burapha University 01
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class DropPointofsaleDatabaseSchema {
	public static void main(String[] args) {
		try {
			System.out.println("Are you sure to drop table(s)? (Y/N)");
			java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
			if (reader.readLine().trim().toUpperCase().equals("Y")) {
				ORMDatabaseInitiator.dropSchema(dto.PointofsalePersistentManager.instance());
				dto.PointofsalePersistentManager.instance().disposePersistentManager();
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
