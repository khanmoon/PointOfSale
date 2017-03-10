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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class InvoiceDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression INV_Number;
	public final StringExpression CUST_Name;
	public final IntegerExpression INV_Date;
	public final IntegerExpression INV_Subtotal;
	public final IntegerExpression INV_Tax;
	public final IntegerExpression INV_Total;
	public final IntegerExpression column;
	
	public InvoiceDetachedCriteria() {
		super(dto.Invoice.class, dto.InvoiceCriteria.class);
		INV_Number = new IntegerExpression("INV_Number", this.getDetachedCriteria());
		CUST_Name = new StringExpression("CUST_Name", this.getDetachedCriteria());
		INV_Date = new IntegerExpression("INV_Date", this.getDetachedCriteria());
		INV_Subtotal = new IntegerExpression("INV_Subtotal", this.getDetachedCriteria());
		INV_Tax = new IntegerExpression("INV_Tax", this.getDetachedCriteria());
		INV_Total = new IntegerExpression("INV_Total", this.getDetachedCriteria());
		column = new IntegerExpression("column", this.getDetachedCriteria());
	}
	
	public InvoiceDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, dto.InvoiceCriteria.class);
		INV_Number = new IntegerExpression("INV_Number", this.getDetachedCriteria());
		CUST_Name = new StringExpression("CUST_Name", this.getDetachedCriteria());
		INV_Date = new IntegerExpression("INV_Date", this.getDetachedCriteria());
		INV_Subtotal = new IntegerExpression("INV_Subtotal", this.getDetachedCriteria());
		INV_Tax = new IntegerExpression("INV_Tax", this.getDetachedCriteria());
		INV_Total = new IntegerExpression("INV_Total", this.getDetachedCriteria());
		column = new IntegerExpression("column", this.getDetachedCriteria());
	}
	
	public CustomerDetachedCriteria createCUSTCriteria() {
		return new CustomerDetachedCriteria(createCriteria("CUST"));
	}
	
	public StaffDetachedCriteria createStaffSCriteria() {
		return new StaffDetachedCriteria(createCriteria("staffS"));
	}
	
	public LineDetachedCriteria createLineCriteria() {
		return new LineDetachedCriteria(createCriteria("ORM_line"));
	}
	
	public PaymentDetachedCriteria createPaymentCriteria() {
		return new PaymentDetachedCriteria(createCriteria("ORM_payment"));
	}
	
	public Invoice uniqueInvoice(PersistentSession session) {
		return (Invoice) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Invoice[] listInvoice(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Invoice[]) list.toArray(new Invoice[list.size()]);
	}
}

