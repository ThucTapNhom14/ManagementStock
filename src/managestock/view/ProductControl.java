package managestock.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ListSelectionModel;

public class ProductControl {

	private JFrame frame;
	private JTextField textField;
	private JTable table;
	private DefaultTableModel models;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					ProductControl window = new ProductControl();
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
	public ProductControl() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
		JButton btnSearch = new JButton("T\u00ECm Ki\u1EBFm");
		btnSearch.setBounds(469, 11, 89, 23);
		frame.getContentPane().add(btnSearch);
		
		textField = new JTextField();
		textField.setBounds(195, 11, 232, 23);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBack = new JButton("Tr\u1EDF L\u1EA1i");
		btnBack.setBounds(107, 387, 89, 23);
		frame.getContentPane().add(btnBack);
		
		JButton btnQuit = new JButton("Tho\u00E1t");
		btnQuit.setBounds(415, 387, 89, 23);
		frame.getContentPane().add(btnQuit);
		
		table = new JTable();
		//table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		Object [] columns= {"M\u00E3 s\u1EA3n ph\u1EA9m", "T\u00EAn s\u1EA3n ph\u1EA9m", "T\u00EDnh n\u0103ng",
				"H\u1EA1n b\u1EA3o h\u00E0nh", "Gi\u00E1", "Th\u01B0\u01A1ng hi\u1EC7u", "Lo\u1EA1i s\u1EA3n ph\u1EA9m", "More"};
		models = new DefaultTableModel();
		models.setColumnIdentifiers(columns);
		table.setModel(models);
//		table.setModel(new DefaultTableModel(
//			new Object[][] {
//				{null, null, null, null, null, null, null, null},
//				{null, null, null, null, null, null, null, null},
//				{null, null, null, null, null, null, null, null},
//				{null, null, null, null, null, null, null, null},
//				{null, null, null, null, null, null, null, null},
//				{null, null, null, null, null, null, null, null},
//				{null, null, null, null, null, null, null, null},
//				{null, null, null, null, null, null, null, null},
//				{null, null, null, null, null, null, null, null},
//				{null, null, null, null, null, null, null, null},
//				{null, null, null, null, null, null, null, null},
//				{null, null, null, null, null, null, null, null},
//				{null, null, null, null, null, null, null, null},
//				{null, null, null, null, null, null, null, null},
//				{null, null, null, null, null, null, null, null},
//			},
//			new String[] {
//				"M\u00E3 s\u1EA3n ph\u1EA9m", "T\u00EAn s\u1EA3n ph\u1EA9m", "T\u00EDnh n\u0103ng", "H\u1EA1n b\u1EA3o h\u00E0nh", "Gi\u00E1", "Th\u01B0\u01A1ng hi\u1EC7u", "Lo\u1EA1i s\u1EA3n ph\u1EA9m", "more"
//			}
//		));
		table.getColumnModel().getColumn(1).setPreferredWidth(87);
		table.getColumnModel().getColumn(3).setPreferredWidth(85);
		table.setBounds(21, 76, 580, 289);
		frame.getContentPane().add(table);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"M\u00E3 H\u00E0ng", "T\u00EAn H\u00E0ng", "H\u1EA1n S\u1EED D\u1EE5ng", "Gi\u00E1", "Th\u01B0\u01A1ng Hi\u1EC7u", "Lo\u1EA1i S\u1EA3n Ph\u1EA9m"}));
		comboBox.setBounds(341, 45, 94, 20);
		frame.getContentPane().add(comboBox);
		
		JButton btnSort = new JButton("S\u1EAFp x\u1EBFp");
		btnSort.setBounds(192, 42, 89, 23);
		frame.getContentPane().add(btnSort);
		
		JButton btnAdd = new JButton("Th\u00EAm S\u1EA3n Ph\u1EA9m");
		btnAdd.setBounds(45, 11, 115, 23);
		frame.getContentPane().add(btnAdd);
		frame.setBounds(100, 100, 638, 460);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
