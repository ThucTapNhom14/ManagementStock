/**
 * 
 */
package managestock.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import managestock.dao.BrandDao;
import managestock.entity.Brand;

/**
 * @author Admin
 *
 */
public class BrandDaoImpl extends BaseDaoImpl implements BrandDao{

	public ArrayList<Brand> getListBrand() throws ClassNotFoundException, SQLException {
		ArrayList<Brand> brandList= new ArrayList<Brand>();
		Connection connection = null;
		StringBuilder query = new StringBuilder();
		query.append("SELECT * ");
		query.append("FROM brands;");
		try {
			connection = getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(query.toString());
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()){
				Brand brand= new Brand();
				 brand.setId(resultSet.getString("id"));
				 brand.setName(resultSet.getString("name"));
				 brandList.add(brand);
			}
		} finally {
			connection.close();
		}
		return brandList;
	}


}
