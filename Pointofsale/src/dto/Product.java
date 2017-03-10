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
@Table(name="Product")
public class Product implements Serializable {
	public Product() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == dto.ORMConstants.KEY_PRODUCT_LINE) {
			return ORM_line;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == dto.ORMConstants.KEY_PRODUCT_CAT_CODE) {
			this.CAT_Code = (dto.Catagory) owner;
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
	
	@Column(name="PROD_Code", nullable=false)	
	@Id	
	@GeneratedValue(generator="DTO_PRODUCT_PROD_CODE_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DTO_PRODUCT_PROD_CODE_GENERATOR", strategy="native")	
	private int PROD_Code;
	
	@Column(name="PROD_Name", nullable=true, length=11)	
	private String PROD_Name;
	
	@Column(name="PROD_Catagory", nullable=true, length=11)	
	private Integer PROD_Catagory;
	
	@Column(name="PROD_QOH", nullable=true, length=50)	
	private Integer PROD_QOH;
	
	@Column(name="PROD_MIN", nullable=true, length=11)	
	private Integer PROD_MIN;
	
	@Column(name="PROD_Price", nullable=true, length=11)	
	private Integer PROD_Price;
	
	@ManyToOne(targetEntity=dto.Catagory.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="CAT_Code", referencedColumnName="CAT_Code", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private dto.Catagory CAT_Code;
	
	@OneToMany(mappedBy="PROD_Code", targetEntity=dto.Line.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_line = new java.util.HashSet();
	
	private void setPROD_Code(int value) {
		this.PROD_Code = value;
	}
	
	public int getPROD_Code() {
		return PROD_Code;
	}
	
	public int getORMID() {
		return getPROD_Code();
	}
	
	public void setPROD_Name(String value) {
		this.PROD_Name = value;
	}
	
	public String getPROD_Name() {
		return PROD_Name;
	}
	
	public void setPROD_Catagory(int value) {
		setPROD_Catagory(new Integer(value));
	}
	
	public void setPROD_Catagory(Integer value) {
		this.PROD_Catagory = value;
	}
	
	public Integer getPROD_Catagory() {
		return PROD_Catagory;
	}
	
	public void setPROD_QOH(int value) {
		setPROD_QOH(new Integer(value));
	}
	
	public void setPROD_QOH(Integer value) {
		this.PROD_QOH = value;
	}
	
	public Integer getPROD_QOH() {
		return PROD_QOH;
	}
	
	public void setPROD_MIN(int value) {
		setPROD_MIN(new Integer(value));
	}
	
	public void setPROD_MIN(Integer value) {
		this.PROD_MIN = value;
	}
	
	public Integer getPROD_MIN() {
		return PROD_MIN;
	}
	
	public void setPROD_Price(int value) {
		setPROD_Price(new Integer(value));
	}
	
	public void setPROD_Price(Integer value) {
		this.PROD_Price = value;
	}
	
	public Integer getPROD_Price() {
		return PROD_Price;
	}
	
	public void setCAT_Code(dto.Catagory value) {
		if (CAT_Code != null) {
			CAT_Code.product.remove(this);
		}
		if (value != null) {
			value.product.add(this);
		}
	}
	
	public dto.Catagory getCAT_Code() {
		return CAT_Code;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_CAT_Code(dto.Catagory value) {
		this.CAT_Code = value;
	}
	
	private dto.Catagory getORM_CAT_Code() {
		return CAT_Code;
	}
	
	private void setORM_Line(java.util.Set value) {
		this.ORM_line = value;
	}
	
	private java.util.Set getORM_Line() {
		return ORM_line;
	}
	
	@Transient	
	public final dto.LineSetCollection line = new dto.LineSetCollection(this, _ormAdapter, dto.ORMConstants.KEY_PRODUCT_LINE, dto.ORMConstants.KEY_LINE_PROD_CODE, dto.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getPROD_Code());
	}
	
}
