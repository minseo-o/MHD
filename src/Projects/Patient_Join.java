package Projects;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Patient_Join extends CommonFrame {

	JButton loginbtn = new JButton(new ImageIcon("images/Pt_login_Bt.png"));
	JButton joinbtn = new JButton(new ImageIcon("images/join_Check.png"));
	JButton Join_main_btn = new JButton(new ImageIcon("images/Patient_Join_Bt.png"));

	JTextField Nametx = new JTextField();
	JTextField IDtx = new JTextField();
	JTextField PWtx = new JTextField();
	JTextField Emailtx = new JTextField();

	public Patient_Join() {
		super("Patient_Join", Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);

		loginbtn.setBorderPainted(false);
		loginbtn.setContentAreaFilled(false);
		loginbtn.setFocusPainted(false);

		joinbtn.setBorderPainted(false);
		joinbtn.setContentAreaFilled(false);
		joinbtn.setFocusPainted(false);

		Join_main_btn.setBorderPainted(false);
		Join_main_btn.setContentAreaFilled(false);
		Join_main_btn.setFocusPainted(false);

		loginbtn.setBounds(59, 111, 104, 80);
		add(loginbtn);

		joinbtn.setBounds(59, 252, 104, 80);
		add(joinbtn);

		Join_main_btn.setBounds(810, 562, 143, 60);
		add(Join_main_btn);

		Nametx.setBounds(579, 195, 374, 57);
		Nametx.revalidate();
		Nametx.setBackground(Color.decode("#CACACA"));
		Nametx.setBorder(null);

		Nametx.setFont(new Font("조선신명조", Font.PLAIN, 18)); // 입력받을 때, 문자 크기 및 폰트 설정
		add(Nametx);

		IDtx.setBounds(579, 275, 374, 57);
		IDtx.revalidate();
		IDtx.setBackground(Color.decode("#CACACA"));
		IDtx.setBorder(null);
		IDtx.setFont(new Font("조선신명조", Font.PLAIN, 18)); // 입력받을 때, 문자 크기 및 폰트 설정
		add(IDtx);

		PWtx.setBounds(579, 360, 374, 57);
		PWtx.revalidate();
		PWtx.setBackground(Color.decode("#CACACA"));
		PWtx.setFont(new Font("조선신명조", Font.PLAIN, 18)); // 입력받을 때, 문자 크기 및 폰트 설정
		PWtx.setBorder(null);
		add(PWtx);



		Emailtx.setBounds(579, 440, 374, 57);
		Emailtx.revalidate();
		Emailtx.setBackground(Color.decode("#CACACA"));
		Emailtx.setBorder(null);

		Emailtx.setFont(new Font("조선신명조", Font.PLAIN, 18)); // 입력받을 때, 문자 크기 및 폰트 설정
		add(Emailtx);

		JLabel lb = new JLabel(getIcon("images/Patient_Join.png", Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT));
		lb.setBounds(0, 0, Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		add(lb);
		loginbtn.addActionListener(e -> {
			dispose();
			new Patient_Login().setVisible(true);
		
			
		});

		Join_main_btn.addActionListener(e -> {
			signUp();
		});

	}
	private void signUp() {
        String id = IDtx.getText();
        String password = PWtx.getText();
        String email = Emailtx.getText();
        String name = Nametx.getText();
        
        System.out.println(id + " " + password + " " + email + " " + name);
      
        // JDBC를 사용하여 MySQL 데이터베이스에 연결
        // DatabaseConnection 클래스로부터 Connection을 가져옴
        try {
        	update("insert into patient_member values ( ?, ?, ?, ?)", id, password, name,email);
        	new Patient_Login().setVisible(true);
        	update("insert into medical (id) values (?)", id);
        	update("insert into patient_info (id , name) values (?, ?)", id , name);
        	id_check = id;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "회원가입 실패!");
			e.printStackTrace();
		}
    }
}
