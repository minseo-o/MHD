package Projects;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Doctor_Login extends CommonFrame{
	JButton loginbtn = new JButton(new ImageIcon("images/login_check_bt.png"));
	JButton joinbtn = new JButton(new ImageIcon("images/dc_join_bt.png"));
	JButton login_main_btn = new JButton(new ImageIcon("images/dc_login_big_bt.png"));
	public Doctor_Login() {
		super("Doctor_login", Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		
		loginbtn.setBorderPainted(false);
		loginbtn.setContentAreaFilled(false);
		loginbtn.setFocusPainted(false);

		joinbtn.setBorderPainted(false);
		joinbtn.setContentAreaFilled(false);
		joinbtn.setFocusPainted(false);

		login_main_btn.setBorderPainted(false);
		login_main_btn.setContentAreaFilled(false);
		login_main_btn.setFocusPainted(false);

		loginbtn.setBounds(59,111,104,80);
		add(loginbtn);

		joinbtn.setBounds(59,252,104,80);
		add(joinbtn);

		login_main_btn.setBounds(964, 377, 203, 75);
		add(login_main_btn);
	    
		
		JLabel lb = new JLabel(getIcon("images/dc_login.png", Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT));
	      lb.setBounds(0, 0, Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
	      add(lb);
	      
	     loginbtn.addActionListener(e -> {
	    	dispose();
	        new Patient_Check().setVisible(true);
	       });
	     joinbtn.addActionListener(e -> {
		    	dispose();
		        new Patient_Check().setVisible(true);
		       });
	}
}
