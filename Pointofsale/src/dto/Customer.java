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
@Table(name="Customer")
public class Customer implements Serializable {
	public Customer() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == dto.ORMConstants.KEY_CUSTOMER_INVOICE) {
			return ORM_invoice;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="CUST_Id", nullable=false)	
	@Id	
	@GeneratedValue(generator="DTO_CUSTOMER_CUST_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DTO_CUSTOMER_CUST_ID_GENERATOR", strategy="native")	
	private int CUST_Id;
	
	@Column(name="CUST_Name", nullable=true, length=45)	
	private String CUST_Name;
	
	@OneToMany(mappedBy="CUST", targetEntity=dto.Invoice.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_invoice = new java.util.HashSet();
	
	private void setCUST_Id(int value) {
		this.CUST_Id = value;
	}
	
	public int getCUST_Id() {
		return CUST_Id;
	}
	
	public int getORMID() {
		return getCUST_Id();
	}
	
	public void setCUST_Name(String value) {
		this.CUST_Name = value;
	}
	
	public String getCUST_Name() {
		return CUST_Name;
	}
	
	private void setORM_Invoice(java.util.Set value) {
		this.ORM_invoice = value;
	}
	
	private java.util.Set getORM_Invoice() {
		return ORM_invoice;
	}
	
	@Transient	
	public final dto.InvoiceSetCollection invoice = new dto.InvoiceSetCollection(this, _ormAdapter, dto.ORMConstants.KEY_CUSTOMER_INVOICE, dto.ORMConstants.KEY_INVOICE_CUST, dto.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getCUST_Id());
	}
	
}
