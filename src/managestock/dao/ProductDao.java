/**
 * 
 */
package managestock.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import managestock.entity.Product;

/**
 * @author Admin
 *
 */
public interface ProductDao {
	/**
	 * hàm lấy danh sach sản phẩm
	 * @return trả về một danh sách sản phẩm
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public ArrayList<Product> getListProduct() throws ClassNotFoundException, SQLException;
	/**
	 * Hàm check id của sản phẩm có tồn tại trong DB hay không
	 * @param id sản phẩm
	 * @return true là tồn tại
	 */
	public boolean existProductId(String productId) throws ClassNotFoundException, SQLException;
	/**
	 * Hàm check tồn tại của thương hiệu sản phẩm
	 * @param brand_id mã thương hiệu.
	 * @return true là tồn tại, false là không tồn tại
	 */
	public boolean exitBrand(String brand_id) throws ClassNotFoundException , SQLException;
	
	/**
	 * Hàm check tồn tại loại
	 * @param category_id mã thương hiệu
	 * @return true là đúng , flase là không tồn tại
	 */
	public boolean exitCategory(String category_id) throws ClassNotFoundException, SQLException;
	/**
	 * thêm sản phẩm
	 */
	public String addProduct(Product product) throws ClassNotFoundException, SQLException;
}
