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

public class Payment_MethodCriteria extends AbstractORMCriteria {
	public final IntegerExpression PAY_Id;
	public final StringExpression PAY_Type;
	
	public Payment_MethodCriteria(Criteria criteria) {
		super(criteria);
		PAY_Id = new IntegerExpression("PAY_Id", this);
		PAY_Type = new StringExpression("PAY_Type", this);
	}
	
	public Payment_MethodCriteria(PersistentSession session) {
		this(session.createCriteria(Payment_Method.class));
	}
	
	public Payment_MethodCriteria() throws PersistentException {
		this(dto.PointofsalePersistentManager.instance().getSession());
	}
	
	public PaymentCriteria createPaymentCriteria() {
		return new PaymentCriteria(createCriteria("ORM_payment"));
	}
	
	public Payment_Method uniquePayment_Method() {
		return (Payment_Method) super.uniqueResult();
	}
	
	public Payment_Method[] listPayment_Method() {
		java.util.List list = super.list();
		return (Payment_Method[]) list.toArray(new Payment_Method[list.size()]);
	}
}

