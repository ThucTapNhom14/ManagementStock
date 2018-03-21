/**
 * 
 */
package managestock.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import managestock.entity.Brand;

/**
 * @author Admin
 *
 */
public interface BrandDao {
	public ArrayList<Brand> getListBrand() throws ClassNotFoundException, SQLException;
}
