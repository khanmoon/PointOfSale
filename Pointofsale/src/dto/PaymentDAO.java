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

public class PaymentDAO {
	public static Payment loadPaymentByORMID(int PAYMENT_Number) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return loadPaymentByORMID(session, PAYMENT_Number);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Payment getPaymentByORMID(int PAYMENT_Number) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return getPaymentByORMID(session, PAYMENT_Number);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Payment loadPaymentByORMID(int PAYMENT_Number, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return loadPaymentByORMID(session, PAYMENT_Number, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Payment getPaymentByORMID(int PAYMENT_Number, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return getPaymentByORMID(session, PAYMENT_Number, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Payment loadPaymentByORMID(PersistentSession session, int PAYMENT_Number) throws PersistentException {
		try {
			return (Payment) session.load(dto.Payment.class, new Integer(PAYMENT_Number));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Payment getPaymentByORMID(PersistentSession session, int PAYMENT_Number) throws PersistentException {
		try {
			return (Payment) session.get(dto.Payment.class, new Integer(PAYMENT_Number));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Payment loadPaymentByORMID(PersistentSession session, int PAYMENT_Number, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Payment) session.load(dto.Payment.class, new Integer(PAYMENT_Number), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Payment getPaymentByORMID(PersistentSession session, int PAYMENT_Number, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Payment) session.get(dto.Payment.class, new Integer(PAYMENT_Number), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPayment(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return queryPayment(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPayment(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return queryPayment(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Payment[] listPaymentByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return listPaymentByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Payment[] listPaymentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return listPaymentByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPayment(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From dto.Payment as Payment");
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
	
	public static List queryPayment(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From dto.Payment as Payment");
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
	
	public static Payment[] listPaymentByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPayment(session, condition, orderBy);
			return (Payment[]) list.toArray(new Payment[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Payment[] listPaymentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPayment(session, condition, orderBy, lockMode);
			return (Payment[]) list.toArray(new Payment[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Payment loadPaymentByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return loadPaymentByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Payment loadPaymentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return loadPaymentByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Payment loadPaymentByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Payment[] payments = listPaymentByQuery(session, condition, orderBy);
		if (payments != null && payments.length > 0)
			return payments[0];
		else
			return null;
	}
	
	public static Payment loadPaymentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Payment[] payments = listPaymentByQuery(session, condition, orderBy, lockMode);
		if (payments != null && payments.length > 0)
			return payments[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePaymentByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return iteratePaymentByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePaymentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return iteratePaymentByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePaymentByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From dto.Payment as Payment");
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
	
	public static java.util.Iterator iteratePaymentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From dto.Payment as Payment");
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
	
	public static Payment createPayment() {
		return new dto.Payment();
	}
	
	public static boolean save(dto.Payment payment) throws PersistentException {
		try {
			dto.PointofsalePersistentManager.instance().saveObject(payment);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(dto.Payment payment) throws PersistentException {
		try {
			dto.PointofsalePersistentManager.instance().deleteObject(payment);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(dto.Payment payment)throws PersistentException {
		try {
			if(payment.getINV_Number() != null) {
				payment.getINV_Number().payment.remove(payment);
			}
			
			if(payment.getPAY() != null) {
				payment.getPAY().payment.remove(payment);
			}
			
			return delete(payment);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(dto.Payment payment, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(payment.getINV_Number() != null) {
				payment.getINV_Number().payment.remove(payment);
			}
			
			if(payment.getPAY() != null) {
				payment.getPAY().payment.remove(payment);
			}
			
			try {
				session.delete(payment);
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
	
	public static boolean refresh(dto.Payment payment) throws PersistentException {
		try {
			dto.PointofsalePersistentManager.instance().getSession().refresh(payment);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(dto.Payment payment) throws PersistentException {
		try {
			dto.PointofsalePersistentManager.instance().getSession().evict(payment);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Payment loadPaymentByCriteria(PaymentCriteria paymentCriteria) {
		Payment[] payments = listPaymentByCriteria(paymentCriteria);
		if(payments == null || payments.length == 0) {
			return null;
		}
		return payments[0];
	}
	
	public static Payment[] listPaymentByCriteria(PaymentCriteria paymentCriteria) {
		return paymentCriteria.listPayment();
	}
}
