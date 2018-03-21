/**
 * Group code dao Van Tri
 *  Mar 18, 2018 12:17:49 PM
 * Coppyright@codedao
 */
package managestock.main;

import java.util.ArrayList;

import managestock.controller.LoginController;
import managestock.entity.Product;
import managestock.logic.impl.TblProductLogicImpl;

/**
 *
 * @author hoangdinhthi hoangmainghi
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LoginController  loginController = new LoginController();
		loginController.startProgram();

	}

}
