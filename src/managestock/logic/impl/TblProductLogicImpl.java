/**
 * Group code dao Van Tri
 *  Mar 18, 2018 10:35:04 AM
 * Coppyright@codedao
 */
package managestock.logic.impl;

import java.sql.SQLException;
import java.util.ArrayList;

import managestock.constants.Common;
import managestock.dao.impl.ProductDaoImpl;
import managestock.dao.impl.UserDaoImpl;
import managestock.entity.Product;
import managestock.logic.TblProductLogic;

/**
 *
 * @author hoangdinhthi hoangmainghi
 */
public class TblProductLogicImpl implements TblProductLogic {
	private UserDaoImpl userDaoImpl = new UserDaoImpl();
	private ProductDaoImpl productDaoImpl = new ProductDaoImpl();

	/* (non-Javadoc)
	 * @see managestock.logic.TblProductLogic#existLoginAdmin(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean existLoginAdmin(String username, String password) throws ClassNotFoundException, SQLException {
		String salt = userDaoImpl.getSalt(username);
		String passEndCode = Common.endcodeSHA1(password, salt);
		if (userDaoImpl.existAdmin(username, passEndCode)) {
			return true;
		} else {
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see managestock.logic.TblProductLogic#listProduct()
	 */
	@Override
	public ArrayList<Product> listProduct() throws ClassNotFoundException, SQLException {
		ArrayList<Product> arrayList = new ArrayList<>();
		arrayList = productDaoImpl.getListProduct();
		return arrayList;
	}

	/* (non-Javadoc)
	 * @see managestock.logic.TblProductLogic#existProductId(java.lang.String)
	 */
	@Override
	public boolean existProductId(String productId) throws ClassNotFoundException, SQLException {
		boolean result = productDaoImpl.existProductId(productId);
		return result;
	}

	/* (non-Javadoc)
	 * @see managestock.logic.TblProductLogic#existBrand(java.lang.String)
	 */
	@Override
	public boolean existBrand(String Brand_id) throws ClassNotFoundException, SQLException {
		boolean result = productDaoImpl.exitBrand(Brand_id);
		return result;
	}

	/* (non-Javadoc)
	 * @see managestock.logic.TblProductLogic#existCategories(java.lang.String)
	 */
	@Override
	public boolean existCategories(String catergories) throws ClassNotFoundException, SQLException {
		boolean resuilt = productDaoImpl.exitCategory(catergories);
		return resuilt;
	}

}
