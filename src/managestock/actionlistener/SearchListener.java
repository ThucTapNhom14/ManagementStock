package managestock.actionlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JTextField;

import managestock.dao.impl.ProductDaoImpl;
import managestock.entity.Product;

public class SearchListener implements ActionListener{
	private JTextField searchText; 
	public SearchListener(JTextField searchText){
		this.searchText=searchText;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		ProductDaoImpl productDaoImpl = new ProductDaoImpl();
		ArrayList<Product> list= new ArrayList<Product>();
		try {
			list= productDaoImpl.getSearchListProduct(searchText.getText());
		} catch (ClassNotFoundException | SQLException e1) {
			
			e1.printStackTrace();
		}
	}
	
}