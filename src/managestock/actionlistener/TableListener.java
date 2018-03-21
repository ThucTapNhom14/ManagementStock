/**
 * 
 */
package managestock.actionlistener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


import com.toedter.calendar.JDateChooser;

import managestock.entity.Product;

/**
 * @author Admin
 *
 */
public class TableListener implements MouseListener {
	private JTextField jtextfieldID = null;
	private JTextField jtextNamePro = null;
	private JTextField jtextBrands = null;
	private JTextField jtextCategories = null;
	private JTextField jtextPrices = null;
	private JDateChooser jDateChooser = null;
	private JTextArea jTextField = null;
	private JTable table = null;
	private DefaultTableModel model = null;
	private Product product;

	public TableListener(JTextField jtextfieldID, JTextField jtextfieldPrices, JTextField jTextFieldBrand,
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
		this.product=product;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int i = table.getSelectedRow();
		jtextfieldID.setText(model.getValueAt(i, 1).toString());
		jtextNamePro.setText(model.getValueAt(i, 2).toString());
		jtextBrands.setText(model.getValueAt(i, 3).toString());
		jtextCategories.setText(model.getValueAt(i, 4).toString());
		jtextPrices.setText(model.getValueAt(i, 6).toString());
		product.setId(model.getValueAt(i, 1).toString());
		try {
			Date date = new SimpleDateFormat("yyyy-mm-dd").parse((String) model.getValueAt(i, 5));
			jDateChooser.setDate(date);
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		jTextField.setText(model.getValueAt(i, 7).toString());
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

}
