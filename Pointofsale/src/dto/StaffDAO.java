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

public class StaffDAO {
	public static Staff loadStaffByORMID(int s_Id) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return loadStaffByORMID(session, s_Id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff getStaffByORMID(int s_Id) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return getStaffByORMID(session, s_Id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff loadStaffByORMID(int s_Id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return loadStaffByORMID(session, s_Id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff getStaffByORMID(int s_Id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return getStaffByORMID(session, s_Id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff loadStaffByORMID(PersistentSession session, int s_Id) throws PersistentException {
		try {
			return (Staff) session.load(dto.Staff.class, new Integer(s_Id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff getStaffByORMID(PersistentSession session, int s_Id) throws PersistentException {
		try {
			return (Staff) session.get(dto.Staff.class, new Integer(s_Id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff loadStaffByORMID(PersistentSession session, int s_Id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Staff) session.load(dto.Staff.class, new Integer(s_Id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff getStaffByORMID(PersistentSession session, int s_Id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Staff) session.get(dto.Staff.class, new Integer(s_Id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryStaff(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return queryStaff(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryStaff(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return queryStaff(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff[] listStaffByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return listStaffByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff[] listStaffByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return listStaffByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryStaff(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From dto.Staff as Staff");
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
	
	public static List queryStaff(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From dto.Staff as Staff");
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
	
	public static Staff[] listStaffByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryStaff(session, condition, orderBy);
			return (Staff[]) list.toArray(new Staff[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff[] listStaffByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryStaff(session, condition, orderBy, lockMode);
			return (Staff[]) list.toArray(new Staff[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff loadStaffByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return loadStaffByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff loadStaffByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return loadStaffByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff loadStaffByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Staff[] staffs = listStaffByQuery(session, condition, orderBy);
		if (staffs != null && staffs.length > 0)
			return staffs[0];
		else
			return null;
	}
	
	public static Staff loadStaffByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Staff[] staffs = listStaffByQuery(session, condition, orderBy, lockMode);
		if (staffs != null && staffs.length > 0)
			return staffs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateStaffByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return iterateStaffByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateStaffByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return iterateStaffByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateStaffByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From dto.Staff as Staff");
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
	
	public static java.util.Iterator iterateStaffByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From dto.Staff as Staff");
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
	
	public static Staff createStaff() {
		return new dto.Staff();
	}
	
	public static boolean save(dto.Staff staff) throws PersistentException {
		try {
			dto.PointofsalePersistentManager.instance().saveObject(staff);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(dto.Staff staff) throws PersistentException {
		try {
			dto.PointofsalePersistentManager.instance().deleteObject(staff);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(dto.Staff staff)throws PersistentException {
		try {
			if(staff.getST() != null) {
				staff.getST().staff.remove(staff);
			}
			
			dto.Invoice[] lInvoices = staff.invoice.toArray();
			for(int i = 0; i < lInvoices.length; i++) {
				lInvoices[i].setStaffS(null);
			}
			return delete(staff);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(dto.Staff staff, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(staff.getST() != null) {
				staff.getST().staff.remove(staff);
			}
			
			dto.Invoice[] lInvoices = staff.invoice.toArray();
			for(int i = 0; i < lInvoices.length; i++) {
				lInvoices[i].setStaffS(null);
			}
			try {
				session.delete(staff);
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
	
	public static boolean refresh(dto.Staff staff) throws PersistentException {
		try {
			dto.PointofsalePersistentManager.instance().getSession().refresh(staff);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(dto.Staff staff) throws PersistentException {
		try {
			dto.PointofsalePersistentManager.instance().getSession().evict(staff);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Staff loadStaffByCriteria(StaffCriteria staffCriteria) {
		Staff[] staffs = listStaffByCriteria(staffCriteria);
		if(staffs == null || staffs.length == 0) {
			return null;
		}
		return staffs[0];
	}
	
	public static Staff[] listStaffByCriteria(StaffCriteria staffCriteria) {
		return staffCriteria.listStaff();
	}
}
