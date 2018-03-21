package managestock.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class AddProductView {

	private JFrame frame;
	private JTextField textFieldCode;
	private JTextField textFieldName;
	private JTextField textFieldDateHSD;
	private JTextField textFielDateGuarantee;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textFieldCatogory;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					AddProductView window = new AddProductView();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public AddProductView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
		JLabel lbCodeProduct = new JLabel("M\u00E3 S\u1EA3n Ph\u1EA3m");
		lbCodeProduct.setBounds(29, 39, 73, 21);
		frame.getContentPane().add(lbCodeProduct);
		
		JLabel lblNameProduct = new JLabel("T\u00EAn S\u1EA3n Ph\u1EA9m");
		lblNameProduct.setBounds(29, 81, 73, 14);
		frame.getContentPane().add(lblNameProduct);
		
		textFieldCode = new JTextField();
		textFieldCode.setBounds(112, 39, 101, 20);
		frame.getContentPane().add(textFieldCode);
		textFieldCode.setColumns(10);
		
		textFieldName = new JTextField();
		textFieldName.setBounds(112, 78, 146, 20);
		frame.getContentPane().add(textFieldName);
		textFieldName.setColumns(10);
		
		JLabel lblNgyHtHn = new JLabel("Ng\u00E0y h\u1EBFt h\u1EA1n");
		lblNgyHtHn.setBounds(29, 125, 73, 14);
		frame.getContentPane().add(lblNgyHtHn);
		
		textFieldDateHSD = new JTextField();
		textFieldDateHSD.setBounds(112, 122, 86, 20);
		frame.getContentPane().add(textFieldDateHSD);
		textFieldDateHSD.setColumns(10);
		
		JLabel lblHnBoHnh = new JLabel("H\u1EA1n B\u1EA3o H\u00E0nh");
		lblHnBoHnh.setBounds(29, 167, 73, 14);
		frame.getContentPane().add(lblHnBoHnh);
		
		textFielDateGuarantee = new JTextField();
		textFielDateGuarantee.setBounds(112, 164, 86, 20);
		frame.getContentPane().add(textFielDateGuarantee);
		textFielDateGuarantee.setColumns(10);
		
		JLabel lblGi = new JLabel("Gi\u00E1");
		lblGi.setBounds(29, 203, 46, 14);
		frame.getContentPane().add(lblGi);
		
		textField = new JTextField();
		textField.setBounds(112, 200, 121, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblThngHiu = new JLabel("Th\u01B0\u01A1ng hi\u1EC7u");
		lblThngHiu.setBounds(29, 243, 73, 14);
		frame.getContentPane().add(lblThngHiu);
		
		textField_1 = new JTextField();
		textField_1.setBounds(112, 240, 146, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lbCatogory = new JLabel("Lo\u1EA1i");
		lbCatogory.setBounds(29, 282, 46, 14);
		frame.getContentPane().add(lbCatogory);
		
		textFieldCatogory = new JTextField();
		textFieldCatogory.setBounds(112, 279, 101, 20);
		frame.getContentPane().add(textFieldCatogory);
		textFieldCatogory.setColumns(10);
		
		JButton btnCommit = new JButton("X\u00E1c Nh\u1EADn");
		btnCommit.setBounds(109, 336, 89, 23);
		frame.getContentPane().add(btnCommit);
		
		JLabel lblMT = new JLabel("M\u00F4 T\u1EA3");
		lblMT.setBounds(342, 42, 46, 14);
		frame.getContentPane().add(lblMT);
		
		JButton btnCancel = new JButton("H\u1EE7y");
		btnCancel.setBounds(390, 336, 89, 23);
		frame.getContentPane().add(btnCancel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(342, 67, 213, 114);
		frame.getContentPane().add(scrollPane);
		
		JTextArea textAreaDetail = new JTextArea();
		scrollPane.setViewportView(textAreaDetail);
		frame.setBounds(100, 100, 611, 425);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
