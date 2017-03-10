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

public class CatagoryDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression CAT_Code;
	public final StringExpression CAT_Name;
	
	public CatagoryDetachedCriteria() {
		super(dto.Catagory.class, dto.CatagoryCriteria.class);
		CAT_Code = new IntegerExpression("CAT_Code", this.getDetachedCriteria());
		CAT_Name = new StringExpression("CAT_Name", this.getDetachedCriteria());
	}
	
	public CatagoryDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, dto.CatagoryCriteria.class);
		CAT_Code = new IntegerExpression("CAT_Code", this.getDetachedCriteria());
		CAT_Name = new StringExpression("CAT_Name", this.getDetachedCriteria());
	}
	
	public ProductDetachedCriteria createProductCriteria() {
		return new ProductDetachedCriteria(createCriteria("ORM_product"));
	}
	
	public Catagory uniqueCatagory(PersistentSession session) {
		return (Catagory) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Catagory[] listCatagory(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Catagory[]) list.toArray(new Catagory[list.size()]);
	}
}

