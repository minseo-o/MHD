package Projects;

import javax.swing.JLabel;

public class Doctor_Join extends CommonFrame {
	
	public Doctor_Join() {
		super("Doctor_Join", Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		
		
	    
		
		JLabel lb = new JLabel(getIcon("images/Doctor_Join.png", Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT));
	      lb.setBounds(0, 0, Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
	      add(lb);
	}
	
}