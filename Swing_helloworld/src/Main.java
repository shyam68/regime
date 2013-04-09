import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	JTextField heading;
	JButton browse;
	JButton create;
	String displayText = "";
	Handler handler = null;
	JFrame createFrame;
	JFrame browseFrame;
	
	public Main() {
		
		super("Regime startup.....");
		Container container = getContentPane();
		container.setLayout(null);
		
		createFrame = new JFrame("Create Panel");
		browseFrame = new JFrame("Browse Panel");
		
		heading = new JTextField("Choose your option..", 20);
		heading.setEditable(false);
		heading.setBounds(10, 10, 230, 50);
		container.add(heading);

		
		handler = new Handler();
		browse = new JButton("browse");
		                                                       
		browse.setVerticalTextPosition(AbstractButton.BOTTOM);   
		browse.setHorizontalTextPosition(AbstractButton.LEADING);
		browse.addActionListener(handler);             
		browse.setBounds(10, 100, 100, 50);
		container.add(browse);                                   
		
		create = new JButton("create");                                                      
		create.setVerticalTextPosition(AbstractButton.BOTTOM);   
		create.setHorizontalTextPosition(AbstractButton.LEADING);
		create.addActionListener(handler);
		create.setBounds(130, 100, 100, 50);
		container.add(create);                                   
		
		
		
		setSize(250, 250);
		setVisible(true);
	}
	
	private class Handler implements ActionListener {
		
		JButton initButton;
		JButton projectsButton;
		CreateAction createHandler = new CreateAction();

		public void actionPerformed(ActionEvent e) {
			
				//displayText = "Button Pressed : " + e.getActionCommand();
				//JOptionPane.showMessageDialog(null, displayText);
				
				if("create".equals(e.getActionCommand())) {
					
					initButton = new JButton("Init");
					//initButton.setVerticalTextPosition(AbstractButton.BOTTOM);   
					//initButton.setHorizontalTextPosition(AbstractButton.LEADING);
					initButton.addActionListener(createHandler);
					
					initButton.setBounds(100, 100, 100, 50);
					
					Container container = createFrame.getContentPane();
					container.setLayout(null);
					
					createFrame.add(initButton);
					createFrame.setSize(500, 600);
					createFrame.setVisible(true);
				}
				
				if("browse".equals(e.getActionCommand())) {
				
					projectsButton = new JButton("projects");
initButton.addActionListener(createHandler);
					
					initButton.setBounds(100, 100, 100, 50);
					
					Container container = createFrame.getContentPane();
					container.setLayout(null);
					
					browseFrame.pack();
					browseFrame.setSize(500, 600);
					browseFrame.setVisible(true);
				}
				
		}
	}
	
	public static void main(String args[]) {
		Main test = new Main();
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}