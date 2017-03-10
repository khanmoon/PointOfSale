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
@Table(name="Staff_Type")
public class Staff_Type implements Serializable {
	public Staff_Type() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == dto.ORMConstants.KEY_STAFF_TYPE_STAFF) {
			return ORM_staff;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="ST_Id", nullable=false)	
	@Id	
	@GeneratedValue(generator="DTO_STAFF_TYPE_ST_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DTO_STAFF_TYPE_ST_ID_GENERATOR", strategy="native")	
	private int ST_Id;
	
	@Column(name="ST_Type", nullable=true, length=45)	
	private String ST_Type;
	
	@OneToMany(mappedBy="ST", targetEntity=dto.Staff.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_staff = new java.util.HashSet();
	
	private void setST_Id(int value) {
		this.ST_Id = value;
	}
	
	public int getST_Id() {
		return ST_Id;
	}
	
	public int getORMID() {
		return getST_Id();
	}
	
	public void setST_Type(String value) {
		this.ST_Type = value;
	}
	
	public String getST_Type() {
		return ST_Type;
	}
	
	private void setORM_Staff(java.util.Set value) {
		this.ORM_staff = value;
	}
	
	private java.util.Set getORM_Staff() {
		return ORM_staff;
	}
	
	@Transient	
	public final dto.StaffSetCollection staff = new dto.StaffSetCollection(this, _ormAdapter, dto.ORMConstants.KEY_STAFF_TYPE_STAFF, dto.ORMConstants.KEY_STAFF_ST, dto.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getST_Id());
	}
	
}
