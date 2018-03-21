package managestock.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CatogoryView {

	private JFrame frmDanhMc;
	private JTextField textFieldSearch;
	private JTextField textFieldCode;
	private JTextField textFieldName;
	private JTable table;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					CatogoryView window = new CatogoryView();
//					window.frmDanhMc.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public CatogoryView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDanhMc = new JFrame();
		frmDanhMc.setTitle("Danh M\u1EE5c");
		frmDanhMc.getContentPane().setLayout(null);
		
		JLabel lblSpXpTheo = new JLabel("S\u1EAFp x\u1EBFp theo");
		lblSpXpTheo.setBounds(20, 11, 72, 26);
		frmDanhMc.getContentPane().add(lblSpXpTheo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"None", "M\u00E3 Danh M\u1EE5c", "T\u00EAn Danh M\u1EE5c"}));
		comboBox.setBounds(114, 11, 106, 23);
		frmDanhMc.getContentPane().add(comboBox);
		
		textFieldSearch = new JTextField();
		textFieldSearch.setBounds(279, 11, 160, 26);
		frmDanhMc.getContentPane().add(textFieldSearch);
		textFieldSearch.setColumns(10);
		
		JButton btnSearch = new JButton("T\u00ECm Ki\u1EBFm");
		btnSearch.setBounds(453, 11, 80, 26);
		frmDanhMc.getContentPane().add(btnSearch);
		
		JLabel lblMSnPhm = new JLabel("M\u00E3 Danh M\u1EE5c");
		lblMSnPhm.setBounds(20, 62, 72, 26);
		frmDanhMc.getContentPane().add(lblMSnPhm);
		
		JLabel lblTnSnPhm = new JLabel("T\u00EAn Danh M\u1EE5c");
		lblTnSnPhm.setBounds(20, 110, 72, 26);
		frmDanhMc.getContentPane().add(lblTnSnPhm);
		
		textFieldCode = new JTextField();
		textFieldCode.setColumns(10);
		textFieldCode.setBounds(112, 65, 108, 26);
		frmDanhMc.getContentPane().add(textFieldCode);
		
		textFieldName = new JTextField();
		textFieldName.setColumns(10);
		textFieldName.setBounds(110, 113, 138, 26);
		frmDanhMc.getContentPane().add(textFieldName);
		
		JButton btnAdd = new JButton("Th\u00EAm");
		btnAdd.setBounds(20, 207, 65, 26);
		frmDanhMc.getContentPane().add(btnAdd);
		
		JButton btnModify = new JButton("S\u1EEDa");
		btnModify.setBounds(110, 207, 65, 26);
		frmDanhMc.getContentPane().add(btnModify);
		
		JButton btnDelete = new JButton("X\u00F3a");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDelete.setBounds(198, 207, 65, 26);
		frmDanhMc.getContentPane().add(btnDelete);
		
		
		
		JButton btnBack = new JButton("Tr\u1EDF L\u1EA1i");
		btnBack.setBounds(308, 207, 80, 26);
		frmDanhMc.getContentPane().add(btnBack);
		
		JButton btnQuit = new JButton("Tho\u00E1t");
		btnQuit.setBounds(453, 207, 80, 26);
		frmDanhMc.getContentPane().add(btnQuit);
		
		table = new JTable();
		table.setSurrendersFocusOnKeystroke(true);
		table.setFillsViewportHeight(true);
		DefaultTableModel model = new DefaultTableModel(new Object[][] {
			{null, null, null},
			{null, null, null},
			{null, null, null},
		},
		new String[] {
			"S\u1ED1 Th\u1EE9 T\u1EF1", "M\u00E3 Danh M\u1EE5c", "Lo\u1EA1i Danh M\u1EE5c"
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"STT", "M\u00E3 Danh M\u1EE5c", "Lo\u1EA1i Danh M\u1EE5c"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(64);
		table.getColumnModel().getColumn(2).setPreferredWidth(96);
		table.setBounds(0, 0, 1, 1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(279, 48, 254, 130);
		scrollPane.setViewportView(table);
		frmDanhMc.getContentPane().add(scrollPane);
		
		frmDanhMc.setBounds(100, 100, 572, 300);
		frmDanhMc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
