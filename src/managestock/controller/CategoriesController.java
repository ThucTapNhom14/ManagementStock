/**
 * Group code dao Van Tri
 *  Mar 18, 2018 5:01:47 PM
 * Coppyright@codedao
 */
package managestock.controller;

import java.util.ArrayList;

import managestock.entity.Product;
import managestock.logic.impl.TblProductLogicImpl;
import managestock.view.ProductView;

/**
 *
 * @author hoangdinhthi hoangmainghi
 */
public class CategoriesController {
	private TblProductLogicImpl tblProductLogicImpl = new TblProductLogicImpl();
	private ArrayList<Product> listProduct = new ArrayList<>();

	public CategoriesController() {
		try {
			listProduct = tblProductLogicImpl.listProduct();
			new ProductView(listProduct);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
