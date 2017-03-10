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

public class Payment_MethodDAO {
	public static Payment_Method loadPayment_MethodByORMID(int PAY_Id) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return loadPayment_MethodByORMID(session, PAY_Id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Payment_Method getPayment_MethodByORMID(int PAY_Id) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return getPayment_MethodByORMID(session, PAY_Id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Payment_Method loadPayment_MethodByORMID(int PAY_Id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return loadPayment_MethodByORMID(session, PAY_Id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Payment_Method getPayment_MethodByORMID(int PAY_Id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return getPayment_MethodByORMID(session, PAY_Id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Payment_Method loadPayment_MethodByORMID(PersistentSession session, int PAY_Id) throws PersistentException {
		try {
			return (Payment_Method) session.load(dto.Payment_Method.class, new Integer(PAY_Id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Payment_Method getPayment_MethodByORMID(PersistentSession session, int PAY_Id) throws PersistentException {
		try {
			return (Payment_Method) session.get(dto.Payment_Method.class, new Integer(PAY_Id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Payment_Method loadPayment_MethodByORMID(PersistentSession session, int PAY_Id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Payment_Method) session.load(dto.Payment_Method.class, new Integer(PAY_Id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Payment_Method getPayment_MethodByORMID(PersistentSession session, int PAY_Id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Payment_Method) session.get(dto.Payment_Method.class, new Integer(PAY_Id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPayment_Method(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return queryPayment_Method(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPayment_Method(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return queryPayment_Method(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Payment_Method[] listPayment_MethodByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return listPayment_MethodByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Payment_Method[] listPayment_MethodByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return listPayment_MethodByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPayment_Method(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From dto.Payment_Method as Payment_Method");
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
	
	public static List queryPayment_Method(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From dto.Payment_Method as Payment_Method");
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
	
	public static Payment_Method[] listPayment_MethodByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPayment_Method(session, condition, orderBy);
			return (Payment_Method[]) list.toArray(new Payment_Method[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Payment_Method[] listPayment_MethodByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPayment_Method(session, condition, orderBy, lockMode);
			return (Payment_Method[]) list.toArray(new Payment_Method[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Payment_Method loadPayment_MethodByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return loadPayment_MethodByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Payment_Method loadPayment_MethodByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return loadPayment_MethodByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Payment_Method loadPayment_MethodByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Payment_Method[] payment_Methods = listPayment_MethodByQuery(session, condition, orderBy);
		if (payment_Methods != null && payment_Methods.length > 0)
			return payment_Methods[0];
		else
			return null;
	}
	
	public static Payment_Method loadPayment_MethodByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Payment_Method[] payment_Methods = listPayment_MethodByQuery(session, condition, orderBy, lockMode);
		if (payment_Methods != null && payment_Methods.length > 0)
			return payment_Methods[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePayment_MethodByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return iteratePayment_MethodByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePayment_MethodByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return iteratePayment_MethodByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePayment_MethodByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From dto.Payment_Method as Payment_Method");
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
	
	public static java.util.Iterator iteratePayment_MethodByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From dto.Payment_Method as Payment_Method");
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
	
	public static Payment_Method createPayment_Method() {
		return new dto.Payment_Method();
	}
	
	public static boolean save(dto.Payment_Method payment_Method) throws PersistentException {
		try {
			dto.PointofsalePersistentManager.instance().saveObject(payment_Method);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(dto.Payment_Method payment_Method) throws PersistentException {
		try {
			dto.PointofsalePersistentManager.instance().deleteObject(payment_Method);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(dto.Payment_Method payment_Method)throws PersistentException {
		try {
			dto.Payment[] lPayments = payment_Method.payment.toArray();
			for(int i = 0; i < lPayments.length; i++) {
				lPayments[i].setPAY(null);
			}
			return delete(payment_Method);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(dto.Payment_Method payment_Method, org.orm.PersistentSession session)throws PersistentException {
		try {
			dto.Payment[] lPayments = payment_Method.payment.toArray();
			for(int i = 0; i < lPayments.length; i++) {
				lPayments[i].setPAY(null);
			}
			try {
				session.delete(payment_Method);
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
	
	public static boolean refresh(dto.Payment_Method payment_Method) throws PersistentException {
		try {
			dto.PointofsalePersistentManager.instance().getSession().refresh(payment_Method);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(dto.Payment_Method payment_Method) throws PersistentException {
		try {
			dto.PointofsalePersistentManager.instance().getSession().evict(payment_Method);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Payment_Method loadPayment_MethodByCriteria(Payment_MethodCriteria payment_MethodCriteria) {
		Payment_Method[] payment_Methods = listPayment_MethodByCriteria(payment_MethodCriteria);
		if(payment_Methods == null || payment_Methods.length == 0) {
			return null;
		}
		return payment_Methods[0];
	}
	
	public static Payment_Method[] listPayment_MethodByCriteria(Payment_MethodCriteria payment_MethodCriteria) {
		return payment_MethodCriteria.listPayment_Method();
	}
}
