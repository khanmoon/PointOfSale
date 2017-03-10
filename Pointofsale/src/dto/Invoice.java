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
@Table(name="Invoice")
public class Invoice implements Serializable {
	public Invoice() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == dto.ORMConstants.KEY_INVOICE_LINE) {
			return ORM_line;
		}
		else if (key == dto.ORMConstants.KEY_INVOICE_PAYMENT) {
			return ORM_payment;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == dto.ORMConstants.KEY_INVOICE_STAFFS) {
			this.staffS = (dto.Staff) owner;
		}
		
		else if (key == dto.ORMConstants.KEY_INVOICE_CUST) {
			this.CUST = (dto.Customer) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="INV_Number", nullable=false)	
	@Id	
	@GeneratedValue(generator="DTO_INVOICE_INV_NUMBER_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DTO_INVOICE_INV_NUMBER_GENERATOR", strategy="native")	
	private int INV_Number;
	
	@ManyToOne(targetEntity=dto.Customer.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="CUST_Id", referencedColumnName="CUST_Id", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private dto.Customer CUST;
	
	@Column(name="CUST_Name", nullable=true, length=45)	
	private String CUST_Name;
	
	@Column(name="INV_Date", nullable=true, length=11)	
	private Integer INV_Date;
	
	@Column(name="INV_Subtotal", nullable=true, length=50)	
	private Integer INV_Subtotal;
	
	@Column(name="INV_Tax", nullable=true, length=50)	
	private Integer INV_Tax;
	
	@Column(name="INV_Total", nullable=true, length=100)	
	private Integer INV_Total;
	
	@Column(name="`Column`", nullable=true, length=11)	
	private Integer column;
	
	@ManyToOne(targetEntity=dto.Staff.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="StaffS_Id", referencedColumnName="S_Id", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private dto.Staff staffS;
	
	@OneToMany(mappedBy="INV_Number", targetEntity=dto.Line.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_line = new java.util.HashSet();
	
	@OneToMany(mappedBy="INV_Number", targetEntity=dto.Payment.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_payment = new java.util.HashSet();
	
	private void setINV_Number(int value) {
		this.INV_Number = value;
	}
	
	public int getINV_Number() {
		return INV_Number;
	}
	
	public int getORMID() {
		return getINV_Number();
	}
	
	public void setCUST_Name(String value) {
		this.CUST_Name = value;
	}
	
	public String getCUST_Name() {
		return CUST_Name;
	}
	
	public void setINV_Date(int value) {
		setINV_Date(new Integer(value));
	}
	
	public void setINV_Date(Integer value) {
		this.INV_Date = value;
	}
	
	public Integer getINV_Date() {
		return INV_Date;
	}
	
	public void setINV_Subtotal(int value) {
		setINV_Subtotal(new Integer(value));
	}
	
	public void setINV_Subtotal(Integer value) {
		this.INV_Subtotal = value;
	}
	
	public Integer getINV_Subtotal() {
		return INV_Subtotal;
	}
	
	public void setINV_Tax(int value) {
		setINV_Tax(new Integer(value));
	}
	
	public void setINV_Tax(Integer value) {
		this.INV_Tax = value;
	}
	
	public Integer getINV_Tax() {
		return INV_Tax;
	}
	
	public void setINV_Total(int value) {
		setINV_Total(new Integer(value));
	}
	
	public void setINV_Total(Integer value) {
		this.INV_Total = value;
	}
	
	public Integer getINV_Total() {
		return INV_Total;
	}
	
	public void setColumn(int value) {
		setColumn(new Integer(value));
	}
	
	public void setColumn(Integer value) {
		this.column = value;
	}
	
	public Integer getColumn() {
		return column;
	}
	
	public void setStaffS(dto.Staff value) {
		if (staffS != null) {
			staffS.invoice.remove(this);
		}
		if (value != null) {
			value.invoice.add(this);
		}
	}
	
	public dto.Staff getStaffS() {
		return staffS;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_StaffS(dto.Staff value) {
		this.staffS = value;
	}
	
	private dto.Staff getORM_StaffS() {
		return staffS;
	}
	
	public void setCUST(dto.Customer value) {
		if (CUST != null) {
			CUST.invoice.remove(this);
		}
		if (value != null) {
			value.invoice.add(this);
		}
	}
	
	public dto.Customer getCUST() {
		return CUST;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_CUST(dto.Customer value) {
		this.CUST = value;
	}
	
	private dto.Customer getORM_CUST() {
		return CUST;
	}
	
	private void setORM_Line(java.util.Set value) {
		this.ORM_line = value;
	}
	
	private java.util.Set getORM_Line() {
		return ORM_line;
	}
	
	@Transient	
	public final dto.LineSetCollection line = new dto.LineSetCollection(this, _ormAdapter, dto.ORMConstants.KEY_INVOICE_LINE, dto.ORMConstants.KEY_LINE_INV_NUMBER, dto.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Payment(java.util.Set value) {
		this.ORM_payment = value;
	}
	
	private java.util.Set getORM_Payment() {
		return ORM_payment;
	}
	
	@Transient	
	public final dto.PaymentSetCollection payment = new dto.PaymentSetCollection(this, _ormAdapter, dto.ORMConstants.KEY_INVOICE_PAYMENT, dto.ORMConstants.KEY_PAYMENT_INV_NUMBER, dto.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getINV_Number());
	}
	
}
