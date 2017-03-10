/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Faculty of informatics, Burapha University 01
 * License Type: Purchased
 */
package dto;

import org.orm.*;
import org.hibernate.Query;
import java.util.List;

public class CatagoryDAO {
	public static Catagory loadCatagoryByORMID(int CAT_Code) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return loadCatagoryByORMID(session, CAT_Code);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Catagory getCatagoryByORMID(int CAT_Code) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return getCatagoryByORMID(session, CAT_Code);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Catagory loadCatagoryByORMID(int CAT_Code, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return loadCatagoryByORMID(session, CAT_Code, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Catagory getCatagoryByORMID(int CAT_Code, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return getCatagoryByORMID(session, CAT_Code, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Catagory loadCatagoryByORMID(PersistentSession session, int CAT_Code) throws PersistentException {
		try {
			return (Catagory) session.load(dto.Catagory.class, new Integer(CAT_Code));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Catagory getCatagoryByORMID(PersistentSession session, int CAT_Code) throws PersistentException {
		try {
			return (Catagory) session.get(dto.Catagory.class, new Integer(CAT_Code));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Catagory loadCatagoryByORMID(PersistentSession session, int CAT_Code, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Catagory) session.load(dto.Catagory.class, new Integer(CAT_Code), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Catagory getCatagoryByORMID(PersistentSession session, int CAT_Code, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Catagory) session.get(dto.Catagory.class, new Integer(CAT_Code), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCatagory(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return queryCatagory(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCatagory(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return queryCatagory(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Catagory[] listCatagoryByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return listCatagoryByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Catagory[] listCatagoryByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return listCatagoryByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCatagory(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From dto.Catagory as Catagory");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCatagory(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From dto.Catagory as Catagory");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Catagory[] listCatagoryByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCatagory(session, condition, orderBy);
			return (Catagory[]) list.toArray(new Catagory[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Catagory[] listCatagoryByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCatagory(session, condition, orderBy, lockMode);
			return (Catagory[]) list.toArray(new Catagory[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Catagory loadCatagoryByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return loadCatagoryByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Catagory loadCatagoryByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return loadCatagoryByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Catagory loadCatagoryByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Catagory[] catagorys = listCatagoryByQuery(session, condition, orderBy);
		if (catagorys != null && catagorys.length > 0)
			return catagorys[0];
		else
			return null;
	}
	
	public static Catagory loadCatagoryByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Catagory[] catagorys = listCatagoryByQuery(session, condition, orderBy, lockMode);
		if (catagorys != null && catagorys.length > 0)
			return catagorys[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCatagoryByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return iterateCatagoryByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCatagoryByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return iterateCatagoryByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCatagoryByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From dto.Catagory as Catagory");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCatagoryByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From dto.Catagory as Catagory");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Catagory createCatagory() {
		return new dto.Catagory();
	}
	
	public static boolean save(dto.Catagory catagory) throws PersistentException {
		try {
			dto.PointofsalePersistentManager.instance().saveObject(catagory);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(dto.Catagory catagory) throws PersistentException {
		try {
			dto.PointofsalePersistentManager.instance().deleteObject(catagory);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(dto.Catagory catagory)throws PersistentException {
		try {
			dto.Product[] lProducts = catagory.product.toArray();
			for(int i = 0; i < lProducts.length; i++) {
				lProducts[i].setCAT_Code(null);
			}
			return delete(catagory);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(dto.Catagory catagory, org.orm.PersistentSession session)throws PersistentException {
		try {
			dto.Product[] lProducts = catagory.product.toArray();
			for(int i = 0; i < lProducts.length; i++) {
				lProducts[i].setCAT_Code(null);
			}
			try {
				session.delete(catagory);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(dto.Catagory catagory) throws PersistentException {
		try {
			dto.PointofsalePersistentManager.instance().getSession().refresh(catagory);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(dto.Catagory catagory) throws PersistentException {
		try {
			dto.PointofsalePersistentManager.instance().getSession().evict(catagory);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Catagory loadCatagoryByCriteria(CatagoryCriteria catagoryCriteria) {
		Catagory[] catagorys = listCatagoryByCriteria(catagoryCriteria);
		if(catagorys == null || catagorys.length == 0) {
			return null;
		}
		return catagorys[0];
	}
	
	public static Catagory[] listCatagoryByCriteria(CatagoryCriteria catagoryCriteria) {
		return catagoryCriteria.listCatagory();
	}
}
