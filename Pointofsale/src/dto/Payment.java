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
@Table(name="Payment")
public class Payment implements Serializable {
	public Payment() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == dto.ORMConstants.KEY_PAYMENT_PAY) {
			this.PAY = (dto.Payment_Method) owner;
		}
		
		else if (key == dto.ORMConstants.KEY_PAYMENT_INV_NUMBER) {
			this.INV_Number = (dto.Invoice) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="PAYMENT_Number", nullable=false)	
	@Id	
	@GeneratedValue(generator="DTO_PAYMENT_PAYMENT_NUMBER_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DTO_PAYMENT_PAYMENT_NUMBER_GENERATOR", strategy="native")	
	private int PAYMENT_Number;
	
	@ManyToOne(targetEntity=dto.Invoice.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="INV_Number", referencedColumnName="INV_Number", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private dto.Invoice INV_Number;
	
	@ManyToOne(targetEntity=dto.Payment_Method.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="PAY_Id", referencedColumnName="PAY_Id", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private dto.Payment_Method PAY;
	
	private void setPAYMENT_Number(int value) {
		this.PAYMENT_Number = value;
	}
	
	public int getPAYMENT_Number() {
		return PAYMENT_Number;
	}
	
	public int getORMID() {
		return getPAYMENT_Number();
	}
	
	public void setPAY(dto.Payment_Method value) {
		if (PAY != null) {
			PAY.payment.remove(this);
		}
		if (value != null) {
			value.payment.add(this);
		}
	}
	
	public dto.Payment_Method getPAY() {
		return PAY;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_PAY(dto.Payment_Method value) {
		this.PAY = value;
	}
	
	private dto.Payment_Method getORM_PAY() {
		return PAY;
	}
	
	public void setINV_Number(dto.Invoice value) {
		if (INV_Number != null) {
			INV_Number.payment.remove(this);
		}
		if (value != null) {
			value.payment.add(this);
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
	
	public String toString() {
		return String.valueOf(getPAYMENT_Number());
	}
	
}
