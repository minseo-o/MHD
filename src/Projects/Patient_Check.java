package Projects;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Patient_Check extends CommonFrame {
	
	public Patient_Check() {
		super("Patient_check", Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		
		
	    
		
		JLabel lb = new JLabel(getIcon("images/Doctor_Patient_Check.png", Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT));
	      lb.setBounds(0, 0, Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
	      add(lb);
	}
	
}
