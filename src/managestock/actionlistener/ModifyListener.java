/**
 * 
 */
package managestock.actionlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

import managestock.dao.impl.ProductDaoImpl;
import managestock.entity.Product;
import managestock.validate.ValidateAdminLogin;

/**
 * @author Admin
 *
 */
public class ModifyListener implements ActionListener{
	private JTextField jtextfieldID = null;
	private JTextField jtextNamePro = null;
	private JTextField jtextBrands = null;
	private JTextField jtextCategories = null;
	private JTextField jtextPrices = null;
	private JDateChooser jDateChooser = null;
	private JTextArea jTextField = null;
	private JTable table= null;
	private DefaultTableModel model= null;
	private Product product= new Product();
	public ModifyListener(JTextField jtextfieldID, JTextField jtextfieldPrices, JTextField jTextFieldBrand,
			JTextField jTextFieldCatergories, JTextField jTextFieldName, JDateChooser jDateChooser,
			JTextArea jTextFieldDe, JTable table, DefaultTableModel model, Product product) {
		this.jtextfieldID = jtextfieldID;
		this.jtextPrices = jtextfieldPrices;
		this.jtextBrands = jTextFieldBrand;
		this.jtextCategories = jTextFieldCatergories;
		this.jtextNamePro = jTextFieldName;

		this.jDateChooser = jDateChooser;
		this.jTextField = jTextFieldDe;
		this.table = table;
		this.model = model;
		this.product= product;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Product productChange = new Product();
		productChange.setId(jtextfieldID.getText().trim());
		productChange.setPrice(jtextPrices.getText().trim());
		productChange.setBrand(jtextBrands.getText().trim());
		productChange.setCatogory(jtextCategories.getText().trim());
		productChange.setName(jtextNamePro.getText().trim());
		SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
	    String date = dcn.format(jDateChooser.getDate() );
	    productChange.setGuarentydate(date);
	    productChange.setDescription(jTextField.getText().trim());
	    
		ArrayList<String> listError = new ArrayList<>();
		ValidateAdminLogin validateAdminLogin = new ValidateAdminLogin();
		ProductDaoImpl productDaoImpl = new ProductDaoImpl();
		try {
		if(productChange.getId().equals(product.getId())){
			listError = validateAdminLogin.validateProductModify(productChange);
			if (listError.isEmpty()) {
				productDaoImpl.modifyProduct(product, productChange);
				//arrayList.add(product);
				return;
			} else {
				for(String i : listError) {
					System.out.println(i);
				}
			}
		}else{
			listError = validateAdminLogin.validateProduct(productChange);
			if (listError.isEmpty()) {
				productDaoImpl.modifyProduct(product,productChange);
				return;
			} else {
				for(String i : listError) {
					System.out.println(i);
				}
			}
		}
		
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

}
