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

public class Staff_TypeCriteria extends AbstractORMCriteria {
	public final IntegerExpression ST_Id;
	public final StringExpression ST_Type;
	
	public Staff_TypeCriteria(Criteria criteria) {
		super(criteria);
		ST_Id = new IntegerExpression("ST_Id", this);
		ST_Type = new StringExpression("ST_Type", this);
	}
	
	public Staff_TypeCriteria(PersistentSession session) {
		this(session.createCriteria(Staff_Type.class));
	}
	
	public Staff_TypeCriteria() throws PersistentException {
		this(dto.PointofsalePersistentManager.instance().getSession());
	}
	
	public StaffCriteria createStaffCriteria() {
		return new StaffCriteria(createCriteria("ORM_staff"));
	}
	
	public Staff_Type uniqueStaff_Type() {
		return (Staff_Type) super.uniqueResult();
	}
	
	public Staff_Type[] listStaff_Type() {
		java.util.List list = super.list();
		return (Staff_Type[]) list.toArray(new Staff_Type[list.size()]);
	}
}

