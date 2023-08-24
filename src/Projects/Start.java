package Projects;

import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Start extends CommonFrame { // commonFrame에 Frame 기본 설정 다 해놨기 때문에 상속 받아야함,

	// 버튼 선언
	JButton Doctorbtn = new JButton(new ImageIcon("images/Doctor_bt.png"));
	JButton Patientbtn = new JButton(new ImageIcon("images/Patient_bt.png"));

	public Start() {
		super("title", Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);

		Doctorbtn.setBorderPainted(false);// 테두리 삭제
		Doctorbtn.setContentAreaFilled(false);// 안에 채우기 삭제
		Doctorbtn.setFocusPainted(false);// 선택 되었을 때 채우기 삭제

		Patientbtn.setBorderPainted(false);
		Patientbtn.setContentAreaFilled(false);
		Patientbtn.setFocusPainted(false);

		Doctorbtn.setBounds(210, 493, 299, 118);// 버튼 위치, 크기 설정 (X값, Y값, 가로, 세로)
		add(Doctorbtn);// 버튼 추가
		Patientbtn.setBounds(771, 493, 299, 118);
		add(Patientbtn);

		JLabel lb = new JLabel(getIcon("images/Start.png", Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT));// 배경 설정 !! 주의 배경 설정은
																									// 버튼 아래에다가 넣을 것 !
		lb.setBounds(0, 0, Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		add(lb);

		// 버튼 클릭하면 ...
		Doctorbtn.addActionListener(e -> {
			dispose();// 창 삭제
			new Doctor_Login().setVisible(true);// login 창 보여지기
		});
		Patientbtn.addActionListener(e -> {
			dispose();
			new Patient_Login().setVisible(true);
		});

	}
}