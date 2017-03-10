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

public class LineCriteria extends AbstractORMCriteria {
	public final IntegerExpression line_Number;
	
	public LineCriteria(Criteria criteria) {
		super(criteria);
		line_Number = new IntegerExpression("line_Number", this);
	}
	
	public LineCriteria(PersistentSession session) {
		this(session.createCriteria(Line.class));
	}
	
	public LineCriteria() throws PersistentException {
		this(dto.PointofsalePersistentManager.instance().getSession());
	}
	
	public ProductCriteria createPROD_CodeCriteria() {
		return new ProductCriteria(createCriteria("PROD_Code"));
	}
	
	public InvoiceCriteria createINV_NumberCriteria() {
		return new InvoiceCriteria(createCriteria("INV_Number"));
	}
	
	public Line uniqueLine() {
		return (Line) super.uniqueResult();
	}
	
	public Line[] listLine() {
		java.util.List list = super.list();
		return (Line[]) list.toArray(new Line[list.size()]);
	}
}

