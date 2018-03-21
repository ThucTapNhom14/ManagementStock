/**
 * Group code dao Van Tri
 *  Mar 18, 2018 9:57:35 AM
 * Coppyright@codedao
 */
package managestock.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import managestock.dao.BaseDao;
import managestock.properties.ConfigProperties;

/**
 *
 * @author hoangdinhthi hoangmainghi
 */
public class BaseDaoImpl implements BaseDao {
	private Connection connection =  null;
	private String URL;
	private String USER;
	private String PASS;
	

	/* (non-Javadoc)
	 * @see managestock.dao.BaseDao#getConnection()
	 */
	@Override
	public Connection getConnection() throws ClassNotFoundException, SQLException {
	
			URL = ConfigProperties.readFileProperties().getProperty("url");
			USER = ConfigProperties.readFileProperties().getProperty("user");
			PASS = ConfigProperties.readFileProperties().getProperty("password");
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(URL, USER, PASS);
		
		return connection;
	}

	/* (non-Javadoc)
	 * @see managestock.dao.BaseDao#closeConnection()
	 */
	@Override
	public void closeConnection() throws ClassNotFoundException, SQLException {
		connection.close();
		
	}
	
	
}
