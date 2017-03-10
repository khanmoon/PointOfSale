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

public class ProductDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression PROD_Code;
	public final StringExpression PROD_Name;
	public final IntegerExpression PROD_Catagory;
	public final IntegerExpression PROD_QOH;
	public final IntegerExpression PROD_MIN;
	public final IntegerExpression PROD_Price;
	
	public ProductDetachedCriteria() {
		super(dto.Product.class, dto.ProductCriteria.class);
		PROD_Code = new IntegerExpression("PROD_Code", this.getDetachedCriteria());
		PROD_Name = new StringExpression("PROD_Name", this.getDetachedCriteria());
		PROD_Catagory = new IntegerExpression("PROD_Catagory", this.getDetachedCriteria());
		PROD_QOH = new IntegerExpression("PROD_QOH", this.getDetachedCriteria());
		PROD_MIN = new IntegerExpression("PROD_MIN", this.getDetachedCriteria());
		PROD_Price = new IntegerExpression("PROD_Price", this.getDetachedCriteria());
	}
	
	public ProductDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, dto.ProductCriteria.class);
		PROD_Code = new IntegerExpression("PROD_Code", this.getDetachedCriteria());
		PROD_Name = new StringExpression("PROD_Name", this.getDetachedCriteria());
		PROD_Catagory = new IntegerExpression("PROD_Catagory", this.getDetachedCriteria());
		PROD_QOH = new IntegerExpression("PROD_QOH", this.getDetachedCriteria());
		PROD_MIN = new IntegerExpression("PROD_MIN", this.getDetachedCriteria());
		PROD_Price = new IntegerExpression("PROD_Price", this.getDetachedCriteria());
	}
	
	public CatagoryDetachedCriteria createCAT_CodeCriteria() {
		return new CatagoryDetachedCriteria(createCriteria("CAT_Code"));
	}
	
	public LineDetachedCriteria createLineCriteria() {
		return new LineDetachedCriteria(createCriteria("ORM_line"));
	}
	
	public Product uniqueProduct(PersistentSession session) {
		return (Product) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Product[] listProduct(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Product[]) list.toArray(new Product[list.size()]);
	}
}

