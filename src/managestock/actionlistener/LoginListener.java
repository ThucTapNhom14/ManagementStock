/**
 * Group code dao Van Tri
 *  Mar 18, 2018 12:22:55 PM
 * Coppyright@codedao
 */
package managestock.actionlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import managestock.constants.Common;
import managestock.controller.CategoriesController;
import managestock.entity.Product;
import managestock.logic.impl.TblProductLogicImpl;
import managestock.validate.ValidateAdminLogin;
import managestock.view.LoginView;
import managestock.view.ProductView;

/**
 * Lớp thực hiện bắt sự kiện của button login 
 * @author hoangdinhthi hoangmainghi
 */
public class LoginListener implements ActionListener {
	private JTextField username = null;
	private JTextField  password = null;
	private JLabel jLabel = null;
	private JFrame jFrameLogin;
	
	public LoginListener(JTextField jtextFieldUsername, JTextField jtextFieldPassword, JLabel jLabel , JFrame jFrame) {
		this.username = jtextFieldUsername;
		this.password = jtextFieldPassword;
		this.jLabel = jLabel;
		this.jFrameLogin = jFrame;
	}
	
	
	public LoginListener() {
		super();
	}


	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		ValidateAdminLogin validateAdminLogin = new ValidateAdminLogin();
		
		try{
		ArrayList<String> getListError = validateAdminLogin.validateLogin(username.getText(), password.getText());
		if(getListError.isEmpty()) {
			// controller của menu.  controller menu se goi tơi view cua menu. views goi actione ..+
			new CategoriesController();
			//jFrameLogin.setVisible(false);
			username.setText("");
			password.setText("");
			//jFrameLogin.setVisible(false);
			return;
		} else {
			// lấy lỗi từ list ra
			for (String t : getListError) {
				jLabel.setText(t);
			}
		}
		
		} catch (Exception e1) {
			// hiện tại là thế. 
			// thực tế là phải tạo ra một from mới rồi in ra lỗi
			e1.printStackTrace();
		}
	}
}
