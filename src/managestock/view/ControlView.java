/**
 * Group code dao Van Tri
 *  Mar 18, 2018 10:35:34 AM
 * Coppyright@codedao
 */
package managestock.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ControlView {

	private JFrame frame;

	/**
	 * Create the application.
	 */
	public ControlView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("S\u1EA3n Ph\u1EA9m");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setForeground(new Color(128, 0, 0));
		btnNewButton.setBounds(10, 68, 112, 55);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Lo\u1EA1i S\u1EA3n Ph\u1EA9m");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(159, 68, 142, 55);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Th\u01B0\u01A1ng Hi\u1EC7u");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setBounds(334, 68, 139, 55);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Quay L\u1EA1i");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(92, 189, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Tho\u00E1t");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBounds(301, 189, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
		frame.setBounds(100, 100, 499, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
	}

}
