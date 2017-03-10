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
@Table(name="Staff")
public class Staff implements Serializable {
	public Staff() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == dto.ORMConstants.KEY_STAFF_INVOICE) {
			return ORM_invoice;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == dto.ORMConstants.KEY_STAFF_ST) {
			this.ST = (dto.Staff_Type) owner;
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
	
	@Column(name="S_Id", nullable=false)	
	@Id	
	@GeneratedValue(generator="DTO_STAFF_S_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DTO_STAFF_S_ID_GENERATOR", strategy="native")	
	private int s_Id;
	
	@Column(name="S_Name", nullable=true, length=45)	
	private String s_Name;
	
	@Column(name="S_Password", nullable=true, length=45)	
	private String s_Password;
	
	@Column(name="S_UserName", nullable=true, length=45)	
	private String s_UserName;
	
	@ManyToOne(targetEntity=dto.Staff_Type.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="ST_Id", referencedColumnName="ST_Id", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private dto.Staff_Type ST;
	
	@OneToMany(mappedBy="staffS", targetEntity=dto.Invoice.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_invoice = new java.util.HashSet();
	
	private void setS_Id(int value) {
		this.s_Id = value;
	}
	
	public int getS_Id() {
		return s_Id;
	}
	
	public int getORMID() {
		return getS_Id();
	}
	
	public void setS_Name(String value) {
		this.s_Name = value;
	}
	
	public String getS_Name() {
		return s_Name;
	}
	
	public void setS_Password(String value) {
		this.s_Password = value;
	}
	
	public String getS_Password() {
		return s_Password;
	}
	
	public void setS_UserName(String value) {
		this.s_UserName = value;
	}
	
	public String getS_UserName() {
		return s_UserName;
	}
	
	public void setST(dto.Staff_Type value) {
		if (ST != null) {
			ST.staff.remove(this);
		}
		if (value != null) {
			value.staff.add(this);
		}
	}
	
	public dto.Staff_Type getST() {
		return ST;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_ST(dto.Staff_Type value) {
		this.ST = value;
	}
	
	private dto.Staff_Type getORM_ST() {
		return ST;
	}
	
	private void setORM_Invoice(java.util.Set value) {
		this.ORM_invoice = value;
	}
	
	private java.util.Set getORM_Invoice() {
		return ORM_invoice;
	}
	
	@Transient	
	public final dto.InvoiceSetCollection invoice = new dto.InvoiceSetCollection(this, _ormAdapter, dto.ORMConstants.KEY_STAFF_INVOICE, dto.ORMConstants.KEY_INVOICE_STAFFS, dto.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getS_Id());
	}
	
}
