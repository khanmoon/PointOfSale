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

public class PaymentDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression PAYMENT_Number;
	
	public PaymentDetachedCriteria() {
		super(dto.Payment.class, dto.PaymentCriteria.class);
		PAYMENT_Number = new IntegerExpression("PAYMENT_Number", this.getDetachedCriteria());
	}
	
	public PaymentDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, dto.PaymentCriteria.class);
		PAYMENT_Number = new IntegerExpression("PAYMENT_Number", this.getDetachedCriteria());
	}
	
	public InvoiceDetachedCriteria createINV_NumberCriteria() {
		return new InvoiceDetachedCriteria(createCriteria("INV_Number"));
	}
	
	public Payment_MethodDetachedCriteria createPAYCriteria() {
		return new Payment_MethodDetachedCriteria(createCriteria("PAY"));
	}
	
	public Payment uniquePayment(PersistentSession session) {
		return (Payment) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Payment[] listPayment(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Payment[]) list.toArray(new Payment[list.size()]);
	}
}

