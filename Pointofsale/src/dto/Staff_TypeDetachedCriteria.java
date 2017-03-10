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

public class Staff_TypeDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ST_Id;
	public final StringExpression ST_Type;
	
	public Staff_TypeDetachedCriteria() {
		super(dto.Staff_Type.class, dto.Staff_TypeCriteria.class);
		ST_Id = new IntegerExpression("ST_Id", this.getDetachedCriteria());
		ST_Type = new StringExpression("ST_Type", this.getDetachedCriteria());
	}
	
	public Staff_TypeDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, dto.Staff_TypeCriteria.class);
		ST_Id = new IntegerExpression("ST_Id", this.getDetachedCriteria());
		ST_Type = new StringExpression("ST_Type", this.getDetachedCriteria());
	}
	
	public StaffDetachedCriteria createStaffCriteria() {
		return new StaffDetachedCriteria(createCriteria("ORM_staff"));
	}
	
	public Staff_Type uniqueStaff_Type(PersistentSession session) {
		return (Staff_Type) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Staff_Type[] listStaff_Type(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Staff_Type[]) list.toArray(new Staff_Type[list.size()]);
	}
}

