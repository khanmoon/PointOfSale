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

public class StaffDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression s_Id;
	public final StringExpression s_Name;
	public final StringExpression s_Password;
	public final StringExpression s_UserName;
	
	public StaffDetachedCriteria() {
		super(dto.Staff.class, dto.StaffCriteria.class);
		s_Id = new IntegerExpression("s_Id", this.getDetachedCriteria());
		s_Name = new StringExpression("s_Name", this.getDetachedCriteria());
		s_Password = new StringExpression("s_Password", this.getDetachedCriteria());
		s_UserName = new StringExpression("s_UserName", this.getDetachedCriteria());
	}
	
	public StaffDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, dto.StaffCriteria.class);
		s_Id = new IntegerExpression("s_Id", this.getDetachedCriteria());
		s_Name = new StringExpression("s_Name", this.getDetachedCriteria());
		s_Password = new StringExpression("s_Password", this.getDetachedCriteria());
		s_UserName = new StringExpression("s_UserName", this.getDetachedCriteria());
	}
	
	public Staff_TypeDetachedCriteria createSTCriteria() {
		return new Staff_TypeDetachedCriteria(createCriteria("ST"));
	}
	
	public InvoiceDetachedCriteria createInvoiceCriteria() {
		return new InvoiceDetachedCriteria(createCriteria("ORM_invoice"));
	}
	
	public Staff uniqueStaff(PersistentSession session) {
		return (Staff) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Staff[] listStaff(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Staff[]) list.toArray(new Staff[list.size()]);
	}
}

