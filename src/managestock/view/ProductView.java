package managestock.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JTextFieldDateEditor;

import managestock.actionlistener.AddListener;
import managestock.actionlistener.BackListioner;
import managestock.actionlistener.DeleteListener;
import managestock.actionlistener.ModifyListener;
import managestock.actionlistener.QuitListener;
import managestock.actionlistener.TableListener;
import managestock.entity.Product;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ProductView {

	private JFrame frame;
	private JTextField textFieldSearch;
	private JTextField textFieldID;
	private JTextField textFieldName;
	private JTextField textFieldBrand;
	private JTextField textField;
	private JTextField textField_1;
	private JDateChooser jDateChooser;
	private JTextArea jTextAreaDe;
	private JTable table;
	private ArrayList<Product> listProduct;
	private DefaultTableModel model;
	private Product product = new Product();
	// private AddListener addListener = new AddListener(textFieldID
	// ,textField_1,textFieldBrand,textField,textFieldName,jDateChooser,jTextAreaDe,listProduct,table);

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public ProductView(ArrayList<Product> listProduct) {
		initialize();
		frame.setVisible(true);
		frame.getContentPane().setLayout(null);

		JLabel lblSpXpTheo = new JLabel("Sắp Xếp Theo");
		lblSpXpTheo.setBounds(31, 28, 80, 20);
		frame.getContentPane().add(lblSpXpTheo);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(
				new String[] { "None", "Mã", "Tên", "Thương Hiệu", "Loại Sản Phẩm", "Hạn Bảo Hành", "Giá" }));
		comboBox.setBounds(132, 26, 119, 25);
		frame.getContentPane().add(comboBox);

		textFieldSearch = new JTextField();
		textFieldSearch.setBounds(715, 26, 281, 25);
		frame.getContentPane().add(textFieldSearch);
		textFieldSearch.setColumns(10);

		JButton btnSearch = new JButton("Tìm Kiếm");
		btnSearch.setBounds(1039, 26, 89, 25);
		frame.getContentPane().add(btnSearch);

		JLabel lblId = new JLabel("Mã");
		lblId.setBounds(31, 89, 80, 20);
		frame.getContentPane().add(lblId);

		textFieldID = new JTextField();
		textFieldID.setColumns(10);
		textFieldID.setBounds(132, 84, 132, 25);
		frame.getContentPane().add(textFieldID);

		JLabel lblTnSnPhm = new JLabel("Tên Sản Phẩm");
		lblTnSnPhm.setBounds(31, 145, 80, 20);
		frame.getContentPane().add(lblTnSnPhm);

		textFieldName = new JTextField();
		textFieldName.setColumns(10);
		textFieldName.setBounds(132, 143, 146, 25);
		frame.getContentPane().add(textFieldName);

		JLabel lblThngHiu = new JLabel("Thương Hiệu");
		lblThngHiu.setBounds(31, 210, 80, 20);
		frame.getContentPane().add(lblThngHiu);

		textFieldBrand = new JTextField();
		textFieldBrand.setColumns(10);
		textFieldBrand.setBounds(132, 205, 146, 25);
		frame.getContentPane().add(textFieldBrand);

		JLabel lblLoi = new JLabel("Loại");
		lblLoi.setBounds(31, 269, 80, 20);
		frame.getContentPane().add(lblLoi);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(132, 267, 172, 25);
		frame.getContentPane().add(textField);

		JLabel lblHnBoHnh = new JLabel("Hạn Bảo Hành");
		lblHnBoHnh.setBounds(31, 332, 80, 20);
		frame.getContentPane().add(lblHnBoHnh);

		jDateChooser = new JDateChooser();
		JTextFieldDateEditor editor = (JTextFieldDateEditor) jDateChooser.getDateEditor();
		editor.setEditable(false);
		jDateChooser.setBounds(132, 327, 108, 25);
		frame.getContentPane().add(jDateChooser);

		JLabel lblGi = new JLabel("Giá");
		lblGi.setBounds(31, 390, 80, 20);
		frame.getContentPane().add(lblGi);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(132, 388, 102, 25);
		frame.getContentPane().add(textField_1);

		JLabel lblChiTit = new JLabel("Chi Tiết");
		lblChiTit.setBounds(31, 453, 80, 20);
		frame.getContentPane().add(lblChiTit);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(132, 453, 172, 89);
		frame.getContentPane().add(scrollPane);

		jTextAreaDe = new JTextArea();
		scrollPane.setViewportView(jTextAreaDe);

		JButton btnAdd = new JButton("Thêm");
		btnAdd.setBounds(31, 589, 89, 25);
		frame.getContentPane().add(btnAdd);
		btnAdd.addActionListener(new AddListener(textFieldID, textField_1, textFieldBrand, textField, textFieldName,
				jDateChooser, jTextAreaDe,frame));

		JButton btnModify = new JButton("Sửa");
		btnModify.setBounds(151, 589, 89, 25);
		frame.getContentPane().add(btnModify);
		btnModify.addActionListener(new ModifyListener(textFieldID, textField_1, textFieldBrand, textField,
				textFieldName, jDateChooser, jTextAreaDe, table, model, product));

		JButton btnDelete = new JButton("Xóa");
		btnDelete.addActionListener(new DeleteListener(textFieldID));
		btnDelete.setBounds(267, 589, 89, 25);
		frame.getContentPane().add(btnDelete);

		JLabel labelErrorID = new JLabel("");
		labelErrorID.setBounds(132, 62, 183, 20);
		frame.getContentPane().add(labelErrorID);

		JLabel labelErrorName = new JLabel("");
		labelErrorName.setBounds(132, 119, 183, 20);
		frame.getContentPane().add(labelErrorName);

		JLabel labelErrorBrand = new JLabel("");
		labelErrorBrand.setBounds(132, 179, 183, 20);
		frame.getContentPane().add(labelErrorBrand);

		JLabel labelErrorCatogory = new JLabel("");
		labelErrorCatogory.setBounds(132, 241, 183, 20);
		frame.getContentPane().add(labelErrorCatogory);

		JLabel labelErrorDateGuarantee = new JLabel("");
		labelErrorDateGuarantee.setBounds(132, 303, 183, 20);
		frame.getContentPane().add(labelErrorDateGuarantee);

		JLabel labelErrorPrice = new JLabel("");
		labelErrorPrice.setBounds(132, 363, 183, 20);
		frame.getContentPane().add(labelErrorPrice);

		// Product product= new Product();
		// product.setId(textFieldID.getText());
		// product.setName(textFieldName.getText());
		// product.setBrand(textFieldBrand.getText());
		// product.setCatogory(textField.getText());
		// product.setPrice(textField_1.getText());
		// product.setDescription(jTextAreaDe.getText());
		// product.setGuarentydate(editor.getText());
		//
		// System.out.println(product.getBrand());
		// System.out.println(product.getId());
		// System.out.println(product.getPrice());
		// System.out.println(product.getCatogory());

		table = new JTable();
		table.setFillsViewportHeight(true);
		table.setSurrendersFocusOnKeystroke(true);
		DefaultTableModel model = new DefaultTableModel(new Object[][] {
				// {product.getId(),product.getName(),
				// product.getBrand(),product.getCatogory(),product.getGuarentydate(),
				// product.getPrice(),product.getDescription()}
				// {
				// textField.getText(),textField_1.getText()
				// }
		}, new String[] { "STT", "M\u00E3 S\u1EA3n Ph\u1EA9m", "T\u00EAn S\u1EA3n Ph\u1EA9m", "Thương Hiệu",
				"Lo\u1EA1i S\u1EA3n Ph\u1EA9m", "H\u1EA1n B\u1EA3o H\u00E0nh", "Gi\u00E1", "Chi Ti\u1EBFt" });
		int count = 0;
		for (Product pro : listProduct) {
			Object[] row = new Object[8];
			row[0] = ++count;
			row[1] = pro.getId();
			row[2] = pro.getName();
			row[3] = pro.getBrand();
			row[4] = pro.getCatogory();
			row[5] = pro.getGuarentydate();
			row[6] = pro.getPrice();
			row[7] = pro.getDescription();
			model.addRow(row);
		}
		table.setModel(model);
		table.getColumnModel().getColumn(2).setPreferredWidth(89);
		table.getColumnModel().getColumn(3).setPreferredWidth(91);
		table.getColumnModel().getColumn(4).setPreferredWidth(85);
		table.setBounds(572, 303, 1, 1);
		table.addMouseListener(new TableListener(textFieldID, textField_1, textFieldBrand, textField, textFieldName,
				jDateChooser, jTextAreaDe, table, model, product));

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(382, 84, 776, 462);
		scrollPane_1.setViewportView(table);
		frame.getContentPane().add(scrollPane_1);

		JButton btnBack = new JButton("Trở Lại");
		btnBack.setBounds(517, 586, 108, 31);
		
		frame.getContentPane().add(btnBack);
		btnBack.addActionListener(new BackListioner(frame));
		
		JButton btnQuit = new JButton("Thoát");
		btnQuit.setBounds(899, 586, 108, 31);
		frame.getContentPane().add(btnQuit);
		btnQuit.addActionListener(new QuitListener());
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 700);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	}
}
