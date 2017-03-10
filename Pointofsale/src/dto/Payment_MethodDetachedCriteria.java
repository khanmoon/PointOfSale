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

public class Payment_MethodDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression PAY_Id;
	public final StringExpression PAY_Type;
	
	public Payment_MethodDetachedCriteria() {
		super(dto.Payment_Method.class, dto.Payment_MethodCriteria.class);
		PAY_Id = new IntegerExpression("PAY_Id", this.getDetachedCriteria());
		PAY_Type = new StringExpression("PAY_Type", this.getDetachedCriteria());
	}
	
	public Payment_MethodDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, dto.Payment_MethodCriteria.class);
		PAY_Id = new IntegerExpression("PAY_Id", this.getDetachedCriteria());
		PAY_Type = new StringExpression("PAY_Type", this.getDetachedCriteria());
	}
	
	public PaymentDetachedCriteria createPaymentCriteria() {
		return new PaymentDetachedCriteria(createCriteria("ORM_payment"));
	}
	
	public Payment_Method uniquePayment_Method(PersistentSession session) {
		return (Payment_Method) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Payment_Method[] listPayment_Method(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Payment_Method[]) list.toArray(new Payment_Method[list.size()]);
	}
}

