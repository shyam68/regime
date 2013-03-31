import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame {

	JTextField heading;
	JButton init;
	JButton create;
	String displayText = "";
	Handler handler = null;
	
	public Main() {
		super("Regime startup.....");
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		heading = new JTextField("Choose your option..", 20);
		heading.setEditable(false);
		container.add(heading);

		
		handler = new Handler();
		init = new JButton("init");
		                                                       
		init.setVerticalTextPosition(AbstractButton.BOTTOM);   
		init.setHorizontalTextPosition(AbstractButton.LEADING);
		init.addActionListener(handler);                       
		container.add(init);                                   
		
		create = new JButton("create");                                                      
		create.setVerticalTextPosition(AbstractButton.BOTTOM);   
		create.setHorizontalTextPosition(AbstractButton.LEADING);
		create.addActionListener(handler);                       
		container.add(create);                                   
		
		
		
		setSize(500, 600);
		setVisible(true);
	}
	
	private class Handler implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			
				displayText = "Button Pressed : " + e.getActionCommand();
				JOptionPane.showMessageDialog(null, displayText);
		}
	}
	
	public static void main(String args[]) {
		Main test = new Main();
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}