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

public class StaffCriteria extends AbstractORMCriteria {
	public final IntegerExpression s_Id;
	public final StringExpression s_Name;
	public final StringExpression s_Password;
	public final StringExpression s_UserName;
	
	public StaffCriteria(Criteria criteria) {
		super(criteria);
		s_Id = new IntegerExpression("s_Id", this);
		s_Name = new StringExpression("s_Name", this);
		s_Password = new StringExpression("s_Password", this);
		s_UserName = new StringExpression("s_UserName", this);
	}
	
	public StaffCriteria(PersistentSession session) {
		this(session.createCriteria(Staff.class));
	}
	
	public StaffCriteria() throws PersistentException {
		this(dto.PointofsalePersistentManager.instance().getSession());
	}
	
	public Staff_TypeCriteria createSTCriteria() {
		return new Staff_TypeCriteria(createCriteria("ST"));
	}
	
	public InvoiceCriteria createInvoiceCriteria() {
		return new InvoiceCriteria(createCriteria("ORM_invoice"));
	}
	
	public Staff uniqueStaff() {
		return (Staff) super.uniqueResult();
	}
	
	public Staff[] listStaff() {
		java.util.List list = super.list();
		return (Staff[]) list.toArray(new Staff[list.size()]);
	}
}

