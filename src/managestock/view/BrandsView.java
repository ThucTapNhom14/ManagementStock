package managestock.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class BrandsView {

	private JFrame frmThngHiu;
	private JTextField textFieldCode;
	private JTextField textFieldName;
	private JTextField textFieldCountry;
	private JTextField textFieldSearch;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BrandsView window = new BrandsView();
					window.frmThngHiu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BrandsView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmThngHiu = new JFrame();
		frmThngHiu.setTitle("Th\u01B0\u01A1ng Hi\u1EC7u");
		frmThngHiu.getContentPane().setLayout(null);
		
		JLabel lblMThngHiu = new JLabel("M\u00E3 Th\u01B0\u01A1ng Hi\u1EC7u");
		lblMThngHiu.setBounds(10, 71, 91, 20);
		frmThngHiu.getContentPane().add(lblMThngHiu);
		
		JLabel lblTnThngHiu = new JLabel("T\u00EAn Th\u01B0\u01A1ng Hi\u1EC7u");
		lblTnThngHiu.setBounds(10, 120, 91, 20);
		frmThngHiu.getContentPane().add(lblTnThngHiu);
		
		JLabel lblXutX = new JLabel("Xu\u1EA5t X\u1EE9");
		lblXutX.setBounds(10, 171, 91, 20);
		frmThngHiu.getContentPane().add(lblXutX);
		
		textFieldCode = new JTextField();
		textFieldCode.setBounds(111, 68, 117, 26);
		frmThngHiu.getContentPane().add(textFieldCode);
		textFieldCode.setColumns(10);
		
		textFieldName = new JTextField();
		textFieldName.setColumns(10);
		textFieldName.setBounds(111, 117, 128, 26);
		frmThngHiu.getContentPane().add(textFieldName);
		
		textFieldCountry = new JTextField();
		textFieldCountry.setColumns(10);
		textFieldCountry.setBounds(111, 168, 111, 26);
		frmThngHiu.getContentPane().add(textFieldCountry);
		
		JButton btnAdd = new JButton("Th\u00EAm");
		btnAdd.setBounds(10, 258, 73, 33);
		frmThngHiu.getContentPane().add(btnAdd);
		
		JButton btnModify = new JButton("S\u1EEDa");
		btnModify.setBounds(111, 258, 73, 33);
		frmThngHiu.getContentPane().add(btnModify);
		
		JButton btnDelete = new JButton("Th\u00EAm");
		btnDelete.setBounds(214, 258, 73, 33);
		frmThngHiu.getContentPane().add(btnDelete);
		
		
		
		JLabel lblSpXpTheo = new JLabel("S\u1EAFp X\u1EBFp Theo");
		lblSpXpTheo.setBounds(37, 27, 73, 14);
		frmThngHiu.getContentPane().add(lblSpXpTheo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"None", "M\u00E3 Th\u01B0\u01A1ng Hi\u1EC7u", "T\u00EAn Th\u01B0\u01A1ng Hi\u1EC7u", "Xu\u1EA5t X\u1EE9"}));
		comboBox.setBounds(111, 24, 117, 20);
		frmThngHiu.getContentPane().add(comboBox);
		DefaultTableModel model= new DefaultTableModel(new Object[][] {
			{null, null, null,null},
			{null, null, null,null},
			{null, null, null,null},
			{null, null, null,null},
			{null, null, null,null},
			{null, null, null,null},
			{null, null, null,null},
		},
		new String[] {
			"STT","M\u00E3 Th\u01B0\u01A1ng Hi\u1EC7u", "T\u00EAn Th\u01B0\u01A1ng Hi\u1EC7u", "Xu\u1EA5t X\u1EE9"
		});
		
		textFieldSearch = new JTextField();
		textFieldSearch.setColumns(10);
		textFieldSearch.setBounds(377, 24, 194, 26);
		frmThngHiu.getContentPane().add(textFieldSearch);
		
		JButton btnSearch = new JButton("T\u00ECm Ki\u1EBFm");
		btnSearch.setBounds(601, 23, 73, 33);
		frmThngHiu.getContentPane().add(btnSearch);
		frmThngHiu.setBounds(100, 100, 750, 400);
		frmThngHiu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(299, 67, 425, 156);
		frmThngHiu.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setSurrendersFocusOnKeystroke(true);
		table.setFillsViewportHeight(true);
		table.setModel(model);
		table.getColumnModel().getColumn(0).setPreferredWidth(46);
		table.getColumnModel().getColumn(1).setPreferredWidth(96);
		table.getColumnModel().getColumn(2).setPreferredWidth(103);
		
		JButton btnBack = new JButton("Tr\u1EDF L\u1EA1i");
		btnBack.setBounds(377, 258, 73, 33);
		frmThngHiu.getContentPane().add(btnBack);
		
		JButton btnQuit = new JButton("Tho\u00E1t");
		btnQuit.setBounds(565, 258, 73, 33);
		frmThngHiu.getContentPane().add(btnQuit);
	}

}
