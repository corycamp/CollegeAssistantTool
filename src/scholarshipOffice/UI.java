package scholarshipOffice;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

public class UI extends JFrame implements ActionListener{
	
	JPanel viewPanel;
	JPanel dashBoardPanel;
	JLabel label;
	JButton openButton;
	Controls control;
	String currentView;
	
	public UI(){
		super("Scholarship Office");
		setSize(1024,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		control = new Controls();
		currentView = "Home";
		mainView();
		setVisible(true);
		System.out.println("Start...");
	}
	
	public void mainView() {
		switch(currentView) {
			case "Home":
				HomeView();
			default:
				HomeView();
		}
		createDashBoard();
	}
	
	public void HomeView() {
		setLayout( new BorderLayout() );     			// set the layout manager
	    label = new JLabel("Scholarship Software");  	// construct a JLabel
	    add( label, BorderLayout.NORTH ); 			    // add the label to the JFrame
	    
	    viewPanel = new JPanel(); 						//View panel
	    viewPanel.setBackground(Color.white);
	    viewPanel.setLayout(new FlowLayout());
	    
	    openButton = new JButton("Open");
	    openButton.addActionListener(this);
	    viewPanel.add(openButton);
	    
	    getContentPane().add(viewPanel,BorderLayout.CENTER);
	       
	}
	
	public void createDashBoard() {
		dashBoardPanel = new JPanel();					//Dash-board panel
	    dashBoardPanel.setBackground(Color.gray);
	    dashBoardPanel.setLayout(new BoxLayout(dashBoardPanel,BoxLayout.Y_AXIS));
	    
	    try {
	    	BufferedImage logo =  ImageIO.read(new File("C:\\Users\\campb\\Downloads\\logo.png"));
	    	JLabel bcLogo = new JLabel(new ImageIcon(new ImageIcon(logo).getImage().getScaledInstance(100, 40, java.awt.Image.SCALE_SMOOTH)));
	    	bcLogo.setBackground(Color.white);
	    	bcLogo.setOpaque(true);
	    	dashBoardPanel.add(bcLogo);
	    }
	    catch(Exception e) {
	    	System.out.println("Can't find the image");
	    	System.out.println(e);
	    }
	    
	    getContentPane().add(dashBoardPanel, BorderLayout.WEST);
	    SwingUtilities.updateComponentTreeUI(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== openButton) {
			System.out.println("Open Button Clicked");
			control.getFile("file1");
		}
	}
}
	