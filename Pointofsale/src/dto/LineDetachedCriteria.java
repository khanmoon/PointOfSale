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

public class LineDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression line_Number;
	
	public LineDetachedCriteria() {
		super(dto.Line.class, dto.LineCriteria.class);
		line_Number = new IntegerExpression("line_Number", this.getDetachedCriteria());
	}
	
	public LineDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, dto.LineCriteria.class);
		line_Number = new IntegerExpression("line_Number", this.getDetachedCriteria());
	}
	
	public ProductDetachedCriteria createPROD_CodeCriteria() {
		return new ProductDetachedCriteria(createCriteria("PROD_Code"));
	}
	
	public InvoiceDetachedCriteria createINV_NumberCriteria() {
		return new InvoiceDetachedCriteria(createCriteria("INV_Number"));
	}
	
	public Line uniqueLine(PersistentSession session) {
		return (Line) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Line[] listLine(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Line[]) list.toArray(new Line[list.size()]);
	}
}

