package Projects;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Doctor_Login extends CommonFrame {

	// 버튼 선언
	JButton loginbtn = new JButton(new ImageIcon("images/Login_check.png"));
	JButton joinbtn = new JButton(new ImageIcon("images/Dc_join_Bt.png"));
	JButton login_main_btn = new JButton(new ImageIcon("images/Doctor_login_bt.png"));

	// textField 선언
	JTextField IDtx = new JTextField();
	JPasswordField PWtx = new JPasswordField(); // password 입력할때 글자가 •이걸로 표현 됨

	public Doctor_Login() {
		super("Doctor_login", Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);

		// 버튼 투명하게 만들기
		loginbtn.setBorderPainted(false);
		loginbtn.setContentAreaFilled(false);
		loginbtn.setFocusPainted(false);

		joinbtn.setBorderPainted(false);
		joinbtn.setContentAreaFilled(false);
		joinbtn.setFocusPainted(false);

		login_main_btn.setBorderPainted(false);
		login_main_btn.setContentAreaFilled(false);
		login_main_btn.setFocusPainted(false);

		loginbtn.setBounds(59, 111, 104, 80);
		add(loginbtn);

		joinbtn.setBounds(59, 252, 104, 80);
		add(joinbtn);

		login_main_btn.setBounds(955, 389, 160, 59);
		add(login_main_btn);

		// textField 설정
		IDtx.setBounds(496, 292, 373, 57);
		IDtx.revalidate();// 왜 추가 했지? 자동 레이아웃 설정 가능하게 하는 코드
		IDtx.setBackground(Color.decode("#CACACA"));// textField 색상 변경
		IDtx.setBorder(null); // textField 테두리 삭제
		IDtx.setFont(new Font("조선신명조", Font.PLAIN, 18)); // 입력받을 때, 문자 크기 및 폰트 설정
		add(IDtx);// textField 추가
		

		PWtx.setBounds(496, 389, 373, 57);
		PWtx.revalidate();
		PWtx.setBackground(Color.decode("#CACACA"));
		PWtx.setBorder(null);
		add(PWtx);

		JLabel lb = new JLabel(getIcon("images/Doctor_Login.png", Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT));// 배경 설정 !! 주의
																											// 배경 설정은 버튼
																											// 아래에다가 넣을
																											// 것 !
		lb.setBounds(0, 0, Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		add(lb);

		// 버튼 클릭하면 ...
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
