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
@Table(name="Payment_Method")
public class Payment_Method implements Serializable {
	public Payment_Method() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == dto.ORMConstants.KEY_PAYMENT_METHOD_PAYMENT) {
			return ORM_payment;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="PAY_Id", nullable=false)	
	@Id	
	@GeneratedValue(generator="DTO_PAYMENT_METHOD_PAY_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DTO_PAYMENT_METHOD_PAY_ID_GENERATOR", strategy="native")	
	private int PAY_Id;
	
	@Column(name="PAY_Type", nullable=true, length=20)	
	private String PAY_Type;
	
	@OneToMany(mappedBy="PAY", targetEntity=dto.Payment.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_payment = new java.util.HashSet();
	
	private void setPAY_Id(int value) {
		this.PAY_Id = value;
	}
	
	public int getPAY_Id() {
		return PAY_Id;
	}
	
	public int getORMID() {
		return getPAY_Id();
	}
	
	public void setPAY_Type(String value) {
		this.PAY_Type = value;
	}
	
	public String getPAY_Type() {
		return PAY_Type;
	}
	
	private void setORM_Payment(java.util.Set value) {
		this.ORM_payment = value;
	}
	
	private java.util.Set getORM_Payment() {
		return ORM_payment;
	}
	
	@Transient	
	public final dto.PaymentSetCollection payment = new dto.PaymentSetCollection(this, _ormAdapter, dto.ORMConstants.KEY_PAYMENT_METHOD_PAYMENT, dto.ORMConstants.KEY_PAYMENT_PAY, dto.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getPAY_Id());
	}
	
}
