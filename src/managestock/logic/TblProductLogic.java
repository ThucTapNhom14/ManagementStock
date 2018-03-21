/**
 * Group code dao Van Tri
 *  Mar 18, 2018 10:34:44 AM
 * Coppyright@codedao
 */
package managestock.logic;

import java.sql.SQLException;
import java.util.ArrayList;

import managestock.entity.Product;

/**
 *
 * @author hoangdinhthi hoangmainghi
 */
public interface TblProductLogic {
	/**
	 * kiểm tra sự tồn tại khi đăng nhập vào
	 * @param username tên đăng nhập khi nhập vào.
	 * @param password mật khẩu admin khi nhập vào
	 * @return true là tồn tại, false là không tồn tại
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public boolean existLoginAdmin(String username, String password) throws ClassNotFoundException, SQLException;
	/**
	 * Hàm lấy danh sách sản phẩm từ DB
	 * @return trả về một danh sách
	 */
	public ArrayList<Product> listProduct() throws ClassNotFoundException, SQLException;
	/**
	 * hàm kiểm productId tồn tại trong DB
	 * @param productId 
	 * @return true là tồn tại. else ngược lại là không tồn tại
	 */
	public boolean existProductId(String productId) throws ClassNotFoundException, SQLException;
	/**
	 * Hàm kiểm tra sự tồn tại của thương hiệu
	 * @param brand_id mã thương hiệu
	 * @return true là tồn tại , false là không tồn tại
	 */
	public boolean existBrand(String Brand_id) throws ClassNotFoundException, SQLException;
	
	/**
	 * Hàm kiểm tra sự tồn tại của loại sản phẩm
	 * @param categoriesId mã loại sản phẩm
	 * @return true là tồn tại, false là không tồn tại
	 */
	public boolean existCategories(String catergories) throws ClassNotFoundException, SQLException;
}
