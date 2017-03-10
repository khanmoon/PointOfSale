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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class InvoiceCriteria extends AbstractORMCriteria {
	public final IntegerExpression INV_Number;
	public final StringExpression CUST_Name;
	public final IntegerExpression INV_Date;
	public final IntegerExpression INV_Subtotal;
	public final IntegerExpression INV_Tax;
	public final IntegerExpression INV_Total;
	public final IntegerExpression column;
	
	public InvoiceCriteria(Criteria criteria) {
		super(criteria);
		INV_Number = new IntegerExpression("INV_Number", this);
		CUST_Name = new StringExpression("CUST_Name", this);
		INV_Date = new IntegerExpression("INV_Date", this);
		INV_Subtotal = new IntegerExpression("INV_Subtotal", this);
		INV_Tax = new IntegerExpression("INV_Tax", this);
		INV_Total = new IntegerExpression("INV_Total", this);
		column = new IntegerExpression("column", this);
	}
	
	public InvoiceCriteria(PersistentSession session) {
		this(session.createCriteria(Invoice.class));
	}
	
	public InvoiceCriteria() throws PersistentException {
		this(dto.PointofsalePersistentManager.instance().getSession());
	}
	
	public CustomerCriteria createCUSTCriteria() {
		return new CustomerCriteria(createCriteria("CUST"));
	}
	
	public StaffCriteria createStaffSCriteria() {
		return new StaffCriteria(createCriteria("staffS"));
	}
	
	public LineCriteria createLineCriteria() {
		return new LineCriteria(createCriteria("ORM_line"));
	}
	
	public PaymentCriteria createPaymentCriteria() {
		return new PaymentCriteria(createCriteria("ORM_payment"));
	}
	
	public Invoice uniqueInvoice() {
		return (Invoice) super.uniqueResult();
	}
	
	public Invoice[] listInvoice() {
		java.util.List list = super.list();
		return (Invoice[]) list.toArray(new Invoice[list.size()]);
	}
}

