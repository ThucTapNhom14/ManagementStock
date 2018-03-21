/**
 * 
 */
package managestock.entity;

/**
 * @author Admin
 *
 */
public class Catogory {
	private String id;
	private String name;
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
	public Catogory(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Catogory() {
		super();
	}
	
}
