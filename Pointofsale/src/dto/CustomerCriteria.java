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

public class CustomerCriteria extends AbstractORMCriteria {
	public final IntegerExpression CUST_Id;
	public final StringExpression CUST_Name;
	
	public CustomerCriteria(Criteria criteria) {
		super(criteria);
		CUST_Id = new IntegerExpression("CUST_Id", this);
		CUST_Name = new StringExpression("CUST_Name", this);
	}
	
	public CustomerCriteria(PersistentSession session) {
		this(session.createCriteria(Customer.class));
	}
	
	public CustomerCriteria() throws PersistentException {
		this(dto.PointofsalePersistentManager.instance().getSession());
	}
	
	public InvoiceCriteria createInvoiceCriteria() {
		return new InvoiceCriteria(createCriteria("ORM_invoice"));
	}
	
	public Customer uniqueCustomer() {
		return (Customer) super.uniqueResult();
	}
	
	public Customer[] listCustomer() {
		java.util.List list = super.list();
		return (Customer[]) list.toArray(new Customer[list.size()]);
	}
}

