/**
 * Group code dao Van Tri
 *  Mar 18, 2018 9:57:06 AM
 * Coppyright@codedao
 */
package managestock.dao;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author hoangdinhthi hoangmainghi
 */
public interface BaseDao {
	/**
	 * hàm kết nôi cơ sở dữ liệu
	 * @return connetion kết nối
	 */
	public Connection getConnection() throws ClassNotFoundException, SQLException;
	/**
	 * Hàm đóng kết nối cơ sở dữ liệu
	 */
	public void closeConnection() throws ClassNotFoundException, SQLException;
}
