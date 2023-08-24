package Projects;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Doctor_Login extends CommonFrame{
	
	JButton loginbtn = new JButton(new ImageIcon("images/Login_check.png"));
	JButton joinbtn = new JButton(new ImageIcon("images/Dc_join_Bt.png"));
	JButton login_main_btn = new JButton(new ImageIcon("images/Doctor_login_bt.png"));
	JTextField IDtx = new JTextField();
	JPasswordField PWtx = new JPasswordField();
	
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
		
		IDtx.setBounds(496, 292, 373, 57);
		IDtx.revalidate();
		IDtx.setBackground(Color.decode("#CACACA"));
		IDtx.setBorder(null);
		
        IDtx.setFont(new Font("조선신명조", Font.PLAIN, 18)); // 입력받을 때, 문자 크기 및 폰트 설정
        add(IDtx);
        
        PWtx.setBounds(496,389,373,57);
        PWtx.revalidate();
        PWtx.setBackground(Color.decode("#CACACA"));
        PWtx.setBorder(null);
        add(PWtx);

		loginbtn.setBounds(59,111,104,80);
		add(loginbtn);

		joinbtn.setBounds(59,252,104,80);
		add(joinbtn);

		login_main_btn.setBounds(955,389,160,59);
		add(login_main_btn);
	    
		
		
		JLabel lb = new JLabel(getIcon("images/Doctor_Login.png", Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT));
	      lb.setBounds(0, 0, Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
	      add(lb);
	      
	     login_main_btn.addActionListener(e -> {
	    	dispose();
	        new Patient_Check().setVisible(true);
	       });
	     joinbtn.addActionListener(e -> {
		    	dispose();
		        new Doctor_Join().setVisible(true);
		       });
	}
}
