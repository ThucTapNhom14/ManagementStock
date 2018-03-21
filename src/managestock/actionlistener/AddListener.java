/**
 * Group code dao Van Tri
 *  Mar 20, 2018 7:29:28 PM
 * Coppyright@codedao
 */
package managestock.actionlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JTextFieldDateEditor;

import managestock.controller.CategoriesController;
import managestock.dao.impl.ProductDaoImpl;
import managestock.entity.Product;
import managestock.validate.ValidateAdminLogin;

/**
 *
 * @author hoangdinhthi hoangmainghi
 */
public class AddListener implements ActionListener {
	private JTextField jtextfieldID = null;
	private JTextField jtextNamePro = null;
	private JTextField jtextBrands = null;
	private JTextField jtextCategories = null;
	private JTextField jtextPrices = null;
	private JDateChooser jDateChooser = null;
	private JTextArea jTextField = null;
	
	private JFrame framePro;
	private ArrayList<Product> arrayList;
	private JTable table;
	

	 public AddListener(JTextField jtextfieldID, JTextField jtextfieldPrices, JTextField jTextFieldBrand, JTextField jTextFieldCatergories,JTextField jTextFieldName, JDateChooser jDateChooser, JTextArea jTextFieldDe, JFrame jFrame) {
		this.jtextfieldID = jtextfieldID;
		this.jtextPrices = jtextfieldPrices;
		this.jtextBrands = jTextFieldBrand;
		this.jtextCategories = jTextFieldCatergories;
		this.jtextNamePro = jTextFieldName;
		this.jDateChooser = jDateChooser;
		this.jTextField = jTextFieldDe;
		this.framePro=jFrame;
	}
	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e){
		String date = new String();
		Product product = new Product();
		product.setId(jtextfieldID.getText().trim());
		product.setPrice(jtextPrices.getText().trim());
		product.setBrand(jtextBrands.getText().trim());
		product.setCatogory(jtextCategories.getText());
		product.setName(jtextNamePro.getText().trim());
		SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
		date = dcn.format(jDateChooser.getDate() );
		
	    product.setGuarentydate(date);
		
	    product.setDescription(jTextField.getText().trim());
	    
		ArrayList<String> listError = new ArrayList<>();
		ValidateAdminLogin validateAdminLogin = new ValidateAdminLogin();
		ProductDaoImpl productDaoImpl = new ProductDaoImpl();
		try {
		listError = validateAdminLogin.validateProduct(product);
		if (listError.isEmpty()) {
			//productDaoImpl.addProduct(product);
			framePro.invalidate();
			framePro.validate();
			framePro.repaint();
			return;
		} else {
			for(String i : listError) {
				System.out.println(i);
			}
		}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	
}
