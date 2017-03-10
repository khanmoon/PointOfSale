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

public class CatagoryCriteria extends AbstractORMCriteria {
	public final IntegerExpression CAT_Code;
	public final StringExpression CAT_Name;
	
	public CatagoryCriteria(Criteria criteria) {
		super(criteria);
		CAT_Code = new IntegerExpression("CAT_Code", this);
		CAT_Name = new StringExpression("CAT_Name", this);
	}
	
	public CatagoryCriteria(PersistentSession session) {
		this(session.createCriteria(Catagory.class));
	}
	
	public CatagoryCriteria() throws PersistentException {
		this(dto.PointofsalePersistentManager.instance().getSession());
	}
	
	public ProductCriteria createProductCriteria() {
		return new ProductCriteria(createCriteria("ORM_product"));
	}
	
	public Catagory uniqueCatagory() {
		return (Catagory) super.uniqueResult();
	}
	
	public Catagory[] listCatagory() {
		java.util.List list = super.list();
		return (Catagory[]) list.toArray(new Catagory[list.size()]);
	}
}

