import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;


public class CreateAction implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String displayText = "Button Pressed : " + e.getActionCommand();
		JOptionPane.showMessageDialog(null, displayText);
	}

}
