/**
 * Group code dao Van Tri
 *  Mar 18, 2018 10:49:41 AM
 * Coppyright@codedao
 */
package managestock.constants;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.regex.Pattern;

import managestock.logic.impl.TblProductLogicImpl;
import managestock.properties.ConfigProperties;
import managestock.properties.ManageErrorProperties;

/**
 *
 * @author hoangdinhthi hoangmainghi
 */
public class Common {
	/**
	 * Hàm mã hóa password SHA-1
	 * 
	 * @param password
	 *            là password nhập vào
	 * @param salt
	 *            lấy từ cơ sở dữ nhiều theo username
	 * @return result trả về một password mới được mã hóa.
	 */
	public static String endcodeSHA1(String password, String salt) {
		// trộn password vs salt rồi mới mã hóa
		String inPut = password + salt;
		// lưu password được mã hóa vào đây
		String result = null;
		// khởi tạo đối tượng mã hóa SHA-1
		MessageDigest digest;
		try {
			// thuật toán mã hóa SHA-1
			digest = MessageDigest.getInstance("SHA-1");
			// đầu vào là một mảng byte
			digest.update(inPut.getBytes());
			// mã hóa và đưa đối tượng về BigInteger
			BigInteger bigInteger = new BigInteger(1, digest.digest());
			// chuyển về kiểu String hexa 16
			result = bigInteger.toString(16);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * Hàm kiểm tra một chuối string
	 * 
	 * @param text
	 *            chuỗi String nhập vào để kiểm tra
	 * @return true là tồn tại , false không tồn tại
	 */
	public static boolean checkInputText(String text) {
		// nếu text rỗng tức là nhỏ hơn < 1
		if (text.length() < 1) {
			// trả về kết quả false
			return false;
		}
		// trả về kết quả true
		return true;
	}

	/**
	 * Hàm add chuỗi vào một list
	 * 
	 * @param listError
	 *            danh sách để add lỗi
	 * @param error
	 *            chuỗi lỗi
	 * @return true là add được, false là không có gì để add
	 */
	public static boolean addErrorIntoList(ArrayList<String> listError, String error) {
		if (!error.isEmpty()) {
			listError.add(error);
			return true;
		} else {
			return false;
		}
	}

	/**
	 * hàm check maxlength
	 * 
	 * @param chuỗi
	 *            String
	 * @return true là < 50 . false là lớn hươn 50
	 */
	public static boolean checkMaxLength(int max, String key) {
		if (key.length() > max) {
			return false;
		}
		return true;

	}
	/**
	 * Hàm check giá trị halfsize
	 * 
	 * @param number
	 *            số cần check
	 * @return true nếu đều là halfsize, false nếu có kí tự khác halfsize
	 */
	public static boolean checkHalfSizeTotal(String number) {
		Pattern pattern = Pattern.compile(ConfigProperties.readFileProperties().getProperty("regexTotal"));
		boolean validFormat = pattern.matcher(number).matches();
		return validFormat;
	}

	/**
	 * Hàm kiểm tra id của sản phẩm
	 * 
	 * @param product_id
	 *            mã sản phẩm
	 * @return trả về một câu thông báo nếu có lỗi
	 */
	public static String validateProductId(String product_id) throws SQLException, ClassNotFoundException {
		TblProductLogicImpl tblProductLogicImpl = new TblProductLogicImpl();
		String errorPro = "";
		// kiem tra rong
		if (!checkInputText(product_id)) {
			errorPro = ManageErrorProperties.readFileProperties().getProperty("ERR001_ID");
			// kiem tra trong DB
		} else {
			if(!checkMaxLength(Constants.MAX_LENGTH,product_id )) {
				errorPro = ManageErrorProperties.readFileProperties().getProperty("ERR007");
			}
			else if (tblProductLogicImpl.existProductId(product_id)) {
				errorPro = ManageErrorProperties.readFileProperties().getProperty("ERR004");
			}
		}
		return errorPro;
	}
	public static String validateProductIdModify(String product_id) throws SQLException, ClassNotFoundException {
		TblProductLogicImpl tblProductLogicImpl = new TblProductLogicImpl();
		String errorPro = "";
		// kiem tra rong
		if (!checkInputText(product_id)) {
			errorPro = ManageErrorProperties.readFileProperties().getProperty("ERR001_ID");
			// kiem tra trong DB
		} else {
			if(!checkMaxLength(Constants.MAX_LENGTH,product_id )) {
				errorPro = ManageErrorProperties.readFileProperties().getProperty("ERR007");
			}
		}
		return errorPro;
	}
	
	public static String validateProductIdDelete(String product_id) throws SQLException, ClassNotFoundException {
		TblProductLogicImpl tblProductLogicImpl = new TblProductLogicImpl();
		String errorPro = "";
		// kiem tra rong
		if (!checkInputText(product_id)) {
			errorPro = ManageErrorProperties.readFileProperties().getProperty("ERR001_ID");
			// kiem tra trong DB
		} else {
			if(!checkMaxLength(Constants.MAX_LENGTH,product_id )) {
				errorPro = ManageErrorProperties.readFileProperties().getProperty("ERR007");
			}
			else if (!tblProductLogicImpl.existProductId(product_id)) {
				errorPro = ManageErrorProperties.readFileProperties().getProperty("ERR004");
			}
		}
		return errorPro;
	}
	/**
	 * Hàm check tên sản phẩm
	 * @param product_name tên sản phẩm
	 * @return về một câu thông báo lỗi nếu có
	 */
	public static String validateName(String product_name){
		String errorCategory="";
		if(!checkInputText(product_name)){
			errorCategory=ManageErrorProperties.readFileProperties().getProperty("ERR001_NAMEPRODUCT");
		}else{
			if(!checkMaxLength(Constants.MAX_LENGTH, product_name)){
				errorCategory= ManageErrorProperties.readFileProperties().getProperty("ERR007");
			}
		}
		return errorCategory;
	}


	/**
	 * check Thương hiệu
	 * @param prices
	 * @return về một câu thông báo lỗi nếu có
	 */
	public static String validateBrandId(String brand_id) throws SQLException, ClassNotFoundException{
		String errorBrand="";
		TblProductLogicImpl tblProductLogicImpl = new TblProductLogicImpl();
		if(!checkInputText(brand_id)){
			errorBrand=ManageErrorProperties.readFileProperties().getProperty("ERR001_IDBRAND");
		}else{
			if(!checkMaxLength(Constants.MAX_LENGTH, brand_id)){
				errorBrand= ManageErrorProperties.readFileProperties().getProperty("ERR007");
			}else if(!tblProductLogicImpl.existBrand(brand_id)){
				errorBrand = ManageErrorProperties.readFileProperties().getProperty("ERR002_IDBRAND");
			}
		}
		return errorBrand;
	}
	/**
	 * Hàm check loại sản phẩm
	 */
	public static String validateCategoryId(String category_id) throws SQLException, ClassNotFoundException{
		String errorCategory="";
		TblProductLogicImpl tblProductLogicImpl = new TblProductLogicImpl();
		if(!checkInputText(category_id)){
			errorCategory=ManageErrorProperties.readFileProperties().getProperty("ERR001_IDCATOGORY");
		}else{
			if(!checkMaxLength(Constants.MAX_LENGTH, category_id)){
				errorCategory= ManageErrorProperties.readFileProperties().getProperty("ERR007");
			}else if(!tblProductLogicImpl.existCategories(category_id)){
				errorCategory = ManageErrorProperties.readFileProperties().getProperty("ERR002_IDCATOGORY");
			}
		}
		return errorCategory;
	}
	/**
	 * Hàm check Giá sản phẩm
	 * @param prices
	 * @return
	 */
	public static String validatePrices(String prices) {
		String errorPrice = "";
		String totalStr = String.valueOf(prices);
		if (!checkInputText(totalStr)) {
			errorPrice = ManageErrorProperties.readFileProperties().getProperty("ERR001_PRICES");
		} else {
			if (!checkHalfSizeTotal(totalStr)) {
				errorPrice = ManageErrorProperties.readFileProperties().getProperty("ER005_PRIECS");
			}
		}
		return errorPrice;
	}

	
}
