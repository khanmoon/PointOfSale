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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Line")
public class Line implements Serializable {
	public Line() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == dto.ORMConstants.KEY_LINE_INV_NUMBER) {
			this.INV_Number = (dto.Invoice) owner;
		}
		
		else if (key == dto.ORMConstants.KEY_LINE_PROD_CODE) {
			this.PROD_Code = (dto.Product) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="Line_Number", nullable=false)	
	@Id	
	@GeneratedValue(generator="DTO_LINE_LINE_NUMBER_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DTO_LINE_LINE_NUMBER_GENERATOR", strategy="native")	
	private int line_Number;
	
	@ManyToOne(targetEntity=dto.Product.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="PROD_Code", referencedColumnName="PROD_Code", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private dto.Product PROD_Code;
	
	@ManyToOne(targetEntity=dto.Invoice.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="INV_Number", referencedColumnName="INV_Number", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private dto.Invoice INV_Number;
	
	private void setLine_Number(int value) {
		this.line_Number = value;
	}
	
	public int getLine_Number() {
		return line_Number;
	}
	
	public int getORMID() {
		return getLine_Number();
	}
	
	public void setINV_Number(dto.Invoice value) {
		if (INV_Number != null) {
			INV_Number.line.remove(this);
		}
		if (value != null) {
			value.line.add(this);
		}
	}
	
	public dto.Invoice getINV_Number() {
		return INV_Number;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_INV_Number(dto.Invoice value) {
		this.INV_Number = value;
	}
	
	private dto.Invoice getORM_INV_Number() {
		return INV_Number;
	}
	
	public void setPROD_Code(dto.Product value) {
		if (PROD_Code != null) {
			PROD_Code.line.remove(this);
		}
		if (value != null) {
			value.line.add(this);
		}
	}
	
	public dto.Product getPROD_Code() {
		return PROD_Code;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_PROD_Code(dto.Product value) {
		this.PROD_Code = value;
	}
	
	private dto.Product getORM_PROD_Code() {
		return PROD_Code;
	}
	
	public String toString() {
		return String.valueOf(getLine_Number());
	}
	
}
