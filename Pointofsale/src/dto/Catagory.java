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
@Table(name="Catagory")
public class Catagory implements Serializable {
	public Catagory() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == dto.ORMConstants.KEY_CATAGORY_PRODUCT) {
			return ORM_product;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="CAT_Code", nullable=false)	
	@Id	
	@GeneratedValue(generator="DTO_CATAGORY_CAT_CODE_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DTO_CATAGORY_CAT_CODE_GENERATOR", strategy="native")	
	private int CAT_Code;
	
	@Column(name="CAT_Name", nullable=true, length=50)	
	private String CAT_Name;
	
	@OneToMany(mappedBy="CAT_Code", targetEntity=dto.Product.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_product = new java.util.HashSet();
	
	private void setCAT_Code(int value) {
		this.CAT_Code = value;
	}
	
	public int getCAT_Code() {
		return CAT_Code;
	}
	
	public int getORMID() {
		return getCAT_Code();
	}
	
	public void setCAT_Name(String value) {
		this.CAT_Name = value;
	}
	
	public String getCAT_Name() {
		return CAT_Name;
	}
	
	private void setORM_Product(java.util.Set value) {
		this.ORM_product = value;
	}
	
	private java.util.Set getORM_Product() {
		return ORM_product;
	}
	
	@Transient	
	public final dto.ProductSetCollection product = new dto.ProductSetCollection(this, _ormAdapter, dto.ORMConstants.KEY_CATAGORY_PRODUCT, dto.ORMConstants.KEY_PRODUCT_CAT_CODE, dto.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getCAT_Code());
	}
	
}
