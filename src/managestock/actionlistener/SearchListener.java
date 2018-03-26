package managestock.actionlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JTextField;

import managestock.dao.impl.ProductDaoImpl;
import managestock.entity.Product;

public class SearchListener implements ActionListener{
	private JTextField textSearch;
	public SearchListener(JTextField textSearch) {
		this.textSearch=textSearch;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(textSearch.getText().isEmpty()){
			System.out.println("O khong duoc de trong");
		}else{
			ProductDaoImpl productDaoImpl= new ProductDaoImpl();
			ArrayList<Product> list= new ArrayList<>();
			try {
				list=productDaoImpl.searchProduct(textSearch.getText().trim());
				if(!list.isEmpty()){
					for(Product pr: list){
						System.out.println(pr.toString());
					}
				}else{
					System.out.println("Khong tim thay gi!!!");
				}
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 
			
		}
	}

}
