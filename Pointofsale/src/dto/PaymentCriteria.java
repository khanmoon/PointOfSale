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

public class PaymentCriteria extends AbstractORMCriteria {
	public final IntegerExpression PAYMENT_Number;
	
	public PaymentCriteria(Criteria criteria) {
		super(criteria);
		PAYMENT_Number = new IntegerExpression("PAYMENT_Number", this);
	}
	
	public PaymentCriteria(PersistentSession session) {
		this(session.createCriteria(Payment.class));
	}
	
	public PaymentCriteria() throws PersistentException {
		this(dto.PointofsalePersistentManager.instance().getSession());
	}
	
	public InvoiceCriteria createINV_NumberCriteria() {
		return new InvoiceCriteria(createCriteria("INV_Number"));
	}
	
	public Payment_MethodCriteria createPAYCriteria() {
		return new Payment_MethodCriteria(createCriteria("PAY"));
	}
	
	public Payment uniquePayment() {
		return (Payment) super.uniqueResult();
	}
	
	public Payment[] listPayment() {
		java.util.List list = super.list();
		return (Payment[]) list.toArray(new Payment[list.size()]);
	}
}

