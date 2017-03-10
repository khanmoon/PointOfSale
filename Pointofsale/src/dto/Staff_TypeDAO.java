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

public class Staff_TypeDAO {
	public static Staff_Type loadStaff_TypeByORMID(int ST_Id) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return loadStaff_TypeByORMID(session, ST_Id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff_Type getStaff_TypeByORMID(int ST_Id) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return getStaff_TypeByORMID(session, ST_Id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff_Type loadStaff_TypeByORMID(int ST_Id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return loadStaff_TypeByORMID(session, ST_Id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff_Type getStaff_TypeByORMID(int ST_Id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return getStaff_TypeByORMID(session, ST_Id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff_Type loadStaff_TypeByORMID(PersistentSession session, int ST_Id) throws PersistentException {
		try {
			return (Staff_Type) session.load(dto.Staff_Type.class, new Integer(ST_Id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff_Type getStaff_TypeByORMID(PersistentSession session, int ST_Id) throws PersistentException {
		try {
			return (Staff_Type) session.get(dto.Staff_Type.class, new Integer(ST_Id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff_Type loadStaff_TypeByORMID(PersistentSession session, int ST_Id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Staff_Type) session.load(dto.Staff_Type.class, new Integer(ST_Id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff_Type getStaff_TypeByORMID(PersistentSession session, int ST_Id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Staff_Type) session.get(dto.Staff_Type.class, new Integer(ST_Id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryStaff_Type(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return queryStaff_Type(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryStaff_Type(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return queryStaff_Type(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff_Type[] listStaff_TypeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return listStaff_TypeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff_Type[] listStaff_TypeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return listStaff_TypeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryStaff_Type(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From dto.Staff_Type as Staff_Type");
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
	
	public static List queryStaff_Type(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From dto.Staff_Type as Staff_Type");
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
	
	public static Staff_Type[] listStaff_TypeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryStaff_Type(session, condition, orderBy);
			return (Staff_Type[]) list.toArray(new Staff_Type[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff_Type[] listStaff_TypeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryStaff_Type(session, condition, orderBy, lockMode);
			return (Staff_Type[]) list.toArray(new Staff_Type[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff_Type loadStaff_TypeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return loadStaff_TypeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff_Type loadStaff_TypeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return loadStaff_TypeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff_Type loadStaff_TypeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Staff_Type[] staff_Types = listStaff_TypeByQuery(session, condition, orderBy);
		if (staff_Types != null && staff_Types.length > 0)
			return staff_Types[0];
		else
			return null;
	}
	
	public static Staff_Type loadStaff_TypeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Staff_Type[] staff_Types = listStaff_TypeByQuery(session, condition, orderBy, lockMode);
		if (staff_Types != null && staff_Types.length > 0)
			return staff_Types[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateStaff_TypeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return iterateStaff_TypeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateStaff_TypeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return iterateStaff_TypeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateStaff_TypeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From dto.Staff_Type as Staff_Type");
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
	
	public static java.util.Iterator iterateStaff_TypeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From dto.Staff_Type as Staff_Type");
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
	
	public static Staff_Type createStaff_Type() {
		return new dto.Staff_Type();
	}
	
	public static boolean save(dto.Staff_Type staff_Type) throws PersistentException {
		try {
			dto.PointofsalePersistentManager.instance().saveObject(staff_Type);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(dto.Staff_Type staff_Type) throws PersistentException {
		try {
			dto.PointofsalePersistentManager.instance().deleteObject(staff_Type);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(dto.Staff_Type staff_Type)throws PersistentException {
		try {
			dto.Staff[] lStaffs = staff_Type.staff.toArray();
			for(int i = 0; i < lStaffs.length; i++) {
				lStaffs[i].setST(null);
			}
			return delete(staff_Type);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(dto.Staff_Type staff_Type, org.orm.PersistentSession session)throws PersistentException {
		try {
			dto.Staff[] lStaffs = staff_Type.staff.toArray();
			for(int i = 0; i < lStaffs.length; i++) {
				lStaffs[i].setST(null);
			}
			try {
				session.delete(staff_Type);
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
	
	public static boolean refresh(dto.Staff_Type staff_Type) throws PersistentException {
		try {
			dto.PointofsalePersistentManager.instance().getSession().refresh(staff_Type);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(dto.Staff_Type staff_Type) throws PersistentException {
		try {
			dto.PointofsalePersistentManager.instance().getSession().evict(staff_Type);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff_Type loadStaff_TypeByCriteria(Staff_TypeCriteria staff_TypeCriteria) {
		Staff_Type[] staff_Types = listStaff_TypeByCriteria(staff_TypeCriteria);
		if(staff_Types == null || staff_Types.length == 0) {
			return null;
		}
		return staff_Types[0];
	}
	
	public static Staff_Type[] listStaff_TypeByCriteria(Staff_TypeCriteria staff_TypeCriteria) {
		return staff_TypeCriteria.listStaff_Type();
	}
}
