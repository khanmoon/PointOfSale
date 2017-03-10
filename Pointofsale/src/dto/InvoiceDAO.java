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

public class InvoiceDAO {
	public static Invoice loadInvoiceByORMID(int INV_Number) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return loadInvoiceByORMID(session, INV_Number);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Invoice getInvoiceByORMID(int INV_Number) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return getInvoiceByORMID(session, INV_Number);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Invoice loadInvoiceByORMID(int INV_Number, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return loadInvoiceByORMID(session, INV_Number, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Invoice getInvoiceByORMID(int INV_Number, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return getInvoiceByORMID(session, INV_Number, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Invoice loadInvoiceByORMID(PersistentSession session, int INV_Number) throws PersistentException {
		try {
			return (Invoice) session.load(dto.Invoice.class, new Integer(INV_Number));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Invoice getInvoiceByORMID(PersistentSession session, int INV_Number) throws PersistentException {
		try {
			return (Invoice) session.get(dto.Invoice.class, new Integer(INV_Number));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Invoice loadInvoiceByORMID(PersistentSession session, int INV_Number, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Invoice) session.load(dto.Invoice.class, new Integer(INV_Number), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Invoice getInvoiceByORMID(PersistentSession session, int INV_Number, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Invoice) session.get(dto.Invoice.class, new Integer(INV_Number), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryInvoice(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return queryInvoice(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryInvoice(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return queryInvoice(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Invoice[] listInvoiceByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return listInvoiceByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Invoice[] listInvoiceByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return listInvoiceByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryInvoice(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From dto.Invoice as Invoice");
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
	
	public static List queryInvoice(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From dto.Invoice as Invoice");
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
	
	public static Invoice[] listInvoiceByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryInvoice(session, condition, orderBy);
			return (Invoice[]) list.toArray(new Invoice[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Invoice[] listInvoiceByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryInvoice(session, condition, orderBy, lockMode);
			return (Invoice[]) list.toArray(new Invoice[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Invoice loadInvoiceByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return loadInvoiceByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Invoice loadInvoiceByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return loadInvoiceByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Invoice loadInvoiceByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Invoice[] invoices = listInvoiceByQuery(session, condition, orderBy);
		if (invoices != null && invoices.length > 0)
			return invoices[0];
		else
			return null;
	}
	
	public static Invoice loadInvoiceByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Invoice[] invoices = listInvoiceByQuery(session, condition, orderBy, lockMode);
		if (invoices != null && invoices.length > 0)
			return invoices[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateInvoiceByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return iterateInvoiceByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateInvoiceByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return iterateInvoiceByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateInvoiceByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From dto.Invoice as Invoice");
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
	
	public static java.util.Iterator iterateInvoiceByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From dto.Invoice as Invoice");
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
	
	public static Invoice createInvoice() {
		return new dto.Invoice();
	}
	
	public static boolean save(dto.Invoice invoice) throws PersistentException {
		try {
			dto.PointofsalePersistentManager.instance().saveObject(invoice);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(dto.Invoice invoice) throws PersistentException {
		try {
			dto.PointofsalePersistentManager.instance().deleteObject(invoice);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(dto.Invoice invoice)throws PersistentException {
		try {
			if(invoice.getCUST() != null) {
				invoice.getCUST().invoice.remove(invoice);
			}
			
			if(invoice.getStaffS() != null) {
				invoice.getStaffS().invoice.remove(invoice);
			}
			
			dto.Line[] lLines = invoice.line.toArray();
			for(int i = 0; i < lLines.length; i++) {
				lLines[i].setINV_Number(null);
			}
			dto.Payment[] lPayments = invoice.payment.toArray();
			for(int i = 0; i < lPayments.length; i++) {
				lPayments[i].setINV_Number(null);
			}
			return delete(invoice);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(dto.Invoice invoice, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(invoice.getCUST() != null) {
				invoice.getCUST().invoice.remove(invoice);
			}
			
			if(invoice.getStaffS() != null) {
				invoice.getStaffS().invoice.remove(invoice);
			}
			
			dto.Line[] lLines = invoice.line.toArray();
			for(int i = 0; i < lLines.length; i++) {
				lLines[i].setINV_Number(null);
			}
			dto.Payment[] lPayments = invoice.payment.toArray();
			for(int i = 0; i < lPayments.length; i++) {
				lPayments[i].setINV_Number(null);
			}
			try {
				session.delete(invoice);
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
	
	public static boolean refresh(dto.Invoice invoice) throws PersistentException {
		try {
			dto.PointofsalePersistentManager.instance().getSession().refresh(invoice);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(dto.Invoice invoice) throws PersistentException {
		try {
			dto.PointofsalePersistentManager.instance().getSession().evict(invoice);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Invoice loadInvoiceByCriteria(InvoiceCriteria invoiceCriteria) {
		Invoice[] invoices = listInvoiceByCriteria(invoiceCriteria);
		if(invoices == null || invoices.length == 0) {
			return null;
		}
		return invoices[0];
	}
	
	public static Invoice[] listInvoiceByCriteria(InvoiceCriteria invoiceCriteria) {
		return invoiceCriteria.listInvoice();
	}
}
