/**
 * Group code dao Van Tri
 *  Mar 18, 2018 10:54:31 AM
 * Coppyright@codedao
 */
package managestock.dao;

import java.sql.SQLException;

/**
 * Lớp thực hiện thao tác với cơ sở dữ liệu
 * @author hoangdinhthi hoangmainghi
 */
public interface UserDao {
	/**
	 * Hàm lấy salt từ DB
	 * @param Username tên đâng nhập từ form
	 * @return trả về một chuỗi salt tìm được
	 */
	public String getSalt(String username) throws ClassNotFoundException, SQLException;
	/**
	 * Hàm kiểm sự tồn tại của username and password trong DB
	 * @param Username tên đăng nhập từ form
	 * @param Password nhập vào từ form
	 * @return true là tồn tại, false là không tồn tại
	 */
	public boolean existAdmin(String username, String password) throws ClassNotFoundException, SQLException;
	
}
