package Projects;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Doctor_Join extends CommonFrame {
	
	JButton loginbtn = new JButton(new ImageIcon("images/Dc_login_Bt.png"));
	JButton joinbtn = new JButton(new ImageIcon("images/join_Check.png"));
	JButton Join_main_btn = new JButton(new ImageIcon("images/Doctor_Join_BT.png"));
	
	JTextField Nametx = new JTextField();
	JTextField IDtx = new JTextField();
	JPasswordField PWtx = new JPasswordField();
	JPasswordField PWChecktx = new JPasswordField();
	JTextField Emailtx = new JTextField();
	
	public Doctor_Join() {
		super("Doctor_Join", Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		
		loginbtn.setBorderPainted(false);
		loginbtn.setContentAreaFilled(false);
		loginbtn.setFocusPainted(false);

		joinbtn.setBorderPainted(false);
		joinbtn.setContentAreaFilled(false);
		joinbtn.setFocusPainted(false);

		Join_main_btn.setBorderPainted(false);
		Join_main_btn.setContentAreaFilled(false);
		Join_main_btn.setFocusPainted(false);
	    
		loginbtn.setBounds(59,111,104,80);
		add(loginbtn);

		joinbtn.setBounds(59,252,104,80);
		add(joinbtn);

		Join_main_btn.setBounds(810,562,143,60);
		add(Join_main_btn);
		
		Nametx.setBounds(579,131,374,57);
		Nametx.revalidate();
		Nametx.setBackground(Color.decode("#CACACA"));
		Nametx.setBorder(null);
		
		Nametx.setFont(new Font("조선신명조", Font.PLAIN, 18)); // 입력받을 때, 문자 크기 및 폰트 설정
        add(Nametx);
        
		IDtx.setBounds(579,223,374,57);
		IDtx.revalidate();
		IDtx.setBackground(Color.decode("#CACACA"));
		IDtx.setBorder(null);
		
        IDtx.setFont(new Font("조선신명조", Font.PLAIN, 18)); // 입력받을 때, 문자 크기 및 폰트 설정
        add(IDtx);
        
        PWtx.setBounds(579,303,374,57);
        PWtx.revalidate();
        PWtx.setBackground(Color.decode("#CACACA"));
        PWtx.setBorder(null);
        add(PWtx);
        
        PWChecktx.setBounds(579,390,374,57);
        PWChecktx.revalidate();
        PWChecktx.setBackground(Color.decode("#CACACA"));
        PWChecktx.setBorder(null);
        add(PWChecktx);
        
        Emailtx.setBounds(579,470,374,57);
        Emailtx.revalidate();
        Emailtx.setBackground(Color.decode("#CACACA"));
        Emailtx.setBorder(null);
		
        Emailtx.setFont(new Font("조선신명조", Font.PLAIN, 18)); // 입력받을 때, 문자 크기 및 폰트 설정
        add(Emailtx);
		
		JLabel lb = new JLabel(getIcon("images/Doctor_Join.png", Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT));
	      lb.setBounds(0, 0, Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
	      add(lb);
	      loginbtn.addActionListener(e -> {
		    	dispose();
		        new Doctor_Login().setVisible(true);
		       });
	      Join_main_btn.addActionListener(e -> {
		    	dispose();
		        new Doctor_Login().setVisible(true);
		       });
	}
	
}