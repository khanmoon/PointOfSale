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

public class CustomerDAO {
	public static Customer loadCustomerByORMID(int CUST_Id) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return loadCustomerByORMID(session, CUST_Id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Customer getCustomerByORMID(int CUST_Id) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return getCustomerByORMID(session, CUST_Id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Customer loadCustomerByORMID(int CUST_Id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return loadCustomerByORMID(session, CUST_Id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Customer getCustomerByORMID(int CUST_Id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return getCustomerByORMID(session, CUST_Id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Customer loadCustomerByORMID(PersistentSession session, int CUST_Id) throws PersistentException {
		try {
			return (Customer) session.load(dto.Customer.class, new Integer(CUST_Id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Customer getCustomerByORMID(PersistentSession session, int CUST_Id) throws PersistentException {
		try {
			return (Customer) session.get(dto.Customer.class, new Integer(CUST_Id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Customer loadCustomerByORMID(PersistentSession session, int CUST_Id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Customer) session.load(dto.Customer.class, new Integer(CUST_Id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Customer getCustomerByORMID(PersistentSession session, int CUST_Id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Customer) session.get(dto.Customer.class, new Integer(CUST_Id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCustomer(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return queryCustomer(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCustomer(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return queryCustomer(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Customer[] listCustomerByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return listCustomerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Customer[] listCustomerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return listCustomerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCustomer(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From dto.Customer as Customer");
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
	
	public static List queryCustomer(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From dto.Customer as Customer");
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
	
	public static Customer[] listCustomerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCustomer(session, condition, orderBy);
			return (Customer[]) list.toArray(new Customer[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Customer[] listCustomerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCustomer(session, condition, orderBy, lockMode);
			return (Customer[]) list.toArray(new Customer[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Customer loadCustomerByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return loadCustomerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Customer loadCustomerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return loadCustomerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Customer loadCustomerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Customer[] customers = listCustomerByQuery(session, condition, orderBy);
		if (customers != null && customers.length > 0)
			return customers[0];
		else
			return null;
	}
	
	public static Customer loadCustomerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Customer[] customers = listCustomerByQuery(session, condition, orderBy, lockMode);
		if (customers != null && customers.length > 0)
			return customers[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCustomerByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return iterateCustomerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCustomerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return iterateCustomerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCustomerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From dto.Customer as Customer");
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
	
	public static java.util.Iterator iterateCustomerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From dto.Customer as Customer");
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
	
	public static Customer createCustomer() {
		return new dto.Customer();
	}
	
	public static boolean save(dto.Customer customer) throws PersistentException {
		try {
			dto.PointofsalePersistentManager.instance().saveObject(customer);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(dto.Customer customer) throws PersistentException {
		try {
			dto.PointofsalePersistentManager.instance().deleteObject(customer);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(dto.Customer customer)throws PersistentException {
		try {
			dto.Invoice[] lInvoices = customer.invoice.toArray();
			for(int i = 0; i < lInvoices.length; i++) {
				lInvoices[i].setCUST(null);
			}
			return delete(customer);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(dto.Customer customer, org.orm.PersistentSession session)throws PersistentException {
		try {
			dto.Invoice[] lInvoices = customer.invoice.toArray();
			for(int i = 0; i < lInvoices.length; i++) {
				lInvoices[i].setCUST(null);
			}
			try {
				session.delete(customer);
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
	
	public static boolean refresh(dto.Customer customer) throws PersistentException {
		try {
			dto.PointofsalePersistentManager.instance().getSession().refresh(customer);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(dto.Customer customer) throws PersistentException {
		try {
			dto.PointofsalePersistentManager.instance().getSession().evict(customer);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Customer loadCustomerByCriteria(CustomerCriteria customerCriteria) {
		Customer[] customers = listCustomerByCriteria(customerCriteria);
		if(customers == null || customers.length == 0) {
			return null;
		}
		return customers[0];
	}
	
	public static Customer[] listCustomerByCriteria(CustomerCriteria customerCriteria) {
		return customerCriteria.listCustomer();
	}
}
