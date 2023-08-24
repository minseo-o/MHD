package Projects;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Patient_Login extends CommonFrame{
	
	JButton loginbtn = new JButton(new ImageIcon("images/Login_check.png"));
	JButton joinbtn = new JButton(new ImageIcon("images/Pt_join_Bt.png"));
	JButton login_main_btn = new JButton(new ImageIcon("images/Patient_login_bt.png"));
	
	public Patient_Login() {
		super("Patient_Login", Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		
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

		login_main_btn.setBounds(955,389,160,59);
		add(login_main_btn);

		JLabel lb = new JLabel(getIcon("images/Patient_Login.png", Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT));
		lb.setBounds(0, 0, Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		add(lb);
		
		login_main_btn.addActionListener(e -> {
	    	dispose();
	        new ().setVisible(true);
	       });
	     joinbtn.addActionListener(e -> {
		    	dispose();
		        new Patient_Join().setVisible(true);
		       });
	}
}
