/**
 * Group code dao Van Tri
 *  Mar 18, 2018 10:35:34 AM
 * Coppyright@codedao
 */
package managestock.validate;

import java.sql.SQLException;
import java.util.ArrayList;

import managestock.constants.Common;
import managestock.entity.Product;
import managestock.logic.impl.TblProductLogicImpl;
import managestock.properties.ManageErrorProperties;

/**
 *
 * @author hoangdinhthi hoangmainghi
 */
public class ValidateAdminLogin {
	/**
	 * Hàm check login
	 * @param username
	 * @param password
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public ArrayList<String> validateLogin(String username, String password) throws ClassNotFoundException, SQLException {
		TblProductLogicImpl tblProductLogicImpl = new TblProductLogicImpl();
		ArrayList<String> listErrors = new ArrayList<>();
		if (!Common.checkInputText(username) && !Common.checkInputText(password)) {
			listErrors.add(ManageErrorProperties.readFileProperties().getProperty("ERRO01_UserName"));
			listErrors.add(ManageErrorProperties.readFileProperties().getProperty("ERR001_Password"));
		} else if (!Common.checkInputText(username)) {
			listErrors.add(ManageErrorProperties.readFileProperties().getProperty("ERRO01_UserName"));
		} else if (!Common.checkInputText(password)) {
			listErrors.add(ManageErrorProperties.readFileProperties().getProperty("ERR001_Password"));
		} else {
			if (!tblProductLogicImpl.existLoginAdmin(username, password)) {
				listErrors.add(ManageErrorProperties.readFileProperties().getProperty("ERR002"));
			}
		}
		return listErrors;
	}
	/**
	 * Hàm check product 
	 * @param product
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public ArrayList<String> validateProduct(Product product) throws ClassNotFoundException, SQLException {
		ArrayList<String> listError = new ArrayList<>();
		String manageError = "";
		// chek lỗi ID sản phẩm
		manageError = Common.validateProductId(product.getId());
		Common.addErrorIntoList(listError, manageError);
		// check lỗi tên sản phẩm
		manageError = Common.validateName(product.getName());
		Common.addErrorIntoList(listError, manageError);
		// check thương hiệu
		manageError = Common.validateBrandId(product.getBrand());
		Common.addErrorIntoList(listError, manageError);
		// check loại
		manageError = Common.validateCategoryId(product.getCatogory());
		Common.addErrorIntoList(listError, manageError);
		// check giá
		manageError = Common.validatePrices(product.getPrice());
		Common.addErrorIntoList(listError, manageError);
		return listError;
	}
	
	public ArrayList<String> validateProductModify(Product product) throws ClassNotFoundException, SQLException {
		ArrayList<String> listError = new ArrayList<>();
		String manageError = "";
		// chek lỗi ID sản phẩm
		manageError = Common.validateProductIdModify(product.getId());
		Common.addErrorIntoList(listError, manageError);
		// check lỗi tên sản phẩm
		manageError = Common.validateName(product.getName());
		Common.addErrorIntoList(listError, manageError);
		// check thương hiệu
		manageError = Common.validateBrandId(product.getBrand());
		Common.addErrorIntoList(listError, manageError);
		// check loại
		manageError = Common.validateCategoryId(product.getCatogory());
		Common.addErrorIntoList(listError, manageError);
		// check giá
		manageError = Common.validatePrices(product.getPrice());
		Common.addErrorIntoList(listError, manageError);
		return listError;
	}
	public ArrayList<String> validateProductDelete(Product product) throws ClassNotFoundException, SQLException {
		ArrayList<String> listError = new ArrayList<>();
		String manageError = "";
		// chek lỗi ID sản phẩm
		manageError = Common.validateProductIdDelete(product.getId());
		Common.addErrorIntoList(listError, manageError);
		return listError;
	}
	

}
