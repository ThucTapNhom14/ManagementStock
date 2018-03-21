/**
 * 
 */
package managestock.actionlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

/**
 * @author Admin
 *
 */
public class BackListioner implements ActionListener{
		private JFrame frame;
	public BackListioner(JFrame frame) {
		this.frame=frame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		frame.dispose();
		return;
	}

}
