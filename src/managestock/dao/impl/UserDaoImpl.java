/**
 * Group code dao Van Tri
 *  Mar 18, 2018 10:54:43 AM
 * Coppyright@codedao
 */
package managestock.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import managestock.dao.UserDao;

/**
 * lớp thực hiện thao tác với cơ sở dữ liệu
 * @author hoangdinhthi hoangmainghi
 */
public class UserDaoImpl extends BaseDaoImpl implements UserDao {

	/* (non-Javadoc)
	 * @see managestock.dao.UserDao#getSalt(java.lang.String)
	 */
	@Override
	public String getSalt(String username) throws ClassNotFoundException, SQLException {
		Connection connection = null;
		String result = "";
		StringBuilder query = new StringBuilder();
		query.append("SELECT salt ");
		query.append("FROM admin ");
		query.append("WHERE username = ? ");
		query.append(";");
		try {
			connection = getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(query.toString());
			preparedStatement.setString(1, username);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				result = resultSet.getString("salt");
			}
		} finally {
			closeConnection();
		}
		return result;
	}

	/* (non-Javadoc)
	 * @see managestock.dao.UserDao#existAdmin(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean existAdmin(String username, String password) throws ClassNotFoundException, SQLException {
		Connection connection = null;
		StringBuilder query = new StringBuilder();
		query.append("SELECT * ");
		query.append("FROM admin ");
		query.append("WHERE username = ? AND pass = ? ");
		query.append(";");
		try {
			connection = getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(query.toString());
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				return true;
			}
		} finally {
			closeConnection();
		}
		return false;
	}

}
