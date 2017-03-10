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

public class ProductCriteria extends AbstractORMCriteria {
	public final IntegerExpression PROD_Code;
	public final StringExpression PROD_Name;
	public final IntegerExpression PROD_Catagory;
	public final IntegerExpression PROD_QOH;
	public final IntegerExpression PROD_MIN;
	public final IntegerExpression PROD_Price;
	
	public ProductCriteria(Criteria criteria) {
		super(criteria);
		PROD_Code = new IntegerExpression("PROD_Code", this);
		PROD_Name = new StringExpression("PROD_Name", this);
		PROD_Catagory = new IntegerExpression("PROD_Catagory", this);
		PROD_QOH = new IntegerExpression("PROD_QOH", this);
		PROD_MIN = new IntegerExpression("PROD_MIN", this);
		PROD_Price = new IntegerExpression("PROD_Price", this);
	}
	
	public ProductCriteria(PersistentSession session) {
		this(session.createCriteria(Product.class));
	}
	
	public ProductCriteria() throws PersistentException {
		this(dto.PointofsalePersistentManager.instance().getSession());
	}
	
	public CatagoryCriteria createCAT_CodeCriteria() {
		return new CatagoryCriteria(createCriteria("CAT_Code"));
	}
	
	public LineCriteria createLineCriteria() {
		return new LineCriteria(createCriteria("ORM_line"));
	}
	
	public Product uniqueProduct() {
		return (Product) super.uniqueResult();
	}
	
	public Product[] listProduct() {
		java.util.List list = super.list();
		return (Product[]) list.toArray(new Product[list.size()]);
	}
}

