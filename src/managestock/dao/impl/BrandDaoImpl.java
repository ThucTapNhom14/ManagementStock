/**
 * 
 */
package managestock.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import managestock.dao.BrandDao;
import managestock.entity.Brand;

/**
 * @author Admin
 *
 */
public class BrandDaoImpl extends BaseDaoImpl implements BrandDao{

	@Override
	public ArrayList<Brand> getListBrand() throws ClassNotFoundException, SQLException {
		ArrayList<Brand> brandList= new ArrayList<Brand>();
		Connection connection = null;
		StringBuilder query = new StringBuilder();
		query.append("SELECT * ");
		query.append("FROM brands;");
		try {
			
		} finally {
			
		}
		return brandList;
	}

}
