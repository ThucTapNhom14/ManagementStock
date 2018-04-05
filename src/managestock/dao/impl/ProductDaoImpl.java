/**
 * 
 */
package managestock.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import managestock.dao.ProductDao;
import managestock.entity.Product;

/**
 * @author Admin
 *
 */
public class ProductDaoImpl extends BaseDaoImpl implements ProductDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see managestock.dao.ProductDao#getListProduct()
	 */
	@Override
	public ArrayList<Product> getListProduct() throws ClassNotFoundException, SQLException {
		Connection connection = null;
		ArrayList<Product> listProduct = new ArrayList<Product>();
		StringBuilder query = new StringBuilder();
		query.append("SELECT pro.id, pro.name, bra.name as brand, pro.catogory, pro.newprice , pro.garentydate, pro.description");
		query.append("FROM products as pro, brands as bra");
		query.append("WHERE pro.brand = bra.id ");
		query.append(";");
		try {
			connection = getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(query.toString());
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Product product = new Product();
				product.setId(resultSet.getString("id"));
				product.setName(resultSet.getString("name"));
				product.setBrand(resultSet.getString("brand"));
				product.setCatogory(resultSet.getString("catogory"));
				product.setPrice(resultSet.getString("newprice"));
				product.setGuarentydate(resultSet.getString("garentydate"));
				product.setDescription(resultSet.getString("description"));
				listProduct.add(product);
			}
		} finally {
			closeConnection();
		}
		return listProduct;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see managestock.dao.ProductDao#existProductId(java.lang.String)
	 */
	@Override
	public boolean existProductId(String productId) throws ClassNotFoundException, SQLException {
		Connection connection = null;
		StringBuilder query = new StringBuilder();
		query.append("SELECT * ");
		query.append("FROM products ");
		query.append("WHERE id = ? ;");
		try {
			connection = getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(query.toString());
			preparedStatement.setString(1, productId);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				return true;
			}
		} finally {
			closeConnection();
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see managestock.dao.ProductDao#exitBrand(java.lang.String)
	 */
	public boolean exitBrand(String brand_id) throws ClassNotFoundException, SQLException {
		Connection connection = null;
		StringBuilder query = new StringBuilder();
		query.append("SELECT * ");
		query.append("FROM brands ");
		query.append("WHERE id = ? ");
		query.append(";");
		try {
			connection = getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(query.toString());
			preparedStatement.setString(1, brand_id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				return true;
			}
		} finally {
			closeConnection();
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see managestock.dao.ProductDao#exitCategory(java.lang.String)
	 */
	public boolean exitCategory(String category_id) throws ClassNotFoundException, SQLException {
		Connection connection = null;
		StringBuilder query = new StringBuilder();
		query.append("SELECT * ");
		query.append("FROM catogories ");
		query.append("WHERE id = ? ");
		query.append(";");
		try {
			connection = getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(query.toString());
			preparedStatement.setString(1, category_id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				return true;
			}
		} finally {
			closeConnection();
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see managestock.dao.ProductDao#addProduct(managestock.entity.Product)
	 */
	@Override
	public String addProduct(Product product) throws ClassNotFoundException, SQLException {
		Connection connection = null;
		StringBuilder qery = new StringBuilder();
		qery.append("INSERT INTO products ");
		qery.append("VALUE (? , ?, ? , ?, ?, ?, ?) ");
		qery.append(";");
		try {
			connection = getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(qery.toString());
			preparedStatement.setString(1, product.getId());
			preparedStatement.setString(2, product.getName());
			preparedStatement.setString(3, product.getBrand());
			preparedStatement.setString(4, product.getCatogory());
			preparedStatement.setString(5, product.getGuarentydate());
			preparedStatement.setString(6, product.getPrice());
			preparedStatement.setString(7, product.getDescription());
			int ketqua = preparedStatement.executeUpdate();
			if (ketqua > 0) {
				System.out.println("thêm thành công");
			}
		} finally {
			closeConnection();
		}
		return null;
	}

	public void modifyProduct(Product product_1, Product product_2) throws ClassNotFoundException, SQLException {
		Connection connection = null;
		StringBuilder query = new StringBuilder();
		query.append("Update products ");
		query.append("Set id = ?, name = ?, brand = ?, catogory = ?, garentydate = ?, newprice = ?, description = ? ");
		query.append("Where id= ?");
		try {
			connection = getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(query.toString());
			preparedStatement.setString(1, product_2.getId());
			preparedStatement.setString(2, product_2.getName());
			preparedStatement.setString(3, product_2.getBrand());
			preparedStatement.setString(4, product_2.getCatogory());
			preparedStatement.setString(5, product_2.getGuarentydate());
			preparedStatement.setString(6, product_2.getPrice());
			preparedStatement.setString(7, product_2.getDescription());
			preparedStatement.setString(8, product_1.getId());
			int ketqua = preparedStatement.executeUpdate();
			if (ketqua > 0) {
				System.out.println("Sua thanh cong");
			}
		} finally {
			closeConnection();
		}
	}

	public void deleteProduct(Product product) throws ClassNotFoundException, SQLException {
		Connection connection = null;
		StringBuilder query = new StringBuilder();
		query.append("delete from products ");
		query.append("Where id= ?");
		try {
			connection = getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(query.toString());
			preparedStatement.setString(1, product.getId());
			int ketqua = preparedStatement.executeUpdate();
			if (ketqua > 0) {
				System.out.println("Xoa Thanh Cong");
			}
		} finally {
			closeConnection();
		}
	}

	public ArrayList<Product> getSearchListProduct(String searchString) throws ClassNotFoundException, SQLException {
		Connection connection = null;
		ArrayList<Product> listProduct = new ArrayList<Product>();
		StringBuilder query = new StringBuilder();
		query.append("SELECT * ");
		query.append("FROM products ");
		query.append("WHERE id like ? ;");
			try {
				connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(query.toString());
				preparedStatement.setString(1, "%"+searchString+"%");
				ResultSet resultSet = preparedStatement.executeQuery();
				while (resultSet.next()) {
					Product product = new Product();
					product.setId(resultSet.getString("id"));
					product.setName(resultSet.getString("name"));
					product.setBrand(resultSet.getString("brand"));
					product.setCatogory(resultSet.getString("catogory"));
					product.setPrice(resultSet.getString("newprice"));
					product.setGuarentydate(resultSet.getString("garentydate"));
					product.setDescription(resultSet.getString("description"));
					listProduct.add(product);
				}
			} finally {
				closeConnection();
			}
		return listProduct;
	}
}
