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

public class CustomerDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression CUST_Id;
	public final StringExpression CUST_Name;
	
	public CustomerDetachedCriteria() {
		super(dto.Customer.class, dto.CustomerCriteria.class);
		CUST_Id = new IntegerExpression("CUST_Id", this.getDetachedCriteria());
		CUST_Name = new StringExpression("CUST_Name", this.getDetachedCriteria());
	}
	
	public CustomerDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, dto.CustomerCriteria.class);
		CUST_Id = new IntegerExpression("CUST_Id", this.getDetachedCriteria());
		CUST_Name = new StringExpression("CUST_Name", this.getDetachedCriteria());
	}
	
	public InvoiceDetachedCriteria createInvoiceCriteria() {
		return new InvoiceDetachedCriteria(createCriteria("ORM_invoice"));
	}
	
	public Customer uniqueCustomer(PersistentSession session) {
		return (Customer) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Customer[] listCustomer(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Customer[]) list.toArray(new Customer[list.size()]);
	}
}

