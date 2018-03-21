/**
 * 
 */
package managestock.actionlistener;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author Admin
 *
 */
public class QuitListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
//		new JOptionPane("Are You Sure Want To Quite??", JOptionPane.QUESTION_MESSAGE,
//			    JOptionPane.YES_NO_OPTION);
		int n= JOptionPane.showConfirmDialog(new JFrame(), "Are You Sure Want To Quite??", "Quite", JOptionPane.YES_NO_OPTION);
		if(n== JOptionPane.YES_OPTION){
			System.exit(0);
		}
	}

}
