/**
 * 
 */
package managestock.entity;

import java.util.Date;

/**
 * @author Admin
 *
 */
public class Product {
	private String id;
	private String name;
	private String description;
	private Date expirydate;
	private String guarentydate;
	private String price;
	private String brand;
	private String catogory;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(Date expirydate) {
		this.expirydate = expirydate;
	}
	public String getGuarentydate() {
		return guarentydate;
	}
	public void setGuarentydate(String guarentydate) {
		this.guarentydate = guarentydate;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCatogory() {
		return catogory;
	}
	public void setCatogory(String catogory) {
		this.catogory = catogory;
	}
	public Product(){
		
	}
	public Product(String id, String name, String description, String guarentydate, String price,
			String brand, String catogory) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.guarentydate = guarentydate;
		this.price = price;
		this.brand = brand;
		this.catogory = catogory;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", expirydate=" + expirydate
				+ ", guarentydate=" + guarentydate + ", price=" + price + ", brand=" + brand + ", catogory=" + catogory
				+ "]";
	}
	
	

}
